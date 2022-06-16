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
Feature: Testing MyPatients Page search results
  As a user, I must able to access contents results of My Patients Page Search option

  @tag1
  Scenario: To verify user redirected  to "Confirm health condition and create plan" page
    Given The user is on My Patients page with search results
    When User clicks CREATE NEW REPORT/PLAN link of respective patient
    Then The user should  be sent to that patients Confirm health condition and build plan page

  @tag2
  Scenario: To verify user redirected  to  "View Recent Test Reports" page in different browser
    Given The user is on My Patients page with search results
    When User clicks VIEW PREVIOUS TEST REPORTS link of respective patient
    Then The user should  be navigated to that patients View Recent Test Reports page

  @tag3
  Scenario: To verify user redirected  to  "View Recent Diets" page in different browser
    Given The user is on My Patients page with search results
    When User clicks VIEW PREVIOUS DIET PLANS link of respective patient
    Then The user should  be navigated to that patients View Recent Diets page

  @tag4
  Scenario: To verify navigation
    Given The user is on My Patients page with search results
    When User clicks page number
    Then The user must navigate to respective page

  @tag5
  Scenario: To verify navigation front arrow
    Given The user is on My Patients page with search results
    When User clicks next arrow
    Then The user must navigate to next page

  @tag6
  Scenario: To verify navigation back arrow
    Given The user is on My Patients page with search results
    When User clicks back arrow
    Then The user must navigate to previous page

  @tag7
  Scenario: To verify View PDF button
    Given The user is on View Recent Test Reports Page
    When User Clicks View PDF Button
    Then The user must able to view the file with patient informations
