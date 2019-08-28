package co.uk.motors.hooks;

import co.uk.motors.helper.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before; 

public class hook extends BaseClass{

	@Before
	
	public void setup() throws Exception {
		
		launchBrowser("Chrome");
	}
	@After
	public void teardown () throws Exception {
		//closeBrowser();
	}
}

