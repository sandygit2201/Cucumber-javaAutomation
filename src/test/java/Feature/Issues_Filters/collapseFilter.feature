Feature: Filter pane collapsible when clicked

  Background:
    Given User navigates to Field
    And User enters a valid username
    And User enters a valid password
    When User clicks on the login button
    Then User should be taken to the homepage
    Given I click on the project list
    And I select Web automation project
    Then I should be taken to that project
    When User clicks on Field-Issues
    Then I should close the FTUX
    Then User should see the issues page
    Then I should close the area selector
    And the page loader should disappear

  Scenario: Contracting filter pane
    Given I see the filters pane
    When I click on collapse icon for filters
    Then I should not be able to see the filters pane

    Scenario: Expanding filter pane
      Given I see the filters pane
      And I click on collapse icon for filters
      And I should not be able to see the filters pane
      When I click on expanding the collapse icon
      Then I see the filters pane
