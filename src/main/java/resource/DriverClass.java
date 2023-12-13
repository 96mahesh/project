package resource;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverClass {
	
	public static WebDriver driver;
	public static ChromeOptions chromeoptions;
	public static EdgeOptions edgeoptions;
	public static FirefoxOptions firefoxoptions;

	public static WebDriver initializeDriver() throws IOException{
		
		String browserName = PropertyFileReader.getBrowserType();

		
		
		if(browserName.contains("chrome")) {
			System.out.println("Chrome browser is launched");
			WebDriverManager.chromedriver().setup();
			chromeoptions = new ChromeOptions();
			chromeoptions.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(chromeoptions);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
		
		else if(browserName.contains("edge")) {
			System.out.println("Edge browser is launched");
			WebDriverManager.edgedriver().setup();
			edgeoptions = new EdgeOptions();
			edgeoptions.addArguments("--remote-allow-origins=*");
			driver=new EdgeDriver(edgeoptions);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
		
		else if(browserName.contains("firefox")) {
			System.out.println("Firefox browser is launched");
			WebDriverManager.edgedriver().setup();
			firefoxoptions = new FirefoxOptions();
			//firefoxoptions.addArguments("--remote-allow-origins=*");
			driver=new FirefoxDriver(firefoxoptions);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
		
			return driver;
		
	}
	
	public static void launchURL() throws IOException {
		String url=PropertyFileReader.readData("url");
		driver.get(url);
	}
	
	public static void quitDriver() {
		driver.quit();
	}

}
