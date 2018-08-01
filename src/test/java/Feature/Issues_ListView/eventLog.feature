Feature: Event Log

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
    Given I click on Add Issue button
    Then I should see the New Issue pane
    And I select a Issue type
    And I select a Issue description

  Scenario: Verifying the "captured by" for a new issue

    Given I click on Save button
    And the Issue should be saved
    And I click on Refresh button
    And user clicks on the first Issue
    When I click on Event log Collapsible header
    And I click on Event log button
    Then I should see the Event log modal
    And I should verify the captured user




