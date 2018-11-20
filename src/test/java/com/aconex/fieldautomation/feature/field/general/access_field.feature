Feature: Access Field module inside Aconex

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

    Given user data "poleary"
      | username | project       | fullname        |
      | poleary  | web Autoation | Mr Patrick O'Leary |
    Given user data "mjenner"
      | username | project       | fullname        |
      | mjenner  | web Autoation |Mr Maurice Jenner|
    Given user data "ataylor"
      | username | project       | password | fullname        |
      | ataylor  | web Autoation | abcd1234 | Patrick O'Leary |
    Given user data "asingh"
      | username | project       | fullname        |
      | asingh   | web Autoation | Patrick O'Leary |

  Scenario: : Enter Field-Issues
    Then check user details
#    Given  login as "mjenner"
    When User clicks on Field-Issues
    And User should close the FTUX
    And User should close the area selector
    Then User should see the issues page









