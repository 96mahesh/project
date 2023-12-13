package objectRepository;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import resource.ExcelReader;
import resource.PropertyFileReader;
import resource.WebActions;

public class CreatorPage {
	
	WebDriver driver;
	WebActions actions=new WebActions();
	int heightFullscreen=0;
	int widthFullscreen=0;
	int heightNormal=0;
	int widthNormal=0;
	
	By lblLogo=By.xpath("//img[@src='assets/images/logo/logo-text.svg']");
	By lblHome=By.xpath("//*[text()=' Home ']");
	By btnFullScreen=By.xpath("(//*[name()='svg'])[1]");
	By btnProfile=By.xpath("//mat-icon[@class='mat-icon notranslate mat-icon-no-color']//*[name()='svg']//*[name()='path' and contains(@stroke-linecap,'round')]");
	By lblCreatorSign=By.xpath("(//strong[contains(text(),'Creator')])[5]");
	By lblProfileName=By.xpath("//span[text()='Muskan ']");
	By lblProfileMail=By.xpath("//span[text()='muskan@ssapidos.onmicrosoft.com']");
	By btnSwitchRole=By.xpath("//mat-icon[@data-mat-icon-name='users']");
	By btnSwithRolePanel=By.xpath("//div[@id='mat-menu-panel-1']");
	By btnSignout=By.xpath("//span[text()='Sign out']");
	
	
	By lblQueueManagement=By.xpath("//mat-panel-title[text()=' Queue Management ']");
	By lblCompletedQueue=By.xpath("//mat-panel-title[text()=' Completed Queue ']");
	By lblFailedTransactions=By.xpath("//mat-panel-title[text()=' Failed Transactions ']");
	By lblMyPendingActivities=By.xpath("//mat-panel-title[text()=' My Pending Activities ']");
	By btnSignIn=By.xpath("//*[text()=' Sign in ']");
	By lblRefNo=By.xpath("(//strong[text()='Ref. No.'])[1]");
	By lblCustomerName=By.xpath("(//strong[text()='Customer Name'])[1]");
	By lblCustomerId=By.xpath("(//strong[text()='Customer ID'])[1]");
	By lblActionParticular=By.xpath("(//strong[text()='Action Particular'])[1]");
	By lblCreator=By.xpath("(//strong[text()='Creator'])[1]");
	By lblAprrover=By.xpath("(//strong[text()='Approver'])[1]");
	By lblRM=By.xpath("(//strong[text()='RM'])[1]");
	By lblCommunicationNotes=By.xpath("(//strong[text()='Communication Notes'])[1]");
	By lblPendingWith=By.xpath("(//strong[text()='Pending WIth'])[1]");
	By lblExpDate=By.xpath("(//strong[text()='Exp. Date'])[1]");
	By lblManagedDocuments=By.xpath("(//strong[text()='Managed Documents'])[1]");
	By btnExpansionQueueManagement=By.xpath("(//span[contains(@class,'mat-expansion-indicator')])[1]");
	By lblQueueManagementElements=By.xpath("(//mat-expansion-panel-header[contains(@class,'mat-expansion-panel-header')])[1]");
	//By lblQueueManagementElementsMinimized=By.xpath("//mat-expansion-panel-header[@aria-expanded='false']//child::mat-panel-title[text()=' Queue Management ']");
	By lblQueueManagementElementsMinimized=By.xpath("(//mat-expansion-panel-header[contains(@class,'mat-expansion-panel-header')])[1]");
	By txtCustomerIdQueue=By.xpath("//input[@id='mat-input-2']");
	By btnRefresh=By.xpath("//mat-icon[normalize-space()='refresh']");
	By btnUploadStatement=By.xpath("//span[text()='Upload Statement ']");
	By btnDownloadTemplate=By.xpath("//span[@class='mat-button-wrapper' and text()='Download Template ']");
	By btnUploadStatementPDFDropdown=By.xpath("//mat-icon[text()='picture_as_pdf']");
	By lstCustomerNameUpload=By.xpath("//span[text()='Dummy Customer']");
	By lstCustomerIDUpload=By.xpath("//span[@class='text-sm leading-tight']");
	By btnUploadStatementInPopup=By.xpath("//div[@class='flex w-full']//button[@color='primary']");
	By btnUpload=By.xpath("//span[text()='Upload']");
	By btnCancel=By.xpath("//span[text()='Cancel']");
	By btnSortArrow=By.xpath("(//div[contains(@class,'mat-sort-header-arrow')])[1]");
	By lstRefNo=By.xpath("//tbody[@role='rowgroup']/tr/td[1]");
	By lstCustomerId=By.xpath("//tbody[@role='rowgroup']/tr/td[3]");
	By btnManagedDocumentDownload=By.xpath("(//mat-icon[@aria-label='Example home icon'][normalize-space()='download'])[2]");
	By lblUploadStatementCard=By.xpath("//mat-card-title[@class='mat-card-title']");
	By btnItemsPerPage=By.xpath("//div[@id='mat-select-value-3']");
	By btnPageCountMax=By.xpath("//span[@class='mat-option-text' and text()=' 500 ']");
	By btnCreatorUnassigned=By.xpath("//tbody[@role='rowgroup']/tr/td[5]");
	By btnCustomerIdUnassigned=By.xpath("//tbody[@role='rowgroup']/tr/td[3]");
	By btnCustomerNameUnassigned=By.xpath("//tbody[@role='rowgroup']/tr/td[2]");
	By txtPickCustomer=By.xpath("//input[@data-placeholder='Pick Customer']");
	By customersttingL = By.xpath("//strong[text()='Customer Settings']");
	
	By txtStatementCalender=By.xpath("(//button[@aria-label='Open calendar'])[1]");
	By btnCalenderMonthYear=By.xpath("//span[@id='mat-calendar-button-0']");
	By btnPreviousYears=By.xpath("//button[@aria-label='Previous 24 years']");
	By lstYears=By.xpath("//button[contains(@class,'mat-calendar-body-cell')]");
	By lstMonths=By.xpath("//button[contains(@class,'mat-calendar-body-cell')]");
	By lstDates=By.xpath("//button[contains(@class,'mat-calendar-body-cell')]");
	By txtHSBCSanctionedFundLimit=By.xpath("//ssap-input[@formcontrolname='stockInformationHsbcSanctionedFundBasedLimit']/div/input");
	By btnDetails=By.xpath("//strong[text()='Details']");
	By btnStockValueDetails=By.xpath("//mat-panel-title[text()=' Stock Value Details ']");
	By btnCreditValueDetails=By.xpath("//mat-panel-title[text()=' Creditors Value Details ']");
	By btnPostMarginDeductionsValueDetails=By.xpath("//mat-panel-title[text()=' Post Margin Deductions Value Details ']");
	By btnAgeingDetailsDomestic=By.xpath("//mat-panel-title[text()=' Ageing Details - Domestic ']");
	By btnAgeingDetailExport=By.xpath("//mat-panel-title[text()=' Ageing Details - Export ']");
	By btnOtherDetails=By.xpath("//mat-panel-title[text()=' Other Details ']");
	
	By txtRM=By.xpath("//ssap-input[@formcontrolname='stockRmGrossValue']/div/input");
	By txtFG=By.xpath("//ssap-input[@formcontrolname='stockFgGrossValue']/div/input");
	By txtWIP=By.xpath("//ssap-input[@formcontrolname='stockWipGrossValue']/div/input");
	By txtConsumables=By.xpath("//ssap-input[@formcontrolname='stockConsumablesGrossValue']/div/input");
	By txtStockAgainstLC=By.xpath("//ssap-input[@formcontrolname='stockStockAgainstLcGrossValue']/div/input");
	By txtStockInTransit=By.xpath("//ssap-input[@formcontrolname='stockStockInTransitGrossValue']/div/input");
	By txtStockWithThirdParty=By.xpath("//ssap-input[@formcontrolname='stockStockWithThirdPartyGrossValue']/div/input");
	By txtScrapStock=By.xpath("//ssap-input[@formcontrolname='stockScrapStockGrossValue']/div/input");
	By txtCreditorsUnderLC=By.xpath("//ssap-input[@formcontrolname='creditorsCreditorsUnderLc']/div/input");
	By txtCreditorsOthers=By.xpath("//ssap-input[@formcontrolname='creditorsCreditorsOthers']/div/input");
	By txtAdvancePaidToSuppliers=By.xpath("//ssap-input[@formcontrolname='creditorsAdvancePaidToSuppliers']/div/input");
	By txtBuyerCredit=By.xpath("//ssap-input[@formcontrolname='postMarginDeductionsBuyerCredit']/div/input");
	By txtCommercialPaper=By.xpath("//ssap-input[@formcontrolname='postMarginDeductionsCommercialPaper']/div/input");
	By txtDomestic_0_30Days=By.xpath("//ssap-input[@formcontrolname='ageingDetailsDomestic030DaysDomesticDebitors']/div/input");
	By txtDomestic_31_60_Days_0_60_days_upto_60_Days=By.xpath("//ssap-input[@formcontrolname='ageingDetailsDomestic3060DaysDomesticDebitors']/div/input");
	By txtDomestic_61_90_Days_Above_60_Days=By.xpath("//ssap-input[@formcontrolname='ageingDetailsDomestic6090DaysDomesticDebitors']/div/input");
	By txtDomestic_31_90_Days_0_90_Days_upto_90_Days=By.xpath("//ssap-input[@formcontrolname='ageingDetailsDomestic3090DaysDomesticDebitors']/div/input");
	By txtDomestic_0_45_Days_upto_45_Days=By.xpath("//ssap-input[@formcontrolname='ageingDetailsDomestic045DaysDomesticDebitors']/div/input");
	By txtDomestic_46_90_Days_Above_45_Days=By.xpath("//ssap-input[@formcontrolname='ageingDetailsDomestic4590DaysDomesticDebitors']/div/input");
	By txtDomestic_91_120_Days_Above_90_Days_upto_120_Days_61_120_days=By.xpath("//ssap-input[@formcontrolname='ageingDetailsDomestic91120DaysDomesticDebtors']/div/input");
	By txtDomestic_121_150_Days_Above_120_Days_61_150_Days_91_150_Days_upto_150_Days=By.xpath("//ssap-input[@formcontrolname='ageingDetailsDomestic121150DaysDomesticDebitors']/div/input");
	By txtDomestic_151_180_Days_Above_150_Days=By.xpath("//ssap-input[@formcontrolname='ageingDetailsDomestic151180DaysDomesticDebitors']/div/input");
	By txtDomestic_121_180_Days_upto_180_Days_61_180_days_91_180_days=By.xpath("//ssap-input[@formcontrolname='ageingDetailsDomestic121180DaysDomesticDebitors']/div/input");
	By txt_Domestic_181_365_Days_Above_180_Days_upto_270_Days_upto_1_year=By.xpath("//ssap-input[@formcontrolname='ageingDetailsDomestic181365DaysDomesticDebitors']/div/input");
	By txtDomestic_Above_365_Days_Above_270_Days=By.xpath("//ssap-input[@formcontrolname='ageingDetailsDomesticAbove365DaysDomesticDebitors']/div/input");
	By txtDomestic_Others_Eligible_Debtors_case_of_Debtors_days_Others=By.xpath("//ssap-input[@formcontrolname='ageingDetailsDomesticOthersDomestic']/div/input");
	By txtBillDiscounted=By.xpath("//ssap-input[@formcontrolname='ageingDetailsDomesticBillDiscountedDomesticDebitors']/div/input");
	By txtAdvanceFromCustomers=By.xpath("//ssap-input[@formcontrolname='ageingDetailsDomesticAdvanceFromCustomersDomesticDebitors']/div/input");
	By txtExport_0_30_Days=By.xpath("//ssap-input[@formcontrolname='ageingDetailsExport030Days']/div/input");
	By txtExport_31_60_Days_0_60_days_upto_60_Days=By.xpath("//ssap-input[@formcontrolname='ageingDetailsExport3060Days']/div/input");
	By Export_61_90_Days_Above_60_Days=By.xpath("//ssap-input[@formcontrolname='ageingDetailsExport6090Days']/div/input");
	By Export_31_90_Days_0_90_Days_upto_90_Days=By.xpath("//ssap-input[@formcontrolname='ageingDetailsExport3090Days']/div/input");
	By Export_0_45_Days_upto_45_Days=By.xpath("//ssap-input[@formcontrolname='ageingDetailsExport045Days']/div/input");
	By Export_46_90_Days_Above_45_Days=By.xpath("//ssap-input[@formcontrolname='ageingDetailsExport4590Days']/div/input");
	By Export_91_120_Days_Above_90_Days_upto_120_Days_61_120_days=By.xpath("//ssap-input[@formcontrolname='ageingDetailsExport91120Days']/div/input");
	By Export_121_150_Days_Above_120_Days_61_150_Days_91_150_Days_upto_150_Days=By.xpath("//ssap-input[@formcontrolname='ageingDetailsExport121150Days']/div/input");
	By Export_151_180_Days_Above_150_Days=By.xpath("//ssap-input[@formcontrolname='ageingDetailsExport151180Days']/div/input");
	By Export_121_180_Days_upto_180_Days_61_180_days_91_180_days=By.xpath("//ssap-input[@formcontrolname='ageingDetailsExport121180Days']/div/input");
	By Export_181_365_Days_Above_180_Days_upto_270_Days_upto_1_year=By.xpath("//ssap-input[@formcontrolname='ageingDetailsExport181365Days']/div/input");
	By Export_Above_365_Days_Above_270_Days=By.xpath("//ssap-input[@formcontrolname='ageingDetailsExportAbove365Days']/div/input");
	By Export_Others_Eligible_Debtors_in_case_Debtors_days_Others=By.xpath("//ssap-input[@formcontrolname='ageingDetailsExportOthers']/div/input");
	By for_Reporting_month_Sale=By.xpath("//ssap-input[@formcontrolname='otherDetailsForReportingMonthSales']/div/input");
	By for_Reporting_month_Purchase=By.xpath("//ssap-input[@formcontrolname='otherDetailsForReportingMonthPurchase']/div/input");
	By YTD_Sale=By.xpath("//ssap-input[@formcontrolname='otherDetailsYtdSales']/div/input");
	By YTD_Purchase=By.xpath("//ssap-input[@formcontrolname='otherDetailsYtdPurchase']/div/input");
	By crmLcValue = By.xpath("//input[@type='text']");
	By callenderL = By.xpath("//mat-datepicker-toggle[@class='mat-datepicker-toggle ng-tns-c29-171']");
	By callenderIcon = By.xpath("(//button[@aria-label='Open calendar'])[2]");
	By recivedCallender = By.xpath("//*[@id='mat-input-8']");
	By listOfDateL = By.xpath("//*[@id='mat-datepicker-1']");
	By prvBtnL = By.xpath("//button[@aria-label='Previous month']");
	By suggestedDatesL = By.xpath("//table[@class='mat-calendar-table']//tbody//tr//td");
	
   
	public CreatorPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void verifyCreatorHomePage() {
		Assert.assertTrue(driver.findElement(lblHome).isDisplayed());
	}
	
	public void verifyLogo() {
		Assert.assertTrue(driver.findElement(lblLogo).isDisplayed());
	}
	
	public void verifyCreatorHomeButton() {
		Assert.assertTrue(driver.findElement(lblHome).isDisplayed());
	}
	
	public void verifyFullscreenIcon() throws InterruptedException {
		Thread.sleep(3000);
		Assert.assertTrue(driver.findElement(btnFullScreen).isDisplayed());
	}
	
	public void clickOnFullscreenIcon() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(btnFullScreen).click();
	}
	
	public void verifySiteInFullscreenMode() throws IOException {
//		String FileName="SiteFullScreen";
//		actions.takeScreenShot(FileName);
		Dimension size = driver.manage().window().getSize();
	    heightFullscreen = size.getHeight();
	    widthFullscreen =  size.getWidth();
	    System.out.println("height " + heightFullscreen + " width " + widthFullscreen);
	}
	
	public void verifySiteInNormalMode() throws IOException {
		Dimension size = driver.manage().window().getSize();
	    heightNormal = size.getHeight();
	    widthNormal =  size.getWidth();
	    System.out.println("height " + heightNormal + " width " + widthNormal);
	    Assert.assertTrue(heightNormal<heightFullscreen);
	    
		}
	
	
	public void verifyProfileIcon() {
		Assert.assertTrue(driver.findElement(btnProfile).isDisplayed());
	}
	
	public void verifyQueueManagement() {
		//Assert.assertTrue(driver.findElement(lblQueueManagement).isDisplayed());
		String expected=driver.findElement(lblQueueManagement).getText();
		String actual="Queue Management";
		if(expected.contains(actual)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		}
	
	public void verifyCompletedQueue() {
		Assert.assertTrue(driver.findElement(lblCompletedQueue).isDisplayed());
		}
	
	public void verifyFailedTransactions() {
		Assert.assertTrue(driver.findElement(lblFailedTransactions).isDisplayed());
		}
	
	public void verifyMyPendingActivities() {
		Assert.assertTrue(driver.findElement(lblMyPendingActivities).isDisplayed());
		}
	
	public void clickOnProfileIcon() {
		driver.findElement(btnProfile).click();
	}
	
	public void verifySignedAsCreator() {
		Assert.assertTrue(driver.findElement(lblCreatorSign).isDisplayed());
	}
	
	public void verifyProfileName() {
		Assert.assertTrue(driver.findElement(lblProfileName).isDisplayed());
	}
	
	public void verifyProfileEmail() {
		Assert.assertTrue(driver.findElement(lblProfileMail).isDisplayed());
	}
	
	public void verifySwitchRole() {
		Assert.assertTrue(driver.findElement(btnSwitchRole).isDisplayed());
	}

	public void hoverOnSwitchRoleButton() {
//		Actions actions=new Actions(driver);
//		actions.moveToElement((WebElement) btnSwitchRole).build().perform();
		driver.findElement(btnSwitchRole).click();
	}
	
	public void verifyRolesListed() {
		Assert.assertTrue(driver.findElement(btnSwithRolePanel).isDisplayed());
	}
	
	public void verifySignOut() {
		Assert.assertTrue(driver.findElement(btnSignout).isDisplayed());
	}
	
	public void clickOnSignout() {
		driver.findElement(btnSignout).click();
	}
	
	public void verifySignInPageAfterSignout() {
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(btnSignIn));
		Assert.assertTrue(driver.findElement(btnSignIn).isDisplayed());
	}

	
	public void verifyUpwardIconQueueManagement() {
		Assert.assertTrue(driver.findElement(btnExpansionQueueManagement).isDisplayed());
	}
	
	public void clickOnExpansionQueueManagement() {
		driver.findElement(btnExpansionQueueManagement).click();
	}
	
	public void verifyQueueManagementMinimized() {
		String value=driver.findElement(lblQueueManagementElements).getAttribute("aria-expanded");
		Assert.assertEquals(value,"false");
	}
	
	public void verifyQueueManagementElementsVisible() {
		String value=driver.findElement(lblQueueManagementElements).getAttribute("aria-expanded");
		Assert.assertEquals(value,"true");
	}
	
	public void verifyCustomerTextboxQueue() throws Exception {
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(txtCustomerIdQueue).isDisplayed());
	}
	
	public void verifyRefreshButton() {
		Assert.assertTrue(driver.findElement(btnRefresh).isDisplayed());
	}
	
	public void verifyUploadStatementButton() {
		Assert.assertTrue(driver.findElement(btnUploadStatement).isDisplayed());
	}
	
	public void verifyDownloadTemplateButton() {
		Assert.assertTrue(driver.findElement(btnDownloadTemplate).isDisplayed());
	}
	
	public void verifyRefNoColumnQueue() {
		Assert.assertTrue(driver.findElement(lblRefNo).isDisplayed());
	}
	
	public void verifyCustomerNameColumnQueue() {
		Assert.assertTrue(driver.findElement(lblCustomerName).isDisplayed());
	}
	
	public void verifyCustomerIdColumnQueue() {
		Assert.assertTrue(driver.findElement(lblCustomerId).isDisplayed());
	}
	
	public void verifyActionParticularColumnQueue() {
		Assert.assertTrue(driver.findElement(lblActionParticular).isDisplayed());
	}
	
	public void verifyCreatorColumnQueue() {
		Assert.assertTrue(driver.findElement(lblCreator).isDisplayed());
	}
	
	public void verifyAproverColumnQueue() {
		Assert.assertTrue(driver.findElement(lblAprrover).isDisplayed());
	}

	public void verifyRMColumnQueue() {
		Assert.assertTrue(driver.findElement(lblRM).isDisplayed());
	}

	
	public void verifyCommunicationNotesColumnQueue() {
		Assert.assertTrue(driver.findElement(lblCommunicationNotes).isDisplayed());
	}
	
	public void verifyPendingWithColumnQueue() {
		Assert.assertTrue(driver.findElement(lblPendingWith).isDisplayed());
	}
	
	public void verifyExpDateColumnQueue() {
		Assert.assertTrue(driver.findElement(lblExpDate).isDisplayed());
	}
	
	public void verifyManagedDocumentsColumnQueue() {
		Assert.assertTrue(driver.findElement(lblManagedDocuments).isDisplayed());
	}

	public void entersCustomerIdQueue() throws IOException {
		String value=PropertyFileReader.readData("customerIdQueue");
		driver.findElement(txtCustomerIdQueue).sendKeys(value);
	}
	
	public void verifyCustomerIdEnteredVisibleQueue() throws IOException, InterruptedException {
//		Thread.sleep(3000);
//		actions.takeScreenShot("img 😊");
//		String value=PropertyFileReader.readData("customerIdQueue");
//		List<WebElement> listCustomerId=driver.findElements(lstCustomerId);
//		for(int i=0;i<listCustomerId.size();i++) {
//			listCustomerId=driver.findElements(lstCustomerId);
//			String customerId=listCustomerId.get(0).getText();
//			System.out.println("Customer id  : "  + customerId);
//			if(value.equals(customerId)) {
//				Assert.assertTrue(true);
//			}
//			else {
//				Assert.assertTrue(false);
//				break;
//			}
//		}
		
//		for (WebElement ele : listCustomerId) {
//			System.err.println(ele);
//		}
			
		
	}
	
	public void clickOnRefreshButton() {
		driver.findElement(btnRefresh).click();
	}
	
	public void verifyPageRefreshed() throws IOException {
		actions.takeScreenShot("RefreshedPage");
	}
	
	public void clickOnDownloadTemplate() {
		driver.findElement(btnDownloadTemplate).click();
	}
	
	public void verifyTemplateDownloaded() throws IOException {
		actions.takeScreenShot("TemplateDownloaded");
	}
	
	public void clickOnSortButtonQueue() throws InterruptedException {
		driver.findElement(btnSortArrow).click();
	}
	
	public void verifyRefNoSorted() {
		ArrayList al=null;
		List<WebElement> listRefNo=driver.findElements(lstRefNo);
		for(int i=0;i<5;i++) {
			String refNo=listRefNo.get(i).getText().split("SS")[1];
			System.out.println(refNo);
			//int refNoInteger=Integer.parseInt(refNo);
			long refNoInteger=Long.parseLong(refNo);
			al=new ArrayList();
			al.add(refNoInteger);
		}
		TreeSet ts=new TreeSet();
		ts.addAll(al);
		ArrayList al2=new ArrayList();
		for(Object x:ts) {
			al2.add(x);
	}
	
		if(al.equals(al2)==true) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		
	}
	
	public void clickOnManagedDocumentDownload() {
		driver.findElement(btnManagedDocumentDownload).click();
	}
	
	public void verifyManagedDocumentDownloaded() throws IOException {
		actions.takeScreenShot("ManagedDocumentDownload");
	}
	
	public void clickOnUploadStatementButton() {
		driver.findElement(btnUploadStatement).click();
	}
	
	public void clickOnUploadStatementPdfInDropdown() throws Exception {
		Thread.sleep(2000);
		driver.findElement(btnUploadStatementPDFDropdown).click();
	}
	
	public void verifyUploadStatementCard() throws InterruptedException {
		Thread.sleep(3000);
		Assert.assertTrue(driver.findElement(lblUploadStatementCard).isDisplayed());
	}
	
	public void verifyUploadButton() {
		Assert.assertTrue(driver.findElement(btnUpload).isDisplayed());
	}
	
	public void verifyCancelButton() {
		Assert.assertTrue(driver.findElement(btnCancel).isDisplayed());
	}
	
	public void clickOnCustomerDetails() throws IOException, Exception {
		Thread.sleep(2000);
		driver.findElement(txtPickCustomer).sendKeys(PropertyFileReader.readData("customerNameStatement"));
		//String value=PropertyFileReader.readData("customerNameStatement");
		String valueUppercase=PropertyFileReader.readData("customerNameStatement");
		System.err.println(valueUppercase);
		List<WebElement> listCustomerName=driver.findElements(lstCustomerNameUpload);
		for(int i=0;i<listCustomerName.size();i++) {
			String customerName=listCustomerName.get(i).getText();
			System.err.println(customerName);
			if(customerName.contains(valueUppercase)) {   
				listCustomerName.get(i).click();
				break;
			}
		}
		
	}
	
	public void uploadsStatement() throws Exception {
		actions.takeScreenShot("pic1");
		Thread.sleep(2000);
	 driver.findElement(btnUploadStatementInPopup).click();
//		Actions action = new Actions(driver);
//		action.click(ele).build().perform();
		
		
		Thread.sleep(5000);
		Runtime.getRuntime().exec("C:\\Users\\Mahesh\\OneDrive\\Desktop\\HSBC_28_08_23_FileUpload.exe");
		//actions.uploadFileUsingRobotClass("Ratan");
	}
	
	public void clickOnUploadButton() throws InterruptedException, Exception {
		Thread.sleep(3000);
		actions.takeScreenShot("img1");
		WebElement Uploadele =driver.findElement(btnUpload);
		Actions action = new Actions(driver);
		action.click(Uploadele).build().perform();
		Thread.sleep(25000);
	}
	
	public void verifyNewCustomerDetails() throws InterruptedException, IOException {
		Thread.sleep(3000);
		// Unassigned "// Unassigned //
//		if(driver.findElement(btnCreatorUnassigned).getText().contains("Unassigned")) {
//			if(driver.findElement(btnRefNoUnassigned).getText().contains(PropertyFileReader.readData("customerIdQueue"))) {
//				Assert.assertTrue(true);
//			}
//		}
//		else {
//			Assert.assertTrue(false);
//		}
		
		
		actions.takeScreenShot("img2");
		List<WebElement> listUnassigned=driver.findElements(btnCreatorUnassigned);
		List<WebElement> listCustomerId=driver.findElements(btnCustomerNameUnassigned);
	for(int i=0;i<listUnassigned.size();i++) {
			listUnassigned=driver.findElements(btnCreatorUnassigned);
			if(listUnassigned.get(1).getText().contains("Unassigned")) {
				if(listCustomerId.get(0).getText().contains((PropertyFileReader.readData("customerNameStatement")))) {
				Assert.assertTrue(true);
				break;
				}
			}
		}
		
		for (WebElement ele : listUnassigned) {
			
			 String data =ele.getText();
			 if(!(data==null||data.isBlank()||data.isEmpty()))
				 System.err.println("listUnassigned data : " + data);
			 
			 
				}
			 
		
		
		for (WebElement e : listCustomerId) {
			String data = e.getText();
			if(!(data==null||data.isBlank()||data.isEmpty()))
				 System.err.println("listCustomerId data :" + data);
				
		}
			
		
	}
	
	// Stock Statement
		public void clickOnNewCustomer() throws IOException, InterruptedException {
			Thread.sleep(30000);
			
			List<WebElement> listUnassigned=driver.findElements(btnCreatorUnassigned);
			List<WebElement> listCustomerId=driver.findElements(btnCustomerNameUnassigned);
			for(int i=0;i<listUnassigned.size();i++) {
				if(listUnassigned.get(i).getText().contains("Unassigned")) {
					if(listCustomerId.get(i).getText().contains((PropertyFileReader.readData("customerNameStatement")))) {
						listCustomerId.get(i).click();
					break;
					}
				}
			}
			
			
			
		}
		
		public void selectDateOnStatementDate() throws Exception {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.findElement(txtStatementCalender).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.findElement(btnCalenderMonthYear).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//			while(!driver.findElement(lstYears).getAttribute("aria-label").contains(PropertyFileReader.readData("Year"))){
//				driver.findElement(btnPreviousYears).click();
//			}
			
			List<WebElement> listYears=driver.findElements(lstYears);
			year : for(int i=0;i<listYears.size();i++) {
				if(listYears.get(i).getAttribute("aria-label").contains(PropertyFileReader.readData("Year"))) {
					listYears.get(i).click();
					break year;
				}
				else if(listYears.size()-1==i) {
					if(!listYears.get(listYears.size()-1).getAttribute("aria-label").contains(PropertyFileReader.readData("Year"))) {
						driver.findElement(btnPreviousYears).click();
					}
				}
			}
			
			List<WebElement> listMonths=driver.findElements(lstMonths);
			year : for(int i=0;i<listMonths.size();i++) {
				if(listMonths.get(i).getAttribute("aria-label").contains(PropertyFileReader.readData("Month"))) {
					listMonths.get(i).click();
					break year;
				}
				else if(listMonths.size()-1==i) {
					if(!listMonths.get(listMonths.size()-1).getAttribute("aria-label").contains(PropertyFileReader.readData("Month"))) {
						driver.findElement(btnPreviousYears).click();
					}
				}
			}
			
			List<WebElement> listDates=driver.findElements(lstDates);
			year : for(int i=0;i<listDates.size();i++) {
				if(listDates.get(i).getAttribute("aria-label").contains(PropertyFileReader.readData("Date"))) {
					listDates.get(i).click();
					break year;
				}
				else if(listDates.size()-1==i) {
					if(!listDates.get(listDates.size()-1).getAttribute("aria-label").contains(PropertyFileReader.readData("Date"))) {
						driver.findElement(btnPreviousYears).click();
					}
				}
			}
			
			
		}
		
		
		public void enterHSBCSantionedFundLimit() throws IOException {
			driver.findElement(txtHSBCSanctionedFundLimit).clear();
			driver.findElement(txtHSBCSanctionedFundLimit).sendKeys(PropertyFileReader.readData("HSBCSanctionedFund"));
		}
		
		public void clickOnDetailSection() {
			driver.findElement(btnDetails).click();
		}
		
		public void clickOnStock_Value_Details() throws IOException, InterruptedException {
			driver.findElement(btnStockValueDetails).click();
			String rM=(String) ExcelReader.getData("GN_Marketing","Details","RM").get(1);
			//System.out.println("**"+rM);
			driver.findElement(txtRM).sendKeys(rM);
			String fG=(String) ExcelReader.getData("GN_Marketing","Details","FG").get(1);
			//driver.findElement(txtFG).clear();
			driver.findElement(txtFG).sendKeys(Keys.chord(Keys.CONTROL,"a",fG));
			Thread.sleep(10000);
			String wIP=(String) ExcelReader.getData("GN_Marketing","Details","WIP").get(1);
			driver.findElement(txtWIP).sendKeys(wIP);
			String consumables=(String) ExcelReader.getData("GN_Marketing","Details","Consumables").get(1);
			driver.findElement(txtConsumables).sendKeys(consumables);
			String stockAgainstLC=(String) ExcelReader.getData("GN_Marketing","Details","Stock against LC").get(1);
			driver.findElement(txtStockAgainstLC).sendKeys(stockAgainstLC);
			String stockInTransit=(String) ExcelReader.getData("GN_Marketing","Details","Stock in Transit").get(1);
			driver.findElement(txtStockInTransit).sendKeys(stockInTransit);
			String stockWithThirdParty=(String) ExcelReader.getData("GN_Marketing","Details","Stock with third party").get(1);
			driver.findElement(txtStockWithThirdParty).sendKeys(stockWithThirdParty);
			String scrapStock=(String) ExcelReader.getData("GN_Marketing","Details","Scrap Stock").get(1);
			driver.findElement(txtScrapStock).sendKeys(scrapStock);
			 
			 
		
			
		}
		
		public void clickOnCreditorsValueDetails() throws IOException {
			driver.findElement(btnCreditValueDetails).click();
			String creditorsUnderLC=(String) ExcelReader.getData("GN_Marketing", "Details", "Creditors Under LC").get(1);
			driver.findElement(txtCreditorsUnderLC).sendKeys(creditorsUnderLC);
			String creditorsOthersLc= (String)ExcelReader.getData("GN_Marketing", "Details", "Creditors Others").get(1);
			driver.findElement(txtCreditorsOthers).sendKeys(creditorsOthersLc);
			String creditorsAdvancePaidTpSuppliers= (String)ExcelReader.getData("GN_Marketing", "Details", "Advance paid to Suppliers").get(1);
            driver.findElement(txtAdvancePaidToSuppliers).sendKeys(creditorsAdvancePaidTpSuppliers);
           // driver.findElement(btnCreditValueDetails).click();
            System.out.println("Compleate done the senario");
		}
		
		public void postMerginDediCationDetailsValues() throws Exception {
			Thread.sleep(2000);
			driver.findElement(btnPostMarginDeductionsValueDetails).click();
			String BuyersCreaditL = (String) ExcelReader.getData("GN_Marketing", "Details", "Buyer's Credit").get(1);
			driver.findElement(txtBuyerCredit).sendKeys(BuyersCreaditL);
			String CommercialPaperL = (String) ExcelReader.getData("GN_Marketing", "Details", "Commercial Paper").get(1);
			driver.findElement(txtCommercialPaper).sendKeys(CommercialPaperL);	
			actions.takeScreenShot("ima 9");
			Thread.sleep(5000);
			//driver.findElement(btnPostMarginDeductionsValueDetails).click();
		}
		
		public void AgeingDetailsDomestic() throws Exception {
		actions.takeScreenShot("ima 6");
		Thread.sleep(2000);
		driver.findElement(btnAgeingDetailsDomestic).click();
		Thread.sleep(1000);
		String thartyDays = (String) ExcelReader.getData("GN_Marketing", "Details", "0-30 Days").get(1);
		driver.findElement(txtDomestic_0_30Days).sendKeys(thartyDays);
		Thread.sleep(1000);
		String domasticValue60Days= (String) ExcelReader.getData("GN_Marketing", "Details", "Domestic_31-60 Days / 0-60 days / upto 60 Days").get(1);
		driver.findElement(txtDomestic_31_60_Days_0_60_days_upto_60_Days).sendKeys(domasticValue60Days);
		Thread.sleep(1000);
		String domasticValue90Days= (String) ExcelReader.getData("GN_Marketing", "Details", "Domestic_61-90 Days / Above 60 Days").get(1);
		driver.findElement(txtDomestic_61_90_Days_Above_60_Days).sendKeys(domasticValue90Days);
		Thread.sleep(1000);
		String domasticValue60_90Days= (String) ExcelReader.getData("GN_Marketing", "Details", "Domestic_31-90 Days / 0-90 Days / upto 90 Days").get(1);
		driver.findElement(txtDomestic_31_90_Days_0_90_Days_upto_90_Days).sendKeys(domasticValue60_90Days);
		Thread.sleep(1000);
		String domasticValue0_45Days= (String) ExcelReader.getData("GN_Marketing", "Details", "Domestic_0-45 Days / upto 45 Days").get(1);
		driver.findElement(txtDomestic_0_45_Days_upto_45_Days).sendKeys(Keys.chord(Keys.CONTROL,"A",domasticValue0_45Days));
		Thread.sleep(1000);
		String domasticValue45_90Days= (String) ExcelReader.getData("GN_Marketing", "Details", "Domestic_46-90 Days / Above 45 Days").get(1);
		driver.findElement(txtDomestic_46_90_Days_Above_45_Days).sendKeys(Keys.chord(Keys.CONTROL,"A",domasticValue45_90Days));
		Thread.sleep(1000);
		String domasticValue90_120Days= (String) ExcelReader.getData("GN_Marketing", "Details", "Domestic_91-120 Days / Above 90 Days / upto 120 Days / 61-120 days").get(1);
		driver.findElement(txtDomestic_91_120_Days_Above_90_Days_upto_120_Days_61_120_days).sendKeys(domasticValue90_120Days);
		Thread.sleep(1000);
		String domasticValue90_150Days= (String) ExcelReader.getData("GN_Marketing", "Details", "Domestic_121-150 Days / Above 120 Days / 61-150 Days / 91-150 Days / upto 150 Days").get(1);
		driver.findElement(txtDomestic_121_150_Days_Above_120_Days_61_150_Days_91_150_Days_upto_150_Days).sendKeys(domasticValue90_150Days);
		Thread.sleep(1000);
		String domasticValue150_180Days= (String) ExcelReader.getData("GN_Marketing", "Details", "Domestic_151-180 Days / Above 150 Days").get(1);
		driver.findElement(txtDomestic_151_180_Days_Above_150_Days).sendKeys(domasticValue150_180Days);
		Thread.sleep(1000);
		String domasticValueupto_180Days= (String) ExcelReader.getData("GN_Marketing", "Details", "Domestic_121-180 Days / upto 180 Days / 61-180 days / 91-180 days").get(1);
		driver.findElement(txtDomestic_121_180_Days_upto_180_Days_61_180_days_91_180_days).sendKeys(domasticValueupto_180Days);
		Thread.sleep(1000);
		String domasticValue180_1years= (String) ExcelReader.getData("GN_Marketing", "Details", "Domestic_181-365 Days / Above 180 Days / upto 270 Days / upto 1 year").get(1);
		driver.findElement(txt_Domestic_181_365_Days_Above_180_Days_upto_270_Days_upto_1_year).sendKeys(domasticValue180_1years);
		Thread.sleep(1000);
		String domasticValue365_270Days= (String) ExcelReader.getData("GN_Marketing", "Details", "Domestic_Above 365 Days / Above 270 Days").get(1);
		driver.findElement(txtDomestic_Above_365_Days_Above_270_Days).sendKeys(domasticValue365_270Days);
		Thread.sleep(1000);
		String domasticValueOtherDays= (String) ExcelReader.getData("GN_Marketing", "Details", "Domestic_Others (Eligible Debtors in case of Debtors days 'Others')").get(1);
		driver.findElement(txtDomestic_Others_Eligible_Debtors_case_of_Debtors_days_Others).sendKeys(domasticValueOtherDays);
		actions.takeScreenShot("pic3");
		Thread.sleep(1000);
		String domasticBillDiscount= (String) ExcelReader.getData("GN_Marketing", "Details", "Bill Discounted").get(1);
		driver.findElement(txtBillDiscounted).sendKeys(domasticBillDiscount);
		actions.takeScreenShot("pic2");
		Thread.sleep(1000);
		String domasticAdvanceFromCustome= (String) ExcelReader.getData("GN_Marketing", "Details", "Advance from Customers").get(1);
		driver.findElement(txtAdvanceFromCustomers).sendKeys(domasticAdvanceFromCustome);
		Thread.sleep(1000);
				}
		
		public void AgeingDetailsExport() throws Exception {
			actions.takeScreenShot("ima 7");
			driver.findElement(btnAgeingDetailExport).click();
			Thread.sleep(1000);
			String ExportDetails30_60Days= (String) ExcelReader.getData("GN_Marketing", "Details", "30_60Days").get(1);
			driver.findElement(txtExport_31_60_Days_0_60_days_upto_60_Days).sendKeys(ExportDetails30_60Days);
			Thread.sleep(1000);
			String ExportDetails60_120Days= (String) ExcelReader.getData("GN_Marketing", "Details", "Export_31-60 Days / 0-60 days / upto 60 Days").get(1);
			driver.findElement(txtExport_31_60_Days_0_60_days_upto_60_Days).sendKeys(ExportDetails60_120Days);
			Thread.sleep(1000);
			String ExportDetails61_90Days= (String) ExcelReader.getData("GN_Marketing", "Details", "Export_61-90 Days / Above 60 Days").get(1);
			driver.findElement(Export_61_90_Days_Above_60_Days).sendKeys(ExportDetails61_90Days);
			Thread.sleep(1000);
			String ExportDetails31_90Days= (String) ExcelReader.getData("GN_Marketing", "Details", "Export_31-90 Days / 0-90 Days / upto 90 Days").get(1);
			driver.findElement(Export_31_90_Days_0_90_Days_upto_90_Days).sendKeys(ExportDetails31_90Days);
			Thread.sleep(1000);
			String ExportDetails0_45Days= (String) ExcelReader.getData("GN_Marketing", "Details", "Export_0-45 Days / upto 45 Days").get(1);
			driver.findElement( Export_0_45_Days_upto_45_Days).sendKeys(ExportDetails0_45Days);
			Thread.sleep(1000);
			String Export_46_90_Days_Above_45_Days= (String) ExcelReader.getData("GN_Marketing", "Details", "Export_46-90 Days / Above 45 Days").get(1);
			driver.findElement( Export_0_45_Days_upto_45_Days).sendKeys(Export_46_90_Days_Above_45_Days);
			Thread.sleep(1000);
			String Export_91_120_Days_Above_45_Days= (String) ExcelReader.getData("GN_Marketing", "Details", "Export_91-120 Days / Above 90 Days / upto 120 Days / 61-120 days").get(1);
			driver.findElement( Export_91_120_Days_Above_90_Days_upto_120_Days_61_120_days).sendKeys(Export_91_120_Days_Above_45_Days);
			Thread.sleep(1000);
			String Export_120_150_Days_Above_150_Days= (String) ExcelReader.getData("GN_Marketing", "Details", "Export_121-150 Days / Above 120 Days / 61-150 Days / 91-150 Days / upto 150 Days").get(1);
			driver.findElement( Export_121_150_Days_Above_120_Days_61_150_Days_91_150_Days_upto_150_Days).sendKeys(Export_120_150_Days_Above_150_Days);
			Thread.sleep(1000);
			String Export_150_180_Days= (String) ExcelReader.getData("GN_Marketing", "Details", "Export_151-180 Days / Above 150 Days").get(1);
			driver.findElement( Export_151_180_Days_Above_150_Days).sendKeys(Export_150_180_Days);
			Thread.sleep(1000);
			String Export_91_180_Days= (String) ExcelReader.getData("GN_Marketing", "Details", "Export_121-180 Days / upto 180 Days / 61-180 days / 91-180 days").get(1);
			driver.findElement( Export_121_180_Days_upto_180_Days_61_180_days_91_180_days).sendKeys(Export_91_180_Days);
			Thread.sleep(1000);
			String Export_180_365_Days= (String) ExcelReader.getData("GN_Marketing", "Details", "Export_181-365 Days / Above 180 Days / upto 270 Days / upto 1 year").get(1);
			driver.findElement( Export_181_365_Days_Above_180_Days_upto_270_Days_upto_1_year).sendKeys(Export_180_365_Days);
			Thread.sleep(1000);
			String Export_365_270Days= (String) ExcelReader.getData("GN_Marketing", "Details", "Export_Above 365 Days / Above 270 Days").get(1);
			driver.findElement( Export_Above_365_Days_Above_270_Days).sendKeys(Export_365_270Days);
			Thread.sleep(1000);
			String Export_365_OthersDays= (String) ExcelReader.getData("GN_Marketing", "Details", "Export_Others (Eligible Debtors in case of Debtors days 'Others')").get(1);
			driver.findElement( Export_Others_Eligible_Debtors_in_case_Debtors_days_Others).sendKeys(Export_365_OthersDays);
			Thread.sleep(1000);
				
		    }
		
	        public void clickOnOtherDetails() throws Exception {
	        	actions.takeScreenShot("ima 8");
	        	driver.findElement(btnOtherDetails).click();
	        	String forReportingSales= (String) ExcelReader.getData("GN_Marketing", "Details", "for Reporting month_Sales").get(1);
	    		driver.findElement(for_Reporting_month_Sale).sendKeys(Keys.chord(Keys.CONTROL,"A",forReportingSales));
	    		Thread.sleep(1000);
	    		String forReportingPurchaes= (String) ExcelReader.getData("GN_Marketing", "Details", "for Reporting month_Purchase").get(1);
	    		driver.findElement(for_Reporting_month_Purchase).sendKeys(Keys.chord(Keys.CONTROL,"A",forReportingPurchaes));
	    		Thread.sleep(1000);
	    		String YtdSales= (String) ExcelReader.getData("GN_Marketing", "Details", "YTD_Sales").get(1);
	    		driver.findElement(YTD_Sale).sendKeys(Keys.chord(Keys.CONTROL,"A",YtdSales));
	    		Thread.sleep(1000);
	    		String YTDPurchase= (String) ExcelReader.getData("GN_Marketing", "Details", "YTD_Purchase").get(1);
	    		driver.findElement(YTD_Purchase).sendKeys(Keys.chord(Keys.CONTROL,"A",YTDPurchase));
	    		Thread.sleep(1000);
	        }
	        
	        public void userEntercrmValues() throws Exception {
	        	actions.takeScreenShot("ima 9");
	        	driver.findElement(crmLcValue).sendKeys(PropertyFileReader.readData("crmReference"));
	        	actions.takeScreenShot("ima 10");
	        }
	        
	        public void userSelectRecividDate() throws Exception{
	        	//driver.findElement(recivedCallender).sendKeys("09/02/2023");
//	        	actions.takeScreenShot("ima 11");
	        	
	        	Thread.sleep(3000);
	        	driver.findElement(callenderIcon).click();
	    		WebElement callenderL =driver.findElement(listOfDateL);
				System.err.print(callenderL.getText());
				
				for(int i=1;i<=3;i++) {
					
					Thread.sleep(2000);
					WebElement nextBtn = driver.findElement(prvBtnL);
					nextBtn.click();
				}
				List<WebElement> datepickerButns = driver.findElements(suggestedDatesL);		
				List <String> dates = new ArrayList<String>();
				for(WebElement ele :datepickerButns ) {
					String data = ele.getText();
					dates.add(data);
					
				}
					System.out.println(dates);
					for(int i=0;i<dates.size();i++) {
						if(dates.get(i).equals("6"))
							datepickerButns.get(i).click();
						
					}
					actions.takeScreenShot("ima 11");
	        }
	        
	        public void clickOnCustomerSetting()throws Exception {
	        	
	        	driver.findElement(customersttingL).click();
	        	actions.takeScreenShot("ima 12");
	        	
	        	WebElement DP_Cal_Method_Field_Ele = driver.findElement(By.id("mat-select-value-13"));
	    		Thread.sleep(1000);
	    		DP_Cal_Method_Field_Ele.click();

	    		Thread.sleep(1000);
	    		List<WebElement> DP_Calculation_Method_Options = driver
	    				.findElements(By.xpath("//div[@role='listbox']//*[@role='option']"));
	    		Thread.sleep(1000);
	    		for (WebElement ele : DP_Calculation_Method_Options) {
	    			String data = ele.getText();
	    			Thread.sleep(1000);
	    			System.out.println(data);
	    		}
	    		DP_Calculation_Method_Options.get(1).click();

	    		driver.findElement(By.id("mat-select-value-15")).click();

	    		List<WebElement> DP_Debtors_days_Domestic_Options = driver
	    				.findElements(By.xpath("//span[@class='mat-option-text']"));
	    		Thread.sleep(1000);
	    		for (WebElement ele : DP_Debtors_days_Domestic_Options) {
	    			String data = ele.getText();
	    			Thread.sleep(1000);
	    			System.out.println(data);
	    		}
	    		System.out.println("===================================");
	    		DP_Debtors_days_Domestic_Options.get(3).click();

	    		driver.findElement(By.id("mat-select-value-17")).click();
	    		Thread.sleep(1000);
	    		List<WebElement> DP_Debtors_days_Export_Options = driver
	    				.findElements(By.xpath("//span[@class='mat-option-text']"));
	    		Thread.sleep(1000);
	    		for (WebElement ele : DP_Debtors_days_Export_Options) {
	    			String data = ele.getText();
	    			Thread.sleep(1000);
	    			System.out.println(data);
	    		}
	    		DP_Debtors_days_Export_Options.get(3).click();

	    		System.out.println("===================================");
	    		driver.findElement(By.id("mat-select-value-19")).click();
	    		Thread.sleep(1000);
	    		List<WebElement> Group_Debtors_Options = driver.findElements(By.xpath("//span[@class='mat-option-text']"));
	    		Thread.sleep(1000);
	    		for (WebElement ele : Group_Debtors_Options) {
	    			String data = ele.getText();
	    			Thread.sleep(1000);
	    			System.out.println(data);
	    		}
	    		Group_Debtors_Options.get(0).click();

	    	
	    		System.out.println("===================================");

	    		driver.findElement(By.id("mat-select-value-21")).click();
	    		Thread.sleep(1000);
	    		List<WebElement> Advance_Paid_to_Suppliers = driver.findElements(By.xpath("//span[@class='mat-option-text']"));
	    		Thread.sleep(1000);
	    		for (WebElement ele : Advance_Paid_to_Suppliers) {
	    			String data = ele.getText();
	    			Thread.sleep(1000);
	    			System.out.println(data);
	    		}
	    		Advance_Paid_to_Suppliers.get(0).click();
	    		System.out.println("===================================");

	    		driver.findElement(By.id("mat-select-value-23")).click();
	    		Thread.sleep(1000);
	    		List<WebElement> Advance_from_customers_options = driver
	    				.findElements(By.xpath("//span[@class='mat-option-text']"));
	    		Thread.sleep(1000);
	    		for (WebElement ele : Advance_from_customers_options) {
	    			String data = ele.getText();
	    			Thread.sleep(1000);
	    			System.out.println(data);
	    		}
	    		Advance_from_customers_options.get(0).click();

	    		System.out.println("====================================");

	    		driver.findElement(By.id("mat-select-value-25")).click();
	    		Thread.sleep(1000);
	    		List<WebElement> Stock_with_Third_Party_options = driver
	    				.findElements(By.xpath("//span[@class='mat-option-text']"));
	    		Thread.sleep(1000);
	    		for (WebElement ele : Stock_with_Third_Party_options) {
	    			String data = ele.getText();
	    			Thread.sleep(1000);
	    			System.out.println(data);
	    		}
	    		Stock_with_Third_Party_options.get(0).click();

	    		System.out.println("====================================");
	    		
	    		
	    		driver.findElement(By.id("mat-select-value-27")).click();
	    		Thread.sleep(1000);
	    		List<WebElement> Stock_in_transit_options = driver
	    				.findElements(By.xpath("//span[@class='mat-option-text']"));
	    		
	    		for (WebElement ele : Stock_in_transit_options) {
	    			String data = ele.getText();
	    			Thread.sleep(1500);
	    			System.out.println(data);
	    		}
	    		Stock_in_transit_options.get(0).click();
	    		Thread.sleep(1000);
	    		System.out.println("====================================");
	    		
	    		driver.findElement(By.id("mat-select-value-29")).click();

	    		List<WebElement> Scrap_stock_options = driver
	    				.findElements(By.xpath("//span[@class='mat-option-text']"));
	    		Thread.sleep(1500);
	    		for (WebElement ele : Scrap_stock_options) {
	    			String data = ele.getText();
	    			Thread.sleep(1000);
	    			System.out.println(data);
	    		}
	    		Scrap_stock_options.get(0).click();

	    		System.out.println("====================================");
	    		
	    		driver.findElement(By.id("mat-select-value-31")).click();
	    		Thread.sleep(1000);
	    		List<WebElement> Paid_Stock_clause_options = driver
	    				.findElements(By.xpath("//span[@class='mat-option-text']"));
	    		Thread.sleep(1500);
	    		for (WebElement ele : Paid_Stock_clause_options) {
	    			String data = ele.getText();
	    			Thread.sleep(1000);
	    			System.out.println(data);
	    		}
	    		Paid_Stock_clause_options.get(0).click();

	    		System.out.println("====================================");
	    		
	    		driver.findElement(By.id("mat-select-value-33")).click();
	    		Thread.sleep(1000);
	    		List<WebElement> Margin_Stock_options = driver
	    				.findElements(By.xpath("//span[@class='mat-option-text']"));
	    		Thread.sleep(1000);
	    		for (WebElement ele : Margin_Stock_options) {
	    			String data = ele.getText();
	    			Thread.sleep(1000);
	    			System.out.println(data);
	    		}
	    		Margin_Stock_options.get(3).click();

	    		System.out.println("====================================");
	    		Thread.sleep(1000);
	    		driver.findElement(By.id("mat-select-value-35")).click();

	    		List<WebElement> Margin_Domestic_Debtors_options = driver
	    				.findElements(By.xpath("//span[@class='mat-option-text']"));
	    		Thread.sleep(1000);
	    		for (WebElement ele : Margin_Domestic_Debtors_options) {
	    			String data = ele.getText();
	    			Thread.sleep(1000);
	    			System.out.println(data);
	    		}
	    		Margin_Domestic_Debtors_options.get(3).click();

	    		System.out.println("====================================");
	    		
	    		driver.findElement(By.id("mat-select-value-37")).click();

	    		List<WebElement> Margin_Export_Debtors_options = driver
	    				.findElements(By.xpath("//span[@class='mat-option-text']"));
	    		Thread.sleep(1000);
	    		for (WebElement ele : Margin_Export_Debtors_options) {
	    			String data = ele.getText();
	    			Thread.sleep(1000);
	    			System.out.println(data);
	    		}
	    		Margin_Export_Debtors_options.get(2).click();

	    		System.out.println("====================================");
	    		Thread.sleep(1000);
	    		
	    		driver.findElement(By.id("mat-select-value-39")).click();

	    		List<WebElement> Margin_Creditors_options = driver
	    				.findElements(By.xpath("//span[@class='mat-option-text']"));
	    		Thread.sleep(1000);
	    		for (WebElement ele : Margin_Creditors_options) {
	    			String data = ele.getText();
	    			Thread.sleep(1000);
	    			System.out.println(data);
	    		}
	    		Margin_Creditors_options.get(2).click();
	    		Thread.sleep(1000);
	    		System.out.println("====================================");
	    		
	    		driver.findElement(By.id("mat-select-value-41")).click();
	    		Thread.sleep(1000);
	    		List<WebElement> Margin__Stock_options = driver
	    				.findElements(By.xpath("//span[@class='mat-option-text']"));
	    		Thread.sleep(1000);
	    		for (WebElement ele : Margin__Stock_options) {
	    			String data = ele.getText();
	    			Thread.sleep(1000);
	    			System.out.println(data);
	    		}
	    		Margin__Stock_options.get(2).click();

	    		System.out.println("====================================");
	    		
	    		driver.findElement(By.id("mat-select-value-43")).click();
	    		Thread.sleep(1000);
	    		List<WebElement> Margin_Adjustment_options = driver
	    				.findElements(By.xpath("//span[@class='mat-option-text']"));
	    		Thread.sleep(1000);
	    		for (WebElement ele : Margin_Adjustment_options) {
	    			String data = ele.getText();
	    			Thread.sleep(1000);
	    			System.out.println(data);
	    		}
	    		Margin_Adjustment_options.get(3).click();
	    		
	    		System.out.println("====================================");

	        }
	        
	        
	        
	        
	
	
}
