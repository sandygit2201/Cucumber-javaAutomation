Feature: User should be able to interact in Your Organization section

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


  Scenario: : Accessing Your Organization section
    Given User click on Your Organization
    Then User should see the Your Organization section

  Scenario: Adding people into my Organization
    Given User types Automation User1 in the Add more people search bar
    When User select the user from the drop down
    Then the user should be added to my Org

  Scenario: Changing user roles
##    Automation User1 user should be inspector

    Given User Automation User1 is an Inspector
    And User clicks on the role of an Inspector
    And User should see the available user roles
    When User select a user role
    Then User role for the user should be changed

  Scenario: Removing people from my Organization

    Given User click on Your Organization
    When User click on the X mark for an Automation User1
    Then the user Automation User1 should be removed from my Organization

