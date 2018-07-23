Feature: Log into Babylon

  Multiple Valid and Invalid login scenarios


  Scenario Outline: Successful Babylon Login

    Given User navigates to Field
    And User enters a "<Username>" username
    And User enters a "<Password>" password
    When User clicks on the login button
    Then User should see the "<message>"

    Examples:
      | Username | Password  | message |
      | mjenner  | Auth3nt1c | Logout  |



  Scenario Outline: Unsuccessful Babylon Login - Incorrect Username and Password

    Given User navigates to Field
    And User enters a "<Username>" username
    And User enters a "<Password>" password
    When User clicks on the login button
    Then User should see the failure message

    Examples:
      | Username | Password   |
      | mjenner1 | Auth3nt1c  |
      | poleary  | Auth3nt1c1 |

  Scenario Outline: Unsuccessful Babylon Login - Blank Username and Password

    Given User navigates to Field
    And User enters a "<Username>" username
    And User enters a "<Password>" password
    When User clicks on the login button
    Then User should see the failure "<message>"

    Examples:
      | Username | Password   | message                                    |
      | mjenner  |            | Please enter your login name and password. |
      |          | Auth3nt1c1 | Please enter your login name and password. |