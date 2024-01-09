Feature: Parent and Teacher DB Functionality
  
  Background:
  Given Admin logged in succesfully
  And Admin clicks setting tab on the homepage
  And Admin clicks management sub tab and query analyzer link

  @smoke17
  Scenario: Parent and Teacher DB Validation
    Then Admin validates parent table by sending a query into text box, writing password and clicking execute button
    And Admin validates teacher table by sending a query into text box, writing password and clicking execute button
    

  