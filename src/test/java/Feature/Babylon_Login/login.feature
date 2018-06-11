@sanity
Feature: Log into Babylon

Multiple Valid and Invalid login scenarios

  Scenario Outline: Log into Babylon

    Given User navigates to Field
    And User enters a "<Username>" username
    And User enters a "<Password>" password
    When User clicks on the login button
    Then User should see the "<message>"

    Examples:
      | Username | Password  | message                                    |
      | mjenner  | Auth3nt1c | Logout                                     |
      | poleary1 | Auth3nt1c | Your login name or password is incorrect.  |
      | mjenner  |           | Please enter your login name and password. |
      |          | Auth3nt1c | Please enter your login name and password. |


