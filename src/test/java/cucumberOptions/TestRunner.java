package cucumberOptions;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import resource.PropertyFileReader;

@CucumberOptions(
			features="src\\test\\java\\features",
			glue={"stepDefinition","cucumberHooks"},
			tags="@queueManagement",
			dryRun=false,
			plugin={"pretty","html:test-output/cucumber/report.html","json:test-output/cucumber/jsonreport.json","rerun:target/failedrerun.txt"},
			monochrome=true
			)
	public class TestRunner  extends AbstractTestNGCucumberTests{

	@DataProvider(parallel=false)
	public Object[][] scenarios(){
		return super.scenarios();
	}
	
	@Parameters({"browser"})
	@BeforeClass
	public void defineBrowser(String browser) throws Exception {
		PropertyFileReader.setBrowserType(browser);
	}
	
	
	
	}


