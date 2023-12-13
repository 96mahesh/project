@creator
Feature: Creator functionality

@sections
  Scenario: Validating the presence of elements and sections present in creator page
  Given User navigates to the url
    When User enters valid email address and password
    And User clicks on sign in
    Then User should able to see Eco Management System portal
    When User clicks on creator login
    Then User should able to see creator homepage
    And User should able to see KPMG Automato Logo
    And User should able to see home button
    And User should able to see fullscreen mode icon
    When User clicks on the fullscreen mode icon
    Then User should able to see the screen in fullscreen mode
    When User clicks on the fullscreen mode icon
    Then User should able to see the screen in normal size
    And User should able to see the profile icon
    And User should able to see Queue Management section
    And User should able to see Completed Queue
    And User should able to see Failed Transactions
    And User should able to see My Pending Activities
    When User clicks on profile icon
    Then User should able to see signed in as creator
    And User should able to see profile name
    And User should able to see profile mail
    And User should able to see switch role button
    And User should able to see signout button
    When User hovers on switch role
    Then User should able to see the roles listed
    When User clicks on signout button
    Then User should able to see the profile has been logged out
    
    @queueManagement
  Scenario: Validating the functionality of elements present in Queue Management section
  Given User navigates to the url
    When User enters valid email address and password
    And User clicks on sign in
    Then User should able to see Eco Management System portal
    When User clicks on creator login
    Then User should able to see creator homepage
    And User should able to see Queue Management section
    And User should able to see upward icon in Queue Management section
    When User clicks on upward icon in Queue Management section
    Then User should able to see Queue Management section is minimized
    When User clicks on downward icon in Queue Management section
    Then User should able to see the elements presents under Queue Management section
    And User should able to see search customer text box
    And User should able to see refresh icon
    And User should able to see upload statement button
    And User should able to see download Template icon
    And User should able to see Ref No column
    And User should able to see Customer Name column
    And User should able to see Customer ID column
    And User should able to see Action Particular column
    And User should able to see Creator column
    And User should able to see Approver column
    And User should able to see RM column
    And User should able to see Communication Notes column
    And User should able to see Pending with column
    And User should able to see Exp Date column
    And User should able to see Managed documents column
    When User enters customer number in search customer text box
    Then User should able to see customer detail of entered customer id
    When User clicks on refresh button
    Then User should able to see the page has been loaded
    When User clicks on download template button
    Then User should able to see file has been download
    When User clicks on the sorting button in Ref No
    Then User should able to see the customer details has been sorted
    When User clicks download icon on managed documents column
    Then User should able to see the document has been downloaded
    When User clicks on Upload statement
    And User clicks on upload statement pdf in dropdown
    Then User should able to see the card to enter customer detail and upload statement
    And User should able to see the upload button
    And User should able to see the cancel button
    When User picks on customer detail
    And User uploads the statement
    And User clicks on the upload button
    Then User should able to see new customer detail has been created with new Ref No
    When User clicks on  new customer detail has been created with new Ref No
    And User selects date on statement
    And User enters HSBC sanctioned fund based limit
    And User clicks on details section
    And User clicks on stock value details and enters the value
    And User clicks on creditors value details and enters the value
    And User clicks on post margin deductions value details and enters the value
    When User clicks on ageing  details domestic and enters the value
   # And User clicks on ageing  details domestic and enters the value
    And User clicks on ageing details export and enters the value
    And User clicks on other details and enters the value
    And User enters CARM Reference 
    And User selects date on receipt
    And User clicks on customer settings and select dropdowns 
    And User clicks on document validation and check all radio buttons are Yes
    And User enters remarks
    When User clicks on Recompute button
    Then User should able to view the popup message "DP has been Recomputed."
    When User clciks on Approval Basis Stock Value
    Then User should able to view pending with Approver in Queue Management page
    
  
    
    
     