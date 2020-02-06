$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SchutzShippingVerify.feature");
formatter.feature({
  "line": 2,
  "name": "Schutz Check Cart",
  "description": "This feature will check the options in the client cart and checkout pages",
  "id": "schutz-check-cart",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Buy item Full Price as Entrega pela Loja Arezzo",
  "description": "",
  "id": "schutz-check-cart;buy-item-full-price-as-entrega-pela-loja-arezzo",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@SchutzFullMethods"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 7,
      "value": "#  Scenario: Buy item Full Price as Entrega pela Loja Arezzo"
    }
  ],
  "line": 8,
  "name": "I select the number \"35\"",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I click the buy button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I insert my CEP address",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I click on Calculate Shipping",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I see the Entrega pela Loja method",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I see the Retire na Loja method",
  "keyword": "And "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "schutz-check-cart;buy-item-full-price-as-entrega-pela-loja-arezzo;",
  "rows": [
    {
      "cells": [
        "number"
      ],
      "line": 16,
      "id": "schutz-check-cart;buy-item-full-price-as-entrega-pela-loja-arezzo;;1"
    },
    {
      "cells": [
        "35"
      ],
      "line": 17,
      "id": "schutz-check-cart;buy-item-full-price-as-entrega-pela-loja-arezzo;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 21040582300,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Buy item Full Price as Entrega pela Loja Arezzo",
  "description": "",
  "id": "schutz-check-cart;buy-item-full-price-as-entrega-pela-loja-arezzo;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@SchutzFullMethods"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 7,
      "value": "#  Scenario: Buy item Full Price as Entrega pela Loja Arezzo"
    }
  ],
  "line": 8,
  "name": "I select the number \"35\"",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I click the buy button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I insert my CEP address",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I click on Calculate Shipping",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I see the Entrega pela Loja method",
  "keyword": "And "
});
formatter.step({
  "line": 13,
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
  "duration": 809212700,
  "status": "passed"
});
formatter.match({
  "location": "ShippingMethodsSteps.iClickTheBuyButton()"
});
formatter.result({
  "duration": 1764237500,
  "status": "passed"
});
formatter.match({
  "location": "ShippingMethodsSteps.iInsertMyCEPAddress()"
});
formatter.result({
  "duration": 1629762600,
  "status": "passed"
});
formatter.match({
  "location": "ShippingMethodsSteps.iClickOnCalculateShipping()"
});
formatter.result({
  "duration": 367538600,
  "status": "passed"
});
formatter.match({
  "location": "ShippingMethodsSteps.iSeeTheEntregaPelaLojaMethod()"
});
formatter.result({
  "duration": 1312027200,
  "status": "passed"
});
formatter.match({
  "location": "ShippingMethodsSteps.iSeeTheRetireNaLojaMethod()"
});
formatter.result({
  "duration": 141516700,
  "status": "passed"
});
});