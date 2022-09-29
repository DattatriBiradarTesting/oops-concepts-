package com.selenium.interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_Demo {
	WebDriver driver;
	String url = "https://www.saucedemo.com/";

	@Test
	public void Css_Demo() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.xpath("")).sendKeys("standard_user");
		driver.findElement(By.xpath("")).sendKeys("secret_sauce");

		
	}
}
