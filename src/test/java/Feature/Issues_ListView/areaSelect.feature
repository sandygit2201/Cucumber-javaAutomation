Feature: Selecting area

  Background: User is logged in

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
    And User should close the FTUX


  Scenario: User should be able to select an area after successful login
    Given the area drop down appears
    And User click on BLOCK A area
    Then User should close the area selector
    And User should see the loading screen
    Then User should be taken to that area


  Scenario: Area displayed in New issue pane should match with the user selected area
    Given the area drop down appears
    And User click on BLOCK A area
    Then User should close the area selector
    And User should see the loading screen
    Then User should be taken to that area
    Given User click on Add Issue button
    Then User should see the New Issue pane
    And User select the Issue type
    And User enter the Issue description
    Then User click on Save button
    And User click on Refresh button
    When User clicks on the first Issue
    Then the area in new issue pane should match the user selected area



