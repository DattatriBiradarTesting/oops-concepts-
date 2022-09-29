package com.selenium.interview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tutorial_2 {
	WebDriver driver;

	@Test
	public void Test_1() throws Throwable {
		String lti = "https://www.google.com/";
		String fb = "https://www.facebook.com/login/";
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(lti);

		Thread.sleep(3000);
		driver.get(fb);

		Thread.sleep(3000);

	}
}