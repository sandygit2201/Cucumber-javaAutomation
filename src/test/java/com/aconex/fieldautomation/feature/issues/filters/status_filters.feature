Feature: Toggle Issues filters

  Background: Land field
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
    And User should close the FTUX
    Then User should close the area selector
    Then User should see the issues page

  Scenario: Filter Open Issues
    When User select Open status
    Then User should see Issues that are Open

  Scenario: Filter Ready to Inspect Issues
    When User select Ready to Inspect status
    Then User should see Issues that are Ready to Inspect

  Scenario: Filter In Dispute Issues
    When User select In Dispute status
    Then User should see Issues that are In Dispute

  Scenario: Filter Closed Issues
    When User select Closed status
    Then User should see Issues that are Closed


  Scenario: Filter Work Done Issues
    When User select Work Done status
    Then User should see Issues that are Work Done

