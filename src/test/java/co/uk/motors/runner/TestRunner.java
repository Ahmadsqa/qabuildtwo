package co.uk.motors.runner;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.ExtentCucumberFormatter;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		features = {"src/test/java/co/uk/motors/features"},
		glue = {"co.uk.motors.hooks", "co.uk.motors.stepDefinitions"}
				
		)
		

public class TestRunner {

	@BeforeClass
	public static void setup() {
		String dateNow = new SimpleDateFormat("ddMMyy").format(new GregorianCalendar().getTime());
		String timeNow = new SimpleDateFormat("HHmmss").format(new GregorianCalendar().getTime());
		
		String fileName = String.format("./report/%s/report_%s.html", dateNow, timeNow);
		
		ExtentCucumberFormatter.initiateExtentCucumberFormatter(new File(fileName));;
		ExtentCucumberFormatter.loadConfig(new File("scr/test/java/co/uk/motors/resources/extent-config.xml"));
		ExtentCucumberFormatter.addSystemInfo("Browser Name", "Chrome");
		ExtentCucumberFormatter.addSystemInfo("Browser Version", "76.0.3809.132");
		ExtentCucumberFormatter.addSystemInfo("Selenium Version", "3.141.59");
		
	}
	
	
}
