Feature: Adding comments to an Issue

  Background: User is logged in
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
    And I should close the FTUX
    And I should close the area selector
    Then User should see the issues page

  Scenario: Field user should be able to add comment to an Issue

    Given the user clicks on the first Issue
    When the user should see the comment text box
    Then the user should be able to add the comment
    When the user clicks on Post
    Then the comment should be added


