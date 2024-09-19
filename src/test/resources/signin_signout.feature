Feature: User Sign-In and Sign-Out

  Scenario: Successful Sign-In
    Given the user is on the sign-in page
    When the user enters valid credentials
    And the user submits the sign-in form
    Then the user should be redirected to the home page
    And the user should see a sign-out button

  Scenario: Sign-In with Invalid Credentials
    Given the user is on the sign-in page
    When the user enters invalid credentials
    And the user submits the sign-in form
    Then the user should see an error message indicating invalid credentials

  Scenario: Successful Sign-Out
    Given the user is signed in
    When the user clicks the sign-out button
    Then the user should be redirected to the sign-in page
    And the user should not see a sign-out button

  Scenario: Sign-Out Without Being Signed In
    Given the user is on the sign-in page
    When the user attempts to sign out without being signed in
    Then the user should see a message indicating no active session
