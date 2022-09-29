package com.MyPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeDriver {

	public static void main(String[] args) {
		ChromeOptions co = new ChromeOptions();
		co.setHeadless(true);
		WebDriver driver = WebDriverManager.chromedriver().capabilities(co).create();
		driver.get("https://mvnrepository.com/");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		
	

	}

}
