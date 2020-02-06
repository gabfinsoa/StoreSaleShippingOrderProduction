package base;

import actions.PdpProductOptionsActions;
import capabilities.Capabilities;

public class InitPdp {

    public static Capabilities caps = new Capabilities();
    static PdpProductOptionsActions pdpActions = new PdpProductOptionsActions(caps.driver);

    public static void pdpSelectShoeNumber(){
        pdpActions.doSelectBtnNumber35PDPSelectSchutz();
    }

    public static void pdpClickBuyButton(){
        pdpActions.doClickBtnBuyPdpSchutz();
    }
}
