@T004
@Smoke
Feature: To verify the need help functionality

Scenario Outline:To test the need help functionality

Given To open the Afrexim application
When Mouse-hover to Need help and click Submit your request 
And Select Entity
And Select Oppurtunities
And Type request "<Type request>"
And Select prefix title  
And Enter first name "<First name>"
And Enter last name "<Last name>"
And Type the function "<Type function>"
And Type organisation "<Type organisation>"
And Type country of operation "<Type country of operation>"
And Type email "<Type email>"
And Type phone "<Type phone>"
And Click Submit button
Then Verify Thanks for contacting us page

Examples:

|Type request|First name|Last name|Type function|Type organisation|Type country of operation|Type email|Type phone|
|test request|test first name|test last name|test function|test org|test country|test@gmail.com|9998765432|
