


Feature: Testing Confirm condition and create plan page Option One
  As a user, I must able to access Patients test reports and create diet plan


  Scenario: To verify Browse option
    Given The user is on "Confirm conditions and create plan " page2
    When User clicks Browse button option 2
    Then A window should popup to select the file from file location option 2

 
  Scenario: To verify Upload option
    Given The user is on "Confirm conditions and create plan " page2
    When User clicks Upload button option 2
    Then It should upload the file successfully option2

 
  Scenario: To verify Upload option Negative scenario
    Given The user is on "Confirm conditions and create plan " page2
    When User clicks Upload button with correpted file option 2
    Then Display alert the file could not be uploaded option 2

 
  Scenario: To validate option 2 screen
    Given The user is on "Confirm conditions and create plan " page2
    When User unselect toggle button option 2
    Then The respective option must deselect option 2

 
  Scenario: To validate option 2 screen
    Given The user is on "Confirm conditions and create plan " page2
    When User select toggle button option 2
    Then The respective option must get selected option 2

 
  Scenario: To validate option 2 screen
    Given The user is on "Confirm conditions and create plan " page2
    When User clicks Confirm button option 2
    Then Displays confirmed successfuly and no more updates allowed to user option 2

  Scenario: To validate option 2 screen
    Given The user is on "Confirm conditions and create plan " page2
    When User clicks Confirm button without selecting any options 2
    Then Displays Please select atleast one option option 2


  Scenario: To validate option 2 screen
    Given The user is on "Confirm conditions and create plan " page2
    When User clicks Confirm button with no condition selected option 2
    Then Displays Select atleast one option from condition option 2

  
  Scenario: To validate option 2 screen
    Given The user is on "Confirm conditions and create plan " page2
    When User clicks Confirm button with no Co-Morbidities selected option 2
    Then Displays Select atleast one option from Co-Morbidities


  Scenario: To validate option 2 screen
    Given The user is on "Confirm conditions and create plan " page2
    When User clicks Confirm button with no preference selected option 2
    Then Displays Select atleast one option from preference option 2

  
  Scenario: To validate option 2 screen
    Given The user is on "Confirm conditions and create plan " page2
    When User clicks Confirm button upon selecting only condition option 2
    Then Displays Confirmed, only condition is selected option 2


  Scenario: To validate option 2 screen
    Given The user is on "Confirm conditions and create plan " page2
    When User clicks Confirm button upon selecting only Co-Morbidities option 2
    Then Displays Confirmed, only Co-Morbidities is selected


  Scenario: To validate option 2 screen
    Given The user is on "Confirm conditions and create plan " page2
    When User clicks Confirm button upon selecting only preference option 2
    Then Displays Confirmed, only preference is selected option 2


  Scenario: To validate option 2 screen
    Given The user is on "Confirm conditions and create plan " page2
    When User clicks Confirm button upon selecting only condition and Co-Morbidi condition option 2
    Then Displays Confirmed, only condition and Co-Morbidities are selected


  Scenario: To validate option 2 screen
    Given The user is on "Confirm conditions and create plan " page2
    When User clicks Confirm button upon selecting only Co-Morbidi condition and preference option 2
    Then Displays Confirmed, only Co-Morbidities and preferences are selected


  Scenario: To validate option 2 screen
    Given The user is on "Confirm conditions and create plan " page2
    When User clicks Confirm button upon selecting only condition and preference option 2
    Then Displays Confirmed, only condition and preferences are selected option 2

 
  Scenario: To validate option 2 screen Negative scenario
    Given The user is on "Confirm conditions and create plan " page2
    When User clicks Confirm button option 2 neg
    Then Nothing happened, no message displayed

  
  Scenario: To verify Generate Menu option
    Given The user is on "Confirm conditions and create plan " page2
    When user clicks Generate Menu Button option 2
    Then Displays Menu generated
