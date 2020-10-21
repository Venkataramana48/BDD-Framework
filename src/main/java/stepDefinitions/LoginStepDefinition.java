/*package stepDefinitions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {
	
	public static WebDriver driver;

	@Given("^user is already login page$")
	public void  user_is_already_login_page() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\Selenium Projects"
				+ "\\LocalBadabing Project with Selenium\\Badabing Project\\FreeCrmBDDFramework\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://ui.freecrm.com/");

	}
	
	
	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM() {
		String title = driver.getTitle();
		System.out.print(title);
		Assert.assertEquals("Cogmento CRM", title);
	    
	}
	
	//Regular Expression:
	//1. \"(.*)\   OR
	//2. 
	
	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String username, String password) {
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	}
	
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Then("^user is on home page$")
	public void user_is_on_home_page() {
		String title = driver.getTitle();
		System.out.println("Homepage title is: "+title);
		Assert.assertEquals("Cogmento CRM", title);
	}
	
	@Then("^user moves to new contact page$")
	public void user_moves_to_new_contact_page() throws InterruptedException{
	    driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[contains(text(),'New')]")).click();
	}
	
	@Then("^user enters contact details \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_contact_details_and_and(String firstname, String lastname, String position) throws InterruptedException{
	    driver.findElement(By.name("first_name")).sendKeys(firstname);
	    driver.findElement(By.name("last_name")).sendKeys(lastname);
	    driver.findElement(By.name("position")).sendKeys(position);
	    Thread.sleep(6000);
	    driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
	}
	
	
	@Then("^close the browser$")
	public void close_the_browser() {
		driver.quit();
	}
	

}
*/