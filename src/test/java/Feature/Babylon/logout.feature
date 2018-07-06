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

    When User clicks on Field-Issues
    Then User should see the issues page
    Then I should close the FTUX
    Then I should close the area selector
    And the page loader should disappear
    When user clicks on logout link
    Then user should be successfully logged out



