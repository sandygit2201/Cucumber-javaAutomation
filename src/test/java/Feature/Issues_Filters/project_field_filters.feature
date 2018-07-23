Feature: Toggle Project field filters

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
    And I should close the FTUX
    Then I should close the area selector

  Scenario: User should be able to apply project field filters
      """
      Select "Priority" CC and select "High" value
      """
      Given I click on Extra details
      Then I should see the Extra details modal
      And I select the project field
      When I select one value in that project field
      And I click on Apply button
      Then I should see the loading screen
      Then I should see the result as per the filter
