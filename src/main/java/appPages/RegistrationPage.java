package appPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {
    public WebDriver driver;


    public RegistrationPage(WebDriver driver) {
        this.driver=driver;

    }

    private By clickRegistrationPage= By.xpath("//i[@class='fa-user']");
    private By searchId=By.xpath("//input[@id='registrationNumber']");
    private By clickId=By.xpath("//button[@tabindex='3' and text()='Search']");
    private By searchName=By.id("name");
    private By searchPhoneNumber=By.id("customAttribute");
    private By clickName=By.xpath("//button[@tabindex='8' and text()='Search']");
    private By CreateNew=By.xpath("//span[@class='nav-link' and text()='Create ']  ");
    private By FirstName=By.xpath("//input[@id='givenName']");
    private  By LastName=By.id("familyName");
    private  By SelectGender=By.id("gender");
    private By AgeYear=By.id("ageYears");
    private By Month=By.id("ageMonths");
    private  By Days=By.id("ageDays");
    private By Estimated=By.id("birthdateEstimated");
    private  By StartOPDVisit=By.xpath("//button[@class='buttonClass']");
    public  void RegistrationPage1(String IdSend) throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(clickRegistrationPage).click();
        Thread.sleep(5000);
        driver.findElement(searchId).sendKeys(IdSend);
        driver.findElement(clickId).click();
        Thread.sleep(5000);
    }
    public void RegistrationPage2(String NameSend,String PhoneNumberSend) throws InterruptedException {
        driver.navigate().back();
        Thread.sleep(9000);
        driver.findElement(searchName).sendKeys(NameSend);
        driver.findElement(searchPhoneNumber).sendKeys(PhoneNumberSend);
        driver.findElement(clickName).click();
    }
    public void Registration3(String firstname,String lastname,String age) throws InterruptedException {
        driver.findElement(CreateNew).click();
        Thread.sleep(5000);
        driver.findElement(FirstName).sendKeys(firstname);
        driver.findElement(LastName).sendKeys(lastname);
        Thread.sleep(3000);
        Select select=new Select((driver.findElement(SelectGender)));
        select.selectByIndex(1);
        driver.findElement(AgeYear).sendKeys(age);
//        driver.findElement(Month).sendKeys("12");
//        driver.findElement(Days).sendKeys("7");
        driver.findElement(Estimated).click();
Thread.sleep(3000);
driver.findElement(StartOPDVisit).click();
        Thread.sleep(3000);



    }





}
