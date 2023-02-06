@smoke
Feature: Register | Users could register with new accounts
  Scenario: User could register with valid data successfully
    Given User go to register page
    When user select gender type
    And User enter "automation"
    And user enter "tester"
    And user enter Date
    And user enter month
    And user enter year
    And User enters valid "test16@example.com"
    And User fills "P@ssw0rd"
    And user fills "P@ssw0rd"
    And User clicks on register button
   Then success message is displayed
