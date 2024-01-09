Feature: Student Login Functionality

  @smoke12
  Scenario Outline: Student Login Validation
    Given Student logins with "<UserName>" and "<Password>"
    Then Student validates "<UserName>", "<StudentName>", "<StudentId>", and "<Grade>"

    Examples: 
      | UserName       | Password  | StudentName   | StudentId | Grade     |
      | FulinKulkara21 | fulin@123 | Fulin Kulkara |      1155 | 9th Grade |
