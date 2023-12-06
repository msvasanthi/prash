package stepDefinitions;

import appPages.RegistrationPage;
import driverManagement.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class RegistrationStepDefinition {
    RegistrationPage rp=new RegistrationPage(DriverManager.getdriver());

    @Given("User is clicking Registration button and patient detail with searchID {string}")
    public void user_is_clicking_registration_button_and_patient_detail_with_search_id(String string) throws InterruptedException {
        rp.RegistrationPage1(string);

    }
    @And("User search patient detail with NameSend {string} and PhoneNumberSend {string}")
    public void user_search_patient_detail_with_name_send_and_phone_number_send(String string, String string2) throws InterruptedException {
     rp.RegistrationPage2(string,string2);

    }
    @Then("User click create button and user enter {string} and {string} and {string} and click StartOPDVisit")
    public void user_click_create_button_and_user_enter_and_and_and_click_start_opd_visit(String string, String string2, String string3) throws InterruptedException {

       rp.Registration3(string,string2,string3);
    }



}
