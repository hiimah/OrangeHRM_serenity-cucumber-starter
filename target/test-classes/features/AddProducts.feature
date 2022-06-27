Feature: Input New Product in My Jurnal.id

  Scenario: Input New Product
    Given I already logged in
    When I click product menu
    Then product page appear
    When I click action button
    And I choose new product
    Then create new product page appear
#    When I input name with "SIDU BOOK 38"
#    And I input CodeOrSKU "SDU38101101"
#    And I click field category
#    And I input name category with "BOOK"
##    And I click field unit
#    And I input unit "100"
#    And I input Description "Buku Sidu 38 Lembar isi 10 PCS"
    And I click check box I buy this item button
    And I click field buy unit price
#    And I input buy unit price "31500"
#    And I click dropdown on default buy tax button
    And I click check box I sell this item button
#    And I input sale unit price "35000"
#    And I click dropdown on default sell tax button
    And I click check box I track stock for this item button
#    And I input minimum stock quantity "50"
#    And I click create product button
#    Then product detail should be appear



