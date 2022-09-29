package com.SeleniumwebdriverSession;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selnium {
	WebDriver driver;

	@Test
	public void testCase() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://www.saucedemo.com/";
		driver.get(url);
		WebElement username = driver.findElement(By.id("user-name"));
		Thread.sleep(3000);
		WebElement password = driver.findElement(By.id("password"));
		Thread.sleep(3000);
		WebElement click = driver.findElement(By.id("login-button"));
		Thread.sleep(3000);
		username.sendKeys("standard_user", Keys.ENTER, Keys.TAB);
		Thread.sleep(3000);
		password.sendKeys("secret_sauce", Keys.ENTER, Keys.TAB);
		click.click();

	}

}
