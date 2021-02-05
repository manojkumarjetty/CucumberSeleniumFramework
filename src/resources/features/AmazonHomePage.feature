#Author: J Manoj Kumar
@ignore
Feature: Google Search 

Scenario Outline: Validate Search feature 

	Given I open a browser 
	Then I navigate to amazon page 
	When I enter searchItem "<searchItem>" in search keyword 
	And I validate searched text 
	Then Items should be displayed properly

Examples: 
      | searchItem              |
      |TC01						|
	  |TC02						|
	  |TC03                     |
	  |TC04						|
	  |TC05						|
      |TC06						|
      |TC07						|
      
      
       