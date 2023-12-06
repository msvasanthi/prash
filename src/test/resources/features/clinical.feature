Feature: Clinical Test go and Selecting BloodTest
  Background:
    Given user launch the application
    When user enter the login details UserName and Password
    Then user should click on button
    Given User is clicking Registration button and patient detail with searchID "GAN10092"
    And User search patient detail with NameSend "vasa" and PhoneNumberSend "1234567889"
    Then User click create button and user enter "vasanthi" and "ms" and "31" and click StartOPDVisit
  @clinical_DatatableNoHeader
Scenario:Clinical Test
  Given user click the clinical page and moving to consultation and order page and select  BloodTest
  |CBN|
  And user click serum and select the serumtest
  |Serum|Serum electrolytes|


