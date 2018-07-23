Feature: Interact with Custom Field

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
    When User clicks on Field-Issues
    Then I should close the FTUX
    And I should close the area selector
    Then User should see the issues page


  Scenario: Adding Custom Field while creating issue

    Given I click on Add Issue button
    Then I should see the New Issue pane
    And I select the Issue type
    And I select a Issue description
    And I click on the first custom field
    And I select the value as High
    And I click on Save button
    Then the Issue should be saved
    And I click on Refresh button
    Then the selected custom field value should be saved for that issue

  Scenario: Selecting a custom field for an existing issue

    Given I click on Add Issue button
    And I should see the New Issue pane
    And I select the Issue type
    And I select a Issue description
    When I click on Save button
    And the Issue should be saved
    And I click on Refresh button
    When user clicks on the first Issue
    And I click on Extra Details Collapsible header
    When I select value High from dropdown
    And I click on Refresh button
    Then User should verify the selected custom field value


