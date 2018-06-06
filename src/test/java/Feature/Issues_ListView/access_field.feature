Feature: Access Field module inside Aconex

  Background:

    Given User navigates to Field
    And User enters a valid username
    And User enters a valid password
    When User clicks on the login button
    Then User should be taken to the homepage


 Scenario: : Enter Field-Issues

    When User clicks on Field-Issues
    Then User should see the Issues page


  Scenario: Add an Issue

    When User clicks on Field-Issues
    Then User should see the Issues page
    Then I should close the FTUX
    Given I click on Add Issue button
    Then I should see the New Issue pane
    And I enter the Issue type
    And I enter the Issue description
    When I click on Save button
    Then the Issue should be saved

#  Scenario: : Enter Field-Inspections
#
#    When User clicks on Field-Inspections
#    Then User should see the Inspection page







