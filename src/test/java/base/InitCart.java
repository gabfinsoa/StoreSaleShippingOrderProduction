package base;

import actions.CartActions;
import actions.PdpProductOptionsActions;
import capabilities.Capabilities;

public class InitCart {

    public static Capabilities caps = new Capabilities();
    static CartActions cartActions = new CartActions(caps.driver);

    public static void cartCepNumberInsert(){
        cartActions.doClearCepFieldSchutz();
        cartActions.doSendKeysCepFieldSchutz();
    }

    public static void cartCepConsult(){
        cartActions.doCepConsultCartSchutz();
    }

    public static void cartCepValidateRetireNaLojaMethod(){
        cartActions.doValidateRetirarNaLojaShippingMethodSchutz();
    }

    public static void cartCepValidateEntregaPelaLojaMethod(){
        cartActions.doValidateEntregaPelaLojaShippingMethodSchutz();
    }


}
