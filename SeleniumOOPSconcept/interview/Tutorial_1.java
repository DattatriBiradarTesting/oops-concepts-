package com.selenium.interview;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tutorial_1 {
	WebDriver driver;

	@Test
	public void Test_1() throws Throwable{
		String lti = "https://www.google.com/";
		String fb="https://www.facebook.com/login/";
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(lti);
		String tagname = driver.findElement(By.name("q")).getTagName();
		System.out.println("tag name :: "+tagname );
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("selenium with java "+Keys.ENTER);
		Thread.sleep(3000);
	Navigation nav=	driver.navigate();
	nav.to(fb);
	Thread.sleep(3000);
		driver.quit();

	}
}