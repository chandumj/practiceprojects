package assistedPractices;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class ReapeatedAssumptionsDemo {


	@RepeatedTest(3)
	@Test
	public void AssumtionsDemo()
	{
		// Condition Assumed
		boolean isDBServerUp= true;
		
		Assumptions.assumeTrue(isDBServerUp);
		// the test case will aborted as the assumption is not true
		
		System.out.println("execute the tests");
	}
	
	@Test
	public void AssumtionsDemo2()
	{
		// Condition Assumed
		boolean isDBServerUp= false;
		
		Assumptions.assumeFalse(isDBServerUp);
		// the test case will aborted as the assumption is not true
		
		System.out.println("Dont exeucte test");
	}

}
