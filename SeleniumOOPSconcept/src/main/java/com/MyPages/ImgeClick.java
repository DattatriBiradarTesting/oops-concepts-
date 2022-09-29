package com.MyPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ImgeClick {
	WebDriver driver;

	@Test
	public void GetTitle() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String URLlanch = "https://www.opencart.com/index.php?route=cms/demo";
		driver.get(URLlanch);
		driver.findElement(By.xpath("// img[@title='OpenCart - Demo']")).click();
		System.out.println(driver.getTitle());
		if (driver.getTitle().equals("OpenCart - Open Source Shopping Cart Solution")) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}

	}
}
