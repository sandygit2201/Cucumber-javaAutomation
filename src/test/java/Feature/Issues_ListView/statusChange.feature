Feature: Change Issue status


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
    Then User should close the area selector
    Then User should see the issues page

  Scenario: User should be able to change the status of an Issue from Open to RTI
    Given User find an Open Issue
    When User tap on the status
    When User click on RTI
    Then the status should be changed
