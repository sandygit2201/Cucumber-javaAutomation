Feature: As a ADMIN, user should be ale to acess all the sections in the settings page


  Background:
    Given User navigates to Field
    And User enters a valid username
    And User enters a valid password
    When User clicks on the login button
    Then User should be taken to the homepage
    Given I click on Field-Settings
    Then I should be taken to Settings page

    Scenario: Access Template section
#      Run browser in full screen
      Given I click on Templates
      Then I should see the FTUX and close it
      Then I should see the Templates section
