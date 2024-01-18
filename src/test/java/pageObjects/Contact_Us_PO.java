package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Global_Vars;

public class Contact_Us_PO extends Base_PO{

    private @FindBy(xpath = "//input[@name='first_name']") WebElement firstName_textField;

    private @FindBy(xpath = "//input[@name='last_name']") WebElement lastName_textField;

    private @FindBy(xpath = "//input[@name='email']") WebElement emailAddress_textField;

    private @FindBy(xpath = "//textarea[@name='message']") WebElement comment_textArea;

    private @FindBy(xpath = "//input[@type='submit']") WebElement submit_button;

    private @FindBy(xpath = "//h1[text()='Thank You for your Message!']") WebElement confirmation_message;

    public Contact_Us_PO(){
        super();
    }

    public void navigateTo_WebDriverUniversity_Contact_Us_Page(){
        navigateTo_URL(Global_Vars.WEBDRIVER_UNIVERSITY_CONTACT_US_URL);
    }

    public void setFirstName(String firstName){
        sendKeys(firstName_textField, firstName);
    }

    public void setUnique_firstName(){
        sendKeys(firstName_textField,"AutoFN" + generateRandomNumber(5) );
    }

    public void setLastName(String lastName){
        sendKeys(lastName_textField, lastName);
    }

    public void setUnique_lastName(){
        sendKeys(lastName_textField,"AutoFN" + generateRandomNumber(7) );
    }

    public void setEmailAddress(String emailAddress){
        sendKeys(emailAddress_textField, emailAddress);
    }

    public void setUnique_emailAddress(){
        sendKeys(emailAddress_textField,generateRandomNumber(10) + "@mail.com");
    }

    public void setComment(String comment){
        sendKeys(comment_textArea, comment);
    }

    public void setUnique_comment(){
        sendKeys(comment_textArea,"Hello World" + generateRandomString(20));
    }
    public void clickSubmitButton(){
        waitForWebElementAndClick(submit_button);
    }

    public boolean verifyConfirmationMessage (String message){
        return verifyTextToBePresentInElement(confirmation_message, message);
    }
}
