Feature: Login 
Scenario: Valid Login
	Given User Launch Chrome browser
	When User opens URL "http://admin-demo.nopcommerce.com/login"
	And User enters Email as "" and password as ""
	And Click on Login
	Then Page Title should be "Dashboard / nopCommerce administration"
	When User click on Logout link
	Then Page Title should be "Your store.Login"
	And close browser