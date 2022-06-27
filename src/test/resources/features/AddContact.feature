Feature: add contact in my jurnal

  Scenario: Success create contact
    Given I already logged in
    When I click contact menu
    Then Contact page appear
    When I click new contact
    Then Create new contact page appear
    When I fill name with "Winny"
    And I choose contact type as customer
    And I click add button
    Then Contact with name "Winny" is created
    And Contact type should be "Customer"

  Scenario Outline: Success fully create contact
    Given I already logged in
    When I click contact menu
    Then Contact page appear
    When I click new contact
    Then Create new contact page appear
    When I fill name with "<Display Name>"
    And I choose contact type as customer
    Then I input Number Phone "<Number Phone>"
    And I click add button
    Then Contact with name "<Display Name>" is created
    And Contact type should be "<Contact Type>"
    Examples:
      | Display Name  | Contact Type | Number Phone  |
      | Olive         | Customer     | 081255889990  |
#      | Marco         | Customer     | 089978225677  |
#      | Vanilla       | Customer     | 087899663212  |