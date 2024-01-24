package assistedPractices;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class DynamicTestDemo {


	// A DynamicTest is a test case generated at runtime.
	
	@TestFactory
	public Collection<DynamicTest> genereatedynamictests()
	{
		
		return Arrays.asList(
				
				//lets write dynamic test code that will generate tests at runtime.
				DynamicTest.dynamicTest("Test1", () -> Assertions.assertTrue(true)),
				DynamicTest.dynamicTest("Test2", () -> Assertions.assertFalse(false)),
				DynamicTest.dynamicTest("Test3", () -> Assertions.assertEquals(4,2*2)),
				DynamicTest.dynamicTest("exception Handling",
				() -> {throw new Exception("Exception for Dynamic test");})
				
				
				);
		
	}

}
