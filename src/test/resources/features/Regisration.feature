Feature:Registration test with inline data from feature file
  Background:
    Given user launch the application
    When user enter the login details UserName and Password
    Then user should click on button
  @Registration_Inline
  Scenario:Registration page
    Given User is clicking Registration button and patient detail with searchID "GAN10092"
    And User search patient detail with NameSend "vasa" and PhoneNumberSend "1234567889"
    Then User click create button and user enter "vasanthi" and "ms" and "31" and click StartOPDVisit



