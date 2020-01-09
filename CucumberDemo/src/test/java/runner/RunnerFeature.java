package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions 
       (
features = {"src/test/java/features"},
glue = {"stepDefinitions"},
plugin = {"pretty", "html:target/cucumber-reports", "pretty:target/pretty", "html:target/selenium-reports",
		"junit:target/junitrep", "json:target/json", "testng:target/tn"},
dryRun = false,
strict = false,
monochrome = true
//tags = {"@Regression"}
		
		)

public class RunnerFeature extends AbstractTestNGCucumberTests {
	
	

}
