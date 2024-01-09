Feature: Add Teacher Functionality

  Background: 
    Given Admin logged in succesfully

  @smoke13
  Scenario Outline: Add Teacher Functionality Validation
    When Admin clicks Staff/Faculty tab and add new button on the staff page
    And Admin enters teacher "<StateId>", "<LastName>","<FirstName>","<DateOfBirth>", "<SSN>","<License>","<Password>","<JobTitle>","<Address>","<City>","<ZipCode>","<Phone>","<SchoolEmail>" and "<PersonalEmail>"
    And Admin selects teacher "<JobPosition>","<Title>", "<Gender>", "<Ethnicity>","<Race>","<Department>","<AdvisorOf>","<Homeroom>","<Classroom>" and "<State>"
    And Admin clicks submit button and upload photo of teacher
    Then Admin validates the teacher added

    Examples: 
      | StateId | LastName | FirstName | DateOfBirth | SSN       | License | Password  | JobTitle     | Address           | City     | ZipCode | Phone      | SchoolEmail       | PersonalEmail   | JobPosition     | Title | Gender | Ethnicity              | Race  | Department  | AdvisorOf | Homeroom  | Classroom | State |
      |    3245 | White    | Elion     | 01/14/1992  | 456789123 |     123 | elion@123 | Lead Teacher | 2345 Club Lane Dr | Columbus |   98765 | 6147654321 | elion@neotech.com | elion@gmail.com | Teacher/Teacher | Mr.   | Male   | Not Hispanic or Latino | White | Mathematics | 9th Grade | 9th Grade | Science   | OH    |
