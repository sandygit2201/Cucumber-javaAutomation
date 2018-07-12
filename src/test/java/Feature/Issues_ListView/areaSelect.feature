Feature: Selecting area

  Background: User is logged in

    Given User navigates to Field
    And User enters a valid username
    And User enters a valid password
    When User clicks on the login button
    Then User should be taken to the homepage
    Given I click on the project list
    And I select Web automation project
    Then I should be taken to that project
    When User clicks on Field-Issues
    And I should close the FTUX


  Scenario: User should be able to select an area after successful login
    Given the area drop down appears
    And I click on BLOCK A area
    Then I should close the area selector
    And I should see the loading screen
    Then I should be taken to that area


  Scenario: Area displayed in New issue pane should match with the user selected area
    Given the area drop down appears
    And I click on BLOCK A area
    Then I should close the area selector
    And I should see the loading screen
    Then I should be taken to that area
    Given I click on Add Issue button
    Then I should see the New Issue pane
    And I select the Issue type
    And I enter the Issue description
    Then I click on Save button
    And I click on Refresh button
    When user clicks on the first Issue
    Then the area in new issue pane should match the user selected area



