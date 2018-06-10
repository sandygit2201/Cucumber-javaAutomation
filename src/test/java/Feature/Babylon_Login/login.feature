@sanity
Feature: Log into Apiprod
  Existing user should be able to log into account using existing credentials



  Scenario Outline: Log into Apiprod with credentials

    Given User navigates to Field
    And User enters a "<Username>" username
    And User enters a "<Password>" password
    When User clicks on the login button
    Then User should see the "<message>"

    Examples:
      | Username | Password  | message                                   |
      | mjenner  | Auth3nt1c | Logout                                    |
      | poleary1 | Auth3nt1c | Your login name or password is incorrect. |









