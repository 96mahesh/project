@stock
Feature: Creator functionality

  @statement
  Scenario: Validating the functionalities of stock statement page
    Given User navigates to the url
    When User enters valid email address and password
    And User clicks on sign in
    And User clicks on creator login
    And User clicks on Upload statement
    And User clicks on upload statement pdf in dropdown
    And User picks on customer detail
    And User uploads the statement
    And User clicks on the upload button
    And User clicks on  new customer detail has been created with new Ref No
    And User selects date on statement
    And User enters HSBC sanctioned fund based limit
    And User clicks on details section
    #And User clicks on compare with original button
    And User clicks on stock value details and enters the value
    And User clicks on creditors value details and enters the value
    And User clicks on post margin deductions value details and enters the value
    And User clicks on ageing  details domestic and enters the value
    And User clicks on ageing details export and enters the value
    And User clicks on other details and enters the value
