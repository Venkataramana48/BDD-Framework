Feature: Free CRM Create Deals

  Scenario: Free CRM Create a new Deal Scenario
  
    Given user is already login page
    When title of login page is Free CRM
    Then user enters username and password
      | username                          | password       |
      | yegireddi.venkataramana@gmail.com | Mangamma!#1990 |
      
    Then user clicks on login button
    Then user is on home page
    Then user moves to new deal page
    Then user enters deal details
      | title      | probability | amount | commission |
      | test deal1 |          60 |   2000 |         20 |
      | test deal2 |          70 |   3000 |         30 |
      | test deal3 |          80 |   4000 |         40 |
      
    Then close the browser
