Feature: Issue Grid View

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
    Then I should close the area selector
    And the page loader should disappear

  Scenario: Accessing the issues grid view page

    When User click on grid view button
    Then User should see the grid view