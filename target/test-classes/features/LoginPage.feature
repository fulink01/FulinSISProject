
Feature: Login Page Functionality
  I want to use this template for my feature file

  @smoke2
  Scenario: Blank password
    When  enter username
    And leave empty password box
    And click login button
    Then verify password box can not empty

	@smoke3
  Scenario: Wrong Credentials
   	When enter invalid username
   	And enter valid password
   	When click login button
   	Then verify that username does not match
   	
  