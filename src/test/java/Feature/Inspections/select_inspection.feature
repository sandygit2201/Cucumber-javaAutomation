Feature: Access Field module inside Aconex

  Background:

    Given User navigates to Field
    And User enters a valid username
    And User enters a valid password
    When User clicks on the login button
    Then User should be taken to the homepage
    Given I click on the project list
    And I select Web automation project
    Then I should be taken to that project


  Scenario: : Enter Field-Inspections

    Given User clicks on Field-Inspection
    Then I should close the CL area selector
    Then User should see the Inspection page