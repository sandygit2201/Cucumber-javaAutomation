Feature: Toggle Issues filters

  Background:
    Given User navigates to Field
    And User enters a valid username
    And User enters a valid password
    When User clicks on the login button
    Then User should be taken to the homepage
    When User clicks on Field-Issues
    Then User should see the Issues page
    And I should close the FTUX
    Then I should close the area selector

  Scenario: Filter Open Issues
    When I select Open status
    Then I should see Issues that are Open