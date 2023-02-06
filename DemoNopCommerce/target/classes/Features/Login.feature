@smoke
  Feature: Login | User could use login functionality to use his account
    Scenario: User logins in with valid email and valid password
      Given User goes to login page
      When User Enters "test14@example.com"
      And user Enters "P@ssw0rd"
      And User Clicks on Login button
      Then User Logins to the system successfully
@smoke
Scenario: User Logins with invalid email and password
  Given User goes to login page
  When User enters "Wrong@example.com"
  And user Enters "P@ssw0rd"
  And User Clicks on Login button
  Then User could not login in to the system