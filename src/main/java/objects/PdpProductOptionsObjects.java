package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;

public class PdpProductOptionsObjects extends Utils {
    public PdpProductOptionsObjects(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "add-and-go-to-cart-button")
    public static WebElement btnBuyPDPSchutz;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/main/section[2]/section/div/div[3]/div/ul/li[3]/label")
    public static WebElement btnNumber35PDPSelectSchutz;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/div[1]/div[2]/div[14]/form/div[1]/button/span")
    public static WebElement btnBuyPDPArezzo;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/div[1]/div[2]/div[10]/ul/li[3]/a/span")
    public static WebElement btnNumber35PDPSelectArezzo;
}
