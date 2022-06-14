Feature: Sign in form1 Of the Application

Background:
Given User has alreday sign up


Scenario: Validating the title of Sign in page
Given  User is on Dietician  website
When user clicks on sign in 
Then User should see the title of the page as "sign in"

Scenario: Validating the Sign in page mandatory fields
Given  User is on Dietician  website
When user is on sign in page
Then User should see all mandatory fields

Scenario: Validating the Sign in form heading
Given  User is on Dietician  website
When user is on sign in page
Then User should see a form with heading "Sign in form"

Scenario: Validating the Sign in button
Given  User is on Dietician  website
When user is on sign in page
Then User should see a button with text "sign in"

Scenario Outline: validating the Sign in  with empty fields
Given  User is on Sign in  page 
When User clicks on sign in button with all fields empty
Then User should get message "please fill out the fields"
Examples:
|username|password|
|         |         |  

Scenario Outline: validating the Sign in  with invalid Password
Given  User is on sign in  page 
When User clicks on sign in button with invalid Password
Then User should get a message "inavlid entry for password field"
Examples:
|password|
| xdutpo32l;,mm|         

Scenario Outline: validating the Sign in  with both invalid username and Password
Given  User is on sign in  page 
When User clicks on sign in button with invalid  username and password
Then User should get  a message "inavlid login credentials"
Examples:
|username|password|
| cxfre565271871ujdf|  cdsryuj3452678910p	lamnz|

Scenario: validating the Sign in with forgot password link
Given  User is on sign in  page 
When User clicks on forgot password button
Then User should be directed to reset password link

Scenario: validating the Sign in with Not member yet button 
Given  User is on sign in  page 
When User clicks on not member yet button
Then User will land on Register page

Scenario Outline: validating the Sign in with all fields valid entry 
Given  User is on sign in  page 
When User clicks sign in with all fields entered
Then User logged in successfully
Examples:
|username|password|
| shwetha        |cucumber | 