Feature: check home page functuonality

  Background: user logged in
    Given user is in login page
    When user entes un an dpswd
    And clicks on login button
    Then navigated to home page

  Scenario: Check logout button
    
    When user clicks on logout btn
    Then singup page is displayed

  Scenario: check login
    
    When user enters country name and other details
    And clicks on save btn
    Then saved is displayed
