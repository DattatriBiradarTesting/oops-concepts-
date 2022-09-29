package com.Synchronisation.issue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FulikedWait {
	WebDriver driver;

	@Test
	public void FulikedWait_Actions() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		String URLlanch = "https://www.ebay.in/";
		driver.get(URLlanch);

}
}
