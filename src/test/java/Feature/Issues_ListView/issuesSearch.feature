Feature: User wants to search an item in the search field

  Background:
    Given User navigates to Field
    And User enters a valid username
    And User enters a valid password
    When User clicks on the login button
    Then User should be taken to the homepage
    When User clicks on Field-Issues
    Then I should close the FTUX
    Then I should close the area selector
    Then User should see the issues page


    Scenario: Search for an item in issues search field

      Given User clicks on the issues search field
      When User enters a string in the issues search field
      And User clicks on the search button
#      Then User should be able to see searched item in the issues list view

