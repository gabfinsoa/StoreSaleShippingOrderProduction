
Feature: Schutz Check Cart
  This feature will check the options in the client cart and checkout pages


#  Scenario Outline: Buy item Full Price as Entrega pela Loja Schutz
  @SchutzCart @SchutzCheckout @SchutzSmoke
  Scenario: Buy item Full Price as Entrega pela Loja Arezzo
    Given I select the number "33"
    And I click the buy button
    When I insert my CEP address
    Then I click on Calculate Shipping
    And I see the Entrega pela Loja method
    And I see the Retire na Loja method

#    Examples:
#    |number|
#    |  35  |
