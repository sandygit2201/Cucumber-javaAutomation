Feature: Access Field module inside Aconex

  Background:

    Given User navigates to Field
    And User enters a valid username
    And User enters a valid password
    When User clicks on the login button
    Then User should be taken to the homepage
    Given I click on the project list
    And I select Web automation project
    And I agree to Terms of Service Update if prompted
    Then I should be taken to that project


  Scenario: : Enter Field-Issues

    When User clicks on Field-Issues
    And I should close the FTUX
    And I should close the area selector
    Then User should see the issues page









