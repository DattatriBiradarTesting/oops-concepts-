package com.selenium.interview;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tutorial_4 {
	WebDriver driver;

	@Test
	public void Test_4() throws Throwable {
		String lti = "https://www.google.com/";

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(lti);
		WebElement element = driver.findElement(By.name("q"));
	//	element.sendKeys("alert ways for sendkeys () in selenium ()");
		Actions action=new Actions(driver);
		action.sendKeys(element, "alaertnt ways for sendkes ()").build().perform();
		Thread.sleep(3000);
		action.keyDown(Keys.ENTER);
		

		Thread.sleep(3000);
		
	}
}