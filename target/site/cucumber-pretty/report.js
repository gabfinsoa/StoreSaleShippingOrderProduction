$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AnacapriShippingVerify.feature");
formatter.feature({
  "line": 2,
  "name": "Anacapri Check Cart",
  "description": "This feature will check the options in the client cart and checkout pages",
  "id": "anacapri-check-cart",
  "keyword": "Feature"
});
formatter.before({
  "duration": 17389231400,
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
  "id": "anacapri-check-cart;buy-item-full-price-as-entrega-pela-loja-anacapri",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@AnacapriCart"
    },
    {
      "line": 7,
      "name": "@AnacapriCheckout"
    },
    {
      "line": 7,
      "name": "@AnacapriSmoke"
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
  "duration": 547918600,
  "status": "passed"
});
formatter.match({
  "location": "ShippingMethodsSteps.iClickTheBuyButton()"
});
formatter.result({
  "duration": 267430000,
  "status": "passed"
});
formatter.match({
  "location": "ShippingMethodsSteps.iInsertMyCEPAddress()"
});
formatter.result({
  "duration": 4510981000,
  "status": "passed"
});
formatter.match({
  "location": "ShippingMethodsSteps.iClickOnCalculateShipping()"
});
formatter.result({
  "duration": 1264910400,
  "status": "passed"
});
formatter.match({
  "location": "ShippingMethodsSteps.iSeeTheEntregaPelaLojaMethod()"
});
formatter.result({
  "duration": 1242389700,
  "status": "passed"
});
formatter.match({
  "location": "ShippingMethodsSteps.iSeeTheRetireNaLojaMethod()"
});
formatter.result({
  "duration": 107002400,
  "status": "passed"
});
formatter.after({
  "duration": 272300,
  "status": "passed"
});
});