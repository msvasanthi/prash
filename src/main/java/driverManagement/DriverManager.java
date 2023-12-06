package driverManagement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverManager {
    WebDriver driver;
    public static ThreadLocal<WebDriver> localdriver = new ThreadLocal<>();


    public static synchronized WebDriver getdriver(){
        return localdriver.get();
    }

    public static void unloadDriver( ){
        localdriver.set(null);
    }
    public WebDriver initBrower(String browserType) throws InterruptedException {

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

            default:
                System.out.println("please enter the valid browser name");
                break;

        }
       // getdriver().get("https://demo-lite.mybahmni.in/bahmni/home/index.html#/login");
      getdriver().manage().window().maximize();

return getdriver();

    }

}