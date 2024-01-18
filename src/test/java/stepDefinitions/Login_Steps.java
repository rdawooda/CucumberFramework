package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.Login_PO;

public class Login_Steps {

    private Login_PO login_po;

    public Login_Steps(Login_PO login_po){
        this.login_po = login_po;
    }

    @Given("I access the webdriver university login page")
    public void i_access_the_webdriver_university_login_page() {
        login_po.navigateTo_WebDriverUniversity_Login_Page();
    }

    @When("I enter username as {word}")
    public void i_enter_username_as(String userName) {
        login_po.setUsername(userName);
    }

    @When("I enter password as {word}")
    public void i_enter_password_as(String password) {
        login_po.setPassword(password);
    }

    @When("I click on Login button")
    public void i_click_on_login_button() {
        login_po.clickLoginButton();
    }

    @Then("I should be displayed {} message")
    public void i_should_be_displayed_message(String message) {
        login_po.waitForAlert_And_ValidateText(message);
        login_po.acceptAlert();
    }
}
