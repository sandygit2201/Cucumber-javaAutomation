Feature: Selecting area

  Background: User is logged in


    Given User navigates to Field
    And User enters a valid username
    And User enters a valid password
    When User clicks on the login button
    Then User should be taken to the homepage
    Given I click on the project list
    And I select Web automation project
    Then I should be taken to that project
    When User clicks on Field-Issues
    And I should close the FTUX



  Scenario: User should be able to select an area after successful login
    Given the area drop down appears
    And I click on an area
    Then I should be taken to that area

