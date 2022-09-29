package com.Alerts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
	WebDriver driver;

	@Test
	public void WebTable_Hindle() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		String URLlanch = "https://testautomationpractice.blogspot.com/";
		driver.get(URLlanch);

		List<WebElement> RowsList = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
		System.out.println("RowsCount  :: __ " + RowsList.size());

		List<WebElement> ColumList = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[1]/th"));
		System.out.println("Coulm Count ::-- " + ColumList.size());

		for (int r = 2; r <= RowsList.size(); r++) {
			System.out.println("  ----------------WEL COME ---------------------");
			for (int c = 1; c<= ColumList.size(); c++) {
				
				String CountData = driver
						.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[" + r + "]/td[ " + c + "] " )).getText();
			
				System.out.println("Total of The Count :: " + CountData);
			}
		}

	}
}
