@tag
Feature: Login functionality

@positiveLogin
  Scenario: Validating login functionality with positive data
    Given User navigates to the url
    When User enters valid email address and password
    And User clicks on sign in
    Then User should able to see Eco Management System portal
    
    @invalidEmail
  Scenario Outline: Validating the functionality of email address field
    Given User navigates to the url
    When User enters invalid "<emailId>" in email address field
    And User clicks on password field
    Then User should able to see "Please enter a valid email address" error message below email address field
    
    Examples:
    |emailId|
    |muskan|
    
    @eyeIcon
    Scenario: Validating the functionality of eye icon in password field
    Given User navigates to the url
    When User enters valid email address and password
    And User clicks on eye icon in password field
    Then User should able to see entered password details
    
    
