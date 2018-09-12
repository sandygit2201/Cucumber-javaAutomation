Feature: Add issue


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

  Scenario: Add an Issues by giving custom values

    Given User click on Add Issue button
    Then User should see the New Issue pane
    And User select the Issue type
    And User enter the Issue description
    And User add a location detail

    #Select due date for next month
    And User select a due date
    When User click on Save button
    Then the Issue should be saved

  Scenario: Add an Issues by selecting dropdown values

    Given User click on Add Issue button
    Then User should see the New Issue pane
    And User select the Issue type
    And User select a Issue description
    And User select a location detail
    #Select due date for next month
    And User select a due date
    When User click on Save button
    Then the Issue should be saved


  Scenario: Issue type is sorted Alphabetically

    Given User click on Add Issue button
    Then User should see the New Issue pane
    Then User click on Issue type
    Then Issue types should be displayed alphabetically

  Scenario: Cancel should not save the items entered in the add issue pane fields

    Given User click on Add Issue button
    Then User should see the New Issue pane
    And User select the Issue type
    And User select a Issue description
    When User click on the Cancel button
    Then User should see the Assigned To text









