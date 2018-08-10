Feature: Event Log

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
    When User clicks on Field-Issues
    Then User should close the FTUX
    Then User should see the issues page
    Given User click on Add Issue button
    Then User should see the New Issue pane
    And User select a Issue type
    And User select a Issue description

  Scenario: Verifying the "captured by" for a new issue

    Given User click on Save button
    And the Issue should be saved
    And User click on Refresh button
    And User clicks on the first Issue
    When User click on Event log Collapsible header
    And User click on Event log button
    Then User should see the Event log modal
    And User should verify the captured user




