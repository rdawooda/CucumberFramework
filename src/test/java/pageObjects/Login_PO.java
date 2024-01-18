package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Global_Vars;

public class Login_PO extends Base_PO{

    private @FindBy(xpath = "//input[@placeholder='Username']") WebElement username_textField;

    private @FindBy(xpath = "//input[@placeholder='Password']") WebElement password_textField;

    private @FindBy(xpath = "//button[@id='login-button']") WebElement login_button;

    public Login_PO(){
        super();
    }
    public void navigateTo_WebDriverUniversity_Login_Page(){
        navigateTo_URL(Global_Vars.WEBDRIVER_UNIVERSITY_LOGIN_URL);
    }

    public void setUsername(String username){
        sendKeys(username_textField, username);
    }

    public void setPassword(String password){
        sendKeys(password_textField, password);
    }

    public void clickLoginButton(){
        waitForWebElementAndClick(login_button);
    }


}
