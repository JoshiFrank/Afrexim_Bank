@regression
@Smoke
Feature: To test the Afrexim Bank server

Scenario Outline: To verify the login functionality
Given To open the Afrexim application
When To click the Apply for facility option
And To enter username "<username>"
And To enter password "<password>"
And To click Sign in button
Then Application should show error credentials

Examples:

|username|password|
|test@gmail.com|test123|







@New
Scenario: To validate Afreximbank Products Brouchures

Given To open the Afrexim application
When To click the Apply for facility option
And Click Afreximbank Products brouchers
Then Validate Afreximbank Products brouchers page
And Click The Afreximbanker newsletter Edition two
Then Validate The Afreximbanker newsletter Edition two
And Click right arrow in brouchers page
And Click African Quality Assurance centres
Then Validate African Quality Assurance centres page
And Click right arrow in brouchers page
When Navigate to back
And Click Load more in brouchers page
