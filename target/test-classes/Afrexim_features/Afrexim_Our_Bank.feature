@ourbank
Feature: To Test the Our Bank Option in the home page

Scenario: To validate the Our bank dropdown

Given To open the Afrexim application
When To click the Our Bank Option
Then To validate Our Bank dropdown

#Scenario: To validate Organisational Structure option

#Given To open the Afrexim application
#When To click the Our Bank Option
#And To Select the About Us Functionality
#Then To validate the About us page
#And To click Read more in Organisational Structure

@aboutustable
Scenario: To validate About us tables

Given To open the Afrexim application
When To click the Our Bank Option
And To Select the About Us Functionality
Then To validate the About us page
And To click Read more in Vision and Mission
And To validate Vision and Mission page
When Navigate to back
And To click Read more in Our Strategy
Then Validate Our Strategy page
When Navigate to back
And To click Readmore in Board of Directors
Then Validate Board of Directors page
When Navigate to back
And To click Readmore in Mnagement Team
Then Validate Management Team page
When Navigate to back
And To click the Read more option in Corporate Governance
Then Validate the Corporate Governance page 
 
@Dropdown
Scenario: To validate the drop down 
Given To open the Afrexim application
When To click the Our Bank Option
And Click the Careers link
Then Validate the Careers page is Displayed
When Click the Check Vacancies Option
And Click the All Vacancies Dropdown
Then All types of vacancies should be presented in the Dropdown
When Click the job location Dropdown
Then Required location should be presented in the Dropdown
When Click the Expiry limitation Dropdown
Then Required Expiry limitations should be presented in the Dropdown

Scenario:
Given To open the Afrexim application
When To click the Our Bank Option
And Click the Careers link
Then Validate the Careers page is Displayed
When Click the Check Vacancies Option
And Select the type of the job in All Vacancies Dropdown
And select the job location in the location Dropdown
And Select the Expected expiry limitation in limitation Dropdown
And Click the Filter Button
Then Validate the job search results 
And Click desired job
Then Validate selected job details

@findabranch
Scenario:
Given To open the Afrexim application
When To click the Our Bank Option
And Click Contact us page
Then Validate Contact us page
And Click Read more in Find Branch 
Then Validate Find a Branch page is displayed


@Sendusamessage
Scenario Outline: 
Given To open the Afrexim application
When To click the Our Bank Option
And Click Contact us page
Then Validate Contact us page
And Click Readmore option in send us a message
Then Validate Send us a message
And Select Entity title
And Select interested in
And Type company name "<companyname>"
And Select title name
And Enter first and last names "<names>"
And Enter telephone with area code "<telephone number>"
And Enter email address functionality "<email>"
And Enter function "<function>"
And Enter organisation "<organisation>"
And Enter country of operation "<country>"
And Enter requests here "<requests>"
And Click confirm check box
And click robot check box
And Click Submit button option 
Then Validate Submission Confirmation page

Examples:
|companyname|names|telephone number|email|function|organisation|country|requests|
|testcompany|firstname lastname|9987654321|test1@gmail.com|test function|test organisation|test country|test requests|
 

@Contctuspage
Scenario Outline: 
Given To open the Afrexim application
When To click the Our Bank Option
And Click Contact us page
Then Validate Contact us page
And Click Read more in Give us a Feedback
Then Validate Give us a feedback page
And Enter organization name "<organisation name>"
And Select Title
And Enter Full Contact name "<contact name>"
And Enter contact number with country code "<contact number>"
And Enter email address "<email>"
And Enter confirm email address "<confirm email>"
And Select country name 
And Click existing customer
And Click preferred contact method
And Enter preferred contact "<From>" "<TO>" time 
And Select feedback type 
And Enter comments "<comments>"
And Click consent agree box
And Click submit
Then Validate Thanks for contacting us page

Examples:
|organisation name|contact name|contact number|email|confirm email|From|TO|comments|
|sample organisation|test name|9876543210|test@gmail.com|test@gmail.com|9|5|test comments|








