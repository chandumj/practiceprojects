package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;

public class HooksAnnotationDemo {

	static WebDriver driver=new ChromeDriver();
	@BeforeAll
	public static void featureStart() // this annotated method will execute before any of the scenario in feature begins
	{
		System.out.println("The feature started Execution");
			
	}
	
	
	@AfterAll
	public static void featureCompleted()
	
	// this annotated method will execute after all the scenarios in feature completed
	
	{
		System.out.println("The feature Execution Completed");
	}
	
	
	
	
	
	
	@Before(order=1)
	public void openBrowser()
	{
		System.out.println("task 1. Open Browser window");
		
	}
	
	@Before(order=2)
	public void ManageBrowser()
	{
		System.out.println("task 2. Manage Browser window");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	@Before(order=3)
	public void enterURL()
	{
		System.out.println("task 3. Enter the URL");
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Wikipedia%3ASign+up");
	}
	
	
	@BeforeStep
	public void stepstart()
	{
		System.out.println("Step Execution Started");
	}
	
	
	@AfterStep
	public void stepCompleted()
	{
		System.out.println("Step Execution Completed");
	}
	
	
	
	
	@After(order=2)
	public void captureFinalTitle()
	{
		System.out.println("AfterScenarioTask 1. Capture final Page title");
		System.out.println(driver.getTitle());
	}
	
	@After(order=1)
	public void CloseBrowser()
	{
		System.out.println("AfterScenarioTask 2. Close the Browser");
		driver.close();
	}

}
