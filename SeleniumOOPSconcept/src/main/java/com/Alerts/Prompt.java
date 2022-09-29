package com.Alerts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prompt {
	WebDriver driver;

	@Test
	public void prompt_Hindle() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		String URLlanch = "http://www.uitestpractice.com/Students/Switchto";
		driver.get(URLlanch);

		driver.findElement(By.id("prompt")).click();
		driver.switchTo().alert().sendKeys("vinayak");
		driver.switchTo().alert().accept();

	}
}