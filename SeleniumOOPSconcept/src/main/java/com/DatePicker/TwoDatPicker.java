package com.DatePicker;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TwoDatPicker {

	WebDriver driver;

	@Test
	public void TwoDatPicker_Handle() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		String URLlanch = "https://www.goibibo.com/";
		driver.get(URLlanch);
		
		WebElement titl = driver.findElement(By.xpath("//span[@class='sc-kfPuZi dprjVP fswDownArrow']"));
		titl.click();
		
		

	}
}
