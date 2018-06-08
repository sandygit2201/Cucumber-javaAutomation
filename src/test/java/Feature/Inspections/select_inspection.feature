Feature: Access Field module inside Aconex

  Background:

    Given User navigates to Field
    And User enters a valid username
    And User enters a valid password
    When User clicks on the login button
    Then User should be taken to the homepage


  Scenario: : Enter Field-Issues

    Given User clicks on Field-Inspection
    Then I should close the CL area selector
    Then User should see the Inspection page