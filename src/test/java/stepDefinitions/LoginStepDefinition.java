package stepDefinitions;

import appPages.LoginPage;
import driverManagement.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDefinition {
    LoginPage lp=new LoginPage(DriverManager.getdriver());


    @Given("user launch the application")
    public void user_launch_the_application() {
     DriverManager.getdriver().get("https://demo-lite.mybahmni.in/bahmni/home/index.html#/login");

    }

    @When("user enter the login details UserName and Password")
    public void user_enter_the_login_details_user_name_and_password() throws InterruptedException {
        lp.loginPage("superman","Admin123");



    }

    @Then("user should click on button")
    public void user_should_click_on_button() {
        lp.buttonclick();

    }

}