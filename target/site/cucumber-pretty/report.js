$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AnacapriShippingVerify.feature");
formatter.feature({
  "line": 2,
  "name": "Arezzo Check Cart",
  "description": "This feature will check the options in the client cart and checkout pages",
  "id": "arezzo-check-cart",
  "keyword": "Feature"
});
formatter.before({
  "duration": 30817285300,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 5,
      "value": "#  @AnacapriFullMethods"
    },
    {
      "line": 6,
      "value": "#  Scenario Outline: Buy item Full Price as Entrega pela Loja Anacapri"
    }
  ],
  "line": 8,
  "name": "Buy item Full Price as Entrega pela Loja Anacapri",
  "description": "",
  "id": "arezzo-check-cart;buy-item-full-price-as-entrega-pela-loja-anacapri",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@AnacapriFullMethods"
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
  "duration": 468972000,
  "status": "passed"
});
formatter.match({
  "location": "ShippingMethodsSteps.iClickTheBuyButton()"
});
formatter.result({
  "duration": 1219319800,
  "status": "passed"
});
formatter.match({
  "location": "ShippingMethodsSteps.iInsertMyCEPAddress()"
});
formatter.result({
  "duration": 1511809500,
  "status": "passed"
});
formatter.match({
  "location": "ShippingMethodsSteps.iClickOnCalculateShipping()"
});
formatter.result({
  "duration": 3400240000,
  "status": "passed"
});
formatter.match({
  "location": "ShippingMethodsSteps.iSeeTheEntregaPelaLojaMethod()"
});
formatter.result({
  "duration": 1145362900,
  "status": "passed"
});
formatter.match({
  "location": "ShippingMethodsSteps.iSeeTheRetireNaLojaMethod()"
});
formatter.result({
  "duration": 120624900,
  "status": "passed"
});
});