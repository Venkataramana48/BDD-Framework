Feature: Free CRM Create Deals

Scenario: Free CRM Create a new Deal Scenario

Given user is already login page
When title of login page is Free CRM
Then user enters username and password
 | yegireddi.venkataramana@gmail.com | Mangamma!#1990 |
Then user clicks on login button
Then user is on home page
Then user moves to new deal page
Then user enters deal details
| test deal | 50 | 1000 | 10 |
Then close the browser