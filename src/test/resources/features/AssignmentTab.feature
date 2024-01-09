Feature: Assignment Tab Functionality

  Background: 
    Given Admin logged in succesfully

  @smoke14
  Scenario: Assignment Tab Validation
    And Admin clicks Staff/Faculty tab on the main page
    When Admin clicks Assignment sub tab
    Then Admin validates that reaching the assignment tab
