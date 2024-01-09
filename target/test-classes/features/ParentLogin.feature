Feature: Parent Login Functionality

  @smoke15
  Scenario Outline: Parent Login Validation
    Given Primary/Secondary parent logged in successfully with "<UserName>" and "<Password>"
    Then Primary/Secondary parent validates all sub tabs are visible
      | Main Page  |
      | Attendance |
      | Grades     |
      | Homework   |
      | Results    |
      | Schedule   |
      | Discipline |
    And Primary/Secondary parent validates "<FullName>", "<Address>","<CellPhone>","<Email>","<StudentId>","<StudentName>" and "<GradeLevel>"

    Examples: 
      | FullName      | Address                    | CellPhone  | Email           | StudentId | StudentName   | GradeLevel | UserName   | Password  |
      | Senay Kulkara | 1234 Club Lane Dr OH, 1234 | 6141234567 | senay@gmail.com, |      1155 | Fulin Kulkara |          9 | SenKulkara | senay@123 |
