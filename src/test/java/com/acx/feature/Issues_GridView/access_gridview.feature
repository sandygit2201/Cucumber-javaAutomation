Feature: Issue Grid View

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
    Then User should see the issues page
    Then User should close the area selector
    And the page loader should disappear

  Scenario: Accessing the issues grid view page

    When User click on grid view button
    Then User should see the grid view