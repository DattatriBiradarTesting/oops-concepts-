package com.DatePicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FristDatePicker {
	WebDriver driver;

	@Test
	public void FristDatePicker_Handle() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		String URLlanch = "https://jqueryui.com/datepicker/";
		driver.get(URLlanch);

		String expectedDate = "2";
		String expectedMonth = "June";
		String expectedYear = "2022";

		driver.switchTo().frame(0);
		WebElement date = driver.findElement(By.id("datepicker"));
		date.click();

		while (true) {
			String month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			System.out.println(month);
			String year = driver.findElement(By.xpath(" //span[@class='ui-datepicker-year']")).getText();

			if (month.equals(expectedMonth) && year.equals(expectedYear)) {
				List<WebElement> dayList = driver.findElements(By.xpath("//table/tbody/tr/td"));
				
				for (WebElement dm : dayList) {
					String calenderDay = dm.getText();
					if (calenderDay.equals(expectedDate)) {
						dm.click();
						break;
					}
				}
				break;
			}
			else {
				driver.findElement(By.linkText("Next")).click();
			}
		}

	}
}