Feature: Salesforce Account Creation 

Scenario: Create a new account in Salesforce

Given Login to Salesforce with the username as 'vidyar@testleaf.com' and password as 'Sales@123'
When Open the toggle menu and select Sales from App Launcher
And Click on the Accounts tab
And Click on the New button
And Enter "Nan" as account name
And Select Ownership
Then Click save and verify Account name is "Nan"