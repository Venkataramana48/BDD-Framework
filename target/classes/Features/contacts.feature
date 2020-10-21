Feature: Free CRM Create Contacts

Scenario Outline: Free CRM Create a new Contact Scenario

Given user is already login page
When title of login page is Free CRM
Then user enters "<username>" and "<password>" 
Then user clicks on login button
Then user is on home page
Then user moves to new contact page
Then user enters contact details "<firstname>" and "<lastname>" and "<position>"
Then close the browser

Examples:

		| username | password | firstname | lastname | position |
		| yegireddi.venkataramana@gmail.com | Mangamma!#1990 | Sureshkumar | Chinta | Manager |
		| yegireddi.venkataramana@gmail.com | Mangamma!#1990 | Swapna | Cheekati | Developer |