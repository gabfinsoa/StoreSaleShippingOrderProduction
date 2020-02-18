
Feature: Arezzo Check Cart
  This feature will check the options in the client cart and checkout pages

#  @Run
#  Scenario: Rodar
#  Buy item Full Price as Entrega pela Loja e Retire na Loja Arezzo
#  Buy item Full Price as Entrega pela Loja Arezzo

  @ArezzoCart @Smoke
  Scenario: Buy item Full Price as Entrega pela Loja e Retire na Loja Arezzo
    Given I select the number "39"
    And I click the buy button
    When I insert my CEP address
    Then I click on Calculate Shipping
    And I see the Entrega pela Loja method
    And I see the Retire na Loja method


  @ArezzoCartEntrega @Smoke
  Scenario: Buy item Full Price as Entrega pela Loja Arezzo
    Given I select the number "35"
    And I click the buy button
    When I insert my CEP address
    Then I click on Calculate Shipping
    And I see the Entrega pela Loja method


  @ArezzoCartRetire
  Scenario: Buy item Full Price as Retire na Loja Arezzo
    Given I select the number "35"
    And I click the buy button
    When I insert my CEP address
    Then I click on Calculate Shipping
    And I see the Retire na Loja method


  @ArezzoCheckout
  Scenario: Buy item Full Price as Entrega pela Loja Arezzo
    Given I select the number "35"
    And I click the buy button
    When I insert my CEP address
    Then I click on Calculate Shipping
    And I see the Entrega pela Loja method
    And I see the Retire na Loja method


  @ArezzoCheckoutEntrega
  Scenario: Buy item Full Price as Entrega pela Loja Arezzo
    Given I select the number "35"
    And I click the buy button
    When I insert my CEP address
    Then I click on Calculate Shipping
    And I see the Entrega pela Loja method
    And I see the Retire na Loja method


  @ArezzoCheckoutRetire
  Scenario: Buy item Full Price as Entrega pela Loja Arezzo
    Given I select the number "35"
    And I click the buy button
    When I insert my CEP address
    Then I click on Calculate Shipping
    And I see the Entrega pela Loja method
    And I see the Retire na Loja method
