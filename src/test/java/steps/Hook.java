package steps;

import capabilities.Capabilities;
import cucumber.api.Scenario;
import cucumber.api.java8.Pt;
import utils.Utils;

//import utils.Browser;


public class Hook /* extends Capabilities */ implements Pt {

    //    static boolean isMobile = Utils.getMode().equals("Mobile");
    static boolean isArezzo = Utils.getBrand().equals("Arezzo");
    //    static boolean isArezzoMobile = isArezzo && isMobile;
    static boolean isAlexandreBirman = Utils.getBrand().equals("AlexandreBirman");
    static boolean isAnacapri = Utils.getBrand().equals("Anacapri");
    //    static boolean isArezzo = Utils.getBrand().equals("Arezzo");
    static boolean isFiever = Utils.getBrand().equals("Fiever");
    static boolean isOutstore = Utils.getBrand().equals("Outstore");
    static boolean isOwme = Utils.getBrand().equals("Owme");
    static boolean isSchutz = Utils.getBrand().equals("Schutz");

    public Hook() {

        Before((Scenario scenario) -> {
            System.setProperty("webdriver.chrome.driver", Utils.webdriverLocation());
            System.out.println("Base URL: " + Utils.getBaseUrl());
            System.out.println("Brand: " + Utils.getBrand());
            System.out.println("Mode: " + Utils.getMode());
            System.out.println("Env: " + Utils.getEnv());
            try {
                Capabilities.loadPage(Utils.getBaseUrl());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });


        After((Scenario scenario) -> {
            System.out.println("---------------------------------------------------------------------------------------------------");
            System.out.println("Cenário teste: " + scenario.getName());
            System.out.println("Status teste: " + scenario.getStatus().toUpperCase());
            System.out.println("---------------------------------------------------------------------------------------------------");
        });


    }
}
