Feature: Clear All Filter

  Background:
    Given User navigates to Field
    And User enters a valid username
    And User enters a valid password
    When User clicks on the login button
    Then User should be taken to the homepage
    Given I click on the project list
    And I select Web automation project
    And I agree to Terms of Service Update if prompted
    Then I should be taken to that project
    When User clicks on Field-Issues
    Then I should close the FTUX
    Then User should see the issues page
    Then I should close the area selector
    And the page loader should disappear

    Scenario: Clearing the selected filters

      Given User clicks on Ready to Inspect filter
      And User selects the Issue Type as Automation
      And User selects the created date as Today
      And User checks the filter count as three
      When User clicks on clear all filter option
      Then Filter count should be removed

