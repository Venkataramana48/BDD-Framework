$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/Selenium Jars/Selenium Projects/LocalBadabing Project with Selenium/Badabing Project/FreeCrmBDDFramework/src/main/java/Features/deals.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Create Deals",
  "description": "",
  "id": "free-crm-create-deals",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM Create a new Deal Scenario",
  "description": "",
  "id": "free-crm-create-deals;free-crm-create-a-new-deal-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is already login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "yegireddi.venkataramana@gmail.com",
        "Mangamma!#1990"
      ],
      "line": 8
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user moves to new deal page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user enters deal details",
  "rows": [
    {
      "cells": [
        "test deal",
        "50",
        "1000",
        "10"
      ],
      "line": 13
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "DealStepDefinition.user_is_already_login_page()"
});
formatter.result({
  "duration": 16029569900,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefinition.title_of_login_page_is_Free_CRM()"
});
formatter.result({
  "duration": 12053300,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefinition.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 747277300,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 5903765400,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefinition.user_is_on_home_page()"
});
formatter.result({
  "duration": 9816700,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefinition.user_moves_to_new_deal_page()"
});
formatter.result({
  "duration": 3551716400,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefinition.user_enters_deal_details(DataTable)"
});
formatter.result({
  "duration": 4185536100,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 5826246500,
  "status": "passed"
});
});