
Feature: Enroll Student Functionality

Background: 
    Given Admin logged in succesfully
    When Admin clicks Student tab


  @smoke7
  Scenario: Enroll Student Functionality Validation
    When Admin searches new student in the list and click on it
    And Admin clicks enroll link and changes the student status to enroll
    Then Admin validates that the status change and finds the student in the enrollement sub tab
   

  