
Feature: Student DB Functionality

Background:
	Given Admin logged in succesfully

  @smoke8
  Scenario: Student DB Validation
    When Admin clicks setting tab on the homepage
    And Admin clicks management sub tab and query analyzer link
    Then Admin validates by sending a query into text box, writing password and clicking execute button
    

  