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
            System.out.println("ENTROU RETIRE");
            String lblRetireReturn = getText(lblRetirarNaLojaMethodSchutz);
            System.out.println(lblRetireReturn);
            Assert.assertEquals("Retirar na loja".toUpperCase(),lblRetireReturn);
        }else {
            System.out.println("Não ofereceu RETIRAR NA LOJA");
        }
    }

    public void doValidateEntregaPelaLojaShippingMethodSchutz(){
        boolean validate = waitElementPolling(lblEntregaPelaLojaMethodSchutz);
        if (validate){
            System.out.println("ENTROU ENTREGA");
            String lblEntregaReturn = getText(lblEntregaPelaLojaMethodSchutz);
            System.out.println(lblEntregaReturn);
            Assert.assertEquals("Entrega pela loja".toUpperCase(),lblEntregaReturn);
        }else {
            System.out.println("Não ofereceu ENTREGA PELA LOJA");
        }
    }
}
