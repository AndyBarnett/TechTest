Feature: Sign up

Scenario: Create a new account
	Given am on the homepage
	When I click sign in
	And I click the register now button
	And I enter my email
	And I click Email me
	Then I should be on the confirmation email screen