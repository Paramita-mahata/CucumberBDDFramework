Feature: Add New Patient Information

  Scenario: Empty form Submission for add new patient details
    Given User is on add new patient page
    When User attempts to submit button without entering "mandatory details"
    Then Verify message "Please fill all mandatory fields" should display

  Scenario: Full Name field Numeric value validation
    Given User is on add new patient page
    When User attemtps to put numeric value in "Fullname" field
    Then Verify message "only charactors are allowed" should display

  Scenario: Full name field space validation
    Given User is on add new patient page
    When user enters "firstname" and "lastname" without space
    Then Verify message "fName and lName shoud have space in between" should display

  Scenario: "Address line 1" field empty validation
    Given User is on add new patient page
    When User attempts to submit form without entering "Address line 1" field
    Then Unable to submit "Please enter Address line 1" message should display

  Scenario: "Country" field empty value validation
    Given User is on add new patient page
    When User Attempts to submit form without selecting "Country"
    Then Unable to submit "Please select country" message should display

  Scenario: "City" field numeric value validation
    Given User is on add new patient page
    When user attempts to put numeric value in "City" field
    Then Verify message "only charactors are allowed" should display

  Scenario: "City" field empty value validation
    Given User is on add new patient page
    When User attempts to submit form without entering "City" field
    Then Unable to submit "Please enter city" message should display

  Scenario: "State,province or region" field numeric value validation
    Given User is on add new patient page
    When user attempts to put numeric value in "State,province or region" field
    Then Verify message "only charactors are allowed" should display

  Scenario: "State,province or region" field empty value validation
    Given User is on add new patient page
    When User attempts to submit form without entering "State,province or region" field
    Then Unable to submit "Please enter State,province or region" message should display

  Scenario: "Postal Code" field value empty validation
    Given User is on add new patient page
    When User attempts to submit form without entering "Postal Code" field
    Then Unable to submit "Please enter Postal Code" message should display

  Scenario: "Postal Code" field wrong data format validation
    Given User is on add new patient page
    When User trying to enter wrong data format in "Postal Code" field
    Then Verify message "Invalid Postal Code" should display

  Scenario: "Email" field empty validation
    Given User is on add new patient page
    When User attempts to submit form without entering "Email" field
    Then Unable to submit "Please enter email address" message should display

  Scenario: "Email" field wrong data format validation
    Given User is on add new patient page
    When User trying to enter wrong data format in "Email" field
    Then Verify message "Please Enter Valid email address" should display

  Scenario: "Phone Number" field empty value validation
    Given User is on add new patient page
    When User attempts to submit form without entering "Phone Number" field
    Then Unable to submit "Please Enter Phone Number" message should display

  Scenario: "Phone Number" field Character value validation
    Given User is on add new patient page
    When User attempts to put characters in "Phone Number" field
    Then Verify message "only numeric values are allowed" should display

  Scenario Outline: Enterning valid New Patient data submission
    Given User is on add new patient page
    When User fills the New Patient form with valid inputs
    Then Verify "Add New Patient" button should appear

    Examples: 
      | Full Name | Address line 1 | Country | City    | State,province or region | Postal code | Email          | Phone Number |
      | Lucy Dan  | 123 main st    | USA     | NewYork | NY                       |       23422 | lucy@gmail.com |   9987654321 |

  Scenario: Valid new patient data submission
    Given User is on add new patient page
    When User clicks on "Add New Patient" button after entering valid patient data
    Then User should land on "My Patients" page with the new "New Patient" details dispalyed
