

Feature: Login

Scenario: Successful login with valid credential
	Given User launch the Chrome browser
	When user open url "https://admin-demo.nopcommerce.com/login"
	And Enter the valid Email and password
	And click the login button
	Then Open dashboard "Dashboard / nopCommerce administration"
	When User click on log out
	And close browser