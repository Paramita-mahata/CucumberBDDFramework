
@tag
Feature: Testing MyPatients page
  As a user, I must able to open and work on My Patients Page

  @tag1
  Scenario: My Patients Page
    Given User is on any page
    When User clicks on My Patients tab
    Then User should be directed to My Patients page

  @tag2
  Scenario: Details missing in all the fields
    Given User is on My Patients page
    When User clicks Search button without any entry
    Then User should see an Alert message  "Required fields. Please enter data in any one field "

  @tag3
  Scenario: To verify patient name in field
    Given User is on My Patients page
    When User clicks Search button invalid name
    Then User should see an Alert message1 "No results found with this name "

  @tag4
  Scenario: To verify patient email in field
    Given User is on My Patients page
    When User clicks Search with  invalid email
    Then User should see an Alert message2 "No results found with this email "

  @tag5
  Scenario: To verify patient phone number in field
    Given User is on My Patients page
    When User clicks Submit button with invalid phone number
    Then User should see an Alert message3 "No results found with this phone number "

  @tag6
  Scenario: To verify Search patients by name
    Given User is on My Patients page
    When User clicks search button with name field.
    Then Records with that name phrase are displayed

  @tag7
  Scenario: To verify Search patients by email
    Given User is on My Patients page
    When User clicks search button with email field
    Then Records with that email are displayed

  @tag8
  Scenario: To verify Search patients by phone number
    Given User is on My Patients page
    When User clicks search button with phone number field
    Then Records with that phone number are displayed
