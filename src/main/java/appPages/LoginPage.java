package appPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
    public WebDriver driver;


    public LoginPage(WebDriver driver) {
        this.driver=driver;


    }

    private By textUserName=By.id("username");
    private By textPassWord=By.id("password");
    private By selectLocation=By.id("location");
    private By buttonLogin=By.xpath("//button[@type='submit' and text()='Login']");
   // private By clickRegistrationPage= By.xpath("//i[@class='fa-user']");

    public void loginPage(String userName,String passWord) throws InterruptedException {
Thread.sleep(2000);

        driver.findElement(textUserName).sendKeys(userName);
        driver.findElement(textPassWord).sendKeys(passWord);
        Select select = new Select(driver.findElement(selectLocation));
        select.selectByIndex(1);


    }
    public void buttonclick(){

        driver.findElement(buttonLogin).click();
        //Thread.sleep(5000);
        //driver.findElement(clickRegistrationPage).click();




    }




    }
