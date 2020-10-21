Feature: Free CRM Login Feature

#Without Examples Keyword
#Scenario: Free CRM Login Test Scenario
#
#Given user is already login page
#When title of login page is Free CRM
#Then user enters "yegireddi.venkataramana@gmail.com" and "Mangamma!#1990"
#Then user clicks on login button
#Then user is on home page


#With Examples Keyword
Scenario Outline: Free CRM Login Test Scenario

Given user is already login page
When title of login page is Free CRM
Then user enters "<username>" and "<password>" 
Then user clicks on login button
Then user is on home page
Then close the browser

Examples:

				| username | password |
				| yegireddi.venkataramana@gmail.com | Mangamma!#1990 |
				| venkyy439@gmail.com | Ramana@1248 |