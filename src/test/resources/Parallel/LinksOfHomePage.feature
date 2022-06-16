Feature: Links of the Home page 

Background:
Given User is on the browser
When User open the Dietician Website
Given User is on the Home page

Scenario: validating the product link on home page
When User clicks on product  link 
 Then User is re-directed to Product page 
 
Scenario: validating the Client link on home page
  When User clicks on client link 
 Then User is re-directed to client testimonial page 

Scenario: validating the Team link on home page
 When User clicks on Team link 
 Then User is directed  to Doctor team page
 
 Scenario: validating the Register link on home page
 When User clicks on Register link 
 Then User is directed  to Register page
 
Scenario: validating the About link on home page
When User clicks on Register link 
 Then User is directed  to About page
 
  Scenario: validating the Feature link on home page
  When User clicks on Feature  link 
 Then User is directed  to Featured content page
 
 Scenario: validating the Blogs link on home page
 When User clicks on Blogs link 
 Then User is directed  to Blogs page
 
 Scenario: validating the Contact uslink on home page
 When User clicks on Contact us link 
 Then User is directed  to Contact us page