package com.selenium.interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BoostrDropDwon {
	WebDriver driver;

	@Test
	public void DropDown() {
		String lti = "https://www.jquery-az.com/boots/demo.php?ex=63.0_3";
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(lti);
		WebElement element = driver.findElement(By.xpath("//span[contains(text(),'HTML, CSS')]"));
		element.click();

	}

}
