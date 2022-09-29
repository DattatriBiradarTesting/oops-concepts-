package com.ToScrollonWebPage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlbumDemo {
	WebDriver driver;

	@Test
	public void AlbumDemo_Handle() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		String URLlanch = "https://www.album.alexflueras.ro/";
		driver.get(URLlanch);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println(e);
		}
		WebElement alex = driver.findElement(By.id("a2"));
		js.executeScript("arguments[0].scrollIntoView();", alex);
        driver.close();
	}
}