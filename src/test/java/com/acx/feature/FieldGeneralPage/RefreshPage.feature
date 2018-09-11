Feature: Refresh Issues List view page

  Background:
    User is logged in
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
    And User should close the area selector
    Then User should see the issues page

  Scenario: Click on Refresh button after adding an Issue
      Given User know the Issue count in Issues page
      Then User click on Add Issue button
      And User should see the New Issue pane
      And User select the Issue type
      And User select a Issue description
      And User click on Save button in Issues pane
      And Issue should be saved
      When User clicks on Refresh button
      Then User should see Issue number get updated


    Scenario: Click on Refresh button
      When User clicks on Refresh button
      Then User should see the loading screen

