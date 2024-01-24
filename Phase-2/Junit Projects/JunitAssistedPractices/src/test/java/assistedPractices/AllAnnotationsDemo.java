package assistedPractices;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
@TestInstance(Lifecycle.PER_CLASS)
public class AllAnnotationsDemo {


	JavaOperations obj;
	
	// @BeforeAll is used to signal that the annotated method should beexecuted before all tests in the current test class
	
	@BeforeAll
	public  void setup()
	{
		System.out.println("Start DB connection");
		
		obj = new JavaOperations();
		
	}
	
	
	
	@Test
	public void method1()
	{
		System.out.println("Hello Junit");
	}
	
	@Test
	public void method2()
	{
		System.out.println("Test code of Java operations class");
	}
	
//	@AfterAll is used to signal that the annotated method should be executed after all tests in the current test class.
	
	@AfterAll
	public void teardown()
	{
		System.out.println("Close DB connections");
	}

}
