package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=
				"F:\\MphasisPractice Eclipse\\CucumberAssistedProjects\\src\\test\\java\\features\\tagsDemo.feature",
		glue = {"steps"},  // packagename where the steps are
		plugin= {"pretty","html:target/cucumberreport.html"},
		//dryRun=true
		// tags="@sanity", // all the scenario is feature file with tagname sanity will get executed
		//tags="@regression and @search"  // and operator// scanerios whicha re having both of thes etags will run
		//tags="@regression or @sanity"
		// tags="@all" // all scnaerios will run
		
		tags = "@all" // run all the scenarios except scenario with tag search
		
		)

public class TestRunnerTags {

}
