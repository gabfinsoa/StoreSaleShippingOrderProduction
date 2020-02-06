package base;

import actions.PdpProductOptionsActions;
import capabilities.Capabilities;

import static utils.Utils.getBrand;

public class InitPdp {

    public static Capabilities caps = new Capabilities();
    static PdpProductOptionsActions pdpActions = new PdpProductOptionsActions(caps.driver);

    public static void pdpSelectShoeNumber(){
        String brand = getBrand();
        switch (brand){
            case "Arezzo":
                pdpActions.doSelectBtnNumber35PDPSelectArezzo();
                break;
            case "Schutz":
                pdpActions.doSelectBtnNumber35PDPSelectSchutz();
                break;
            case "Anacapri":
                pdpActions.doSelectBtnNumber35PDPSelectAnacapri();
                break;
        }
//        pdpActions.doSelectBtnNumber35PDPSelectSchutz();
    }

    public static void pdpClickBuyButton(){
        String brand = getBrand();
        switch (brand){
            case "Arezzo":
                pdpActions.doClickBtnBuyPdpArezzo();
                break;
            case "Schutz":
                pdpActions.doClickBtnBuyPdpSchutz();
                break;
            case "Anacapri":
                pdpActions.doClickBtnBuyPdpAnacapri();
                break;
        }
//        pdpActions.doClickBtnBuyPdpSchutz();
    }
}
