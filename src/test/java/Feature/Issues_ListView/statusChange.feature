Feature: Change Issue status


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
    Then I should close the area selector
    Then User should see the issues page

  Scenario: User should be able to change the status of an Issue from Open to RTI
#    The first issue in the list page should be in Open
    Given I find an Open Issue
    When I tap on the status
    When I click on RTI
    Then the status should be changed
