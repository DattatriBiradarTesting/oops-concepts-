package com.MyPages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewWindowOpen {

	WebDriver driver;

	@Test
	public void NewWindow() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		String URLlanch = "https://mvnrepository.com/";
		driver.get(URLlanch);
		System.out.println("Frist Page Open :: " + driver.getTitle());

		driver.switchTo().newWindow(WindowType.TAB);
		String URL2 = "https://www.automationtestinginsider.com/";
		driver.get(URL2);
		System.out.println("Secound Page Open:: " + driver.getTitle());

		Set<String> windowHandels = driver.getWindowHandles();
		List<String> handels=new ArrayList<String>();
		handels.addAll(windowHandels);
		
		driver.close();
		
		driver.switchTo().window(handels.get(0));
		System.out.println("---------------------------------------------------------------");
		System.out.println("Frist Page Open :: " + driver.getTitle());
		
		

	}
}