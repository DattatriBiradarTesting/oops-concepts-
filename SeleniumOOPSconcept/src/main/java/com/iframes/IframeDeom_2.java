package com.iframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeDeom_2 {
	WebDriver driver;

	@Test
	public void IframeDeom_2_Hindle() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		String URLlanch = "https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html";
		driver.get(URLlanch);
		WebElement frms = driver.findElement(By.name("packageListFrame"));
		driver.switchTo().frame(frms);

		driver.findElement(By.xpath("//a[@href='org/openqa/selenium/package-frame.html']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.findElement(By.linkText("By.Remotable")).click();
		driver.switchTo().defaultContent();
		int noOfframe = driver.findElements(By.tagName("iframe")).size();
		System.out.println("The number of Frame:: " + noOfframe);

	}
}