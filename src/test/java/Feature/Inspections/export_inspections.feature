Feature: Export a valid Inspection

  Background:
    Given User navigates to Field
    And User enters a valid username
    And User enters a valid password
    When User clicks on the login button
    Then User should be taken to the homepage
    Given I click on the project list
    And I select Web automation project
    Then I should be taken to that project
    Given User clicks on Field-Inspection
    Then I should close the CL area selector
    Then User should see the Inspection page

  Scenario: Export checklist PDF report
    #Click on CL named Automation
    Given I select the first checklist
    When I click on the Export button
    #Check download folder for a PDF named <whatever>
    Then the checklist report should be downloaded
    And the PDF content should match with the Web app