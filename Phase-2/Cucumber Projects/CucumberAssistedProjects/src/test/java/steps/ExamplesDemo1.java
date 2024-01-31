package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static steps.HooksAnnotationDemo.driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExamplesDemo1 {
	@When("User will enter {string},{string}")
	public void user_will_enter_username_password(String user, String passwd) throws InterruptedException {
		
		WebElement e1 = driver.findElement(By.xpath("//input[@id='wpName2']"));
		
		WebElement e2 = driver.findElement(By.xpath("//input[@id='wpPassword2']"));
		
		e1.clear();
		e1.sendKeys(user);
		
		e2.clear();
		e2.sendKeys(passwd);
		
		Thread.sleep(2000);
	}
	@Then("User will enter {string} and {string}")
	public void user_will_enter_emial_id_retype_password(String re, String em) throws InterruptedException {
	  
		WebElement e3 = driver.findElement(By.xpath("//input[@id='wpRetype']"));
		
		WebElement e4 = driver.findElement(By.xpath("//input[@id='wpEmail']"));
		
		e3.clear();
		e3.sendKeys(re);
		
		
		e4.clear();
		e4.sendKeys(em);
		
		
		Thread.sleep(2000);
		
	   
	}

}
