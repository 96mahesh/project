package stepDefinition;


import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.CreatorPage;
import objectRepository.SignInPage;
import resource.DriverClass;

public class StepDefinitions extends DriverClass{
	
	SignInPage signInPage=new SignInPage(driver);
	CreatorPage creatorPage=new CreatorPage(driver);
	
	@Given("User navigates to the url")
	public void user_navigates_to_the_url() throws IOException {
		launchURL();
	}

	@When("User enters valid email address and password")
	public void user_enters_valid_email_address_and_password() throws IOException {
		signInPage.enterValidEmailId();
		signInPage.enterValidPassword();
	}

	@When("User clicks on sign in")
	public void user_clicks_on_sign_in() {
		signInPage.clickSignIn();
	}

	@Then("User should able to see Eco Management System portal")
	public void user_should_able_to_see_eco_management_system_portal() {
		signInPage.verifyEcoSystemHomePage();
	}
	
	@When("User enters invalid {string} in email address field")
	public void user_enters_invalid_muskan_in_email_address_field(String string) throws IOException {
		signInPage.enterInValidEmailId(string);
	}

	@When("User clicks on password field")
	public void user_clicks_on_password_field() {
		signInPage.clickOnPasswordField();
	}

	@Then("User should able to see {string} error message below email address field")
	public void user_should_able_to_see_error_message_below_email_address_field(String string) {
		signInPage.verifyErrorMsgInEmailField(string);
	}

	@When("User clicks on eye icon in password field")
	public void user_clicks_on_eye_icon_in_password_field() {
	   signInPage.clickOnPasswordIcon();
	}

	@Then("User should able to see entered password details")
	public void user_should_able_to_see_entered_password_details() {
	   signInPage.verifyPasswordDisplays();
	}
	//creator login
	@When("User clicks on creator login")
	public void user_clicks_on_creator_login() {
		signInPage.clickOnCreatorLogin();
	}

	@Then("User should able to see creator homepage")
	public void user_should_able_to_see_creator_homepage() {
		creatorPage.verifyCreatorHomePage();
	}

	@Then("User should able to see KPMG Automato Logo")
	public void user_should_able_to_see_kpmg_automato_logo() {
		creatorPage.verifyLogo();
	}

	@Then("User should able to see home button")
	public void user_should_able_to_see_home_button() {
		creatorPage.verifyCreatorHomeButton();
	}

	@Then("User should able to see fullscreen mode icon")
	public void user_should_able_to_see_fullscreen_mode_icon() throws InterruptedException {
		creatorPage.verifyFullscreenIcon();
	}

	@When("User clicks on the fullscreen mode icon")
	public void user_clicks_on_the_fullscreen_mode_icon() throws InterruptedException {
		creatorPage.clickOnFullscreenIcon();
	}

	@Then("User should able to see the screen in fullscreen mode")
	public void user_should_able_to_see_the_screen_in_fullscreen_mode() throws IOException {
		creatorPage.verifySiteInFullscreenMode();
	}

	@Then("User should able to see the screen in normal size")
	public void user_should_able_to_see_the_screen_in_normal_size() throws IOException {
		creatorPage.verifySiteInNormalMode();
	}

	@Then("User should able to see the profile icon")
	public void user_should_able_to_see_the_profile_icon() {
		creatorPage.verifyProfileIcon();
	}

	@Then("User should able to see Queue Management section")
	public void user_should_able_to_see_queue_management_section() {
		creatorPage.verifyQueueManagement();
	}

	@Then("User should able to see Completed Queue")
	public void user_should_able_to_see_completed_queue() {
		creatorPage.verifyCompletedQueue();
	}

	@Then("User should able to see Failed Transactions")
	public void user_should_able_to_see_failed_transactions() {
		creatorPage.verifyFailedTransactions();
	}

	@Then("User should able to see My Pending Activities")
	public void user_should_able_to_see_my_pending_activities() {
		creatorPage.verifyMyPendingActivities();
	}

	@When("User clicks on profile icon")
	public void user_clicks_on_profile_icon() {
		creatorPage.clickOnProfileIcon();
	}

	@Then("User should able to see signed in as creator")
	public void user_should_able_to_see_signed_in_as_creator() {
		creatorPage.verifySignedAsCreator();
	}
	
	@Then("User should able to see profile name")
	public void user_should_able_to_see_profile_name() {
		creatorPage.verifyProfileName();
	}
	@Then("User should able to see profile mail")
	public void user_should_able_to_see_profile_mail() {
		creatorPage.verifyProfileEmail();
	}
	@Then("User should able to see switch role button")
	public void user_should_able_to_see_switch_role_button() {
		creatorPage.verifySwitchRole();
	}
	@Then("User should able to see signout button")
	public void user_should_able_to_see_signout_button() {
		creatorPage.verifySignOut();
	}
	
	@When("User hovers on switch role")
	public void user_hovers_on_switch_role() {
		creatorPage.hoverOnSwitchRoleButton();
	}
	@Then("User should able to see the roles listed")
	public void user_should_able_to_see_the_roles_listed() {
		creatorPage.verifyRolesListed();
	}

	@When("User clicks on signout button")
	public void user_clicks_on_signout_button() {
		creatorPage.clickOnSignout();
	}

	@Then("User should able to see the profile has been logged out")
	public void user_should_able_to_see_the_profile_has_been_logged_out() {
		creatorPage.verifySignInPageAfterSignout();
	}
	
	@Then("User should able to see upward icon in Queue Management section")
	public void user_should_able_to_see_upward_icon_in_queue_management_section() {
		creatorPage.verifyUpwardIconQueueManagement();
	}
	@When("User clicks on upward icon in Queue Management section")
	public void user_clicks_on_upward_icon_in_queue_management_section() {
		creatorPage.clickOnExpansionQueueManagement();
	}
	@Then("User should able to see Queue Management section is minimized")
	public void user_should_able_to_see_queue_management_section_is_minimized() {
		creatorPage.verifyQueueManagementMinimized();
	}
	@When("User clicks on downward icon in Queue Management section")
	public void user_clicks_on_downward_icon_in_queue_management_section() {
		creatorPage.clickOnExpansionQueueManagement();
	}
	@Then("User should able to see the elements presents under Queue Management section")
	public void user_should_able_to_see_the_elements_presents_under_queue_management_section() {
		creatorPage.verifyQueueManagementElementsVisible();
	}
	@Then("User should able to see search customer text box")
	public void user_should_able_to_see_search_customer_text_box() throws Exception {
		creatorPage.verifyCustomerTextboxQueue();
	}
	@Then("User should able to see refresh icon")
	public void user_should_able_to_see_refresh_icon() {
		creatorPage.verifyRefreshButton();
	}
	@Then("User should able to see upload statement button")
	public void user_should_able_to_see_upload_statement_button() {
		creatorPage.verifyUploadStatementButton();
	}
	@Then("User should able to see download Template icon")
	public void user_should_able_to_see_download_template_icon() {
		creatorPage.verifyDownloadTemplateButton();
	}
	@Then("User should able to see Ref No column")
	public void user_should_able_to_see_ref_no_column() {
		creatorPage.verifyRefNoColumnQueue();
	}
	@Then("User should able to see Customer Name column")
	public void user_should_able_to_see_customer_name_column() {
		creatorPage.verifyCustomerNameColumnQueue();
	}
	@Then("User should able to see Customer ID column")
	public void user_should_able_to_see_customer_id_column() {
		creatorPage.verifyCustomerIdColumnQueue();
	}
	@Then("User should able to see Action Particular column")
	public void user_should_able_to_see_action_particular_column() {
		creatorPage.verifyActionParticularColumnQueue();
	}
	@Then("User should able to see Creator column")
	public void user_should_able_to_see_creator_column() {
		creatorPage.verifyCreatorColumnQueue();
	}
	@Then("User should able to see Approver column")
	public void user_should_able_to_see_approver_column() {
		creatorPage.verifyAproverColumnQueue();
	}
	@Then("User should able to see RM column")
	public void user_should_able_to_see_rm_column() {
		creatorPage.verifyRMColumnQueue();
	}
	@Then("User should able to see Communication Notes column")
	public void user_should_able_to_see_communication_notes_column() {
		creatorPage.verifyCommunicationNotesColumnQueue();
	}
	@Then("User should able to see Pending with column")
	public void user_should_able_to_see_pending_with_column() {
		creatorPage.verifyPendingWithColumnQueue();
	}
	@Then("User should able to see Exp Date column")
	public void user_should_able_to_see_exp_date_column() {
		creatorPage.verifyExpDateColumnQueue();
	}
	@Then("User should able to see Managed documents column")
	public void user_should_able_to_see_managed_documents_column() {
		creatorPage.verifyManagedDocumentsColumnQueue();
	}
	@When("User enters customer number in search customer text box")
	public void user_enters_customer_number_in_search_customer_text_box() throws IOException {
		creatorPage.entersCustomerIdQueue();
	}
	@Then("User should able to see customer detail of entered customer id")
	public void user_should_able_to_see_customer_detail_of_entered_customer_id() throws IOException, InterruptedException {
		creatorPage.verifyCustomerIdEnteredVisibleQueue();
	}
	@When("User clicks on refresh button")
	public void user_clicks_on_refresh_button() {
		creatorPage.clickOnRefreshButton();
	}
	@Then("User should able to see the page has been loaded")
	public void user_should_able_to_see_the_page_has_been_loaded() throws IOException {
		creatorPage.verifyPageRefreshed();
	}
	@When("User clicks on download template button")
	public void user_clicks_on_download_template_button() {
		creatorPage.clickOnDownloadTemplate();
	}
	@Then("User should able to see file has been download")
	public void user_should_able_to_see_file_has_been_download() throws IOException {
		creatorPage.verifyTemplateDownloaded();
	}
	@When("User clicks on the sorting button in Ref No")
	public void user_clicks_on_the_sorting_button_in_ref_no() throws InterruptedException {
		creatorPage.clickOnSortButtonQueue();
	}
	@Then("User should able to see the customer details has been sorted")
	public void user_should_able_to_see_the_customer_details_has_been_sorted() {
		creatorPage.verifyRefNoSorted();
	}
	@When("User clicks download icon on managed documents column")
	public void user_clicks_download_icon_on_managed_documents_column() {
		creatorPage.clickOnManagedDocumentDownload();
	}
	@Then("User should able to see the document has been downloaded")
	public void user_should_able_to_see_the_document_has_been_downloaded() throws IOException {
		creatorPage.verifyManagedDocumentDownloaded();
	}
	@When("User clicks on Upload statement")
	public void user_clicks_on_upload_statement() {
		creatorPage.clickOnUploadStatementButton();
	}
	
	@When("User clicks on upload statement pdf in dropdown")
	public void user_clicks_on_upload_statement_pdf_in_dropdown() throws Exception {
		creatorPage.clickOnUploadStatementPdfInDropdown();
	}
	
	@Then("User should able to see the card to enter customer detail and upload statement")
	public void user_should_able_to_see_the_frame_to_enter_customer_detail_and_upload_statement() throws InterruptedException {
		creatorPage.verifyUploadStatementCard();
	}
	@Then("User should able to see the upload button")
	public void user_should_able_to_see_the_upload_button() {
		creatorPage.verifyUploadButton();
	}
	@Then("User should able to see the cancel button")
	public void user_should_able_to_see_the_cancel_button() {
		creatorPage.verifyCancelButton();
	}
	@When("User picks on customer detail")
	public void user_picks_on_customer_detail() throws Exception {
		creatorPage.clickOnCustomerDetails();
	}
	@When("User uploads the statement")
	public void user_uploads_the_statement() throws Exception {
	   creatorPage.uploadsStatement();
	}
	@When("User clicks on the upload button")
	public void user_clicks_on_the_upload_button() throws Exception {
		creatorPage.clickOnUploadButton();
	}
	@Then("User should able to see new customer detail has been created with new Ref No")
	public void user_should_able_to_see_new_customer_detail_has_been_created_with_new_ref_no() throws InterruptedException, IOException {
		creatorPage.verifyNewCustomerDetails();
	}
	
	//aug 21
	@When("User clicks on  new customer detail has been created with new Ref No")
	public void user_clicks_on_new_customer_detail_has_been_created_with_new_ref_no() throws IOException, InterruptedException {
		creatorPage.clickOnNewCustomer();
	}

	@When("User selects date on statement")
	public void user_selects_date_on_statement() throws Exception {
		creatorPage.selectDateOnStatementDate();
	}

	@When("User enters HSBC sanctioned fund based limit")
	public void user_enters_hsbc_sanctioned_fund_based_limit() throws IOException {
		creatorPage.enterHSBCSantionedFundLimit();
	}

	@When("User clicks on details section")
	public void user_clicks_on_details_section() {
		creatorPage.clickOnDetailSection();
	}

	@When("User clicks on stock value details and enters the value")
	public void user_clicks_on_stock_value_details_and_enters_the_value() throws IOException, InterruptedException {
		creatorPage.clickOnStock_Value_Details();
	}

	@When("User clicks on creditors value details and enters the value")
	public void user_clicks_on_creditors_value_details_and_enters_the_value() throws IOException {
		creatorPage.clickOnCreditorsValueDetails();
	}

	@When("User clicks on post margin deductions value details and enters the value")
	public void user_clicks_on_post_margin_deductions_value_details_and_enters_the_value() throws Exception {
		creatorPage.postMerginDediCationDetailsValues();
	}
	@When("User clicks on ageing  details domestic and enters the value")
	public void user_clicks_on_ageing_details_domestic_and_enters_the_value() throws Exception {
		creatorPage.AgeingDetailsDomestic();
	}


//	@When("User clicks on ageing details domestic and enters the value")
//	public void user_clicks_on_ageing_details_domestic_and_enters_the_value() throws Exception {
//		creatorPage.AgeingDetailsDomestic();
//	}

	@When("User clicks on ageing details export and enters the value")
	public void user_clicks_on_ageing_details_export_and_enters_the_value() throws Exception {
		creatorPage.AgeingDetailsExport();
	}

	@When("User clicks on other details and enters the value")
	public void user_clicks_on_other_details_and_enters_the_value() throws Exception {
		creatorPage.clickOnOtherDetails();
	}
	

	@When("User enters CARM Reference")
	public void user_enters_carm_reference() throws Exception {
		creatorPage.userEntercrmValues();
	}

	@When("User selects date on receipt")
	public void user_selects_date_on_receipt() throws Exception{
	    creatorPage.userSelectRecividDate();
	}

	@When("User clicks on customer settings and select dropdowns")
	public void user_clicks_on_customer_settings_and_select_dropdowns() throws Exception {
		creatorPage.clickOnCustomerSetting();
	}

	@When("User clicks on document validation and check all radio buttons are Yes")
	public void user_clicks_on_document_validation_and_check_all_radio_buttons_are_yes() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User enters remarks")
	public void user_enters_remarks() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on Recompute button")
	public void user_clicks_on_recompute_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User should able to view the popup message {string}")
	public void user_should_able_to_view_the_popup_message(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clciks on Approval Basis Stock Value")
	public void user_clciks_on_approval_basis_stock_value() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User should able to view pending with Approver in Queue Management page")
	public void user_should_able_to_view_pending_with_approver_in_queue_management_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}




}
