Feature: Interact with Custom Field

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
    And User should close the area selector
    Then User should see the issues page


  Scenario: Adding Custom Field while creating issue

    Given User click on Add Issue button
    Then User should see the New Issue pane
    And User select the Issue type
    And User select a Issue description
    And User click on the first custom field
    And User select the value as High
    And User click on Save button
    Then the Issue should be saved
    And User click on Refresh button
    Then the selected custom field value should be saved for that issue

  Scenario: Selecting a custom field for an existing issue

    Given User click on Add Issue button
    And User should see the New Issue pane
    And User select the Issue type
    And User select a Issue description
    When User click on Save button
    And the Issue should be saved
    And User click on Refresh button
    Given User clicks on the first Issue
    And User click on Extra Details Collapsible header
    When User select value High from dropdown
    And User click on Refresh button
    Then User should verify the selected custom field value


