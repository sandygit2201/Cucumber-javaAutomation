Feature: User should be able to create a checklist

    Background:
    Given User navigates to Field
    And User enters a valid username
    And User enters a valid password
    When User clicks on the login button
    Then User should be taken to the homepage
    Given I click on Field-Settings
    Then I should be taken to Settings page
#      Run browser in full screen
    Given I click on Templates
      Then I should see the FTUX and close it
      Then I should see the Templates section

      Scenario: Create a valid checklist
        Given I click on Add Template button
        And I select checklist
        Then I should see the checklist create page
        And I add the title
        And I enter the description
#        Then I select a Category
        And I enter a item
        And I select a type
        And I click on Add button
        When I click on Publish button
        Then the checklist should be created


