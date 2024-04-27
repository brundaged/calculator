Feature: Calculator
  Scenario: Sum two numbers
    Given I have two numbers: 1 and 2
    When the calculator sums them
    Then I receive 3 as a result

  Scenario: Multiply two numbers
    Given I have two numbers: 3 and 51
    When the calculator multiplies them
    Then I receive 153 as a result
