Feature: Assign Issues within your Org and other Org

  Background:
    Given User navigates to Field
    And User enters a valid username
    And User enters a valid password
    When User clicks on the login button
    Then User should be taken to the homepage
    When User clicks on Field-Issues
    Then User should see the Issues page
    Then I should close the FTUX
    Then I should close the area selector


  Scenario: Assign Issues within your Org for an Issue
    Given I select an Issue
    When the Issue is not assigned to anyone
#    test test user
    And I click on it and select an User from my org
    Then the Issue should be assigned to the User


  Scenario: Assign Issues to other Org for an Issue
    Given I select an Issue
    When the Issue is not assigned to anyone
#    Majestic builders
    And I click on it and select an Org
    Then the Issue should be assigned to that Org


  Scenario: Assign Issues within your Org while creating an Issue

    Given I click on Add Issue button
    Then I should see the New Issue pane
    And I enter the Issue description
    And I click on Assign to field
    And I select a User from the list
    When I click on Save button
    Then the Issue should be saved
    Then the Issue should be assigned to that User which I selected

  Scenario: Assign Issues to other Org while creating an Issue

    Given I click on Add Issue button
    Then I should see the New Issue pane
    And I enter the Issue description
    And I click on Assign to field
    And I select a Org from the list
    When I click on Save button
    Then the Issue should be saved
  #    Majestic Org
    Then the Issue should be assigned to that Org which I selected

