package resource;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class WebActions extends DriverClass {
	
	public void takeScreenShot(String FileName) throws IOException {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File(System.getProperty("user.dir")+"/test-output/Screenshots/"+FileName+".png"));
	}
	
	public void uploadFileUsingRobotClass(String FileName) throws AWTException, Exception {
		Robot rb=new Robot();
		
		Thread.sleep(2000);
		String filepath = "C:\\TestPerformar\\HSBC_SSAP\\Statement_Pdfs\\Ratan.pdf";
		StringSelection str=new StringSelection(System.getProperty(filepath));
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		Thread.sleep(1000);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
	}

}
