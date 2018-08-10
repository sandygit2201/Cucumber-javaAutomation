Feature: User should be able to send Issues report though mail

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

  Scenario: User should be able to send mail when there are assigned issues in an area
    When User clicks on Field-Issues
    Then User should close the FTUX
    And User click on BLOCK E area
    Then User should close the area selector
    Then User should see the issues page
    Given the Send button should be enabled
    When User click on Send Button
    Then User should see the Send mail modal
    And the Send button should be disabled
    And User click on Mail type drop down
    And User select Variation mail type
    Then the Send button in the modal should be enabled
    And User click on Send button
    Then the Send mail modal should disappear

  Scenario: User should see the sent mail in Mail module
    Given User clicks on Mail-Sent module
    Then User should land in the Mail module
    And User selects today from the date column
    And User clicks the Search button
    Then User should see the mail with subject: Aconex Field Issues for BLOCK E
    And the From should be Maurice Jenner
    And the type should be Variation




