package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;

public class CartObjects extends Utils {
    public CartObjects(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "zipCodeInput")
    public WebElement txtCepFieldCartSchutz;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[1]/div/div[1]/div[1]/div[2]/div/div[1]/div[2]/div[1]/div[2]/div[2]/button")
    public WebElement btnCepConsultCartSchutz;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[1]/div/div[1]/div[1]/div[2]/div/div[1]/div[2]/div[3]/div/p[1]/strong[1]")
    public WebElement lblRetirarNaLojaMethodSchutz;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[1]/div/div[1]/div[1]/div[2]/div/div[1]/div[2]/div[3]/div/p[2]/strong")
    public WebElement lblEntregaPelaLojaMethodSchutz;

    @FindBy(id = "postalCode")
    public WebElement txtCepFieldCartArezzo;

    @FindBy(xpath = "/html/body/main/section[1]/section[2]/div/table/tbody/tr[2]/td[2]/form/div/button")
    public WebElement btnCepConsultCartArezzo;

    @FindBy(xpath = "/html/body/main/section[1]/section[2]/div/table/tbody/tr[2]/td[2]/div/p[1]")
    public WebElement lblRetirarNaLojaMethodArezzo;

    @FindBy(xpath = "/html/body/main/section[1]/section[2]/div/table/tbody/tr[2]/td[2]/div/p[2]")
    public WebElement lblEntregaPelaLojaMethodArezzo;

    @FindBy(id = "zipcode-ipt")
    public WebElement txtCepFieldCartAnacapri;

    @FindBy(xpath = "/html/body/div[5]/section/div[1]/section[2]/div/div[1]/ul/li[2]/div[1]/div[2]/div/a")
    public WebElement btnCepConsultCartAnacapri;

    @FindBy(css = ".pr:nth-child(1)")
    public WebElement lblRetirarNaLojaMethodAnacapri;

    @FindBy(xpath = "/html/body/div[5]/section/div[1]/section[2]/div/div[1]/ul/li[2]/div[2]/p[2]")
    public WebElement lblEntregaPelaLojaMethodAnacapri;

}
