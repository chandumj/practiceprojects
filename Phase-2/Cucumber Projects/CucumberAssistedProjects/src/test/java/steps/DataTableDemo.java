package steps;
import static steps.HooksAnnotationDemo.driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DataTableDemo {
	@Given("User enter following details")
	public void user_enter_following_details(io.cucumber.datatable.DataTable dataTable) {
		
	
		// create a listObject that will go to data table and fetch each value
		
		List<List<String>> userList = dataTable.asLists(String.class);
		
		for(List<String> e : userList)
		{
			
      WebElement e1 = driver.findElement(By.xpath("//input[@id='wpName2']"));
      e1.clear();
      e1.sendKeys(e.get(0));
		WebElement e2 = driver.findElement(By.xpath("//input[@id='wpPassword2']"));
		e2.clear();
		e2.sendKeys(e.get(1));
       WebElement e3 = driver.findElement(By.xpath("//input[@id='wpRetype']"));
       e3.clear();
       e3.sendKeys(e.get(2));
		WebElement e4 = driver.findElement(By.xpath("//input[@id='wpEmail']"));
		e4.clear();
       e4.sendKeys(e.get(3));
		


		
		}	
		
	}
	@Then("user clicks on Create account")
	public void user_clicks_on_create_account() {
	 
	}

}
