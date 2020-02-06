package base;

import actions.CartActions;
import actions.PdpProductOptionsActions;
import capabilities.Capabilities;

import static utils.Utils.getBrand;

public class InitCart {

    public static Capabilities caps = new Capabilities();
    static CartActions cartActions = new CartActions(caps.driver);

    public static void cartCepNumberInsert(){
        String brand = getBrand();
        switch (brand){
            case "Arezzo":
                cartActions.doClearCepFieldArezzo();
                cartActions.doSendKeysCepFieldArezzo();
                break;
            case "Schutz":
                cartActions.doClearCepFieldSchutz();
                cartActions.doSendKeysCepFieldSchutz();
                break;
            case "Anacapri":
                System.out.println("Fazer Anacapri!");
                break;
        }
    }

    public static void cartCepConsult(){
        String brand = getBrand();
        switch (brand){
            case "Arezzo":
                cartActions.doCepConsultCartArezzo();
                break;
            case "Schutz":
                cartActions.doCepConsultCartSchutz();
                break;
            case "Anacapri":
                System.out.println("Fazer Anacapri!");
                break;
        }

    }

    public static void cartCepValidateRetireNaLojaMethod(){
        String brand = getBrand();
        switch (brand){
            case "Arezzo":
                cartActions.doValidateRetirarNaLojaShippingMethodArezzo();
                break;
            case "Schutz":
                cartActions.doValidateRetirarNaLojaShippingMethodSchutz();
                break;
            case "Anacapri":
                System.out.println("Fazer Anacapri");
        }

    }

    public static void cartCepValidateEntregaPelaLojaMethod(){
        String brand = getBrand();
        switch (brand){
            case "Arezzo":
                cartActions.doValidateEntregaPelaLojaShippingMethodArezzo();
                break;
            case "Schutz":
                cartActions.doValidateEntregaPelaLojaShippingMethodSchutz();
                break;
            case "Anacapri":
                System.out.println("Fazer Anacapri");
        }

    }


}
