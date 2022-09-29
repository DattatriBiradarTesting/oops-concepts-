package com.MyPages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RiadoButton {

	WebDriver driver;

	@Test
	public void LinksBroken() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String URLlanch = "https://udyamregistration.gov.in/Udyam_Login.aspx";
		driver.get(URLlanch);
		List<WebElement> radioButtonList = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("Total Number of WebPage:: " + radioButtonList.size());
		driver.quit();
	}

}
