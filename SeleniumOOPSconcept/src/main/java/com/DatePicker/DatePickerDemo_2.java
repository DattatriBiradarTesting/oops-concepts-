package com.DatePicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePickerDemo_2 {

	WebDriver driver;

	@Test
	public void DatePickerDemo_Handle() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		String URLlanch = "https://www.redbus.in/";
		driver.get(URLlanch);

		String expDate = "25";
		String expMonthYear = "Jun 2022";

		WebElement showing = driver.findElement(By.id("onward_cal"));
		showing.click();

		while (true) {
			String MothYear = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
			if (MothYear.equals(expMonthYear)) {
				driver.findElement(By.xpath("//td[text()='25']")).click();
				break;
			} else {

			}

			driver.findElement(By.xpath("//td[@class='next']")).click();
		}
	}
}
