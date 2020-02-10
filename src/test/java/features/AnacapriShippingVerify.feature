
Feature: Anacapri Check Cart
  This feature will check the options in the client cart and checkout pages

#  @AnacapriFullMethods
#  Scenario Outline: Buy item Full Price as Entrega pela Loja Anacapri
  @AnacapriCart @AnacapriCheckout @AnacapriSmoke
  Scenario: Buy item Full Price as Entrega pela Loja Anacapri
    Given I select the number "35"
    And I click the buy button
    When I insert my CEP address
    Then I click on Calculate Shipping
    And I see the Entrega pela Loja method
    And I see the Retire na Loja method

#    Examples:
#    |number|
#    |  35  |
