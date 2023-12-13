package objectRepository;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import resource.PropertyFileReader;

public class SignInPage {
	
	WebDriver driver;
	
	By txtEmailId=By.xpath("//input[@id='email']");
	By txtPassword=By.xpath("//input[@id='password']");
	By btnSignIn=By.xpath("//*[text()=' Sign in ']");
	By btnReset=By.xpath("//a[text()=' Reset ']");
	By lblEmailErrorMsg=By.xpath("//mat-error[text()=' Please enter a valid email address ']");
	By lblEcoSystemHome=By.xpath("//*[text()=' Eco-System ']");
	By btnEyeIcon=By.xpath("//mat-icon[@data-mat-icon-name='eye']");
	By txtPasswordDisplayed=By.xpath("//input[@id='password'and @type='text']");
	By btnCreatorLogin=By.xpath("//span[text()='Creator Login ']");
	
	
	
	public SignInPage(WebDriver driver) {
		this.driver=driver;
	}

	public void enterValidEmailId() throws IOException {
		driver.findElement(txtEmailId).sendKeys(PropertyFileReader.readData("emailAddress"));
	}
	
	public void enterValidPassword() throws IOException {
		driver.findElement(txtPassword).sendKeys(PropertyFileReader.readData("password"));
	}
	
	public void clickSignIn() {
		driver.findElement(btnSignIn).click();
	}
	
	public void verifyEcoSystemHomePage() {
		Assert.assertTrue(driver.findElement(lblEcoSystemHome).isDisplayed());
	}
	
	public void enterInValidEmailId(String emailId) throws IOException {
		driver.findElement(txtEmailId).sendKeys(emailId);
	}
	
	public void clickOnPasswordField() {
		driver.findElement(txtPassword).click();
	}
	
	public void verifyErrorMsgInEmailField(String message) {
		Assert.assertTrue(driver.findElement(lblEmailErrorMsg).getText().contains(message));
	}
	
	public void clickOnPasswordIcon() {
		driver.findElement(btnEyeIcon).click();
	}
	
	public void verifyPasswordDisplays() {
		Assert.assertTrue(driver.findElement(txtPasswordDisplayed).isDisplayed());
	}
	
	public void clickOnCreatorLogin() {
		driver.findElement(btnCreatorLogin).click();
	}
	


}
