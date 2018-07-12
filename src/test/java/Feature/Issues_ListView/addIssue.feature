Feature: Add issue


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
    Then I should close the FTUX
    Then User should see the issues page

  Scenario: Add an Issues by giving custom values

    Given I click on Add Issue button
    Then I should see the New Issue pane
    And I select the Issue type
    And I enter the Issue description
    And I add a location detail

      #Select due date for next month
    And I select a due date
    When I click on Save button
    Then the Issue should be saved

  Scenario: Add an Issues by selecting dropdown values

    Given I click on Add Issue button
    Then I should see the New Issue pane
    And I select the Issue type
    And I select a Issue description
    And I select a location detail
    #Select due date for next month
    And I select a due date
    When I click on Save button
    Then the Issue should be saved


  Scenario: Issue type is sorted Alphabetically

    Given I click on Add Issue button
    Then I should see the New Issue pane
    Then I click on Issue type
    Then Issue types should be displayed alphabetically







