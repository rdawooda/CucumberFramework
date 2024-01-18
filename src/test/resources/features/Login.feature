@login @regression
Feature: WebDriver University - Login

  Background:
    Given I access the webdriver university login page

  Scenario Outline: Validate Successful & Unsuccessful Login
    When I enter username as <username>
    And I enter password as <password>
    And I click on Login button
    Then I should be displayed <loginValidationText> message

    Examples:
      | username  | password     | loginValidationText  |
      | webdriver | webdriver123 | validation succeeded |
      | webdriver | webdriver12  | validation failed    |


