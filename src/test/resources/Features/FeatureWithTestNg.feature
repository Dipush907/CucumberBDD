Feature: log in to mpower application 

Scenario: Log in to mpower application

Given Open the browser
And Navigate to application
When User provides Valid credentials
And click on log in button
Then User is moved to TOA page.