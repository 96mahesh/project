package resource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;



public class PropertyFileReader {
	
	//public static ThreadLocal<Properties> property=new ThreadLocal<Properties>();
	
	static Properties prop;
	
	public static String readData(String name) throws IOException {
		
		
			prop=new Properties();
			FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"/testdata.properties");
			System.out.println(System.getProperty("user.dir")+"/testdata.properties");
			prop.load(fis);
			//property.set(prop);
			String value=prop.getProperty(name);
			//String value=property.get().getProperty(name);
			System.out.println(value);
		 
		return value;
	}
	
	public static void setBrowserType(String name) throws IOException {
		prop=new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"/testdata.properties");
		System.out.println(System.getProperty("user.dir")+"/testdata.properties");
		prop.load(fis);
		prop.setProperty("browserName", name);
		
		
	}
	
	public static String getBrowserType() {
		String browserName=prop.getProperty("browserName");
		return browserName;
	}

}
