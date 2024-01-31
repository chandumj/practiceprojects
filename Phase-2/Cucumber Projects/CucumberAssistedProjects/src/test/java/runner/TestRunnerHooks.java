package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="F:\\MphasisPractice Eclipse\\CucumberAssistedProjects\\src\\test\\java\\features\\hooksDemo.feature"
				,
		glue = {"steps"},  // packagename where the steps are
		plugin= {"pretty","html:target/cucumberreport.html"}
		//dryRun=true
		
		
		)
public class TestRunnerHooks {

}
