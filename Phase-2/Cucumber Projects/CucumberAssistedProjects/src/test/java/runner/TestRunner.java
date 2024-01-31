package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "F:\\MphasisPractice Eclipse\\CucumberAssistedProjects\\src\\test\\java\\features\\login.feature",
glue = "steps",
plugin = {"pretty","html:target/cucumberreport.html"})
public class TestRunner {

}
