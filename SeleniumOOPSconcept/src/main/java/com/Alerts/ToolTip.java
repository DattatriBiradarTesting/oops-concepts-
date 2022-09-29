package com.Alerts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolTip {

	WebDriver driver;

	@Test
	public void ToolTip_Hindle() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		String URLlanch = "https://testautomationpractice.blogspot.com/";
		driver.get(URLlanch);

		String ActultoopTip = driver.findElement(By.xpath("//input[@id='age']")).getAttribute("title");
		String ExpectedtoopTip = "We ask for your age only for statistical purposes.";

		if (ActultoopTip.equals(ExpectedtoopTip)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Faild");
		}
driver.quit();
	}
}
