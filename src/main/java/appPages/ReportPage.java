package appPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ReportPage {
    public WebDriver driver;
    public ReportPage(WebDriver driver){
        this.driver=driver;
    }
    private By HomeClick=By.xpath("//i[@class='fa fa-home']");
    private By ReportClick=By.xpath("//i[@class='icon-bahmni-reports']");
    //private By ReportDataPicker= By.xpath("//input[@ng-model='default.reportsRequiringDateRange.startDate']");
    private By DataPicker=By.xpath("//input[@type='date']");

    private By Formate=By.xpath("//select[@ng-model='report.responseType']");
    public void ReportPage() throws InterruptedException {
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        Thread.sleep(3000);
        driver.findElement(HomeClick).click();
        Thread.sleep(3000);
        driver.findElement(ReportClick).click();
        Thread.sleep(5000);
//      Select select=new Select(driver.findElement(DataPicker));
//        List<WebElement> FormateClick=driver.findElements(Formate);
//        for(WebElement ele:FormateClick)
//        {
//            if(ele.getAttribute("textContent").contains("CSV"));
//         select.selectByIndex(0);
//        }
//    //   select.selectByIndex(1);


    }




}
