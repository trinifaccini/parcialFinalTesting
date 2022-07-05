package com.Tests;

import com.Base.BasePage;
import com.Pages.AccountOverviewPage;
import com.Pages.NewAccountPage;
import com.Pages.RegisterPage;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

class Test01 {

	@BeforeAll
	public static void openApp() {
		BasePage basePage = new BasePage();
		basePage.openApp();
	}

	@Test
	@Order(1)
	public void registrationTest() throws InterruptedException {

		RegisterPage registerPage = new RegisterPage();
		String pageTitle = registerPage.getPageTitle(); 
		
		assertEquals(pageTitle, "ParaBank | Welcome | Online Banking");

		registerPage.openRegisterPage();
		Thread.sleep(2000);

		pageTitle = registerPage.getPageTitle(); 
		assertEquals(pageTitle, "ParaBank | Register for Free Online Account Access");

		registerPage.completeRegistrationFields();
		registerPage.confirmRegistration();

		pageTitle = registerPage.getPageTitle(); 
		assertEquals(pageTitle, "ParaBank | Customer Created");

		String search = "Your account was created successfully. You are now logged in.";
		By locator = By.id("rightPanel");
		assertTrue(registerPage.textSearch(locator, search));
	}

	@Test
	@Order(2)
	public void openNewAccountTest() throws InterruptedException {

		NewAccountPage newAccountPage = new NewAccountPage();
		
		newAccountPage.openNewAccountPage();
		Thread.sleep(2000);

		String pageTitle = newAccountPage.getPageTitle(); 
		assertEquals(pageTitle, "ParaBank | Open Account");

		newAccountPage.openAccount();

		String search = "Congratulations, your account is now open.";
		By locator = By.id("rightPanel");
		assertTrue(newAccountPage.textSearch(locator, search));
	}

	@Test
	@Order(3)
	public void AccountOverviewPageTest() throws InterruptedException {

		AccountOverviewPage accountOPage = new AccountOverviewPage();

		accountOPage.openAccountsOverviewPage();
		Thread.sleep(2000);

		String pageTitle = accountOPage.getPageTitle(); 
		assertEquals(pageTitle, "ParaBank | Accounts Overview");

		String search = "*Balance includes deposits that may be subject to holds";
		By locator = By.id("rightPanel");
		assertTrue(accountOPage.textSearch(locator, search));
	}

	@Test
	@Order(4)
	public void AccountOverviewDetailsTest() throws InterruptedException {

		AccountOverviewPage accountOPage = new AccountOverviewPage();

		accountOPage.openAccountsDetails();
		Thread.sleep(2000);

		String pageTitle = accountOPage.getPageTitle(); 
		assertEquals(pageTitle, "ParaBank | Accounts Activity");

		String search = "Account Details";
		By locator = By.id("rightPanel");
		assertTrue(accountOPage.textSearch(locator, search));

		accountOPage.seeAccountActivity();

		//Agregar asserts
	}
}