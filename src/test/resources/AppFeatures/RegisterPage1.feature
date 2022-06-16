Feature: Register page of the application

  Background: 
    Given User is on the browser

  Scenario: Validating the Title of Register page
    Given User is on Dietician  website
    When User lands on Register page
    Then User should see the title of the page as "Register"

  Scenario: Validating the Register page mandatory fields
    Given User is on Dietician  website
    When User lands on Register page
    Then User should see all the mandatory fields with star symbol

  Scenario: validating the Sign up form Heading
    Given User is on Dietician  website
    When User lands on Register page
    Then User should see a  Register form with heading "Sign Up form"

  Scenario: validating the Sign up processs with empty fields
    Given User is on Register page
    When User clicks on sign up button with all fields empty
    Then User should see a message "mandatory fields cannot be empty"

  #data table approach
  Scenario: validating the Sign up processs with invalid First Name
    Given User is on Register page
    When User enters inavalid first name
      | csfdefjh |
    Then User clicks on sign up button
    Then User should see a message "inavlid data entered for First name"

  Scenario: validating the Sign up processs with invalid First Name
    Given User is on Register page
    When User clicks on sign up button with inavalid first name
    Then User should see a message "inavlid data entered for First name"

  Scenario: validating the Sign up processs with invalid last name
    Given User is on Register page
    When User clicks on sign up button with inavalid last name
    Then User should see a message "inavlid data entered for Last name"

  Scenario: validating the Sign up processs with invalid Moblie Number
    Given User is on Register page
    When User clicks on sign up button with incorrect moblie number
    Then User should see a message "inavlid data entered for Mobile Number"

  Scenario: validating the Sign up processs with invalid Any other field
    Given User is on Register page
    When User clicks on sign up button with invalid any other field
    Then User should see a message "inavlid data entered for Any other field"

  Scenario: validating the Sign up processs with invalid Email
    Given User is on Register page
    When User clicks on sign up button with invalid Email
    Then User should see a message "inavlid data entered for Email"

  Scenario: validating the Sign up processs with invalid Password
    Given User is on Register page
    When User clicks on sign up button with invalid Password
    Then User should see a message "inavlid data entered for Password"

  Scenario: validating the Sign up processs with valid credentials
    Given User is on Register page
    When User clicks on sign up button with valid credentials
    Then User is re-directed to sign in page
