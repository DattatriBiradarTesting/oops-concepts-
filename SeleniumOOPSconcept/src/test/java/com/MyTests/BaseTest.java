package com.MyTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.MyPages.BasePage;
import com.MyPages.Page;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	WebDriver driver;
	public Page page;

	@BeforeMethod
	@Parameters(value = { "browser" })
	public void setUpTest(String browser) throws Throwable {
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		Thread.sleep(2000);
		page = new BasePage(driver);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
