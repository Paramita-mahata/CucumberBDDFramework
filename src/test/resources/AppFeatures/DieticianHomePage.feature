Feature: Dietician HomePage

  Scenario: verify dietician signin page
    Given dietician is on dietician website
    When Dietician clicks on dietician signin button
    Then dietician navigated to dietician sign in page

  Scenario Outline: Dietician HomePage
    Given Dietician on dietician signin page
    When Dietician clicks on sign in button with valid "username" and "password"
    Then Dietician should navigated to Dietician Homepage
    Then verify message "Logged in as Dietician name" is displayed

    Examples: 
      | valid username | valid password |
      | anita123       | anita123       |

  Scenario: To verify add new patient tab
    Given Dietician is on dietician Home page
    When Dietician clicks on new patient tab
    Then User should be navigated to new patient form page

  Scenario: To verify My Patients tab
    Given Dietician is on dietician Home page
    When Dietician clicks on My Patients tab
    Then User should be navigated to My Patients page

  Scenario: To verify Diet Plans tab
    Given Dietician is on dietician Home page
    When Dietician clicks on Diet Plans tab
    Then User should be navigated to Diet Plans page

  Scenario: To verify Sign Out button
    Given Dietician is on dietician Home page
    When Dietician clicks on Sign Out button
    Then verify message "Successfully Logged Out" is displayed
