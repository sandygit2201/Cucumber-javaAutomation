Feature: Toggle Project field filters

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
    And User should close the FTUX
    Then User should close the area selector

  Scenario: User should be able to apply project field filters
  """
      Select "Priority" CC and select "High" value
      """
    Given User click on Extra details
    Then User should see the Extra details modal
    And User select the project field
    When User select one value in that project field
    And User click on Apply button
    Then User should see the loading screen
    Then User should see the result as per the filter
