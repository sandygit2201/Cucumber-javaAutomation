Feature: Refresh Issues List view page

  Background:
    User is logged in
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
    And I should close the area selector
    Then User should see the issues page

  Scenario: Click on Refresh button after adding an Issue
      Given I know the Issue count in Issues page
      Then I click on Add Issue button
      And I should see the New Issue pane
      And I select the Issue type
      And I select a Issue description
      And I click on Save button in Issues pane
      And Issue should be saved
      When User clicks on Refresh button
      Then I should see Issue number get updated


    Scenario: Click on Refresh button
      When User clicks on Refresh button
      Then I should see the loading screen

