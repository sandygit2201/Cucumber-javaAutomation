Feature: As a ADMIN, user should be ale to acess all the sections in the settings page


  Background:
    Given User navigates to Field
    And User enters a valid username
    And User enters a valid password
    When User clicks on the login button
    Then User should be taken to the homepage
    Given I click on Field-Settings
    Then I should be taken to Settings page


    #    -------------INSPECTIONS-------------
  @sanity
  Scenario: Access Template section
  #      Run browser in full screen
    Given I click on Templates
    Then I should see the FTUX and close it
    Then I should see the Templates section


#    -------------FIELD DIRECTORY-------------

  Scenario: Access Your Organization section
    Given I click on Your Organization
    Then I should see the Your Organization section

  Scenario: Access Organization you work with section
    Given I click on Organization you work with
    Then I should see the Organization you work with section

    #    -------------NOTIFICATIONS-------------

  Scenario: Access Notification Settings section
    Given I click on Notification Settings
    Then I should see the Notification Settings section

    #    -------------AREAS-------------

  Scenario: Access Areas and sub-areas section
    Given I click on Areas and sub-areas
    Then I should see the Areas and sub-areas section

  Scenario: Access Location details suggestions section
    Given I click on Location details suggestions
    Then I should see the Location details suggestions  section

    #    -------------ISSUES-------------

  Scenario: Access Issue types section
    Given I click on Issue types
    Then I should see the Issue types section

  Scenario: Access Issue description suggestions section
    Given I click on Issue description suggestions
    Then I should see the Issue description suggestions section


