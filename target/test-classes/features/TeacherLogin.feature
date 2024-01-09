Feature: Teacher Login Functionality

  @smoke16
  Scenario Outline: Teacher Login Validation
    Given Teacher logged in succesfully with "<UserName>" and "<Password>"
    Then Teacher validates welcome message and personal informations with "<WelcomeMessage>","<LocalId>","<JobTitle>","<Birthday>","<SSN>","<Phone>","<SchoolEmail>" and "<PersonalEmail>"

    Examples: 
      | WelcomeMessage    | LocalId | JobTitle     | Birthday  | SSN       | Phone      | SchoolEmail       | PersonalEmail   | UserName | Password  |
      | Welcome Mr. White |    1258 | Lead Teacher | 1/14/1992 | 456789123 | 6147654321 | elion@neotech.com | elion@gmail.com | ElWhite  | elion@123 |
