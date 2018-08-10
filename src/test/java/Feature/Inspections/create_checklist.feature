Feature: User should be able to create a checklist

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
    Given User click on Field-Settings
    Then User should be taken to Settings page
    Given User click on Templates
#      Then I should see the FTUX and close it
      Then User should see the Templates section

      Scenario: Create a valid checklist
        Given User click on Add Template button
        And User select checklist
        Then User should see the checklist create page
        And User add the title
        And User enter the description
        Then User select a Category
        And User enter a item
        And User select a type
        And User click on Add button
        When User click on Publish button
        Then the checklist should be created


