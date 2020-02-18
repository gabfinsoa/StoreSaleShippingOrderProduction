package steps;

import base.InitCart;
import base.InitPdp;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static utils.Utils.getBrand;

public class ShippingMethodsSteps {

    @Given("^I select the number \"([^\"]*)\"$")
    public void iSelectTheNumber(String numero) throws Throwable {
        InitPdp.pdpSelectShoeNumber(numero);

    }

    @And("^I click the buy button$")
    public void iClickTheBuyButton() {
        InitPdp.pdpClickBuyButton();
    }

    @When("^I insert my CEP address$")
    public void iInsertMyCEPAddress() {
        InitCart.cartCepNumberInsert();
    }

    @Then("^I click on Calculate Shipping$")
    public void iClickOnCalculateShipping() {
        InitCart.cartCepConsult();
    }


    @And("^I see the Entrega pela Loja method$")
    public void iSeeTheEntregaPelaLojaMethod() {
        InitCart.cartCepValidateEntregaPelaLojaMethod();
    }

    @And("^I see the Retire na Loja method$")
    public void iSeeTheRetireNaLojaMethod() {
        InitCart.cartCepValidateRetireNaLojaMethod();
    }
}
