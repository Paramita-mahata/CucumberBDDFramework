







Feature: Testing Confirm condition and create plan page Option One
  As a user, I must able to access Patients test reports and create diet plan


  Scenario: To verify Browse option
    Given The user is on "Confirm conditions and create plan " page
    When User clicks Browse button
    Then A window should popup to select the file from file location


  Scenario: To verify Upload option
    Given The user is on "Confirm conditions and create plan " page
    When User clicks Upload button
    Then It should upload the file successfully

  Scenario: To verify Upload option Negative scenario
    Given The user is on "Confirm conditions and create plan " page
    When User clicks Upload button with correpted file
    Then Display alert the file could not be uploaded


  Scenario: To validate option 1 screen
    Given The user is on "Confirm conditions and create plan " page
    When User unselect toggle button
    Then The respective option must deselect

  
  Scenario: To validate option 1 screen
    Given The user is on "Confirm conditions and create plan " page
    When User select toggle button
    Then The respective option must get selected

  Scenario: To validate option 1 screen
    Given The user is on "Confirm conditions and create plan " page
    When User clicks Confirm button
    Then Displays confirmed successfuly and no more updates allowed to user

  Scenario: To validate option 1 screen
    Given The user is on "Confirm conditions and create plan " page
    When User clicks Confirm button without selecting any options
    Then Displays Please select atleast one option


  Scenario: To validate option 1 screen
    Given The user is on "Confirm conditions and create plan " page
    When User clicks Confirm button with no condition selected
    Then Displays Select atleast one option from condition


  Scenario: To validate option 1 screen
    Given The user is on "Confirm conditions and create plan " page
    When User clicks Confirm button with no Co-Morbidi condition selected
    Then Displays Select atleast one option from Co-Morbidi condition

  
  Scenario: To validate option 1 screen
    Given The user is on "Confirm conditions and create plan " page
    When User clicks Confirm button with no preference selected
    Then Displays Select atleast one option from preference


  Scenario: To validate option 1 screen
    Given The user is on "Confirm conditions and create plan " page
    When User clicks Confirm button upon selecting only condition
    Then Displays Confirmed, only condition is selected

 
  Scenario: To validate option 1 screen
    Given The user is on "Confirm conditions and create plan " page
    When User clicks Confirm button upon selecting only Co-Morbidi condition
    Then Displays Confirmed, only Co-Morbidi condition is selected


  Scenario: To validate option 1 screen
    Given The user is on "Confirm conditions and create plan " page
    When User clicks Confirm button upon selecting only preference
    Then Displays Confirmed, only preference is selected


  Scenario: To validate option 1 screen
    Given The user is on "Confirm conditions and create plan " page
    When User clicks Confirm button upon selecting only condition and Co-Morbidi condition
    Then Displays Confirmed, only condition and Co-Morbidi condition are selected

  
  Scenario: To validate option 1 screen
    Given The user is on "Confirm conditions and create plan " page
    When User clicks Confirm button upon selecting only Co-Morbidi condition and preference
    Then Displays Confirmed, only Co-Morbidi condition and preferences are selected

 
  Scenario: To validate option 1 screen
    Given The user is on "Confirm conditions and create plan " page
    When User clicks Confirm button upon selecting only condition and preference
    Then Displays Confirmed, only condition and preferences are selected


  Scenario: To validate option 1 screen Negative scenario
    Given The user is on "Confirm conditions and create plan " page
    When User clicks Confirm button Neg
    Then Nothing happened, no message displayed .
