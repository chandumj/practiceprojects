package assistedPractices;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class DynamicTestDemo1 {


	@TestFactory
	public Stream<DynamicTest> generatedynamicTest()
	{
		
		return Stream.of("pop","mom","madam","dad","mam")
				.map(inputText ->
				DynamicTest.dynamicTest(inputText,
					() -> Assertions.assertTrue(UtilClass.isPalindrome(inputText)))
							
						);


	}

}
