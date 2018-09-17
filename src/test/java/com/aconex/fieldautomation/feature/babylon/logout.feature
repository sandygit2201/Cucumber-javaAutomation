Feature: Logout

  Background:
    Given User navigates to Field
    And User enters a valid username
    And User enters a valid password
    When User clicks on the login button
    Then User should be taken to the homepage

  Scenario: User logs out before entering into Field

    When user clicks on logout link
    Then user should be successfully logged out


  Scenario: User logs out after entering the Field

    Given User clicks on Field-Issues
    And User should close the FTUX
    And User should see the issues page
    And User should close the area selector
    And the page loader should disappear
    When user clicks on logout link
    Then user should be successfully logged out



