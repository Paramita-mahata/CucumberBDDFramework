Feature: Register page of the application

Background:
Given  User is on the browser


Scenario: Validating the Title of Register page 
Given User is on Dietician  website 
When User lands on Register page 
Then User should see the title of the page as "Register"

Scenario: Validating the Register page mandatory fields
Given  User is on Dietician  website 
When User lands on Register page 
Then User should see all the mandatory fields with star symbol

Scenario: validating the Sign up form Heading
Given  User is on Dietician  website 
When User lands on Register page 
Then User should see a  Register form with heading "Sign Up form"

Scenario Outline: validating the Sign up processs with empty fields
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

Scenario Outline: validating the Sign up processs with invalid last name 
Given  User is on Register page 
When User clicks on sign up button with inavalid last name
Then User should see a message "inavlid data entered for Last name"
Examples:
|LastName|
|pu2454|

Scenario Outline: validating the Sign up processs with invalid Moblie Number
Given  User is on Register page 
When User clicks on sign up button with incorrect moblie number
Then User should see a message "inavlid data entered for Mobile Number"
Examples:
|MobileNumber|
|1243545765sddf|
|1234343546789008790|

Scenario Outline: validating the Sign up processs with invalid Any other field
Given  User is on Register page 
When User clicks on sign up button with invalid any other field
Then User should see a message "inavlid data entered for Any other field"
Examples:
|AnyField|
|$^77879|

Scenario Outline: validating the Sign up processs with invalid Email
Given  User is on Register page 
When User clicks on sign up button with invalid Email
Then User should see a message "inavlid data entered for Email"
Examples:
|Email|
|shwethamailcom|

Scenario Outline: validating the Sign up processs with invalid Password
Given  User is on Register page 
When User clicks on sign up button with invalid Password
Then User should see a message "inavlid data entered for Password"
Examples:
|Password|
|vfdytyjvngvb|

Scenario Outline: validating the Sign up processs with valid credentials
Given  User is on Register page 
When User clicks on sign up button with valid credentials
Then User is re-directed to sign in page
Examples:
|FirstName|LastName|MobileNumber|AnyField|Email|Password|
|Shwetha| pul| 1345566768|cfdgfh |Sdfdgf@gmail.com|drghgjjj| 