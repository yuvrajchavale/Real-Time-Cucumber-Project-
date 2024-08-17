Feature: User Login With Valid and Invalid Credentials

Background:
Given Start the Chrome Browser

@positive
Scenario: Successful login with valid credentials
Given The user is on the login page
When The user enters a valid username and password
And The user clicks the login button
Then The user should be redirected to the dashboard

@negative
Scenario: Unsuccessful login with invalid credentials
Given The user is on the login page
When The user enters an invalid username and password
And The user clicks the login button
Then An error message should be displayed and click ok
And The user should be back on the login page