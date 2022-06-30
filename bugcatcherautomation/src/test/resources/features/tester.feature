Feature: Testers should be able to update defects so they can monitor their progress

Scenario: As a tester I want to update defect from pending to accepted so that I can monitor defect progress

Given  the tester is logged into their homepage
When   the tester clicks on the accept defect selection
When   the tester clicks on the submit defects button
Then   the tester should accept the defect


Scenario: As a tester I want to update defect from pending to decline so that I can monitor defect progress

Given   the tester is logged into their homepage
When    the tester clicks on the decline defect selection
When    the tester clicks on the submit defects button
Then    the tester should decline the defect 

Scenario: As a tester I want to update defect from accepted to rejected so that I can monitor defect progress

Given   the tester is logged into their homepage
When    the tester clicks the rejected selector
When    the tester clicks the updated defect submit button
Then    the tester should reject the defect

Scenario: As a tester I want to update defect from accepted to fixed so that I can monitor defect progress

Given   the tester is logged into their homepage
When    the tester clicks the fixed selector
When    the tester clicks the updated defect submit button
Then    the tester should have fixed the defect

Scenario: As a tester I want to update defect from accepted to shelved so that I can monitor defect progress

Given   the tester is logged into their homepage
When    the tester clicks the shelved selector
When    the tester clicks the updated defect submit button
Then    the tester should have shelved the defect