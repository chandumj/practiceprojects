package assistedPractices;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AssertionsDemo {
CalculatorClass obj;
	
	@BeforeEach
	public void setup()
	{
		obj = new CalculatorClass();
	}
	
	

	
	
	@Test
	public void Testadd()
	{
		int expectnumber = 40;
		int actualnumber = obj.add(2, 2);
		
		Assertions.assertEquals(expectnumber, actualnumber); // test will fail with assertion
		
		// give custom message with assertion method
	//	Assertions.assertEquals(expectnumber, actualnumber,"Sum is Incorrect..recheck the code");
	}
	
	@Test
	public void Testadd2()
	{
		int expectnumber = 40;
		int actualnumber = obj.add(2, 2);
		Assertions.assertNotEquals(expectnumber, actualnumber); // test will pass
	}
	@Test
	public void TestAssertArray()
	{
		
		Assertions.assertArrayEquals(new int[] {1,2,3}, new int[] {1,2,3});
		
		Assertions.assertArrayEquals(new int[] {1,2,3}, new int[] {1,2,3,4,5});
		
	}
	
	@Test
	public void TestassertNull()
	{
		String str1 = null;
		
		Assertions.assertNull(str1); // string is null, so test will pass
		
	}
	
	@Test
	public void TestassertnotNull()
	{
		String str1 = "selenium";
		
		Assertions.assertNotNull(str1); // string is not null, so test will pass
		
		
	}
	
	@Test
	public void TestassertSame()
	{
		String str1 = "selenium";
		
		String str2 = "tool";
		
		Assertions.assertSame(str1, str2);
		
	}
	
	@Test
	public void TestassertnotSame()
	{
		String str1 = "selenium";
		
		String str2 = "selenium";
		
		Assertions.assertNotSame(str1, str2);
		
	}
	@Test
	public void TestassertTrue()
	{
		int a =20;
		int b = 30;
		
		Assertions.assertTrue(a<b); // condition is true.. test will pass
		
		Assertions.assertFalse(a<b); // test will fail  as condition is true
		// for the above lines to pass, the condition should return false value
	}

}
