package assistedPractices;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
@Disabled("Functionality is not working, ignore the test")
public class DisabledAnnotation {
	@Test
	public void method1()
	{
		System.out.println("Hello Junit");
	}
	@Test
	public void method2()
	{
		System.out.println("Hello Junit");
	}
	@Test
	@Disabled  // this method will not be exeucted. It is disabled
	public void method3()
	{
		System.out.println("Hello Junit");
	}
	@Test
	public void method4()
	{
		System.out.println("Hello Junit");
	}


}
