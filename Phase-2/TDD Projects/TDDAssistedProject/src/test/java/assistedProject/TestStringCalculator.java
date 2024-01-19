package assistedProject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestStringCalculator {
	// write a test case to 
	
		// that should send a String to the java code
		// java code will calculate the length of the String and give to the user.
		
		// test if length of String is equal to the length user has given

		
		@Test(priority='1')
		public void passString()
		{
			// I am assuming that I have a class StringCalculator,
			
			StringCalculator s1 = new StringCalculator();
			
			// I am assuming that the above class has method to compute length
			
			int actuallength = s1.stringlength("testDriven");
			
			int expectedlenght=10;
			
			// using testNg assertion I am comparing the length of the string
			
			Assert.assertEquals(actuallength, expectedlenght);
			
			
		}
		
		// The calculator should be able to add 2 strings
		
		@Test(priority='2')
		public void TestaddString()
		{
			
			// I am assuming that I have a class StringCalculator,
			
			StringCalculator str = new StringCalculator();
					
					// I am assuming that the above class has method to concatinate 2 strings
			
			String actualString= str.addstring("selenium","tool");
			
			String expectedString = "SELENIUMTOOL";
			
			Assert.assertEquals(actualString,expectedString);
		}
			
}
