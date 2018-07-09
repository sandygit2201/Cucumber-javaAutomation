Feature: Interact with Custom Field

  Background:
    Given User navigates to Field
    And User enters a valid username
    And User enters a valid password
    When User clicks on the login button
    Then User should be taken to the homepage
    Given I click on the project list
    And I select Web automation project
    Then I should be taken to that project
    When User clicks on Field-Issues
    Then User should see the issues page
    Then I should close the FTUX
    Then User should see the issues page

  Scenario: Adding Custom Field while creating issue

    Given I click on Add Issue button
    Then I should see the New Issue pane
    And I select a Issue type
    And I select a Issue description
    And I click on the first custom field
    And I select the value as High
    And I click on Save button
    Then the Issue should be saved
    And I click on Refresh button
    Then the selected custom field value should be saved for that issue

  Scenario: Selecting a custom field for an existing issue
Given I select an Issue with custom field
    And I click on Extra details collapsible header
    Given there is no value selected
    And I click on the custom field dropdown area
    And I select the value as High
    And I click on Refresh button
    Then the value should be saved for that issue


