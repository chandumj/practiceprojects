package assistedPractices;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.EnumSource;

public class ArgumentConversionExplict {
	@ParameterizedTest
	@EnumSource(TimeUnit.class)
	public void testcaseforExplicit(@ConvertWith(ToStringArgumentConverter.class) String argument)

	{
		System.out.println("The timeUnit is:" + argument);
		Assertions.assertNotNull(TimeUnit.valueOf(argument));

	}

}
