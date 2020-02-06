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
}
