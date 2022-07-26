Feature: Test login functaionality

  Scenario Outline: test login is successful with valid cred
    Given browser is open
    And user is in login page
    When user enters <username> and <password>
    And clicks on login
    Then navigate to home page

    Examples: 
      | username | password |
      | chaitra  |    12345 |
      | raghav   |    12345 |
