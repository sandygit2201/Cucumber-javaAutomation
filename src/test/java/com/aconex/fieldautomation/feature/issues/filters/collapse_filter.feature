Feature: Filter pane collapsible when clicked

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
    Then User should see the issues page
    Then User should close the area selector
    And the page loader should disappear

  Scenario: Contracting filter pane
    Given User see the filters pane
    When User click on collapse icon for filters
    Then User should not be able to see the filters pane

  Scenario: Expanding filter pane
    Given User see the filters pane
    And User click on collapse icon for filters
    And User should not be able to see the filters pane
    When User click on expanding the collapse icon
    Then User see the filters pane
