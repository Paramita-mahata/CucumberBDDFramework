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
Feature: Dietcian view patient's dietplan

  Scenario: Validating the view PDF option
    Given User is on Generate Diet Plans Page
    When Click on View PDF
    Then The well formatted PDF is displayed with patient details, doctor details, patient health details (conditons, co- morbidities), 7- day menu, warnings, comments

  Scenario: Validating the default number of records displayed per pagen
    Given User logged in as dietician
    When User search for all diet plans
    Then List of patients are displayed with 5 records in each page

  Scenario: Validation of traversing next page
    Given User is on "View Recent Diets" Page and more than one page of records are displayed and User is on first page
    When User selects the next page button (>)
    Then User should see the second page

  Scenario: Validation of traversing previous page
    Given User is on "View Recent Diets" Page and more than one page of records are displayed and User is on first page
    When User selects the next page button (<)
    Then User should see the previous page