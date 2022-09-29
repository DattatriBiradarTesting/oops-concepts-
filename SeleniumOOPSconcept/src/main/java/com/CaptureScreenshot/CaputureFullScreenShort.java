package com.CaptureScreenshot;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaputureFullScreenShort {
	WebDriver driver;

	@Test
	public void ScreenShort_Hindle() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		String URLlanch = "http://uitestpractice.com/";
		driver.get(URLlanch);

		TakesScreenshot screenshort = ((TakesScreenshot) driver);
		File src = screenshort.getScreenshotAs(OutputType.FILE);
		File dest = new File(
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumOOPSconcept\\FullScreenShort\\FullScreet.png");
		FileUtils.copyFile(src, dest); 

	}
}
