Feature: Change Issue status


  Background:
    Given User navigates to Field
    And User enters a valid username
    And User enters a valid password
    When User clicks on the login button
    Then User should be taken to the homepage
    When User clicks on Field-Issues
    Then User should see the Issues page
    Then I should close the FTUX
    Then I should close the area selector

  Scenario: User should be able to change the staus of an Issue from Open to RTI
#    The first issue in the list page should be in Open
    Given I find an Open Issue
    When I tap on the status
    When I click on RTI
    Then the status should be changed
