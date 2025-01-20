Feature: Login

  #@Kumar
  Scenario: Successful Login with valid credentials
    Given Launch Browser
    When user opens URL "https://admin-demo.nopcommerce.com/login"
    And user enters username as "admin@yourstore.com" and password as "admin"
    And click on login
    Then page should be opened
    When user click log out
    Then Page title should be "your store.login"
    And close browser

  #@Dileep
  Scenario Outline: Successful Login with Invalid credentials
    Given Launch Browser
    When user opens URL "https://admin-demo.nopcommerce.com/login"
    And user enters username as "<email>" and password as "<pwsd>"
    And click on login
    Then page should be opened
    When user click log out
    Then Page title should be "your store.login"
    And close browser

    Examples: 
      | email                | pwsd   |
      | admin@yourstore.com  | admin  |
      | admin1@yourstore.com | admin1 |
