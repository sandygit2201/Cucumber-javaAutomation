Feature: User should be able to enter Field Settings

  Background:
    Given User navigates to Field
    And User enters a valid username
    And User enters a valid password
    When User clicks on the login button
    Then User should be taken to the homepage
    Given User click on the project list
    And User select Web automation project
    And User agree to Terms of Service Update if prompted
    Then User should be taken to that project

  Scenario: User clicks on Field-Settings
    Given User click on Field-Settings
    Then User should be taken to Settings page