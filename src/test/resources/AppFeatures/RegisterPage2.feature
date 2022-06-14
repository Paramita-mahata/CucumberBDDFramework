Feature: Register form2 of the Application

Scenario:  validating the Sign up form Heading
Given  User is on Dietician  website 
When User lands on Register page 
Then User should see a form with heading "Sign Up with your email"

Scenario:  validating the Sign up button
Given  User is on Dietician  website 
When User lands on Register page 
Then User should see a button with text "sign up"

Scenario Outline: validating the Sign up processs with empty fields
Given  User is on Register page 
When User clicks on sign up button with all fields empty
Then User should see a message "mandatory fields cannot be empty"
Examples:
|FirstName|LastName|MobileNumber|AnyField|Email|Password|
|         |         |           |        |     |        |

Scenario Outline: validating the Sign up processs with invalid First Name
Given  User is on Register page 
When User clicks on sign up button with inavalid first name
Then User should see a message "inavlid data entered for First name"
Examples:
|FirstName|
|shwe$-ha|

Scenario Outline: validating the Sign up processs with invalid Last name 
Given  User is on Register page 
When User clicks on sign up button with inavalid last name
Then User should see a message "inavlid data entered for Last name"
Examples:
|LastName|
|pu2454|

Scenario Outline: validating the Sign up processs with invalid Username
Given  User is on Register page 
When User clicks on sign up button with inavalid Username
Then User should see a message "inavlid data entered for Username"
Examples:
|userName|
|sgwetukhkjk|

Scenario Outline: validating the Sign up processs with invalid Email Address
Given  User is on Register page 
When User clicks on sign up button with invalid Email Address
Then User should see a message "inavlid data entered for Email Address"
Examples:
|Email|
|sgwetukhkjkffjygx|

Scenario Outline: validating the Sign up processs with invalid Password
Given  User is on Register page 
When User clicks on sign up button with invalid Password
Then User should see a message "inavlid data entered for Password"
Examples:
|Password|
|sgwetukhkjkffjygx|

Scenario Outline: validating the Sign up processs with invalid Confirm Password
Given  User is on Register page 
When User clicks on sign up button with invalid  Confirm Password
Then User should see a message "Confirm password should be same as password"
Examples:
|ConfirmPassword|
|sftnj|

Scenario Outline: validating the Sign up processs with valid credentials
Given  User is on Register page 
When User clicks on sign up button with valid credentials
Then User is re-directed to sign in page
Examples:
|FirstName|LastName|MobileNumber|AnyField|Email|Password|
|Shwetha| pul| 1345566768|cfdgfh |Sdfdgf@gmail.com|drghgjjj|

Scenario Outline: validating the Sign up processs with Facebook
Given  User is on Register page 
When User clicks on facebook button for sign in
Then User successfully login with facebook account
Examples:
|username|password|
|cfgdhgjhj|vjghjk|

Scenario Outline: validating the Sign up processs with Google
Given  User is on Register page 
When User clicks on google button
Then User successfully login with Google account
Examples:
|username|password|
|cfgdhgjhj|vjghjk|

Scenario: validating Log in Here link
Given  User is on Register page 
When User clicks Log in here link
Then User is re-directed to sign in page
