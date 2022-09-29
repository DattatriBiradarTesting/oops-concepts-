package com.UploadFile;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFile {
	WebDriver driver;

	@Test
	public void Upload_File() throws Throwable {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	String URLlanch = "https://demoqa.com/upload-download";
	driver.get(URLlanch);
	driver.findElement(By.id("uploadFile")).sendKeys("C:\\Users\\Admin\\Desktop\\Java Collections Interview Questions.docx");

}
}