Feature: Add New Student Functionality
  I want to use this template for my feature file

  Background: 
    Given Admin logged in succesfully
    When Admin clicks Student tab

  @smoke6
  Scenario Outline: Add New Student Validation
    When Admin clicks add new button
    And Admin enters student "<StateId>", "<LastName>", "<FirstName>", "<SSN>", "<Email>", "<DateOfBirth>", "<Password>" and "<BusInfo>"
    And Admin selects "<Gender>", "<LunchType>", "<Ethnicity>" and "<GradeLevel>"
    Then Admin click Submit Changes button and validates that new student successfully added
    And Admin adds picture of student

    Examples: 
      | FirstName | LastName | StateId | SSN       | Email           | Password  | BusInfo |  | DateOfBirth | Gender | LunchType | Ethnicity              | GradeLevel |
      | Fulin     | Kulkara  |     188 | 123456789 | fulin@gmail.com | fulin@123 |     981 |  | 1/14/2008   | Female | Free      | Not Hispanic or Latino |          9 |
