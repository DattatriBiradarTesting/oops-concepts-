package com.MyPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HaperLink {

	public static void main(String[] args) {
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/");
		List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total li nks of Count :: " + totalLinks.size());
		for (WebElement el : totalLinks) {
			System.out.println("total all the links Display:: " + el.getText());
		}
		driver.quit();
	}

}
