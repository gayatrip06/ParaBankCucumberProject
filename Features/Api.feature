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
Feature: Api testing of GitHub Repository
  I want to use this feature file to do Api testing of GitHub Repository

  @Api
  Scenario Outline: Verify Create Repository Request
    Given Api request is created with <Project> name
    Then Status code should be <StatusCode>
    And Status message should be <StatusMessage>
    And Response time should be less than or equal to <ResponseTime>

    Examples: 
      | Project                       | StatusCode | StatusMessage | ResponseTime |
      | ApiRestAssuredCucumberProject |        201 | Created       |            3 |
