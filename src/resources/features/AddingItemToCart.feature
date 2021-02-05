#Author: J Manoj Kumar
@consider
Feature: To Add items to cart 

Scenario Outline: Validate number of items added to cart 

Given I open "<Browser>" browser and launch the Amazon application
Then I click on Menu
Then I select Echo and Alexa from under Digital content and Devices
Then I select Echo Dot 3rd Gen item
Then I retrieve the items count in cart
When I click on Add to cart
Then Added Items count in cart should be retrieved

Examples: 
|Browser				 |
|Chrome                  |
|Firefox                 |
      
      