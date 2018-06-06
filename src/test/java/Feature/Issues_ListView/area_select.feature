Feature: Selecting area

Background: User is logged in


Given User navigates to Field
And User enters a valid username
And User enters a valid password
When User clicks on the login button
  Then User should be taken to the homepage
  When User clicks on Field-Issues
  Then User should see the Issues page


  Scenario: User should be able to select an area after successful login
    When the area drop down appears
    And I click on an area
    Then I should be taken to that area

