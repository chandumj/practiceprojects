package assistedPractices;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CSVParamaterisedDemo {
	
	@ParameterizedTest
	@CsvSource({"Selenium , v4",
		"Junit , v5",
		"TestNG , v7",
		"JMeter , v5",
		"Postman , v2"})
	public void testMethod(String value1,String value2) {
		System.out.println(value1 + " "+ value2);
	}
}
