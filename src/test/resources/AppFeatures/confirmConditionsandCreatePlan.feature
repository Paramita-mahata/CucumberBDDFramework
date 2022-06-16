#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Testing Confirm condition and create plan page Option One
  As a user, I must able to access Patients test reports and create diet plan

  @tag1
  Scenario: To verify Browse option
    Given The user is on "Confirm conditions and create plan " page
    When User clicks Browse button
    Then A window should popup to select the file from file location

  @tag2
  Scenario: To verify Upload option
    Given The user is on "Confirm conditions and create plan " page
    When User clicks Upload button
    Then It should upload the file successfully

  @tag3
  Scenario: To verify Upload option Negative scenario
    Given The user is on "Confirm conditions and create plan " page
    When User clicks Upload button with correpted file
    Then Display alert the file could not be uploaded

  @tag4
  Scenario: To validate option 1 screen
    Given The user is on "Confirm conditions and create plan " page
    When User unselect toggle button
    Then The respective option must deselect

  @tag5
  Scenario: To validate option 1 screen
    Given The user is on "Confirm conditions and create plan " page
    When User select toggle button
    Then The respective option must get selected

  @tag6
  Scenario: To validate option 1 screen
    Given The user is on "Confirm conditions and create plan " page
    When User clicks Confirm button
    Then Displays confirmed successfuly and no more updates allowed to user

  @tag7
  Scenario: To validate option 1 screen
    Given The user is on "Confirm conditions and create plan " page
    When User clicks Confirm button without selecting any options
    Then Displays Please select atleast one option

  @tag8
  Scenario: To validate option 1 screen
    Given The user is on "Confirm conditions and create plan " page
    When User clicks Confirm button with no condition selected
    Then Displays Select atleast one option from condition

  @tag9
  Scenario: To validate option 1 screen
    Given The user is on "Confirm conditions and create plan " page
    When User clicks Confirm button with no Co-Morbidi condition selected
    Then Displays Select atleast one option from Co-Morbidi condition

  @tag10
  Scenario: To validate option 1 screen
    Given The user is on "Confirm conditions and create plan " page
    When User clicks Confirm button with no preference selected
    Then Displays Select atleast one option from preference

  @tag11
  Scenario: To validate option 1 screen
    Given The user is on "Confirm conditions and create plan " page
    When User clicks Confirm button upon selecting only condition
    Then Displays Confirmed, only condition is selected

  @tag12
  Scenario: To validate option 1 screen
    Given The user is on "Confirm conditions and create plan " page
    When User clicks Confirm button upon selecting only Co-Morbidi condition
    Then Displays Confirmed, only Co-Morbidi condition is selected

  @tag13
  Scenario: To validate option 1 screen
    Given The user is on "Confirm conditions and create plan " page
    When User clicks Confirm button upon selecting only preference
    Then Displays Confirmed, only preference is selected

  @tag14
  Scenario: To validate option 1 screen
    Given The user is on "Confirm conditions and create plan " page
    When User clicks Confirm button upon selecting only condition and Co-Morbidi condition
    Then Displays Confirmed, only condition and Co-Morbidi condition are selected

  @tag12
  Scenario: To validate option 1 screen
    Given The user is on "Confirm conditions and create plan " page
    When User clicks Confirm button upon selecting only Co-Morbidi condition and preference
    Then Displays Confirmed, only Co-Morbidi condition and preferences are selected

  @tag13
  Scenario: To validate option 1 screen
    Given The user is on "Confirm conditions and create plan " page
    When User clicks Confirm button upon selecting only condition and preference
    Then Displays Confirmed, only condition and preferences are selected

  @tag14
  Scenario: To validate option 1 screen Negative scenario
    Given The user is on "Confirm conditions and create plan " page
    When User clicks Confirm button Neg
    Then Nothing happened, no message displayed .
