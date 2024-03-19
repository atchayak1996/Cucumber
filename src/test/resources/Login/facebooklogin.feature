Feature: User have to click to facebook login page

@sanity
Scenario: User have to click valid username and invalid password

Given user have to launch facebook url through chromebrowser

When user have to click valid username and invalid password

And user have to click login button

Then user have to go for invalid credential page

@smoke
Scenario: User have to click valid invalid and invalid password

Given user have to launch facebook url through chromebrowser

When user have to click invalid username and invalid password

And user have to click login button

Then user have to go for invalid credential page
