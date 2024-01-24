package assistedPractices;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class ConditionsDemo {
	@Test
	@EnabledOnOs(OS.MAC)
	public void osMethod() {
		System.out.println("OS method executed");
	}
	
	@Test
	@EnabledOnJre(JRE.JAVA_18)
	public void jREMethod() {
		System.out.println("JRE method executed");
	}
	
	@Test
	@EnabledForJreRange(min = JRE.JAVA_10, max= JRE.JAVA_17)
	// condition is If the java version on laptop is in between 10 to 17 -> run the test else ignore/disable the test
	public void testConditionJRErange()
	{
		System.out.println("Java version is matching and test is exeucted");
	}

	@Test
	@EnabledForJreRange(min = JRE.JAVA_14, max = JRE.JAVA_18)
	public void jrerangeMethod() {
		System.out.println("JRE Range method executed");
	}
	

@Test
	@EnabledIfSystemProperty(named="java.vm.vendor", matches="Oracle.*")
	// condition is If the java version is provided by oracle-> run the test else ignore/disable the test
	public void testConditionSystemProperty()
	{
		System.out.println("Java version is installed by oracle and test is exeucted");
	}
	
 @Test
	 
	  @EnabledIfEnvironmentVariable(named = "myENVOS", matches="Linux") //
	  public void testConditionEnvVariables() {
	  System.out.println(" Envirnoment varibale is linux and test is exeucted");
	  }

}
