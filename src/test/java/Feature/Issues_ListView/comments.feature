Feature: Adding comments to an Issue

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
    And User should close the area selector
    Then User should see the issues page

  Scenario: Field user should be able to add comment to an Issue

    Given User clicks on the first Issue
    When User should see the comment text box
    Then User should be able to add the comment
    When User clicks on Post
    Then the comment should be added


