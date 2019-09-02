package co.uk.motors.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/co/uk/motors/features"},
		plugin =  {"html:target/cucumber-html-report",
					"json:target/cucumber.json",
					"pretty:target/cucumber-pretty.txt",
					"usage:target/cucumber-usage.jason",
					"junit:target/cucimber-result.xml"},
		glue = {"co.uk.motors.hooks", "co.uk.motors.stepDefinitions"}
		)

public class Runner {

}
