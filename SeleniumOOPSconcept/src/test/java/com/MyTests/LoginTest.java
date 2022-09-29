package com.MyTests;

import org.testng.annotations.Test;

import com.MyPages.HomePage;
import com.MyPages.LoginPage;

public class LoginTest extends BaseTest {

	@Test(priority = 1)
	public void verifyLoginPageTitelTest() {
		String titel = page.getlnstance(LoginPage.class).getLoginPageTitle();
		System.out.println(titel);
		org.testng.Assert.assertEquals(titel, "OrangeHRM");
	}

	@Test(priority = 2)
	public void doLoginTest() {
	HomePage homepage=	page.getlnstance(LoginPage.class).doLogin("Admin", "admin123 ");
	}
}
