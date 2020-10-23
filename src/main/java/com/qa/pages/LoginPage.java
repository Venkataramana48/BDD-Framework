package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;


public class LoginPage extends TestBase {
	
	//Page factory or Object Repository
	
		@FindBy(xpath = "//span[contains(text(),'Log In')]")
		WebElement homelogInButton;
		
		
		@FindBy(name ="email")
		WebElement username;
		
		@FindBy(name ="password")
		WebElement password;
		
		@FindBy(xpath="//div[contains(text(),'Login')]")
		WebElement loginButton;
		
		/*@FindBy(xpath = "//img[contains(@class,'_97vu img')]")
		WebElement fbLogo;*/
		
		@FindBy(xpath="//a[@title='free crm home']")
		WebElement crmLogo;
		
		//initializing the page Objects
		public LoginPage(){
			PageFactory.initElements(driver, this); //this is the current class objects, all these variables will be initialized with driver (this-->LoginPage.class)
			
		}
		
		//Actions
		public String validateLoginPageTitle() {
			return driver.getTitle();

		}
		
			public boolean validateCrmImage() {
			return crmLogo.isDisplayed();
		}
			/*
			public void logIn() {
				
				logInButton.click();
				
				
			}*/
		
		
		public HomePage logIn(String un, String pwd) {
			//homelogInButton.click();
			username.sendKeys(un);
			password.sendKeys(pwd);
			loginButton.click();
			
			return new HomePage();
		}
		

}
