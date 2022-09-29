package com.Synchronisation.issue;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.common.base.Stopwatch;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExpicityWait {

	WebDriver driver;

	@Test
	public void ExpicityWait_Actions() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		String URLlanch = "https://www.ebay.in/";
		driver.get(URLlanch);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		Stopwatch watch = null;
		try {
			watch = Stopwatch.createStarted();
			// driver.findElement(By.linkText(" START SELLING")).click();
		} catch (Exception e) {
			watch.stop();
			WebElement element = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("xyz ")));
			element.click();

			System.out.println(e);
			System.out.println(watch.elapsed(TimeUnit.SECONDS) + " Secounds");
		}

	}
}
