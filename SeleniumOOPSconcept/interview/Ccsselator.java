package com.selenium.interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ccsselator {
	WebDriver driver;
	String url = "https://www.saucedemo.com/";

	@Test
	public void Css_Demo() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name=password]")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value=Login")).click();

	}

}
