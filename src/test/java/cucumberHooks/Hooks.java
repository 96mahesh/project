package cucumberHooks;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import resource.DriverClass;

public class Hooks {
	

	@Before
	public void initializingDriver() throws IOException {
		DriverClass.initializeDriver();
	} 
	
	@After
	public void quittingDriver() {
		DriverClass.quitDriver();
	}

}
