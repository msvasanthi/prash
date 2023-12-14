package driverManagement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

public class DriverManager {
    WebDriver driver;
    public static ThreadLocal<WebDriver> localdriver = new ThreadLocal<>();

//change add in vasanthigit stuts
    // commit and push same time
    //

    //second change in vasanthi

    //3rd change
    //what happend
    // commit 121423


    public static synchronized WebDriver getdriver(){
        return localdriver.get();
    }


    public static void unloadDriver( ){
        localdriver.set(null);
    }
    public WebDriver initBrower(String browserType) throws InterruptedException, MalformedURLException {

        switch (browserType) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                localdriver.set(new ChromeDriver());
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                localdriver.set(new FirefoxDriver());

                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                localdriver.set(new EdgeDriver());

                break;
            case "Remote":
                MutableCapabilities capabilities = new MutableCapabilities();//user:vasanthi_XhPxM4
                ChromeOptions options = new ChromeOptions();                 //key:zpxCqdEpCjevpKRMfxUu
                options.addArguments("incognito");  // ChromeOptions for starting chrome in incognito mode

                capabilities.setCapability(ChromeOptions.CAPABILITY, options);

                capabilities.setCapability("browserName", "Chrome");
                capabilities.setCapability("browserVersion", "118.0");
                HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
                browserstackOptions.put("os", "OS X");
                browserstackOptions.put("osVersion", "Ventura");
                capabilities.setCapability("bstack:options", browserstackOptions);
                String username= "vasanthi_XhPxM4";
                String accesskey = "zpxCqdEpCjevpKRMfxUu";
                String browserStackURL = "https://"+username+":"+accesskey+"@hub-cloud.browserstack.com/wd/hub";
                localdriver.set( new RemoteWebDriver(new URL(browserStackURL), capabilities));
break;
            default:
                System.out.println("please enter the valid browser name");
                break;

        }
       // getdriver().get("https://demo-lite.mybahmni.in/bahmni/home/index.html#/login");
      getdriver().manage().window().maximize();

return getdriver();

    }

}