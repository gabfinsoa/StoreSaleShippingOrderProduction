$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SchutzShippingVerify.feature");
formatter.feature({
  "line": 2,
  "name": "Schutz Check Cart",
  "description": "This feature will check the options in the client cart and checkout pages",
  "id": "schutz-check-cart",
  "keyword": "Feature"
});
formatter.before({
  "duration": 14530607000,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 6,
      "value": "#  Scenario Outline: Buy item Full Price as Entrega pela Loja Schutz"
    }
  ],
  "line": 8,
  "name": "Buy item Full Price as Entrega pela Loja Arezzo",
  "description": "",
  "id": "schutz-check-cart;buy-item-full-price-as-entrega-pela-loja-arezzo",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@SchutzCart"
    },
    {
      "line": 7,
      "name": "@SchutzCheckout"
    },
    {
      "line": 7,
      "name": "@SchutzSmoke"
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
  "duration": 575034099,
  "status": "passed"
});
formatter.match({
  "location": "ShippingMethodsSteps.iClickTheBuyButton()"
});
formatter.result({
  "duration": 1143059000,
  "status": "passed"
});
formatter.match({
  "location": "ShippingMethodsSteps.iInsertMyCEPAddress()"
});
formatter.result({
  "duration": 1352250000,
  "status": "passed"
});
formatter.match({
  "location": "ShippingMethodsSteps.iClickOnCalculateShipping()"
});
formatter.result({
  "duration": 320234001,
  "status": "passed"
});
formatter.match({
  "location": "ShippingMethodsSteps.iSeeTheEntregaPelaLojaMethod()"
});
formatter.result({
  "duration": 1230581600,
  "error_message": "org.junit.ComparisonFailure: expected:\u003cE[NTREGA PELA LOJA]\u003e but was:\u003cE[XPRESSO]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat actions.CartActions.doValidateEntregaPelaLojaShippingMethodSchutz(CartActions.java:74)\r\n\tat base.InitCart.cartCepValidateEntregaPelaLojaMethod(InitCart.java:70)\r\n\tat steps.ShippingMethodsSteps.iSeeTheEntregaPelaLojaMethod(ShippingMethodsSteps.java:55)\r\n\tat ✽.And I see the Entrega pela Loja method(SchutzShippingVerify.feature:13)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ShippingMethodsSteps.iSeeTheRetireNaLojaMethod()"
});
formatter.result({
  "status": "skipped"
});
});