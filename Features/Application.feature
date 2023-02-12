#Author: gayatripatil596@gmail.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Parabank Login , Registration and Forgot Login Features
  I want to use this feature file to validate Login , Registration and Forgot Login Features of application

  Background: Launch the application
    Given User launch the application

  @Smoke
  Scenario: Verify application is launched successfully
    Then Application login page should be displayed

  @Sanity
  Scenario: Verify application logo and caption
    Then Application logo should be displayed
    And Application caption should be displayed

  @Regression
  Scenario Outline: Verify application login
    When User enter <username> and <password>
    And Click on login button
    Then Application login should be successful

    Examples: 
      | username | password  |
      | admin    | admin@123 |
      | abcd     | abcd@123  |
