package steps;
import static steps.HooksAnnotationDemo.driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestWekipediaPageHooks {
	
	@Given("User is on the MainPage,get title of the page")
	public void user_is_on_the_main_page_get_title_of_the_page() {
		
		String title = driver.getTitle();
		
		System.out.println(title);
	   
	}

	@When("User will enter username,password")
	public void user_will_enter_username_password() {
		
		WebElement e1 = driver.findElement(By.xpath("//input[@id='wpName2']"));
		
		WebElement e2 = driver.findElement(By.xpath("//input[@id='wpPassword2']"));
		
		e1.sendKeys("username1");
		e2.sendKeys("password123");
	}

	@Then("User will enter emial id & retype password")
	public void user_will_enter_emial_id_retype_password() throws InterruptedException {
	    WebElement e3 = driver.findElement(By.xpath("//input[@id='wpRetype']"));
		
		WebElement e4 = driver.findElement(By.xpath("//input[@id='wpEmail']"));
		
		e3.sendKeys("password123");
		e4.sendKeys("admin@gmail.com");
		Thread.sleep(2000);
		
	    
	}

	@Then("user will click on Create account button")
	public void user_will_click_on_create_account_button() {
		
		WebElement e5 = driver.findElement(By.xpath("//button[@id='wpCreateaccount']"));
		e5.click();
	   
	}

	// sceanrio 2

	@When("User clicks on login link")
	public void user_clicks_on_login_link() {
		
		WebElement loginLink = driver.findElement(By.xpath("//a[@data-mw='interface']//span[contains(text(),'Log in')]"));
		loginLink.click();
	   
	}

	@When("User will enter username and password")
	public void user_will_enter_username_and_password() {
	WebElement usrname = driver.findElement(By.xpath("//input[@id='wpName1']"));
		
		WebElement passwd = driver.findElement(By.xpath("//input[@id='wpPassword1']"));
		
		usrname.sendKeys("username1");
		passwd.sendKeys("password123");
		
	  
	}

	@Then("User will click login button")
	public void user_will_click_login_button() {
		
		WebElement loginbtn = driver.findElement(By.xpath("//button[@id='wpLoginAttempt']"));
		loginbtn.click();
	   
	}
}
