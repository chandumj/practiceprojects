package assistedPractices;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;

@SelectClasses(assistedPractices.TagsDemo.class)
@IncludeTags("feature1")
public class RunnerClassDemo {

}
