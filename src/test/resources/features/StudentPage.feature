Feature: Student Page Functionality

  @smoke5
  Scenario: Student Page Validation
    Given Admin logged in succesfully
    When Admin clicks Student tab
    Then Admin validates the all sub tabs are visible on the students page
      | Personal             |
      | Parental             |
      | Academic             |
      | Override Final Grade |
      | Schedule             |
      | Discipline Stats     |
      | Personal 2           |
      | Enrollment           |
      | Notes                |
      | E-Portfolio          |
      | Program Enrollment   |
