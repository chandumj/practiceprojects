package assistedPractices;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StreamParameterisedDemo {
	
	public static Stream<String> Stringvalues() {
		return Stream.of("Selenium","Jmeter","postman");
	}
	
	public static Stream<Integer> intvalues() {
		return Stream.of(100,200,300);
	}
	@ParameterizedTest
	@MethodSource("Stringvalues")
	public void TestMethod(String input) {
		System.out.println("The value from String method is : " + input);
	}
	@ParameterizedTest
	@MethodSource("intvalues")
	public void TestMethod1(int input) {
		System.out.println("The value from String method is : " + input);
	}
}
