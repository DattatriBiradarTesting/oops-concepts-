package com.mouseoveraction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOver {
	WebDriver driver;

	@Test
	public void MouseOver_Actions() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String URLlanch = "https://sellglobal.ebay.in/seller-center/";
		driver.get(URLlanch);
		WebElement mouse = driver.findElement(By.xpath(
				"//ul[@id='menu-header-1']//a[@class='ekit-menu-nav-link'][normalize-space()='Shipping & Payments']"));
		Actions mo = new Actions(driver);
		mo.moveToElement(mouse).build().perform();
		
		WebElement moreClick = driver.findElement(By.linkText("Handling and Automating Returns"));
		Actions To = new Actions(driver);
		To.moveToElement(moreClick).perform();
	}
}
