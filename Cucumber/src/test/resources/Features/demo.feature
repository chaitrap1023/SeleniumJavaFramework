Feature: validation of login
@SmokeTest
  Scenario: to check successful login
    Given user is in login page
    When user enters valid credentials- un and pswd
    And clicks on login
    Then navigated to home page
    
 