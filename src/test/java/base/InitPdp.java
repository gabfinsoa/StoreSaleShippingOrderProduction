package base;

import actions.PdpProductOptionsActions;
import capabilities.Capabilities;

import static utils.Utils.getBrand;
import static utils.Utils.getEnv;

public class InitPdp {

    public static Capabilities caps = new Capabilities();
    static PdpProductOptionsActions pdpActions = new PdpProductOptionsActions(caps.driver);

    public static void pdpSelectShoeNumber(String numero){
        String brand = getBrand();
        String env = getEnv();
        switch (brand){
            case "Arezzo":
//                pdpActions.doSelectBtnNumber35PDPSelectArezzo();
                pdpActions.doSelectShoeNumber(numero);
                break;
            case "Schutz":
//                pdpActions.doSelectBtnNumber33PDPSelectSchutz();
                pdpActions.doSelectShoeNumber(numero);
                break;
            case "Anacapri":
//                pdpActions.doSelectBtnNumber35PDPSelectAnacapri();
                pdpActions.doSelectShoeNumber(numero);
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
