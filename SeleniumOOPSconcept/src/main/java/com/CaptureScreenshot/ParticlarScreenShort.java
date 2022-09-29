package com.CaptureScreenshot;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParticlarScreenShort {
	WebDriver driver;

	@Test
	public void Particlar_Hindle() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		String URLlanch = "http://uitestpractice.com/";
		driver.get(URLlanch);

		WebElement Samall = driver.findElement(By.xpath("//a[@href='https://www.youtube.com/watch?v=dX-MDFWKBwE']"));
		
		TakesScreenshot small = ((TakesScreenshot) driver);
		File dit=Samall.getScreenshotAs(OutputType.FILE);
		File scr=new File("C:\\Users\\Admin\\eclipse-workspace\\SeleniumOOPSconcept\\ScreenShort\\small.png");
		FileUtils.copyFile(dit, scr);
		
		driver.quit();

	}
}