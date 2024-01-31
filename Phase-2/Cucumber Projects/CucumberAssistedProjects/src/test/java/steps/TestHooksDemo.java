package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TestHooksDemo {
	// As the name suggest hooks are used to connect a method to a scenario
		// Hooks can be used to determin pre-equiste for the test case execution
		// hooks come with annotation =>
		// @Before : Annotated method will run before a scenario in feature file
		
		//, @After : Annotated method will run after a scenario in feature file
	//static WebDriver driver = new ChromeDriver();
		@Before()
		public void init()
		{
		System.out.println("test execution started");
		System.out.println("DB connection started");
			
		}
		@After()
		public void dbclose()
		{
		System.out.println("test execution completed");
		System.out.println("DB connection closed");
		
		}

}
