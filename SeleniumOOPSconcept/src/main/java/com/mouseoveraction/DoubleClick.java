package com.mouseoveraction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClick {
	WebDriver driver;

	@Test
	public void DoubleClick_Actions() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String URLlanch = "http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html";
		driver.get(URLlanch);
		WebElement Sourse = driver.findElement(By.id("box6"));
		WebElement Targeat = driver.findElement(By.id("box106"));
		Actions filed = new Actions(driver);
		filed.dragAndDrop(Sourse, Targeat).build().perform();
		
		

	}
}