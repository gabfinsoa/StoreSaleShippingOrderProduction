package actions;

import objects.CartObjects;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CartActions extends CartObjects {
    public CartActions(WebDriver driver) {
        super(driver);
    }

    public void doClearCepFieldSchutz(){
        waitElementPolling(txtCepFieldCartSchutz);
        clearElement(txtCepFieldCartSchutz);
    }

    public void doSendKeysCepFieldSchutz(){
        waitElementPolling(txtCepFieldCartSchutz);
        sendKeysElement(txtCepFieldCartSchutz,"05402-600");
    }

    public void doCepConsultCartSchutz(){
        waitElementPolling(btnCepConsultCartSchutz);
        clickElement(btnCepConsultCartSchutz);
    }

    public void doValidateRetirarNaLojaShippingMethodSchutz(){
        boolean validate = waitElementPolling(lblRetirarNaLojaMethodSchutz);
        if (validate){
            System.out.println("ENTROU RETIRE SCH");
            String lblRetireReturn = getText(lblRetirarNaLojaMethodSchutz);
            System.out.println(lblRetireReturn);
            Assert.assertEquals("Retirar na loja".toUpperCase(),lblRetireReturn);
        }else {
            System.out.println("Não ofereceu RETIRAR NA LOJA SCH");
        }
    }

    public void doValidateEntregaPelaLojaShippingMethodSchutz(){
        boolean validate = waitElementPolling(lblEntregaPelaLojaMethodSchutz);
        if (validate){
            System.out.println("ENTROU ENTREGA SCH");
            String lblEntregaReturn = getText(lblEntregaPelaLojaMethodSchutz);
            System.out.println(lblEntregaReturn);
            Assert.assertEquals("Entrega pela loja".toUpperCase(),lblEntregaReturn);
        }else {
            System.out.println("Não ofereceu ENTREGA PELA LOJA SCH");
        }
    }

    public void doClearCepFieldArezzo(){
        waitElementPolling(txtCepFieldCartArezzo);
        clearElement(txtCepFieldCartArezzo);
    }

    public void doSendKeysCepFieldArezzo(){
        waitElementPolling(txtCepFieldCartArezzo);
        sendKeysElement(txtCepFieldCartArezzo,"05402-600");
    }

    public void doCepConsultCartArezzo(){
        waitElementPolling(btnCepConsultCartArezzo);
        clickElement(btnCepConsultCartArezzo);
    }

    public void doValidateRetirarNaLojaShippingMethodArezzo(){
        boolean validate = waitElementPolling(lblRetirarNaLojaMethodArezzo);
        if (validate){
            System.out.println("ENTROU RETIRE ARZZ");
            String lblRetireReturn = getText(lblRetirarNaLojaMethodArezzo);
            System.out.println(lblRetireReturn);
            String retireShippingMethodLabelReturn = lblRetireReturn.replace(" - 1 dia útil- GRÁTIS","");
            Assert.assertEquals("Retirar na loja",retireShippingMethodLabelReturn);
        }else {
            System.out.println("Não ofereceu RETIRAR NA LOJA");
        }
    }

    public void doValidateEntregaPelaLojaShippingMethodArezzo(){
        boolean validate = waitElementPolling(lblEntregaPelaLojaMethodArezzo);
        if (validate){
            System.out.println("ENTROU ENTREGA ARZZ");
            String lblEntregaReturn = getText(lblEntregaPelaLojaMethodArezzo);
            System.out.println(lblEntregaReturn);
            String entregaShippingMethodLabelReturn = lblEntregaReturn.replace(" - 1 dia útil - R$ 9,90","");
            Assert.assertEquals("Entrega pela loja",entregaShippingMethodLabelReturn);
        }else {
            System.out.println("Não ofereceu ENTREGA PELA LOJA");
        }
    }


    public void doClearCepFieldAnacapri(){
        waitElementPolling(txtCepFieldCartAnacapri);
        clearElement(txtCepFieldCartAnacapri);
    }

    public void doSendKeysCepFieldAnacapri(){
        waitElementPolling(txtCepFieldCartAnacapri);
        sendKeysElement(txtCepFieldCartAnacapri,"05402-600");
    }

    public void doCepConsultCartAnacapri(){
        waitElementPolling(btnCepConsultCartAnacapri);
        clickElement(btnCepConsultCartAnacapri);
    }

    public void doValidateRetirarNaLojaShippingMethodAnacapri(){
        boolean validate = waitElementPolling(lblRetirarNaLojaMethodAnacapri);
        if (validate){
            System.out.println("ENTROU RETIRE ANA");
            String lblRetireReturn = getText(lblRetirarNaLojaMethodAnacapri);
            System.out.println(lblRetireReturn);
            String retireShippingMethodLabelReturn1 = lblRetireReturn.replace("GRÁTIS - 1 dia útil - ","");
            String retireShippingMethodLabelReturn2 = retireShippingMethodLabelReturn1.replace(" ?","");
            Assert.assertEquals("Retirar na loja",retireShippingMethodLabelReturn2);
        }else {
            System.out.println("Não ofereceu RETIRAR NA LOJA ANA");
        }
    }

    public void doValidateEntregaPelaLojaShippingMethodAnacapri(){
        boolean validate = waitElementPolling(lblEntregaPelaLojaMethodAnacapri);
        if (validate){
            System.out.println("ENTROU ENTREGA ANA");
            String lblEntregaReturn = getText(lblEntregaPelaLojaMethodAnacapri);
            System.out.println(lblEntregaReturn);
            String entregaShippingMethodLabelReturn1 = lblEntregaReturn.replace("R$ 9,90 - 1 dia útil - ","");
            String entregaShippingMethodLabelReturn2 = entregaShippingMethodLabelReturn1.replace(" ?","");
            Assert.assertEquals("Entrega pela loja",entregaShippingMethodLabelReturn2);
        }else {
            System.out.println("Não ofereceu ENTREGA PELA LOJA ANA");
        }
    }

}
