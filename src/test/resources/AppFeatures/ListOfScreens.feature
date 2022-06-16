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

Feature: Validating List of Screens menu

  Background: Given User is on the Home page

  Scenario: Validating the visibility of Screens menu on Home page
    Given User is on the browser
    When User opens the Dietcian website
    Then The hamburger menu on the top right corner of the Home page is displayed

  Scenario: Validating the functionality of the Screens menu
    Given User is on the Dietcian website
    When User clicks on the hamburger menu
    Then The side menu is displayed with the list of screens

  Scenario: Validating the list of screens visible to public
    Given User is on Home page
    When User clicks on the hamburger menu
    Then The side menu is dispalyed with the list of screens

  Scenario: Navigation using the Screens menu
    Given User is on the Screens menu
    When User clicks on sign in
    Then The Sign in page is displayed

  Scenario: Navigation using the Screens menu
    Given User is on the Screens menu
    When User clicks on Register
    Then The Register user page is displayed

  Scenario: Navigation using the Screens menu
    Given User is on the Screens menu
    When User clicks on Team
    Then The Team page is displayed

  Scenario: Navigation using the Screens menu
    Given User is on the Screens menu
    When User clicks on Testimonials
    Then The Testimonials page is displayed

  Scenario: Navigation using the Screens menu
    Given User is on the Screens menu
    When User clicks on Forgot Password
    Then The Forgot Password page is displayed

  Scenario: Navigation using the Screens menu
    Given User is on the Screens menu
    When User clicks on Product Features
    Then The Product Features page is displayed

  Scenario: Navigation using the Screens menu
    Given User is on the Screens menu
    When User clicks on Product Contact
    Then The Contact page is displayed

  Scenario: Navigation using the Screens menu
    Given User is on the Screens menu
    When User clicks on Blogs
    Then The Blogs page is displayed

  Scenario: Navigation using the Screens menu
    Given User is on the Screens menu
    When User clicks on Featured Content
    Then The Featured Content page is displayed

  Scenario: Navigation using the Screens menu
    Given User is on the Screens menu
    When User clicks on Home
    Then The Home page is displayed

  Scenario: Navigation using the Screens menu
    Given User is on the Screens menu
    When User clicks on View Recent Diets
    Then A message is displayed "User needs to login to view Recent Diets"

  Scenario: Navigation using the Screens menu
    Given User is on the Screens menu
    When User clicks on View Recent Test Reports
    Then A message is displayed "User needs to login to view Recent Test reports"

  Scenario: Navigation using the Screens menu
    Given User is on the Screens menu
    When User clicks on Add New patient
    Then A message is displayed "User needs to login to Add new patient"

  Scenario: Navigation using the Screens menu
    Given User is on the Screens menu
    When User clicks on Dietcian home
    Then A message is displayed "User needs to login to navigate Dietcian home screen"

  Scenario: Navigation using the Screens menu
    Given User is on the Screens menu
    When User clicks on My Patient
    Then A message is displayed "User needs to login to view My Patient"

  Scenario: Navigation using the Screens menu
    Given User is on the Screens menu
    When User clicks on Confirm Conditions and Create Plan
    Then A message is displayed "User needs to login to view Confirm Conditions and Create Plan"

  Scenario: Dietcian navigation using the Screens menu
    Given User is on Screens menu
    When User clicks on View Recent Diets
    Then The View Recent Diets page is displayed

  Scenario: Dietcian navigation using the Screens menu
    Given User is on Screens menu
    When User clicks on View Recent Test Reports
    Then View Recent Test Reports page is displayed

  Scenario: Dietcian navigation using the Screens menu
    Given User is on Screens menu
    When User clicks on Add New Patient
    Then View Add New Patient page is displayed

  Scenario: Dietcian navigation using the Screens menu
    Given User is on Screens menu
    When User clicks on Dietcian Home
    Then View Dietcian Home page is displayed

  Scenario: Dietcian navigation using the Screens menu
    Given User is on Screens menu
    When User clicks on My Patient
    Then View My Patient page is displayed

  Scenario: Dietcian navigation using the Screens menu
    Given User is on Screens menu
    When User clicks on Confirm Conditions and Create Plan
    Then View Confirm Conditions and Create Plan page is displayed