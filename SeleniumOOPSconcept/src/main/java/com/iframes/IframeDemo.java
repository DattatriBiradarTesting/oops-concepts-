package com.iframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeDemo {
	WebDriver driver;

	@Test
	public void Iframe_Hindle() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		String URLlanch = "https://www.rediff.com/";
		driver.get(URLlanch);

		driver.switchTo().frame("moneyiframe");

		String textRediff = driver.findElement(By.xpath("//span[@id='nseindex']")).getText();
		System.out.println(textRediff);
	}

}