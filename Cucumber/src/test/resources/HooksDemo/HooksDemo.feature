Feature: to validate login

@smoke
  Scenario: 
    Given user is in browser
    When user enters un and pswd
    And clicks on login btn
    Then navigated to home page

  Scenario: 
    Given user is in browser
    When user enters un and pswd
    And clicks on login btn
    Then navigated to home page
