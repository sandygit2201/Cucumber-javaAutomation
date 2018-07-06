Feature: Access Field module inside Aconex

  Background:

    Given User navigates to Field
    And User enters a valid username
    And User enters a valid password
    When User clicks on the login button
    Then User should be taken to the homepage


  Scenario: : Enter Field-Issues

    When User clicks on Field-Issues
    And I should close the FTUX
    And I should close the area selector
    Then User should see the issues page









