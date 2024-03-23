Feature: User Registration on MakeMyTrip IRCTC

Scenario: Creating a new user account
    Given I am on the MakeMyTrip IRCTC Create Account page
    When I click the "Create an Account" link
    Then I should be redirected to the Register page

    Given I have entered a Title
        And I have entered a First Name
        And I have entered a Middle Name
        And I have entered a Surname
        And I have entered a Date of Birth
        And I have entered a Gender
        And I have entered an Email
        And I have entered a Mobile
        And I have entered a Password
        And I have entered a Confirm Password
        And I have entered a Password Reminder Question
        And I have entered a Password Reminder Answer

    When I click on the 'Create Account' button

    Then I should receive a popup displaying my account details
        And I should receive an email with my account details
        And I should be redirected to the MakeMyTrip IRCTC Admissions Portal login page
