
@login
Feature: Login Page Functionality
  
  @smoke2
  Scenario: Valid Credentials
  	When enter valid username
  	And enter valid password
  	And select valid academic year
  	And click login button
  	Then verify succesfully login

  @smoke3
  Scenario: Blank password
    When  enter valid username
    And leave empty password box
    And click login button
    Then verify password box can not empty

	@smoke4
  Scenario: Wrong Credentials
   	When enter invalid username
   	And enter valid password
   	When click login button
   	Then verify that username does not match
   	
  