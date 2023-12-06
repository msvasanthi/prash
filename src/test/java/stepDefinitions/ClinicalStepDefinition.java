package stepDefinitions;

import appPages.ClinicalPage;
import driverManagement.DriverManager;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import java.util.List;

public class ClinicalStepDefinition {
    ClinicalPage cp=new ClinicalPage(DriverManager.getdriver());
    @Given("user click the clinical page and moving to consultation and order page and select  BloodTest")
    public void user_click_the_clinical_page_and_moving_to_consultation_and_order_page_and_select_blood_test(DataTable dataTable) throws InterruptedException {
        List<List<String>> testData=dataTable.asLists();
        cp.ClinicalPage1(testData.get(0).get(0));
    }

    @Given("user click serum and select the serumtest")
    public void user_click_serum_and_select_the_serumtest(DataTable dataTable) {
        List<List<String>> testData=dataTable.asLists();
        cp.SelectSerum(testData.get(0).get(0),testData.get(0).get(1));
    }




}
