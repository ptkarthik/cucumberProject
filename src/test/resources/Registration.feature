Feature: User Registration

  Background:
    Given the user is on the registration page

  Scenario: Registering a user with all required fields
    When I fill in the registration form with the following details:
      | firstName | lastName | address        | language | email                | phone      | skills | country | dob        | password | confirmPassword |
      | John      | Doe      | 123 Elm Street | English  | john.doe@example.com | 1234567890 | Java   | USA     | 01-01-1990 | Pass@123 | Pass@123        |
    Then the registration should be successful
