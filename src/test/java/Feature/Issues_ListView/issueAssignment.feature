Feature: Assign Issues within your Org and other Org

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
    Then User should close the area selector
    Then User should see the issues page


  Scenario: Assign Issues within your Org for an Issue
    Given User click on Add Issue button
    Then User should see the New Issue pane
    And User enter the Issue description
    When User click on Save button
    Then the Issue should be saved
    Given User select an Issue
    When the Issue is not assigned to anyone
    And User click on it and select Automation User from my org
    Then the Issue should be assigned to the User

  Scenario: Assign Issues to other Org for an Issue
    Given User click on Add Issue button
    Then User should see the New Issue pane
    And User enter the Issue description
    When User click on Save button
    Then the Issue should be saved
    Given User select an Issue
    When the Issue is not assigned to anyone
    And User click on it and select Majestic Builders
    Then the Issue should be assigned to that Org

  Scenario: Assign Issues within your Org while creating an Issue

    Given User click on Add Issue button
    Then User should see the New Issue pane
    And User enter the Issue description
    And User click on Assign to field
    And User select Automation User from the list
    When User click on Save button
    Then the Issue should be saved
    Then the Issue should be assigned to that User which I selected

  Scenario: Assign Issues to other Org while creating an Issue

    Given User click on Add Issue button
    Then User should see the New Issue pane
    And User enter the Issue description
    And User click on Assign to field
    And User select Majestic Builders from the list
    When User click on Save button
    Then the Issue should be saved
    Then the Issue should be assigned to that Org which I selected

