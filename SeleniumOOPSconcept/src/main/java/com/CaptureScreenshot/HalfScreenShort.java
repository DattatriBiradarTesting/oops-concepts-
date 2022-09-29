package com.CaptureScreenshot;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HalfScreenShort {
	WebDriver driver;

	@Test
	public void HalfScreenShort_Hindle() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		String URLlanch = "http://uitestpractice.com/";
		driver.get(URLlanch);

		WebElement halfSction = driver.findElement(By.xpath("//div[@class='container orange']"));
		File src = halfSction.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Admin\\eclipse-workspace\\SeleniumOOPSconcept\\ScreenShort\\halfscreen.png");
		FileUtils.copyFile(src, dest);
		
		driver.quit();
	}
}