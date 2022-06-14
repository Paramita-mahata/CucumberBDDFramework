Feature: sign in form Option2
 
Background:
Given User has alreday sign up

Scenario: validating the heading on Sign in form 
Given User is on Dietician website
When User lands on Sign in page
Then User should see a Sign in form with heading "Log in with your email"

Scenario: validating log in button
Given User is on Dietician website
When User lands on Sign in page
Then User should see a button with text "Log in"

Scenario Outline:  Validating Sign in with email and password empty
Given User is on Sign in page
When User clicks on login button
Then User gets a message "Pleasse fill out fields"
Examples:
|email|password|
|         |         | 

Scenario Outline:  Validating sign in with invalid email and valid password
Given User is on Sign in page
When User clicks on login button with invalid email and valid password
Then User gets a message "invalid password.please try again"
Examples:
|invalidemail| validpassword|
|  dfsxxrtygc       |shwetha| 

Scenario Outline:  validating sign in with valid email and invalid password
Given User is on Sign in page
When User clicks on login button with valid email and invalid password
Then User gets a message "please fill the password"
Examples:
|validemail| inavalidpassword|
|  dfsxxrtygc       |shwetha| 

Scenario Outline:  Validating sign in with invalid credentials 
Given User is on Sign in page
When User clicks on login button with invalid email and invalid password
Then User gets a message "Invalid log in credentials"
Examples:
|invalidemail| inavalidpassword|
|  dfsxxrtygc       |shwetha| 

Scenario Outline:  validating sign in with valid  credentials 
Given User is on Sign in page
When User clicks on login button with valid email and valid password
Then User gets a message "logged in successfully"
Examples:
|validemail| validpassword|
|  dfsxxrtygc@gmail.com|shwetha| 

Scenario Outline:  Validating sign in with Facebook button 
Given User is on Sign in page
When User clicks on facebook button
Then User is redirected to Facebook login page
Examples:
|username| password|
|  Shwetha|shwetha|

Scenario Outline:  Validating sign in with Google  button 
Given User is on Sign in page
When User clicks on Google  button
Then User is redirected to Google login page
Examples:
|username| password|
|  ShwethaMohan|shwetha|

Scenario:  Validating sign in with SignUp  button 
Given User is on Sign in page
When User clicks on Sign up link
Then User is redirected to Register page
