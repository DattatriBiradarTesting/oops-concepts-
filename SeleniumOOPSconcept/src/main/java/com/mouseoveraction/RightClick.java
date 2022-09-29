package com.mouseoveraction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {
WebDriver driver;
	@Test
	public void RightClick_Actions() throws Throwable {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	String URLlanch = "https://demoqa.com/buttons";
	driver.get(URLlanch);
	WebElement button=driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
	Actions act=new Actions(driver);
	act.contextClick(button).perform();
	driver.findElement(By.id("rightClickMessage")).getText();
	System.out.println("The Right Click Sucefull ");

		

		
	}

}


