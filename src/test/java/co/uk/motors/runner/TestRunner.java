package co.uk.motors.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/co/uk/motors/features"},
		plugin =  {"pretty", "json:target/report.json", "de.monochromata.cucumber.report.PrettyReports:target/pretty-cucumber"},
		glue = {"co/uk/motors/hooks", "co/uk/motors/stepDefinitions"}
		)

public class TestRunner {

}
