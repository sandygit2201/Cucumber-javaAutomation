Feature: User should be able to send Issues report though mail

  Background:
    Given User navigates to Field
    And User enters a valid username
    And User enters a valid password
    When User clicks on the login button
    Then User should be taken to the homepage
    Given I click on the project list
    And I select Web automation project
    Then I should be taken to that project
    When User clicks on Field-Issues
    Then I should close the FTUX
    And I click on BLOCK E area
    Then I should close the area selector
    Then User should see the issues page

  Scenario: User should be able to send mail when there are assigned issues in an area
    Given I click on Refresh button
    Then the Send button should be enabled
    When I click on Send Button
    Then I should see the Send mail modal
    And the Send button should be disabled
    And I click on Mail type drop down
    And I select Variation mail type
    Then the Send button in the modal should be enabled
    And when I click on Send button
    Then the Send mail modal should disappear


