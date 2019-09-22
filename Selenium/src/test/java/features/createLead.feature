Feature: Create Lead in LeafTap Application
Background: 

Given Open the browser
And Maximise the browser
And Set the timeout
And Load the URL
And Enter the username in Loginpage
And Enter the password in Loginpage
And Click Login button

@Sanity
Scenario: TC001 Verify Createlead for first data
And Click CRM hyperlink   
And Click Create Lead button
And Enter the firstname as Vignesh in CreateLead Page 
And Enter the lastname as Thangavel in CreateLead Page    
And Enter the companyname as HCL in CreateLead Page    
When Click the submit button
Then Lead created successfully 


@Regression
Scenario: TC002 Verify Createlead for second data
And Click CRM hyperlink   
And Click Create Lead button
And Enter the firstname as Bala in CreateLead Page 
And Enter the lastname as Chandran in CreateLead Page    
And Enter the companyname as Cognizant in CreateLead Page    
When Click the submit button
Then Lead created successfully 

@Smoke
Scenario Outline: TC003 Verify Createlead for second data
And Click CRM hyperlink   
And Click Create Lead button
And Enter the firstname as <fName> in CreateLead Page 
And Enter the lastname as <lName> in CreateLead Page    
And Enter the companyname as <companyName> in CreateLead Page    
When Click the submit button
Then Lead created successfully

Examples:
|fName|lName|companyName|
|Divahar|Raja|ZoloStays|
|Shiva|Veera|TCS|


