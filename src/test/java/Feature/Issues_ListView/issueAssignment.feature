Feature: Assign Issues within your Org and other Org

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
    Then I should close the area selector
    Then User should see the issues page


  Scenario: Assign Issues within your Org for an Issue
    Given I click on Add Issue button
    Then I should see the New Issue pane
    And I enter the Issue description
    When I click on Save button
    Then the Issue should be saved
    Given I select an Issue
    When the Issue is not assigned to anyone
    And I click on it and select Automation User from my org
    Then the Issue should be assigned to the User

  Scenario: Assign Issues to other Org for an Issue
    Given I click on Add Issue button
    Then I should see the New Issue pane
    And I enter the Issue description
    When I click on Save button
    Then the Issue should be saved
    Given I select an Issue
    When the Issue is not assigned to anyone
    And I click on it and select Majestic Builders
    Then the Issue should be assigned to that Org

  Scenario: Assign Issues within your Org while creating an Issue

    Given I click on Add Issue button
    Then I should see the New Issue pane
    And I enter the Issue description
    And I click on Assign to field
    And I select Automation User from the list
    When I click on Save button
    Then the Issue should be saved
    Then the Issue should be assigned to that User which I selected

  Scenario: Assign Issues to other Org while creating an Issue

    Given I click on Add Issue button
    Then I should see the New Issue pane
    And I enter the Issue description
    And I click on Assign to field
    And I select Majestic Builders from the list
    When I click on Save button
    Then the Issue should be saved
    Then the Issue should be assigned to that Org which I selected

