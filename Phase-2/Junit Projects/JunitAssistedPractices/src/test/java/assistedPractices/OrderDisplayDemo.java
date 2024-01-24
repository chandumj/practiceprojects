package assistedPractices;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

//@TestMethodOrder(MethodOrderer.Random.class)

public class OrderDisplayDemo {
	
	   @Order(3)
	   @DisplayName("SignButton")
		@Test
		public void method1()
		{
			System.out.println("test Sign in button");
		}
	   @Order(1)
		@Test
		@DisplayName("enterUsername")
		public void method2()
		{
			System.out.println("enter Username");
		}
	   @Order(2)
		@Test
		@DisplayName("enterPassword")
		public void method_new()
		{
			System.out.println("enter password");
		}
	   @Order(4)
		@Test
		@DisplayName("Forget password")
		public void method_new1()
		{
			System.out.println("Test forget password");
		}

}
