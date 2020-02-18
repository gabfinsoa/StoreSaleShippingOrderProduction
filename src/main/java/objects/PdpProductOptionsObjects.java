package objects;

import com.google.gson.Gson;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

public class PdpProductOptionsObjects extends Utils {
    public PdpProductOptionsObjects(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public static String getShoeNumber(String numero) {
        StringBuilder fileName = new StringBuilder();
        fileName.append("src/test/resources/shoesNumberSelect.json");
        String jsonBaseUrl = "";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName.toString()))) {
            Gson gson = new Gson();
            Map<String, Object> element = gson.fromJson(bufferedReader, Map.class);
            jsonBaseUrl = ((Map<String, String>)((Map<String, Object>)element.get(getBrand())).get(getEnv())).get(numero);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonBaseUrl;
    }

    @FindBy(id = "btn-add-to-cart")
    public static WebElement btnBuyPDPAnacapri;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/div[1]/div[2]/div[14]/form/div[1]/button/span")
    public static WebElement btnBuyPDPArezzo;

    @FindBy(id = "add-and-go-to-cart-button")
    public static WebElement btnBuyPDPSchutz;



//    @FindBy(xpath = "/html/body/div[2]/div[2]/div/main/section[2]/section/div/div[3]/div/ul/li[3]/label")
//    public static WebElement btnNumber35PDPSelectSchutz;
//
//    @FindBy(xpath = "/html/body/div[2]/div[2]/div/main/section[2]/section/div/div[3]/div/ul/li[1]/label")
//    public static WebElement btnNumber33PDPSelectSchutz;
//
//    @FindBy(xpath = "/html/body/div[2]/div[2]/div/div[1]/div[2]/div[10]/ul/li[3]/a/span")
//    public static WebElement btnNumber35PDPSelectArezzo;
//
//    @FindBy(xpath = "/html/body/div[5]/div[2]/div[1]/div[2]/form/div[1]/div[1]/div/ul/li[3]/label")
//    public static WebElement btnNumber35PDPSelectAnacapri;




}
