Feature: User should be able to interact in Your Organization section

  Background:
    Given User navigates to Field
    And User enters a valid username
    And User enters a valid password
    When User clicks on the login button
    Then User should be taken to the homepage
    Given I click on Field-Settings
    Then I should be taken to Settings pageGiven I click on Your Organization
    Then I should see the Your Organization section

  Scenario: Adding people into my Organization
    Given I type a existing user in the Add more people search bar
    When I select the user from the drop down
    Then the user should be added to my Org

  Scenario: Removing people from my Organization
    Given I want to remove the above added user
    When I click on the X mark
    Then the user should be removed from my Organization

  Scenario: Changing user roles
    Given I click on the role of an user
    Then I shuould see the available user roles
    When I select a user role
    Then the user role for the user should be changed