package com.selenium.interview;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sauce_Demo {

	WebDriver driver;
	String url = "https://www.saucedemo.com/";

	@Test
	public void test_1() throws Throwable {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(2000);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		String currwindowHadel = driver.getWindowHandle();
		driver.switchTo().window(currwindowHadel);
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sauce Labs Bolt T-Shirt")).click();
		Thread.sleep(2000);
	

	}
}
