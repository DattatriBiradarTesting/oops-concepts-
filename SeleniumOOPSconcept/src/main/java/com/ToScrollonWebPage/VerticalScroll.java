package com.ToScrollonWebPage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerticalScroll {
	WebDriver driver;

	@Test
	public void VerticalScroll_Handle() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		String URLlanch = "https://www.calculator.net/";
		driver.get(URLlanch);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		try {
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,500)");
		} catch (Exception e) {
			System.out.println(e);
		}
		WebElement element = driver.findElement(By.linkText("Due Date Calculator"));
		js.executeScript("arguments[0].scrollIntoView(); ", element);
		element.click();

	}
}