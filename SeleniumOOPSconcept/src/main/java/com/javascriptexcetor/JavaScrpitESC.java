package com.javascriptexcetor;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScrpitESC {

	WebDriver driver;

	@Test
	public void JavaScrpitESC_Actions() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		String URLlanch = "http://uitestpractice.com/Students/Index";
		driver.get(URLlanch);

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("document.getElementById('Search_Data').value='vinayak'; ");

		WebElement excute = driver.findElement(By.xpath("//input[@class='btn ']"));

		/*
		 * js.executeScript("arguments[0].click(); " , excute);
		 * 
		 * js.executeScript("history.go(0)");
		 * 
		 * String dom= js.executeScript("return document.domain; ").toString();
		 * System.out.println("Domain ::" + dom);
		 * 
		 * String ti= js.executeScript("return document.title; ").toString();
		 * System.out.println("Title :: " + ti);
		 * 
		 * String url= js.executeScript("return document.URL; ").toString();
		 * System.out.println("URL :: " + url);
		 * 
		 * js.executeScript("arguments[0].style.border = '3px solid white' ; " ,
		 * excute);
		 * 
		 * js.executeScript("document.body.style.zoom='500%' ");
		 * 
		 * System.out.println(js.executeScript("return window.innerHeight;").toString())
		 * ;
		 * System.out.println(js.executeScript("return window.innerWidth;").toString());
		
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		js.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
	
        js.executeScript("alert ('This is my alert message.');");
	 */
		js.executeScript("window.location='http://www.google.com' ");
	
	}
}