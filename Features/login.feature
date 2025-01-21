Feature: Login

  #@Kumar
  Scenario: Successful Login with valid credentials
    Given Launch Browser
    When user opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    And user enters username as "Admin" and password as "admin123"
    And click on login
    Then page should be opened
    When user click log out
    Then Page title should be "OrangeHRM"
    And close browser

  #@Dileep
  #Scenario Outline: Successful Login with Invalid credentials
    #Given Launch Browser
    #When user opens URL "https://admin-demo.nopcommerce.com/login"
    #And user enters username as "<email>" and password as "<pwsd>"
    #And click on login
    #Then page should be opened
    #When user click log out
    #Then Page title should be "your store.login"
    #And close browser
#
    #Examples: 
      #| email | pwsd     |
      #| Admin | admin1   |
      #| Admin | admin123 |
