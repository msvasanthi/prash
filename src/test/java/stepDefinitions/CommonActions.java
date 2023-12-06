package stepDefinitions;

import driverManagement.DriverManager;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utilities.ConfigReader;

import java.io.IOException;
import java.util.Properties;

public class CommonActions {
    private DriverManager driverManager;
    private ConfigReader configReader;
    private WebDriver driver;
    private Properties properties;


    @Before(order =0 )
    public void readProperties() throws IOException, IOException {

        configReader=new ConfigReader();
        properties=configReader.loadproperties();

    }



    @Before(order=1)
    public void beforeEveryScenario() throws InterruptedException {

        driverManager=new DriverManager();
        driver= driverManager.initBrower((String) properties.get("browser"));


    }




//    @After
//    public void afterEveryScenario(){
//
//
//        if(driver!=null) {
//            driver.close();
//        }

  //  }



}


