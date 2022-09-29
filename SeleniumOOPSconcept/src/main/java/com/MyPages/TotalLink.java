package com.MyPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLink {

	public static void main(String[] args) {
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://mvnrepository.com/");
		List<WebElement> allElement = driver.findElements(By.xpath("//*"));
		int totalWeblements = allElement.size();
		System.out.println("total Of WebElemnt :: " + totalWeblements);
		for (WebElement dm : allElement) {
			System.out.println("The Links Of :: " + dm.getText());
		}
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());

	}

}
