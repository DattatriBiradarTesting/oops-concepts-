package com.Alerts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FBToolTip {

	WebDriver driver;

	@Test
	public void FBToolTip_Hindle() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		String URLlanch = "https://www.facebook.com/";
		driver.get(URLlanch);

		String actualFBtitle = driver.findElement(By.xpath("//a[@href='https://messenger.com/']"))
				.getAttribute("title");

		String exceptFBtitle = "Take a look at Messenger.";
		
		if (actualFBtitle.equals(exceptFBtitle)) {
			System.out.println("Test Pass FB Yes");
		} else {
			System.out.println("Test Fail FB No");
		}
	
		driver.quit();
	}
}

