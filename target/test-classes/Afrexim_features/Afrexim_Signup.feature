@T003
@Smoke
Feature: To validate the Signup functionality of Afrexim page

Scenario Outline: To validate the signup functionality

Given To open the Afrexim application
When To click the Apply for facility option
And Click the SignUp link Under the SignIn Box
Then System should be Show Contact Person Detaile Page
When Select the Salutation
And Give the First Name "<firstname>"
And Give the last Name "<lastname>"
And Enter the Contact Number "<contactnum>"
And Enter the Additional Number "<additionalnum>"
And Enter The Contact Email "<email>"
And Select The Contact Type
And Enter The Contact Title "<contacttitle>"
And Enter The SignIn User Name "<signin username>"
And Give The Password "<give password>"
And Give The Confirm Password "<confirm password>"
And Enter Organization Legal Name "<organisation legal name>"
And Enter Organization Short Name "<organisation short name>"
And Select Legal Entity Type
And Select Type of Institution
And Enter Activities Description "<activities description>"
And Select Sector
And Select Sub-sector
And Select Products of interest
And Enter Registration number "<reg number>"
And Choose Date
And Enter City of incorporation "<city of incorporation>"
And Select country of incorporation
And Enter Operating Street Address "<operating city address>"
And Enter Operating city "<operating city>"
And Enter Operating Postal code "<operating postal code>"
And Select operating Country 
And Select initial source of funds
And Select number of employees
And Select constitution
And Enter Website "<enter website>"
And Click confirmation box
And Click Signup button
Then Verify Registration Confirmation page

Examples:

|firstname|lastname|contactnum|additionalnum|email|contacttitle|signin username|give password|confirm password|organisation legal name|organisation short name|activities description|reg number|city of incorporation|operating city address|operating city|operating postal code|enter website|
|test1|test2|+9876543210|+9876543222|test12@gmai.com|Mr|tes12@gmail.com|Test12345|Test12345|test company|test com|test test test|123456789|test city|test city address|operating city|city postal code|www.testwebsite.com|



 

