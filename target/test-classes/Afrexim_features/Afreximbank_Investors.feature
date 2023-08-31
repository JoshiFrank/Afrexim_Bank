@regression
@Smoke
Feature: To validate the Functionality of Investers Option in Afrexim Bank


Scenario: To Test the Investers dropdown

Given To open the Afrexim application 
When Select the Investers option
Then To validate the Investors dropdown



Scenario: To Test the Investers_FinancialInformation Functionality

Given To open the Afrexim application 
When Select the Investers option
And Clicks on the Financial Information under Investors
Then Validate the Youtube video
And Validate the image
And To click right arrow and check whether years from twenty- twenty three to twenty-eight are present
And To click and check left arrow
And To click twenty-twenty three year 
And Scroll down and click View all 
And Click Afreximbank Abridged Unaudited Financial Statements document
Then Validate Afreximbank Abridged Unaudited Financial Statements document
And Click Download button
Then Validate Afreximbank Abridged Unaudited Financial Statements download pdf
When Navigate to back
When Navigate to back
And To click twenty-twenty two year 
And Scroll down and click View all
And Click Annual report twenty twenty two document
Then Validate Annual report twenty twenty two document
And Click Download button
Then Validate Annual report twenty twenty two download pdf
When Navigate to back
When Navigate to back
And To click twenty-twenty one year 
And Scroll down and click View all
And Click Annual Report twenty twenty one document
Then Validate Annual Report twenty twenty one document
And Click Download button
Then Validate Annual Report twenty twenty one download pdf
When Navigate to back
When Navigate to back
And To click twenty-twenty year 
And Scroll down and click View all
And Click Afreximbank Nine Months twenty twenty Results Presentation document
Then Validate Afreximbank Nine Months twenty twenty Results Presentation document
And Click Download button
Then Validate Afreximbank Nine Months twenty twenty Results Presentation download pdf
When Navigate to back
When Navigate to back
And To click twenty-nineteen year 
And Scroll down and click View all
And Click ANNUAL REPORT twenty nineteen document
Then Validate ANNUAL REPORT twenty nineteen document
And Click Download button
Then Validate ANNUAL REPORT twenty nineteen download pdf
When Navigate to back
When Navigate to back
And To click twenty-eighteen year 
And Scroll down and click View all
And Click Moody’s rating report twenty eighteen document
Then Validate Moody’s rating report twenty eighteen document
And Click Download button
#Then Validate Moody’s rating report twenty eighteen download pdf




Scenario: To Test the Investers Option in Afrexim Bank

Given To open the Afrexim application 
When Select the Investers option
And Click IPO link under Investers
And Select the country and jurisdication 
And Click Submit
And Verify IPO disclaimer page
And Scroll down and click I AGREE check box
And Click I agree button
And Verify IPO Documents page
And Click Registration document for open
Then Registration Document open as pdf




Scenario: To Test the Investors_CreditRatingsReports Functionality

Given To open the Afrexim application 
When Select the Investers option
And Clicks on the Credit Ratings Reports under Investors
Then Validate the Credit Ratings Reports page
When Click Moody’s Rating Report TwentyTwentyThree link
#Then Validate Moody’s Rating Report TwentyTwentyThree download pdf
When Click Fitch Rating Report TwentyTwentyThree link
#Then Validate Fitch Rating Report TwentyTwentyThree download pdf
When Click GCR Rating Report TwentyTwentyThree link
#Then Validate GCR Rating Report TwentyTwentyThree download pdf  
When Click JCR Rating Report TwentyTwentyThree link
#Then Validate JCR Rating Report TwentyTwentyThree download pdf




Scenario: To validate the FAQ option in investors

Given To open the Afrexim application 
When Select the Investers option
And Click FAQs Option
Then Validate FAQs page
And Click General capital increase FAQs 
#Then Validate General capital increase FAQs pdf


