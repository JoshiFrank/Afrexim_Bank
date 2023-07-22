@T001
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