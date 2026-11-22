# FulinSISProject — QA Test Automation Portfolio

A Java-based automated testing project for a School Information System (SIS). This repository contains Cucumber feature scenarios, Selenium page classes, Java step definitions, and JUnit-based test runners.

> **Portfolio note:** This is an existing QA training project. It demonstrates testing structure and practices, but its test suite has not been independently verified to pass in a fresh environment.

## Test coverage

The repository includes scenarios for:

- Login validation, including positive and negative cases
- Student, parent, and teacher login workflows
- Student enrollment and student records
- Adding students, parents, and teachers
- Assignment and student-page functionality
- Student, parent, and teacher database validation

## Tools and techniques

- **Java** and **Maven** for test code and project configuration
- **Selenium WebDriver** for browser interaction
- **Cucumber / Gherkin** for behavior-driven test scenarios
- **JUnit** for Cucumber runners
- **Page Object Model-style organization** for page elements
- **Cucumber HTML and JSON reporting configuration**

## Repository structure

| Path | Contents |
| --- | --- |
| `src/test/resources/features/` | Gherkin feature scenarios |
| `src/test/java/com/neotech/steps/` | Java step definitions and assertions |
| `src/test/java/com/neotech/pages/` | Page element classes |
| `src/test/java/com/neotech/runner/` | Test runners and tag filters |
| `src/test/java/com/neotech/utils/` | Shared testing utilities |
| `pom.xml` | Maven dependencies and reporting configuration |

## Example scenarios

The `LoginPageValidationSteps.java` implementation includes checks for successful login, an empty-password alert, and an invalid-username error message. The repository also contains feature files describing other SIS user flows.

## Running the project

The Maven configuration includes a dependency on `com.neotech:TestNgFrameworkFulin:0.0.1-SNAPSHOT`, which may not be available on a new machine. Running the tests also requires authorized access to the test application and appropriately configured test credentials. The Cucumber runners currently filter tests using tags.

Therefore, **do not assume that `mvn test` will run successfully in a clean environment without additional setup.** No current pass rate is claimed.

## Security note

**The repository currently contains a configuration file with populated username and password fields:** `src/test/resources/configs/configuration.properties`. Review and remove any real credentials from the published repository and its history, and rotate exposed passwords. Never place real login details, private user records, or customer secrets in a public portfolio.

## Relevance to Junior QA roles

This project shows practical examples of test-case design, validation assertions, positive and negative testing, web UI automation, and reusable automation structure. It complements a manual QA portfolio featuring test plans and bug reports.
