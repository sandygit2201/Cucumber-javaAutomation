Feature: Toggle Issues filters

  Background: Land field
    Given User navigates to Field
    And User enters a valid username
    And User enters a valid password
    When User clicks on the login button
    Then User should be taken to the homepage
    Given I click on the project list
    And I select Web automation project
    And I agree to Terms of Service Update if prompted
    Then I should be taken to that project
    When User clicks on Field-Issues
    And I should close the FTUX
    Then I should close the area selector
    Then User should see the issues page

  Scenario: Filter Open Issues
    When I select Open status
    Then I should see Issues that are Open

  Scenario: Filter Ready to Inspect Issues
    When I select Ready to Inspect status
    Then I should see Issues that are Ready to Inspect

  Scenario: Filter In Dispute Issues
    When I select In Dispute status
    Then I should see Issues that are In Dispute

  Scenario: Filter Closed Issues
    When I select Closed status
    Then I should see Issues that are Closed


  Scenario: Filter Work Done Issues
    When I select Work Done status
    Then I should see Issues that are Work Done

