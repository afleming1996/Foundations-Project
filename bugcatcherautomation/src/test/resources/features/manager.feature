Feature: Managers should be able to create and assign defects

Scenario: As a manager I want to create defects so that I can start addressing them

    Given   the manager is logged in to their homepage
    When    the manager enters the defect name  
    Then    the manager should have assigned the defect name

Scenario: As a manager I want to assign defects so that the defects can be worked on

    Given   the manager is logged in to their homepage
    When    the manager enters the Tester Chosen
    When    the manager clicks the submit button
    Then    the manager should have assigned the defect