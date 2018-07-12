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

    Scenario: Click on Refresh button
      When User clicks on Refresh button
      Then Issues page should be refreshed