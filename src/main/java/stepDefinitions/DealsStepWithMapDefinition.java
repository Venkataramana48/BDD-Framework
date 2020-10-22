package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class DealsStepWithMapDefinition {
	
public static WebDriver driver;
	
	@Given("^user is already login page$")
	public void  user_is_already_login_page() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\Selenium Projects"
				+ "\\LocalBadabing Project with Selenium\\Badabing Project\\FreeCrmBDDFramework\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ui.freecrm.com/");

	}
	
	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM() {
		String title = driver.getTitle();
		System.out.print(title);
		Assert.assertEquals("Cogmento CRM", title);
	    
	}
	
	@Then("^user enters username and password$")
	public void user_enters_username_and_password(DataTable credentials) {
		for(Map<String, String> data :credentials.asMaps(String.class, String.class)) {
		
		driver.findElement(By.name("email")).sendKeys(data.get("username"));
		driver.findElement(By.name("password")).sendKeys(data.get("password"));
	}
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
	
	@Then("^user moves to new deal page$")
	public void user_moves_to_new_deal_page() throws InterruptedException{
	    driver.findElement(By.xpath("//span[contains(text(),'Deals')]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[contains(text(),'New')]")).click();
	}
	
	@Then("^user enters deal details$")
	public void user_enters_deal_details(DataTable dealData) throws InterruptedException{
		
		for(Map<String, String> data : dealData.asMaps(String.class, String.class)) {
		
	    driver.findElement(By.name("title")).sendKeys(data.get("title"));
	    driver.findElement(By.name("probability")).sendKeys(data.get("probability"));
	    driver.findElement(By.name("amount")).sendKeys(data.get("amount"));
	    driver.findElement(By.name("commission")).sendKeys(data.get("commission"));
	    
	    //driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
	  try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	    driver.findElement(By.xpath("//div[@class='item']//descendant::button[2]")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//span[contains(text(),'Deals')]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[contains(text(),'New')]")).click();
	  
	}
	}
	
	@Then("^close the browser$")
	public void close_the_browser() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
	
	



}
