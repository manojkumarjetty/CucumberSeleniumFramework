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
  "duration": 13394682000,
  "status": "passed"
});
formatter.match({
  "location": "AddingItemsToCartSteps.i_click_on_menu()"
});
formatter.result({
  "duration": 149669200,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d88.0.4324.150)\nBuild info: version: \u00273.5.3\u0027, revision: \u0027a88d25fe6b\u0027, time: \u00272017-08-29T12:42:44.417Z\u0027\nSystem info: host: \u0027LAPTOP-J8Q24HOB\u0027, ip: \u0027192.168.0.104\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_271\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d87.0.4280.20 (c99e81631faa0b2a448e658c0dbd8311fb04ddbd-refs/branch-heads/4280@{#355}), userDataDir\u003dC:\\Users\\91990\\AppData\\Local\\Temp\\scoped_dir18504_209296793}, timeouts\u003d{implicit\u003d0, pageLoad\u003d300000, script\u003d30000}, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003ddismiss and notify, strictFileInteractability\u003dfalse, platform\u003dXP, proxy\u003dProxy(), goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:55488}, acceptInsecureCerts\u003dfalse, browserVersion\u003d88.0.4324.150, browserName\u003dchrome, javascriptEnabled\u003dtrue, platformName\u003dXP, setWindowRect\u003dtrue, webauthn:virtualAuthenticators\u003dtrue}]\nSession ID: 112303ae075fbc89dd7e4bb75a72ec6e\n*** Element info: {Using\u003dxpath, value\u003d//a[@id\u003d\u0027nav-hamburger-menu\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:185)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:120)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:646)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:416)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:518)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:408)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy17.click(Unknown Source)\r\n\tat pageObjects.AmazonAddToCart.clickAmazonAllMenu(AmazonAddToCart.java:44)\r\n\tat stepDefinitions.AddingItemsToCartSteps.i_click_on_menu(AddingItemsToCartSteps.java:30)\r\n\tat ✽.Then I click on Menu(features/AddingItemToCart.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "AddingItemsToCartSteps.i_select_echo_and_alexa_from_under_digital_content_and_devices()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddingItemsToCartSteps.i_select_echo_dot_3rd_gen_item()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddingItemsToCartSteps.i_retrieve_the_items_count_in_cart()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddingItemsToCartSteps.i_click_on_add_to_cart()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddingItemsToCartSteps.added_items_count_in_cart_should_be_retrieved()"
});
formatter.result({
  "status": "skipped"
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
