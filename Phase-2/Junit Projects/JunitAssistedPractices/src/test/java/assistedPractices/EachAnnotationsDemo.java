package assistedPractices;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EachAnnotationsDemo {


	// @BeforeEach : execute the method before each test method
	
	JavaOperations obj;
	
	// @BeforeEach is used to signal that the annotated method should beexecuted before each @Test
	@BeforeEach
	public void setup()
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
	
	// @AfterEach : exeucte the method after each test method
	// @AfterEach is used to signal that the annotated method should be executed after each @Test
	
	@AfterEach
	public void teardown()
	{
		System.out.println("Close DB connections");
	}

}
