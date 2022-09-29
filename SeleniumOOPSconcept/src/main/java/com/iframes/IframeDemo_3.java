package com.iframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeDemo_3 {
	WebDriver driver;

	@Test
	public void IframeDemo_3_Handle() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		String URLlanch = "https://chercher.tech/practice/frames-example-selenium-webdriver";
		driver.get(URLlanch);

		driver.switchTo().frame("frame1");
		driver.switchTo().frame("frame3");
		driver.findElement(By.id("a")).click();

		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("/html/body/input")).sendKeys("This is Vinayak");

		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");

		WebElement dropDown = driver.findElement(By.id("animals"));
		Select animals=new Select(dropDown);
		//animals.selectByIndex(2);
		animals.selectByValue("big baby cat");

	}
}