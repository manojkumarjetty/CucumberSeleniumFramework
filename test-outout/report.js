$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/AddingItemToCart.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: J Manoj Kumar"
    }
  ],
  "line": 3,
  "name": "To Add items to cart",
  "description": "",
  "id": "to-add-items-to-cart",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@consider"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Validate number of items added to cart",
  "description": "",
  "id": "to-add-items-to-cart;validate-number-of-items-added-to-cart",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "I open \"\u003cBrowser\u003e\" browser and launch the Amazon application",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click on Menu",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I select Echo and Alexa from under Digital content and Devices",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I select Echo Dot 3rd Gen item",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I retrieve the items count in cart",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I click on Add to cart",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Added Items count in cart should be retrieved",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "to-add-items-to-cart;validate-number-of-items-added-to-cart;",
  "rows": [
    {
      "cells": [
        "Browser"
      ],
      "line": 16,
      "id": "to-add-items-to-cart;validate-number-of-items-added-to-cart;;1"
    },
    {
      "cells": [
        "Chrome"
      ],
      "line": 17,
      "id": "to-add-items-to-cart;validate-number-of-items-added-to-cart;;2"
    },
    {
      "cells": [
        "Firefox"
      ],
      "line": 18,
      "id": "to-add-items-to-cart;validate-number-of-items-added-to-cart;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 17,
  "name": "Validate number of items added to cart",
  "description": "",
  "id": "to-add-items-to-cart;validate-number-of-items-added-to-cart;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@consider"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I open \"Chrome\" browser and launch the Amazon application",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click on Menu",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I select Echo and Alexa from under Digital content and Devices",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I select Echo Dot 3rd Gen item",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I retrieve the items count in cart",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I click on Add to cart",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Added Items count in cart should be retrieved",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Chrome",
      "offset": 8
    }
  ],
  "location": "AddingItemsToCartSteps.i_open_browser_and_launch_the_Amazon_application(String)"
});
formatter.result({
  "duration": 11765169400,
  "status": "passed"
});
formatter.match({
  "location": "AddingItemsToCartSteps.i_click_on_menu()"
});
formatter.result({
  "duration": 3951154400,
  "status": "passed"
});
formatter.match({
  "location": "AddingItemsToCartSteps.i_select_echo_and_alexa_from_under_digital_content_and_devices()"
});
formatter.result({
  "duration": 728546100,
  "status": "passed"
});
formatter.match({
  "location": "AddingItemsToCartSteps.i_select_echo_dot_3rd_gen_item()"
});
formatter.result({
  "duration": 2677859400,
  "status": "passed"
});
formatter.match({
  "location": "AddingItemsToCartSteps.i_retrieve_the_items_count_in_cart()"
});
formatter.result({
  "duration": 1317398000,
  "status": "passed"
});
formatter.match({
  "location": "AddingItemsToCartSteps.i_click_on_add_to_cart()"
});
formatter.result({
  "duration": 247340400,
  "status": "passed"
});
formatter.match({
  "location": "AddingItemsToCartSteps.added_items_count_in_cart_should_be_retrieved()"
});
formatter.result({
  "duration": 1448273100,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Validate number of items added to cart",
  "description": "",
  "id": "to-add-items-to-cart;validate-number-of-items-added-to-cart;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@consider"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I open \"Firefox\" browser and launch the Amazon application",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click on Menu",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I select Echo and Alexa from under Digital content and Devices",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I select Echo Dot 3rd Gen item",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I retrieve the items count in cart",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I click on Add to cart",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Added Items count in cart should be retrieved",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Firefox",
      "offset": 8
    }
  ],
  "location": "AddingItemsToCartSteps.i_open_browser_and_launch_the_Amazon_application(String)"
});
