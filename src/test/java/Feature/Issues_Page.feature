Feature: Access Field
  Existing user should be able to access Field

 Scenario: : Enter Field

    Given User navigates to Field
    And User enters a valid username
    And User enters a valid password
    When User clicks on the login button
    Then User should be taken to the homepage
    When User clicks on Field-Issues
    Then User should see the Issues page

#  Scenario: Select an Area
#
#    Given I see the Issue page
#    When I select an area from the dropdown
#    Then I should see the Issues for that area
@AddIssue
  Scenario: Add an Issue
    Given User navigates to Field
    And User enters a valid username
    And User enters a valid password
    When User clicks on the login button
    Then User should be taken to the homepage
    When User clicks on Field-Issues
    Then User should see the Issues page
    Then I should close the FTUX
    Given I click on Add Issue button
    Then I should see the New Issue pane
    And I enter the Issue type
    And I enter the Issue description
    When I click on Save button
    Then the Issue should be saved







