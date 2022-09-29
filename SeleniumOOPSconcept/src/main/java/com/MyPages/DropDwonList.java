package com.MyPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDwonList {
	WebDriver driver;

	@Test
	public void DropDwons() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String URL = "https://www.opencart.com/index.php?route=account/register";
		driver.get(URL);
		WebElement element = driver.findElement(By.id("input-country"));
		Thread.sleep(3000);
		Select dropDown = new Select(element);
		// dropDown.selectByVisibleText("American Samoa");
		dropDown.selectByValue("98");
		if (dropDown.isMultiple()) {
			System.out.println("Drop Down is multiple");
		} else {
			System.out.println("Drop Dwon is not multiple");
		}
		List<WebElement> allList = dropDown.getOptions();
		System.out.println(allList.size());
		for (WebElement dm : allList) {
			System.out.println(dm.getText());
		}
	}
}