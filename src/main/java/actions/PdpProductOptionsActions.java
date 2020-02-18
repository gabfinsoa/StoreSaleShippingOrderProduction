package actions;

import objects.PdpProductOptionsObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PdpProductOptionsActions extends PdpProductOptionsObjects {
    public PdpProductOptionsActions(WebDriver driver) {
        super(driver);
    }

    public void doSelectShoeNumber(String numero){
        WebElement grade = driver.findElement(By.xpath(getShoeNumber(numero)));
        waitElementPolling(grade);
        clickElement(grade);
    }

//    public void doSelectBtnNumber35PDPSelectSchutz(){
////        waitElement(btnNumber35PDPSelectSchutz);
//        waitElementPolling(btnNumber35PDPSelectSchutz);
//        clickElement(btnNumber35PDPSelectSchutz);
//    }
//
//    public void doSelectBtnNumber33PDPSelectSchutz(){
////        waitElement(btnNumber35PDPSelectSchutz);
//        waitElementPolling(btnNumber33PDPSelectSchutz);
//        clickElement(btnNumber33PDPSelectSchutz);
//    }

    public void doClickBtnBuyPdpSchutz(){
        waitElementPolling(btnBuyPDPSchutz); //Create a FluentWait
        clickElement(btnBuyPDPSchutz);
    }

//    public void doSelectBtnNumber35PDPSelectArezzo(){
////        waitElement(btnNumber35PDPSelectSchutz);
//        waitElementPolling(btnNumber35PDPSelectArezzo);
//        clickElement(btnNumber35PDPSelectArezzo);
//    }

    public void doClickBtnBuyPdpArezzo(){
        waitElementPolling(btnBuyPDPArezzo); //Create a FluentWait
        clickElement(btnBuyPDPArezzo);
    }

//    public void doSelectBtnNumber35PDPSelectAnacapri(){
////        waitElement(btnNumber35PDPSelectSchutz);
//        waitElementPolling(btnNumber35PDPSelectAnacapri);
//        clickElement(btnNumber35PDPSelectAnacapri);
//    }

    public void doClickBtnBuyPdpAnacapri(){
        waitElementPolling(btnBuyPDPAnacapri); //Create a FluentWait
        clickElement(btnBuyPDPAnacapri);
    }
}
