package com.qa.stepDefinitions;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class HomePageSteps extends TestBase{
	
	LoginPage loginpage = new LoginPage();
	HomePage homePage;
	
	@Given("^user opens browser$")
	public void user_opens_browser() {
		TestBase.initialization();
	   
	}

	@Then("^user is on login page$")
	public void user_is_on_login_page() {
		loginpage = new LoginPage();
	    String title = loginpage.validateLoginPageTitle();
	    Assert.assertEquals("Cogmento CRM", title);
	}

	@Then("^user logs into app$")
	public void user_enters_username_and_password() {
		homePage = loginpage.logIn(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Then("^validate home page title$")
	public void validate_home_page_title() {
	   String homeTitle = homePage.verifyHomePageTitle();
	   Assert.assertEquals("Cogmento CRM", homeTitle);
	}

	@Then("^validate logged in username$")
	public void validate_logged_in_username() {
		boolean flag = homePage.verifyCorrectUsername();
		Assert.assertTrue(flag);
	}

}
