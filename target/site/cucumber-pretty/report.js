$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ArezzoShippingVerify.feature");
formatter.feature({
  "line": 2,
  "name": "Arezzo Check Cart",
  "description": "This feature will check the options in the client cart and checkout pages",
  "id": "arezzo-check-cart",
  "keyword": "Feature"
});
formatter.before({
  "duration": 17392242500,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 5,
      "value": "#  @ArezzoFullMethods"
    },
    {
      "line": 6,
      "value": "#  Scenario Outline: Buy item Full Price as Entrega pela Loja Arezzo"
    }
  ],
  "line": 8,
  "name": "Buy item Full Price as Entrega pela Loja Arezzo",
  "description": "",
  "id": "arezzo-check-cart;buy-item-full-price-as-entrega-pela-loja-arezzo",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@ArezzoCart"
    },
    {
      "line": 7,
      "name": "@ArezzoCheckout"
    },
    {
      "line": 7,
      "name": "@ArezzoSmoke"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I select the number \"35\"",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I click the buy button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I insert my CEP address",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I click on Calculate Shipping",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I see the Entrega pela Loja method",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I see the Retire na Loja method",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "35",
      "offset": 21
    }
  ],
  "location": "ShippingMethodsSteps.iSelectTheNumber(String)"
});
formatter.result({
  "duration": 605565400,
  "status": "passed"
});
formatter.match({
  "location": "ShippingMethodsSteps.iClickTheBuyButton()"
});
formatter.result({
  "duration": 3677451400,
  "status": "passed"
});
formatter.match({
  "location": "ShippingMethodsSteps.iInsertMyCEPAddress()"
});
formatter.result({
  "duration": 1234404300,
  "status": "passed"
});
formatter.match({
  "location": "ShippingMethodsSteps.iClickOnCalculateShipping()"
});
formatter.result({
  "duration": 377003300,
  "status": "passed"
});
formatter.match({
  "location": "ShippingMethodsSteps.iSeeTheEntregaPelaLojaMethod()"
});
formatter.result({
  "duration": 1370923500,
  "status": "passed"
});
formatter.match({
  "location": "ShippingMethodsSteps.iSeeTheRetireNaLojaMethod()"
});
formatter.result({
  "duration": 152398800,
  "status": "passed"
});
});