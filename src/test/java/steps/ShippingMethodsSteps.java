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
        InitPdp.pdpSelectShoeNumber();
//        if (getBrand().equals("Schutz")){
//            System.out.println(getBrand());
//            System.out.println(numero);
//            if (numero.equals("35")){
//                InitPdp.pdpSelectShoeNumber();
//            }
//            else {
////                InitPdp.pdpSelectGrade33_4Button();
////                /html/body/div[2]/div[2]/div/div[1]/div[2]/div[10]/ul/li[3]/a/span
//            }
//        }else if(getBrand().equals("Arezzo")){
////            InitPdp.pdpAnacapriSelectGrade39Button();
//            System.out.println(getBrand());
//            System.out.println(numero);
//            if (numero.equals("35")){
//                InitPdp.pdpSelectShoeNumber();
//            }
//        }
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
