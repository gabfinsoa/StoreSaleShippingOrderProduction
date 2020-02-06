package actions;

import objects.aObjects;
import org.openqa.selenium.WebDriver;

public class aActions extends aObjects {
    public aActions(WebDriver driver) {
        super(driver);
    }

    public void doClickBuy(){
        clickElement(btnComprar);
    }
}
