package com.Synchronisation.issue;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.base.Stopwatch;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicityWait {

	WebDriver driver;

	@Test
	public void ImplicityWait_Actions() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		String URLlanch = "https://www.ebay.in/";
		driver.get(URLlanch);

		Stopwatch watch = null;

		try {
			watch = Stopwatch.createStarted();
			driver.findElement(By.linkText(" START SELLING")).click();
		} catch (Exception e) {
			watch.stop();
			System.out.println(e);
			System.out.println(watch.elapsed(TimeUnit.SECONDS) + " Seconds");
		}
		{

		}

	}
}
