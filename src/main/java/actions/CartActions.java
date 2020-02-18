package actions;

import objects.CartObjects;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.time.DayOfWeek;
import java.time.LocalDate;

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
        sendKeysElement(txtCepFieldCartSchutz,getCep("StoreSale"));
    }

    public void doCepConsultCartSchutz(){
        waitElementPolling(btnCepConsultCartSchutz);
        clickElement(btnCepConsultCartSchutz);
    }

    public void doValidateRetirarNaLojaShippingMethodSchutz(){
        boolean validate = waitElementPolling(lblRetirarNaLojaMethodSchutz);
        if (validate){
            System.out.println("ENTROU RETIRE SCH");

            LocalDate fullDate = LocalDate.now();
            DayOfWeek dayDate = fullDate.getDayOfWeek();

            if (dayDate.equals(DayOfWeek.FRIDAY) || dayDate.equals(DayOfWeek.SATURDAY) || dayDate.equals(DayOfWeek.SUNDAY)){
                System.out.println("É SEXTA");
                String lblRetireReturn = getText(lblRetirarNaLojaMethodSchutz);
                System.out.println(lblRetireReturn);
                Assert.assertEquals("Retirar na loja".toUpperCase(),lblRetireReturn);
            }else {
                String lblRetireReturn = getText(lblRetirarNaLojaMethodSchutz);
                System.out.println(lblRetireReturn);
                Assert.assertEquals("Retirar na loja".toUpperCase(),lblRetireReturn);
            }

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

            LocalDate fullDate = LocalDate.now();
            DayOfWeek dayDate = fullDate.getDayOfWeek();

            if (dayDate.equals(DayOfWeek.FRIDAY) || dayDate.equals(DayOfWeek.SATURDAY) || dayDate.equals(DayOfWeek.SUNDAY)){
                System.out.println("É SEXTA");
                String lblEntregaReturn = getText(lblEntregaPelaLojaMethodSchutz);
                System.out.println(lblEntregaReturn);
                Assert.assertEquals("Entrega pela loja".toUpperCase(),lblEntregaReturn);
            }else {
                String lblEntregaReturn = getText(lblEntregaPelaLojaMethodSchutz);
                System.out.println(lblEntregaReturn);
                Assert.assertEquals("Entrega pela loja".toUpperCase(),lblEntregaReturn);
            }
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
        sendKeysElement(txtCepFieldCartArezzo,getCep("StoreSale"));
    }

    public void doCepConsultCartArezzo(){
        waitElementPolling(btnCepConsultCartArezzo);
        clickElement(btnCepConsultCartArezzo);
    }

    public void doValidateRetirarNaLojaShippingMethodArezzo(){
        boolean validate = waitElementPolling(lblRetirarNaLojaMethodArezzo);
        if (validate){
            System.out.println("ENTROU RETIRE ARZZ");

            LocalDate fullDate = LocalDate.now();
            DayOfWeek dayDate = fullDate.getDayOfWeek();

            if (dayDate.equals(DayOfWeek.FRIDAY) || dayDate.equals(DayOfWeek.SATURDAY) || dayDate.equals(DayOfWeek.SUNDAY)){
                String lblRetireReturn = getText(lblRetirarNaLojaMethodArezzo);
                System.out.println(lblRetireReturn);
                String retireShippingMethodLabelReturn1 = lblRetireReturn.replace(" - 2 dias úteis- GRÁTIS","");
                String retireShippingMethodLabelReturn2 = retireShippingMethodLabelReturn1.replace(" ?","");
                Assert.assertEquals("Retirar na loja",retireShippingMethodLabelReturn2);
            } else {
                String lblRetireReturn = getText(lblRetirarNaLojaMethodArezzo);
                System.out.println(lblRetireReturn);
                String retireShippingMethodLabelReturn1 = lblRetireReturn.replace(" - 1 dia útil- GRÁTIS","");
                String retireShippingMethodLabelReturn2 = retireShippingMethodLabelReturn1.replace(" ?","");
                Assert.assertEquals("Retirar na loja",retireShippingMethodLabelReturn2);
            }

        }else {
            System.out.println("Não ofereceu RETIRAR NA LOJA");
        }
    }

    public void doValidateEntregaPelaLojaShippingMethodArezzo(){
        boolean validate = waitElementPolling(lblEntregaPelaLojaMethodArezzo);
        if (validate){
            System.out.println("ENTROU ENTREGA ARZZ");

            LocalDate fullDate = LocalDate.now();
            DayOfWeek dayDate = fullDate.getDayOfWeek();

            if (dayDate.equals(DayOfWeek.FRIDAY) || dayDate.equals(DayOfWeek.SATURDAY) || dayDate.equals(DayOfWeek.SUNDAY)){
                System.out.println("É SEXTA");
                String lblEntregaReturn = getText(lblEntregaPelaLojaMethodArezzo);
                System.out.println(lblEntregaReturn);
                String entregaShippingMethodLabelReturn1 = lblEntregaReturn.replace(" - 2 dias úteis - R$ 9,90","");
                String entregaShippingMethodLabelReturn2 = entregaShippingMethodLabelReturn1.replace(" ?","");
                Assert.assertEquals("Entrega pela loja",entregaShippingMethodLabelReturn2);
            }else {
                String lblEntregaReturn = getText(lblEntregaPelaLojaMethodArezzo);
                System.out.println(lblEntregaReturn);
                String entregaShippingMethodLabelReturn1 = lblEntregaReturn.replace(" - 1 dia útil - R$ 9,90","");
                String entregaShippingMethodLabelReturn2 = entregaShippingMethodLabelReturn1.replace(" ?","");
                Assert.assertEquals("Entrega pela loja",entregaShippingMethodLabelReturn2);
            }
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
        sendKeysElement(txtCepFieldCartAnacapri,getCep("StoreSale"));
    }

    public void doCepConsultCartAnacapri(){
        waitElementPolling(btnCepConsultCartAnacapri);
        clickElement(btnCepConsultCartAnacapri);
    }

    public void doValidateRetirarNaLojaShippingMethodAnacapri(){
        boolean validate = waitElementPolling(lblRetirarNaLojaMethodAnacapri);
        if (validate){
            System.out.println("ENTROU RETIRE ANA");

            LocalDate fullDate = LocalDate.now();
            DayOfWeek dayDate = fullDate.getDayOfWeek();

            if (dayDate.equals(DayOfWeek.FRIDAY) || dayDate.equals(DayOfWeek.SATURDAY) || dayDate.equals(DayOfWeek.SUNDAY)){
                String lblRetireReturn = getText(lblRetirarNaLojaMethodAnacapri);
                System.out.println(lblRetireReturn);
                String retireShippingMethodLabelReturn1 = lblRetireReturn.replace("R$ 9,90 - 2 dias úteis - ","");
                String retireShippingMethodLabelReturn2 = retireShippingMethodLabelReturn1.replace(" ?","");
                Assert.assertEquals("Retirar na loja",retireShippingMethodLabelReturn2);
            } else {
                String lblRetireReturn = getText(lblRetirarNaLojaMethodAnacapri);
                System.out.println(lblRetireReturn);
                String retireShippingMethodLabelReturn1 = lblRetireReturn.replace("GRÁTIS - 1 dia útil - ","");
                String retireShippingMethodLabelReturn2 = retireShippingMethodLabelReturn1.replace(" ?","");
                Assert.assertEquals("Retirar na loja",retireShippingMethodLabelReturn2);
            }


        }else {
            System.out.println("Não ofereceu RETIRAR NA LOJA ANA");
        }
    }

    public void doValidateEntregaPelaLojaShippingMethodAnacapri(){
        boolean validate = waitElementPolling(lblEntregaPelaLojaMethodAnacapri);
        if (validate){
            System.out.println("ENTROU ENTREGA ANA");

            LocalDate fullDate = LocalDate.now();
            DayOfWeek dayDate = fullDate.getDayOfWeek();

            if (dayDate.equals(DayOfWeek.FRIDAY) || dayDate.equals(DayOfWeek.SATURDAY) || dayDate.equals(DayOfWeek.SUNDAY)){
                System.out.println("É SEXTA");
                String lblEntregaReturn = getText(lblEntregaPelaLojaMethodAnacapri);
                System.out.println(lblEntregaReturn);
                String entregaShippingMethodLabelReturn1 = lblEntregaReturn.replace("R$ 9,90 - 2 dias úteis - ","");
                String entregaShippingMethodLabelReturn2 = entregaShippingMethodLabelReturn1.replace(" ?","");
                Assert.assertEquals("Entrega pela loja",entregaShippingMethodLabelReturn2);
            }else {
                String lblEntregaReturn = getText(lblEntregaPelaLojaMethodAnacapri);
                System.out.println(lblEntregaReturn);
                String entregaShippingMethodLabelReturn1 = lblEntregaReturn.replace("R$ 9,90 - 1 dia útil - ","");
                String entregaShippingMethodLabelReturn2 = entregaShippingMethodLabelReturn1.replace(" ?","");
                Assert.assertEquals("Entrega pela loja",entregaShippingMethodLabelReturn2);
            }
        }else {
            System.out.println("Não ofereceu ENTREGA PELA LOJA ANA");
        }
    }

}
