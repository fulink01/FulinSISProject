@smoke9
Feature: Add Parent Details Functionality

  Background: 
    Given Admin logged in succesfully
    When Admin clicks Student tab
    And Admin finds the student on the list

  @smoke10
  Scenario Outline: Add Primary Parent
    And Admin clicks Parental sub tab and Admin clicks Add New button for primary parent
    And Admin enters primary parents "<FirstName1>", "<LastName1>","<Password1>","<Address1>","<City1>","<ZipCode1>","<CellPhone1>" and "<Email1>"
    And Admin selects primary parent "<Title1>", "<Relation1>" and "<State1>"
    Then Admin validates primary parent added

    Examples: 
      | FirstName1 | LastName1 | Password1 | Title1 | Relation1 | Address1          | City1    | State1 | ZipCode1 | CellPhone1 | Email1          |
      | Senay      | Kulkara   | senay@123 | Mrs.   | Mother    | 1234 Club Lane Dr | Columbus | OH     |     1234 | 6141234567 | senay@gmail.com |

  @smoke11
  Scenario Outline: Add Secondary Parent
    And Admin clicks Parental sub tab and Admin clicks Add New button for secondary parent
    And Admin enters secondary parent "<FirstName2>", "<LastName2>","<Password2>","<Address2>","<City2>","<ZipCode2>","<CellPhone2>" and "<Email2>"
    And Admin selects secondary parent "<Title2>", "<Relation2>" and "<State2>"
    Then Admin validates secondary parent added

    Examples: 
      | FirstName2 | LastName2 | Password2 | Title2 | Relation2 | Address2          | City2    | State2 | ZipCode2 | CellPhone2 | Email2         |
      | Omer       | Kulkara   | omer@123  | Mr.    | Father    | 1234 Club Lane Dr | Columbus | OH     |     1234 | 6149876543 | omer@gmail.com |
