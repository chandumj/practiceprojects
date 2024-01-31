package steps;
import static steps.HooksAnnotationDemo.driver;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DataTableMapsDemo {
	@Given("User navigates to the registerPage")
	public void user_navigates_to_the_register_page() throws InterruptedException {
	   
		driver.navigate().to("https://tutorialsninja.com/demo/index.php?route=account/register");
	Thread.sleep(2000);
	}
	@Then("User enter registeration details")
	public void user_enter_registeration_details(io.cucumber.datatable.DataTable dataTable) {
	
		WebElement e1 = driver.findElement(By.xpath("//input[@id='input-firstname']"));
		WebElement e2 = driver.findElement(By.xpath("//input[@id='input-lastname']"));
		WebElement e3 = driver.findElement(By.xpath("//input[@id='input-email']"));
		WebElement e4 = driver.findElement(By.xpath("//input[@id='input-telephone']"));
		
	List<Map<String, String>> userList	= dataTable.asMaps(String.class,String.class);
		
	//| FirstName | LastName  | Email           | Telephone  |	
		for(Map<String,String> e : userList )
		
		{
		
		e1.clear();
		e1.sendKeys(e.get("FirstName"));
		e2.clear();
		e2.sendKeys(e.get("LastName"));
		e3.clear();
		e3.sendKeys(e.get("Email"));
		e4.clear();
		e4.sendKeys(e.get("Telephone"));
		
		}
		
		
	  
	}

}
