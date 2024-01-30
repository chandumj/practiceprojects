package steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestRediffRegister {
	WebDriver driver;
	@Given("User Opens chrome Browser")
	public void user_opens_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}

	@When("User enter the rediff account page URL, User captures the title")
	public void user_enter_the_rediff_account_page_url_user_captures_the_title() {
	   driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	  System.out.println(driver.getTitle());
	}

	@Then("User enter following details to create account")
	public void user_enter_following_details_to_create_account(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		WebElement e1 = driver.findElement(By.xpath("//table[@id='tblcrtac']/descendant::input[1]"));
		WebElement e2 = driver.findElement(By.xpath("//table[@id='tblcrtac']/descendant::input[2]"));
		WebElement e3 = driver.findElement(By.xpath("//table[@id='tblcrtac']/descendant::input[4]"));
		WebElement e4 = driver.findElement(By.xpath("//table[@id='tblcrtac']/descendant::input[5]"));
		WebElement e5 = driver.findElement(By.xpath("//table[@id='tblcrtac']/descendant::input[6]"));
		WebElement e6 = driver.findElement(By.xpath("//table[@id='tblcrtac']/descendant::input[13]"));
	
		List<List<String>> userList = dataTable.asLists(String.class);
		
		for(List<String> e: userList)
		{
			e1.clear();
			e1.sendKeys(e.get(0));
			e2.clear();
			e2.sendKeys(e.get(1));
			e3.clear();
			e3.sendKeys(e.get(2));
			e4.clear();
			e4.sendKeys(e.get(3));
			e5.clear();
			e5.sendKeys(e.get(4));
			e6.clear();
			e6.sendKeys(e.get(5));
			
			Thread.sleep(2000);
		}

	}

	@Then("User will close the browser")
	public void user_will_close_the_browser() {
		driver.close();

	}
}
