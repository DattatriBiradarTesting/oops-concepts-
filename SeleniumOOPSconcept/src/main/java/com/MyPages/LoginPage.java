/**
 * 
 */
package com.MyPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author Admin
 *
 */
public class LoginPage extends BasePage {

	private By emailId = By.id("txtUsername");
	private By Password = By.id("txtPassword");
	private By login = By.id("btnLogin");

	public LoginPage(WebDriver driver) {
		super(driver);

	}

	public WebElement getEmailId() {
		return getElement(emailId);
	}

	public WebElement getPassword() {
		return getElement(Password);
	}

	public WebElement getLogin() {
		return getElement(login);
	}

	public String getLoginPageTitle() {
		return getPagetitle();

	}

	public HomePage doLogin(String username, String password) {
		getEmailId().sendKeys(username);
		getPassword().sendKeys(password);
		getLogin().click();

		return getlnstance(HomePage.class);
	}

	public void doLogin() {
		getEmailId().sendKeys("");
		getPassword().sendKeys("");
		getLogin().click();

	}

	public void doLogin(String userCred) {
		if (userCred.contains("username")) {
			getEmailId().sendKeys(userCred.split(":")[1].trim());
		} else if (userCred.contains("password")) {
			getEmailId().sendKeys(userCred.split(":")[1].trim());
		}
		getLogin().click();
	}
}