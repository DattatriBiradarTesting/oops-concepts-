package com.MyPages;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindBrokenLinks {
	WebDriver driver;

	@Test
	public void LinksBroken() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String URLlanch = "http://www.deadlinkcity.com/";
		driver.get(URLlanch);
		List<WebElement> linktext = driver.findElements(By.tagName("a"));
		int resCode = 200;
		int brokenLinkCnt = 0;
		System.out.println("Total of links on Page:: " + linktext.size());
		for (WebElement element : linktext) {
			String url = element.getAttribute("href");
			
			try {
				URL urlLink = new URL(url);
				HttpURLConnection md = (HttpURLConnection) urlLink.openConnection();
				md.setRequestMethod("HEAD");
				md.connect();
				
				resCode = md.getResponseCode();
				if (resCode >= 400) {
					System.out.println(url + " BrokenLinks.. .");
					brokenLinkCnt ++;
				}
			} catch (MalformedURLException e) {

			}
			catch(Exception e)
			{
			
		}
		System.out.println("Total broken links :: " + brokenLinkCnt);
	}

}
}
