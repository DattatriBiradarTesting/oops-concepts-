package com.MyPages;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);

	}

	public String getHomePageTitel() {
		return getPagetitle();
	}
}
