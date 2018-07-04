Feature: Assign Issues within your Org and other Org

  Background:
    Given User navigates to Field
    And User enters a valid username
    And User enters a valid password
    When User clicks on the login button
    Then User should be taken to the homepage
    When User clicks on Field-Issues
    Then User should see the Issues page
    Then I should close the FTUX
    Then I should close the area selector


  Scenario: Assign Issues within your Org for an Issue
    Given I select an Issue
    When the Issue is not assigned to anyone
    And I click on it and select an User from my org
    Then the Issue should be assigned to the User

  @Test
  Scenario: Assign Issues to other Org for an Issue
    Given I select an Issue
    When the Issue is not assigned to anyone
    And I click on it and select an Org
    Then the Issue should be assigned to that Org

#  Scenario: Assign Issues within your Org while creating an Issue
#
#
#    Given I click on Add Issue button
#    Then I should see the New Issue pane
#    When I click on Save button
#    Then the Issue should be saved
#
#  Scenario: Assign Issues to other Org while creating an Issue
#
#    Given I click on Add Issue button
#    Then I should see the New Issue pane
#    When I click on Save button
#    Then the Issue should be saved

