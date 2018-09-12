Feature: As a ADMIN, user should be able to access all the sections in the settings page


  Background:
    Given User navigates to Field
    And User enters a valid username
    And User enters a valid password
    When User clicks on the login button
    Then User should be taken to the homepage
    Given User click on Field-Settings
    Then User should be taken to Settings page


    #    -------------INSPECTIONS-------------

  Scenario: Access Template section
    Given User click on Templates
    Then User should see the Templates section


#    -------------FIELD DIRECTORY-------------

  Scenario: Access Your Organization section
    Given User click on Your Organization
    Then User should see the Your Organization section



