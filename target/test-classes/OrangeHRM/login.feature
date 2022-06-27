Feature: Login ton OrangeHRM

  Scenario: Successfully logged in
    Given I already on login page
    When I input my username
    And I input my password
    And I click login button
    Then The system show dashboard page
    And The system show welcome message