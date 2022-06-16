Feature: Home page of the Application

  Background: 
    Given User is on the browser
    When User open the Dietician Website

  Scenario: Validating the title of the Home page
    #Given User is on the browser
    #When User open the Dietician Website
    Then User should see the title of the home page as "Home"

  Scenario: Validating the Logo on the Home page
    #Given User is on the browser
    #When User open the Dietician Website
    Then User should see the Logo image with Company Name

  Scenario: Validating the tab PRODUCT visibility
    #Given User is on the browser
    #When User open the Dietician Website
    Then User should see a tab with text "PRODUCT"

  Scenario: Validating the tab CLIENTS visibility
    #Given User is on the browser
    #When User open the Dietician Website
    Then User should see a tab with text "CLIENTS"

  Scenario: Validating the tab TEAM visibility
    #Given User is on the browser
    #When User open the Dietician Website
    Then User should see a tab with text "TEAM"

  Scenario: Validating the tab REGISTER visibility
    #Given User is on the browser
    #When User open the Dietician Website
    Then User should see a tab with text "REGISTER"

  Scenario: Validating the tab About visibility
    #Given User is on the browser
    #When User open the Dietician Website
    Then User should see a tab with text "About"

  Scenario: Validating the tab Featured visibility
    #Given User is on the browser
    #When User open the Dietician Website
    Then User should see a tab with text "Featured"

  Scenario: Validating the tab Blog visibility
    #Given User is on the browser
    #When User open the Dietician Website
    Then User should see a tab with text "Blog"

  Scenario: Validating the tab Contact us visibility
    #Given User is on the browser
    #When User open the Dietician Website
    Then User should see a tab with text "Contact us"

  Scenario: Validating the visibility of Search option
    #Given User is on the browser
    #When User open the Dietician Website
    Then User should see a search option symbol on the bottom menu bar

  Scenario: Validating the visibility of Signin option
    #Given User is on the browser
    #When User open the Dietician Website
    Then User should see a Signin option next to the search button
