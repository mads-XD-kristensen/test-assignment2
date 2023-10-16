Feature: String utilities
  Scenario: Reverse a string
    Given I have a string "Hello"
    When I reverse the string
    Then I should get "olleH"

  Scenario: Capitalize a string
    Given I have a lowercase string "big"
    When I capitalize the string
    Then I should get uppercase "BIG"

  Scenario: Lowercase a string
    Given I have a string uppercase "SMALL"
    When I lowercase the string
    Then I should get lowercase "small"