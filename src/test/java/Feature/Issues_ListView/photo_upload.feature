Feature: Adding comments to an Issue

  Background: User is logged in
    Given User navigates to Field
    And User enters a valid username
    And User enters a valid password
    When User clicks on the login button
    Then User should be taken to the homepage
    When User clicks on Field-Issues
    Then User should see the Issues page

  Scenario: Field user should be able to add photo to an existing issue

    Given the user clicks on the first Issue
    Then the user should click on Add photos
    Then the user should select the photo
    Then the user should click on upload button
    Then the added photo should be visible