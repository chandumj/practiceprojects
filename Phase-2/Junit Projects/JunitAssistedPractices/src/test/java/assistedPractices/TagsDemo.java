package assistedPractices;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.IncludeTags;

@IncludeTags({"feature1"})
public class TagsDemo {
	@Test
	@Tag("feature1")
	public void method1() {
		System.out.println("method 1 feature 1");
	}
	@Test
	@Tag("feature2")
	public void method2() {
		System.out.println("method 1 feature 2");
	}
	
}
