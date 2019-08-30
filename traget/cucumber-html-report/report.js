$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/co/uk/motors/features/CarSearch.feature");
formatter.feature({
  "name": "Search",
  "description": "As a customer\ni want the ability to search\nfor a car\nso that i can review the  car to buy",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Customer can search car giving minimum and maximum price and review fulldetails of specific car",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "i navigate to Motors homepage",
  "keyword": "Given "
});
formatter.step({
  "name": "i enter post code as \"\u003cPostCode\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "i select my MinPrice as \"\u003cMiniPrice\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "i select my MaxiPrice as \"\u003cMaximumPrice\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "i click on search button",
  "keyword": "And "
});
formatter.step({
  "name": "the search results for all the cars within that \"\u003cRegion\u003e\"  in the area  is displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "i click on FullDetails button of a car of my choice",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "PostCode",
        "MiniPrice",
        "MaximumPrice",
        "Region"
      ]
    },
    {
      "cells": [
        "L35 9JG",
        "£1,000",
        "£6,000",
        "Rainhill, Prescot"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Customer can search car giving minimum and maximum price and review fulldetails of specific car",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "i navigate to Motors homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "CarSearch.i_navigate_to_Motors_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i enter post code as \"L35 9JG\"",
  "keyword": "When "
});
formatter.match({
  "location": "CarSearch.i_enter_post_code_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i select my MinPrice as \"£1,000\"",
  "keyword": "And "
});
formatter.match({
  "location": "CarSearch.i_select_my_MinPrice_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i select my MaxiPrice as \"£6,000\"",
  "keyword": "And "
});
formatter.match({
  "location": "CarSearch.i_select_my_MaxiPrice_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i click on search button",
  "keyword": "And "
});
formatter.match({
  "location": "CarSearch.i_click_on_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the search results for all the cars within that \"Rainhill, Prescot\"  in the area  is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "CarSearch.the_search_results_for_all_the_cars_within_that_in_the_area_is_displayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i click on FullDetails button of a car of my choice",
  "keyword": "And "
});
formatter.match({
  "location": "CarSearch.i_click_on_FullDetails_button_of_a_car_of_my_choice()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Customer can search a car based on monthly cost",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "i navigate to Motors homepage",
  "keyword": "Given "
});
formatter.step({
  "name": "i click on Monthly Cost tab",
  "keyword": "And "
});
formatter.step({
  "name": "i enter post code as \"\u003cPostCode\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "i select the car maker as \"\u003cMake\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "i select the car model as \"\u003cModel\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "i select my Minimum Cost as \"\u003cMiniCost\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "i select Deposit as \"\u003cDeposit\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "i select my Maximum Cost as \"\u003cMaximumCost\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "i select Term of loan as \"\u003cMonths\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "i click on search button",
  "keyword": "And "
});
formatter.step({
  "name": "the results for search above are displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "i click on specific car of my choice as \u003cCarModelLink\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "PostCode",
        "Make",
        "Model",
        "MiniCost",
        "Deposit",
        "MaximumCost",
        "Months",
        "CarModelLink"
      ]
    },
    {
      "cells": [
        "B93 0NA",
        "Aston Martin",
        "Vantage",
        "£900",
        "Deposit (£10000)",
        "£1000",
        "Term (48 Months)",
        "ASTON MARTIN, VANTAG 2010 (10) V8 Roadster 2-door"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Customer can search a car based on monthly cost",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "i navigate to Motors homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "CarSearch.i_navigate_to_Motors_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i click on Monthly Cost tab",
  "keyword": "And "
});
formatter.match({
  "location": "CarSearch.i_click_on_Monthly_Cost_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i enter post code as \"B93 0NA\"",
  "keyword": "When "
});
formatter.match({
  "location": "CarSearch.i_enter_post_code_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i select the car maker as \"Aston Martin\"",
  "keyword": "And "
});
formatter.match({
  "location": "CarSearch.i_select_the_car_maker_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i select the car model as \"Vantage\"",
  "keyword": "And "
});
formatter.match({
  "location": "CarSearch.i_select_the_car_model_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i select my Minimum Cost as \"£900\"",
  "keyword": "And "
});
formatter.match({
  "location": "CarSearch.i_select_my_Minimum_Cost_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i select Deposit as \"Deposit (£10000)\"",
  "keyword": "And "
});
formatter.match({
  "location": "CarSearch.i_select_Deposit_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i select my Maximum Cost as \"£1000\"",
  "keyword": "And "
});
formatter.match({
  "location": "CarSearch.i_select_my_Maximum_Cost_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i select Term of loan as \"Term (48 Months)\"",
  "keyword": "And "
});
formatter.match({
  "location": "CarSearch.i_select_Term_of_loan_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i click on search button",
  "keyword": "And "
});
formatter.match({
  "location": "CarSearch.i_click_on_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the results for search above are displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "CarSearch.the_results_for_search_above_are_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i click on specific car of my choice as ASTON MARTIN, VANTAG 2010 (10) V8 Roadster 2-door",
  "keyword": "Then "
});
formatter.match({
  "location": "CarSearch.i_click_on_specific_car_of_my_choice_as_ASTON_MARTIN_VANTAG_V_Roadster_door(Integer,Integer,Integer,Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/co/uk/motors/features/CustomerSearchCarForMonthlyPayments.feature");
formatter.feature({
  "name": "Search",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Customer can search a car based on monthly cost",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "i navigate to Motors homepage",
  "keyword": "Given "
});
formatter.step({
  "name": "i click on Monthly Cost tab",
  "keyword": "And "
});
formatter.step({
  "name": "i enter post code as \"\u003cPostCode\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "i select the car maker as \"\u003cMake\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "i select the car model as \"\u003cModel\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "i select Minimum cost as \"\u003cMinCost\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "i select Deposit as \"\u003cDeposit\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "i select Term of loan as \"\u003cMonths\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "i click on search button",
  "keyword": "And "
});
formatter.step({
  "name": "the resuls for search above are displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "i click on specific car of my choice as \u003cCarModelLink\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "PostCode",
        "Make",
        "Model",
        "MinCost",
        "Deposit",
        "Months",
        "CarModelLink"
      ]
    },
    {
      "cells": [
        "B93 0NA",
        "Aston Martin",
        "Vantage",
        "£1000",
        "Deposit (£9000)",
        "Term (48 Months)",
        "ASTON MARTIN VANTAGE 2013 (63) 4.7 V8 ROADSTER"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Customer can search a car based on monthly cost",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "i navigate to Motors homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "CarSearch.i_navigate_to_Motors_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i click on Monthly Cost tab",
  "keyword": "And "
});
formatter.match({
  "location": "CarSearch.i_click_on_Monthly_Cost_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i enter post code as \"B93 0NA\"",
  "keyword": "When "
});
formatter.match({
  "location": "CarSearch.i_enter_post_code_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i select the car maker as \"Aston Martin\"",
  "keyword": "And "
});
formatter.match({
  "location": "CarSearch.i_select_the_car_maker_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i select the car model as \"Vantage\"",
  "keyword": "And "
});
formatter.match({
  "location": "CarSearch.i_select_the_car_model_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i select Minimum cost as \"£1000\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "i select Deposit as \"Deposit (£9000)\"",
  "keyword": "And "
});
formatter.match({
  "location": "CarSearch.i_select_Deposit_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "i select Term of loan as \"Term (48 Months)\"",
  "keyword": "And "
});
formatter.match({
  "location": "CarSearch.i_select_Term_of_loan_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "i click on search button",
  "keyword": "And "
});
formatter.match({
  "location": "CarSearch.i_click_on_search_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the resuls for search above are displayed",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "i click on specific car of my choice as ASTON MARTIN VANTAGE 2013 (63) 4.7 V8 ROADSTER",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "passed"
});
});