package steps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestLoginFeature {
	// In cucmber we dont use Junit Annotations
		// we use cucumber annotation:
		// @Given , @Then, @When, @And, @But
		
	// In this file we create method for every feature step
	static WebDriver driver = new ChromeDriver();	
	@Given("User is on Chrome browser")
	public void user_is_on_chrome_browser() {
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}

	@When("User is on Chrome browser users enters the URL")
	public void user_is_on_chrome_browser_users_enters_the_url() {
		driver.get("https://tutorialsninja.com/demo/");

	}

	@Then("User gets title of the page")
	public void user_gets_title_of_the_page() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	@When("User will enter a product in search box")
	public void user_will_enter_a_product_in_search_box() {
	 
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("imac");
	}
	@When("user click on submit button")
	public void user_click_on_submit_button() {
	   driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
	
	}
	@Then("product list should be displayed")
	public void product_list_should_be_displayed() {
	 
		System.out.println(driver.getTitle());
	}
	@When("user click on Addto cart link")
	public void user_click_on_addto_cart_link() {
	  driver.findElement(By.xpath("//a[@title='Shopping Cart']//i[@class='fa fa-shopping-cart']")).click();
	}
	@Then("user is navigated to Cart page")
	public void user_is_navigated_to_cart_page() {
		System.out.println(driver.getTitle());
	}
	
	@And("user closes the browser")
	public void teardown()
	{
		driver.close();
	}

	
}
