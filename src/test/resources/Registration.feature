Feature: User Registration
  Background:
  Given the user is on the registration page

  Scenario: Registering a user with all required fields
    When I fill in the registration form with the following details:
      | firstName | lastName | address        | language | email                | phone        | skills  | country   | dob        | password | confirmPassword |
      | John      | Doe      | 123 Elm Street | English  | john.doe@example.com | 1234567890   | Java    | USA       | 01-01-1990 | Pass@123 | Pass@123        |
    Then the registration should be successful

#    When the user enters valid registration details
#    And the user submits the registration form
#    Then the user should see a registration success message

#  Scenario: Registration with Missing Required Fields
#
#    When the user submits the registration form with missing required fields
#    Then the user should see an error message indicating the missing fields
#
#  Scenario: Registration with Invalid Email Format
#
#    When the user enters an invalid email address
#    And the user submits the registration form
#    Then the user should see an error message indicating an invalid email address
#
#  Scenario: Registration with Weak Password
#
#    When the user enters a weak password
#    And the user submits the registration form
#    Then the user should see an error message indicating the password is too weak
