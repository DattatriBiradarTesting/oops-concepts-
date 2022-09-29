package com.selenium.interview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
	WebDriver driver;

	@Test
	public void checkTheDropDown() throws Throwable {
		String fb = "https://www.facebook.com/";
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(fb);
		WebElement Element = driver.findElement(By.linkText("Create New Account"));
		Element.sendKeys(Keys.ENTER);

		WebElement day = driver.findElement(By.id("day"));
		Select date = new Select(day);
		date.selectByIndex(5);
		System.out.println(date.getFirstSelectedOption().getText());

		Thread.sleep(3000);
		WebElement month = driver.findElement(By.id("month"));
		Select monthlist = new Select(month);
		monthlist.selectByVisibleText("Jun");
		System.out.println(monthlist.getFirstSelectedOption().getText());
		Thread.sleep(3000);

		WebElement year = driver.findElement(By.id("year"));
		Select yearlist = new Select(year);
		yearlist.selectByVisibleText("1993");
		System.out.println(yearlist.getFirstSelectedOption().getText());
		Thread.sleep(3000);

	}
}
