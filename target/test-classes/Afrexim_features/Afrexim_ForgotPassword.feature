@regression
Feature: To test the forgot password functionality

Scenario Outline: To validate the forgot password functionality with valid and invalid credentials.

Given To open the Afrexim application
When To click the Apply for facility option
And Click the Forgot Password link
And Validate the Reset Password pop-up page
And Enter valid and invalid email credentials "<Emails>"
And Click Submit button for reset page
Then Validate positive and negative status message using respective credentials

Examples: 

|Emails|
|test@gmail.com|
|test123@gmail.com|
|test@12gmail.com|
|test987654@gmail.com|