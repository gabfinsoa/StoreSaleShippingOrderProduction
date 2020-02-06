package actions;

import objects.PdpProductOptionsObjects;
import org.openqa.selenium.WebDriver;

public class PdpProductOptionsActions extends PdpProductOptionsObjects {
    public PdpProductOptionsActions(WebDriver driver) {
        super(driver);
    }

    public void doSelectBtnNumber35PDPSelectSchutz(){
//        waitElement(btnNumber35PDPSelectSchutz);
        waitElementPolling(btnNumber35PDPSelectSchutz);
        clickElement(btnNumber35PDPSelectSchutz);
    }

    public void doClickBtnBuyPdpSchutz(){
        waitElementPolling(btnBuyPDPSchutz); //Create a FluentWait
        clickElement(btnBuyPDPSchutz);
    }

    public void doSelectBtnNumber35PDPSelectArezzo(){
//        waitElement(btnNumber35PDPSelectSchutz);
        waitElementPolling(btnNumber35PDPSelectArezzo);
        clickElement(btnNumber35PDPSelectArezzo);
    }

    public void doClickBtnBuyPdpArezzo(){
        waitElementPolling(btnBuyPDPArezzo); //Create a FluentWait
        clickElement(btnBuyPDPArezzo);
    }

    public void doSelectBtnNumber35PDPSelectAnacapri(){
//        waitElement(btnNumber35PDPSelectSchutz);
        waitElementPolling(btnNumber35PDPSelectAnacapri);
        clickElement(btnNumber35PDPSelectAnacapri);
    }

    public void doClickBtnBuyPdpAnacapri(){
        waitElementPolling(btnBuyPDPAnacapri); //Create a FluentWait
        clickElement(btnBuyPDPAnacapri);
    }
}
