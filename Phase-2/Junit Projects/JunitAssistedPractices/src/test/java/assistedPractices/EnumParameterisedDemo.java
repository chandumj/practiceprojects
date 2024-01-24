package assistedPractices;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

public class EnumParameterisedDemo {

	enum values{
		SELENIUM,JMETER,POSTMAN
	}
	@ParameterizedTest(name="Enum value {arguments}")
	@EnumSource(values.class)
	public void TestMethod(Object value) {
		System.out.println(value.toString());

	}
}
