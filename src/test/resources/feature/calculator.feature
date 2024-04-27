Feature: Calculator
  Scenario: Sum two numbers
    Given I have two numbers: 1 and 2
    When the calculator sums them
    Then I receive 3 as a result
Feature: Calculator
  Scenario: Multiply two numbers
    Given I have two numbers: 3 and 5
    When the calculator multiplies them
    Then I receive 15 as a result
