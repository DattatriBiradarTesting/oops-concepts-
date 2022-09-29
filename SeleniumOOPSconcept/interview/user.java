package com.selenium.interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class user {
	

    public static void main(String[] args) throws Throwable {  
          
       // System Property for Chrome Driver   
    WebDriverManager.chromedriver().setup();
  
        // Instantiate a ChromeDriver class.      
        WebDriver driver=new ChromeDriver();  
  
        // Launch Website  
        driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");   
  
  Thread.sleep(5000);
//Using Select class for selecting value from dropdown  
      
Select dropdown = new Select(driver.findElement(By.id("testingDropdown")));  
Thread.sleep(5000);
dropdown.selectByVisibleText("Database Testing");  
Thread.sleep(5000);
  
    // Close the Browser  
        driver.close();  
  
  
    }  
}  

