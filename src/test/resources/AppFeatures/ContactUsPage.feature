Feature: Contact Us page field

  Scenario: checking contactus page opening or not
    Given User is on HomePage
    When User clicks on contact us page
    Then User should navigated to contact us page

  Scenario: Validating all fields on Contact Us Page
    Given User is on Contact Us page
    When User clicks submit button with all fields empty on contact us page
    Then Verify "Please  fill all fields above" message should display

  Scenario: Validating the First Name field on Contact Us page
    Given User is on Contact Us page
    When User try to enter numeric values in firstname field
    Then Verify "only charactors are allowed" message display

  Scenario: Validating Last Name field on Contact Us page
    Given User is on Contact Us page
    When User try to enter numeric values in lastname field
    Then Verify "only charactors are allowed" msg should display

  Scenario: Validating Email field on Contact Us page
    Given User is on Contact Us page
    When User enters invalid email and other fields with valid information and clicks submit
    Then Verify "Please enter valid Email" message should displayed

  Scenario: Validating Subject field on Contact Us page
    Given User is on Contact Us page
    When User enters Subject field with numeric values and other field valid values and click
    Then Verify "please enter valid subject" should displayed

  Scenario: Validating "Write your Message here" field on Contact Us page
    Given User is on Contact Us page
    When User enters message with numeric values and other field valid values and click
    Then Verify Message "please enter valid message" should display

  Scenario: Validating all valid entries for all fields
    Given User is on Contact Us page
    When User enters all valid values in all fields and click submit button
    Then Verify "Your request is Submitted" Message should displayed
