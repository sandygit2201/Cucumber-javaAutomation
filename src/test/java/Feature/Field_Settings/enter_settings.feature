Feature: User should be able to enter Field Settings

  Background:
    Given User navigates to Field
    And User enters a valid username
    And User enters a valid password
    When User clicks on the login button
    Then User should be taken to the homepage

  Scenario: User clicks on Field-Settings
    Given I click on Field-Settings
    Then I should be taken to Settings page