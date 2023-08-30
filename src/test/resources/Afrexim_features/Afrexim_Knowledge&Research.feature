@regression
Feature: To test the Knowledge&Research option

Scenario: To Validate the Knowledge&Research dropdown

Given To open the Afrexim application
When To click the Knowledge&Research option
Then To validate the Knowledge&Research dropdown 


Scenario Outline: To Validate Knowledge_AboutUs Functionality

Given To open the Afrexim application
When To click the Knowledge&Research option
And To click About us option
Then To validate the About us option page
And Click on Research and Statistics
Then Validate Research and Statistics page
And Click on Internation Cooperation 
Then Validate Internation Cooperation page
And Click on Trade Policy and Market access
Then Validate Trade Policy and Market access page
And Click Library & Knowledge Centre
Then Validate Library & Knowledge Centre page
And Click Afreximbank Library Online Public Access Catalogue
Then Validate Afreximbank Library Online Public Access Catalogue page
And Click Call for papers -CIAT
Then Validate Call for papers -CIAT page
And Enter first name in ciat page "<FirstName>"
And Enter last name in ciat page "<LastName>"
And Enter email address in ciat page "<EmailAddress>"
And Enter institution in ciat page "<Institution>"
And Enter description in ciat page "<Description>"
#And To upload document in ciat page
#Then To validate document uploaded successfully in ciat page
And To select check box in ciat page
And To click submit button in ciat page
#Then Validate Submission Confirmation in ciat page
And Click Call for papers –AWPS
Then Validate Call for papers –AWPS
And Enter first name in awps page "<FirstName_AWPS>"
And Enter last name in awps page "<LastName_AWPS>"
And Enter email in awps page "<Email_AWPS>"
And Enter institution in awps page "<Institution_AWPS>"
And Enter description in awps page "<Description_AWPS>"
#And Upload document in awps page
#Then Validate Document Uploaded successfully in  awps page
And Click checkbox in awps page
And Click submit in awps page
#Then Validate Submission Confirmation in awps page
And Click JAT – Submission of papers
Then Validate JAT – Submission of papers page


Examples:

|FirstName    |LastName    |EmailAddress       |Institution    |Description    |FirstName_AWPS|LastName_AWPS | Email_AWPS        | Institution_AWPS     | Description_AWPS     |
|TestFirstName|TestLastName|testemail@gmail.com|testinstitution|testdescription|TestName_AWPS |testName_AWPS | mail123@gmail.com | TestInstitution_AWPS | TestDescription_AWPS |


@Publications
Scenario: To validate the Knowledge_Publications functionality

Given To open the Afrexim application
When To click the Knowledge&Research option
And To click Publications option
Then To validate the publications page
And To click right arrow and check whether years from twenty- twenty three to twenty-eight are present
And To click and check left arrow
And Click dropdown down arrow button in box
Then Validate dropdown results
And To click twenty-twenty three year 
And Click Publications
And Click Filter button
And Scroll down and click View all
And Click African trade Report document
Then Validate African trade Report document page
And Click Download button
#Then Validate African trade Report Download pdf
When Navigate to back
When Navigate to back
And Click Africa Growth Prospects document
Then Validate Africa Growth Prospects document page
And Click Download button
#Then Validate Africa Growth Prospects Report Download pdf
When Navigate to back
When Navigate to back
And Click Afrexim Commodity Index document
Then Validate Afrexim Commodity Index document page
And Click Download button
#Then Validate Afrexim Commodity Index Download pdf
When Navigate to back
When Navigate to back
#And Click Journal of African Trade document
#Then Validate Journal of African Trade document page
#And Click Download button
#Then Validate Journal of African Trade Download pdf
And To click twenty-twenty two year
And Click Publications
And Click Filter button
And Scroll down and click View all
And Click Country at a glance
Then Validate Country at a glance page
And Click Download button
#Then Validate Country at a glance Download pdf
When Navigate to back
When Navigate to back
And To click twenty-twenty two year
And Click Egypt Country Brief
Then Validate Egypt country brief page
And Click Download button
#Then Validate Egypt country brief Download pdf
When Navigate to back
When Navigate to back
And To click twenty-twenty one year 
And Click Publications
And Click Filter button
And Scroll down and click View all
And Click Annual Trade Development Effectiveness Report
Then Validate Annual Trade Development Effectiveness Report page
And Click Download button
#Then Validate Annual Trade Development Effectiveness Report Download pdf
When Navigate to back
When Navigate to back
And To click twenty-twenty one year 
And Click Annual Report twenty twenty one
Then Validate Annual report page
And Click Download button
#Then Validate Annual Report Download pdf
When Navigate to back
When Navigate to back
And To click twenty-twenty year 
And Click Publications
And Click Filter button
And Scroll down and click View all
And Click Tunisia Country brief
Then Validate Tunisia Country brief page
And Click Download button
#Then Validate Tunisia Country brief Download pdf
When Navigate to back
When Navigate to back
And To click twenty-twenty year 
And Click Mauritius Country brief
Then Validate Mauritius Country brief page
And Click Download button
#Then Validate Mauritius Country brief Download pdf
When Navigate to back
When Navigate to back
And To click twenty-nineteen year
And Click Publications
And Click Filter button
And Scroll down and click View all
And Click Afreximbank Trade and Development Finance Brief
Then Validate Afreximbank Trade and Development Finance Brief page
And Click Download button
#Then Validate Afreximbank Trade and Development Finance Brief Download pdf
When Navigate to back
When Navigate to back
And To click twenty-nineteen year
And Click Trade and market update
Then Validate Trade and market update page
And Click Download button
#Then Validate Trade and market update download pdf
When Navigate to back
When Navigate to back
And To click twenty-eighteen year 
And Click Publications
And Click Filter button
And Scroll down and click View all
And Click Annual report twenty eighteen
Then Validate Annual report twenty eighteen page
And Click Download button
#Then Validate Annual report twenty eighteen download pdf
When Navigate to back
When Navigate to back
And To click twenty-eighteen year
And Click Trade & Development Finance Brief Volume two
Then Validate Trade & Development Finance Brief Volume two page
And Click Download button
#Then Validate Trade & Development Finance Brief Volume two download pdf
When Navigate to back
When Navigate to back
And To click twenty-seventeen year 
And Click Publications
And Click Filter button
And Scroll down and click View all
And Click Annual report twenty seventeen
Then Validate Annual report twenty seventeen page
And Click Download button
#Then Validate Annual report twenty seventeen download pdf
When Navigate to back
When Navigate to back
And To click twenty-seventeen year
And Click Contemporary Issues in African Trade
Then Validate Contemporary Issues in African Trade page
And Click Download button
#Then Validate Contemporary Issues in African Trade download pdf
When Navigate to back
When Navigate to back
And To click right arrow for twenty sixteen year
And To click twenty-sixteen year
And Click Publications
And Click Filter button
And Scroll down and click View all
And Click Annual report twenty sixteen
Then Validate Annual report twenty sixteen page
And Click Download button
#Then Validate Annual report twenty sixteen download pdf
When Navigate to back
When Navigate to back
And To click right arrow for twenty sixteen year
And To click twenty-sixteen year
And Click From Entrepreneur to Corporation
Then Validate From Entrepreneur to Corporation page
And Click Download button
#Then Validate From Entrepreneur to Corporation download pdf
When Navigate to back
When Navigate to back
And To click right arrow for twenty fifteen year
And To click twenty-fifteen year
And Click Publications
And Click Filter button
And Scroll down and click View all
And Click Annual report twenty fifteen
Then Validate Annual report twenty fifteen page
And Click Download button
#Then Validate Annual report twenty fifteen download pdf
When Navigate to back
When Navigate to back
And To click right arrow for twenty fifteen year
And To click twenty-fifteen year
And Click The Role of China in Africa Development
Then Validate The Role of China in Africa Development page
And Click Download button
#Then Validate The Role of China in Africa Development download pdf
When Navigate to back
When Navigate to back
And To click right arrow for twenty fourteen year
And To click twenty-fourteen year
And Click Publications
And Click Filter button
And Scroll down and click View all
And Click Trade And Development at the dawn
Then Validate Trade And Development at the dawn page
And Click Download button
#Then Validate Trade And Development at the dawn page download pdf
When Navigate to back
When Navigate to back
And To click right arrow for twenty fourteen year
And To click twenty-fourteen year
And Click Leading issues in african trade
Then Validate Leading issues in african trade
And Click Download button
#Then Validate Leading issues in african trade download pdf
When Navigate to back
When Navigate to back
And To click right arrow for twenty thirteen year
And To click twenty-thirteen year
And Click Publications
And Click Filter button
And Scroll down and click View all
And Click Statement by Jean Louis Ekra
Then Validate Statement by Jean Louis Ekra
And Click Download button
#Then Validate Statement by Jean Louis Ekra download pdf
When Navigate to back
When Navigate to back
And To click right arrow for twenty thirteen year
And To click twenty-thirteen year
And Click Annual report twenty thirteen
Then Validate Annual report twenty thirteen page
And Click Download button
#Then Validate Annual rep`ort twenty thirteen download pdf
When Navigate to back
When Navigate to back
And To click right arrow for twenty twelve year
And To click twenty-twelve year
And Click African trade report twenty twelve
Then Validate African trade report twenty twelve page
And Click Download button
#Then Validate African trade report twenty twelve download pdf
When Navigate to back
When Navigate to back
And To click right arrow for twenty twelve year
And To click twenty-twelve year
And Click Presentation by Jean Louis Ekra
Then Validate Presentation by Jean Louis Ekra page
And Click Download button
#Then Validate Presentation by Jean Louis Ekra download pdf
When Navigate to back
When Navigate to back
And To click right arrow for twenty eleven year
And To click twenty-eleven year
And Click African Trade report twenty eleven
Then Validate African Trade report twenty eleven page
And Click Download button
#Then Validate African Trade report twenty eleven download pdf
When Navigate to back
When Navigate to back
And To click right arrow for twenty eleven year
And To click twenty-eleven year
And Click Linking Africa Enclave Extractive Sector
Then Validate Linking Africa Enclave Extractive Sector page
And Click Download button
#Then Validate Linking Africa Enclave Extractive Sector download pdf
When Navigate to back
When Navigate to back
And To click right arrow for twenty ten year
And To click twenty-ten year
And Click African Trade report twenty ten
Then Validate African Trade report twenty ten page
And Click Download button
#Then Validate African Trade report twenty ten download pdf
When Navigate to back
When Navigate to back
And To click right arrow for twenty ten year
And To click twenty-ten year
And Click Annual report twenty ten
Then Validate Annual report twenty ten page
And Click Download button
#Then Validate Annual report twenty ten download pdf
When Navigate to back
When Navigate to back
And To click right arrow for twenty nine year
And To click twenty-nine year 
And Click African Trade report twenty nine
Then Validate African Trade report twenty nine page
And Click Download button
#Then Validate African Trade report twenty nine download pdf
When Navigate to back
When Navigate to back
And To click right arrow for twenty nine year
And To click twenty-nine year 
And Click Annual report twenty nine
Then Validate Annual report twenty nine page
And Click Download button
#Then Validate Annual report twenty nine download pdf


Scenario: To validate the Knowledge_Libor Functionality

Given To open the Afrexim application
When To click the Knowledge&Research option
And To click Libor Transition option
Then To validate the Libor transition page
When Click Notice: Libor transition link
Then Validate the Notice Libor Transition page
When Click Download button
#Then Validate the Notice Libor transition pdf
When Navigate to back
When Navigate to back
When Click LIBOR REFORM WEBINAR(February) link
Then Validate the LIBOR REFORM WEBINAR(February) page
When Click Download button
#Then Validate the LIBOR REFORM WEBINAR(February) pdf
When Navigate to back
When Navigate to back
When Click Libor Transition Notice-July link
#Then Validate the Libor Transition Notice-July page         -----> Have to rais Bug
#When Click Download button
#Then Validate the Libor Transition Notice-July pdf
When Navigate to back
When Navigate to back





