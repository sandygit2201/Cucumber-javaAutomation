package com.aconex.fieldautomation.pageobjects.babylon;

import com.aconex.fieldautomation.pageobjects.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class Login extends BasePage {

    public @FindBy(id = "userName")
    WebElement textFieldUserName;
    public @FindBy(id = "password")
    WebElement textFieldPassword;
    public @FindBy(id = "login")
    WebElement buttonLogin;
    public @FindBy(css = "a#logoff")
    WebElement assertLoginSuccess;
    public @FindBy(css = "form[name=\"sll\"] div.logon-messages > ul > li > div:nth-child(1) > div")
    WebElement assertLoginFailure;


    public Login() throws IOException {
        super();
    }

    public Login getLoginPage() throws IOException {
        getDriver().get("https://apiprod.aconex.com/Logon");
        return new Login();

    }

    public Login enterUserName(String userName) throws Exception {
        waitAndClickElement(textFieldUserName);
        sendKeysToWebElement(textFieldUserName, userName);
        return new Login();
    }


    public Login enterPassword(String password) throws Exception {
        waitAndClickElement(textFieldPassword);
        sendKeysToWebElement(textFieldPassword, password);
        return new Login();
    }


    public Login clickLoginButton() throws Exception {
        waitAndClickElement(buttonLogin);
        return new Login();
    }

    public Login assertLoginSuccessMessage(String arg0) throws Exception {
        waitUntilWebElementIsVisible(assertLoginSuccess);
        org.testng.Assert.assertEquals(assertLoginSuccess.getText(), arg0);
        return new Login();
    }

    public Login assertLoginFailureMessage(String arg1) throws Exception {
        waitUntilWebElementIsVisible(assertLoginFailure);
        org.testng.Assert.assertEquals(assertLoginFailure.getText(), arg1);
        return new Login();
    }

    public String getLoginFailureMessage() {
        waitUntilWebElementIsVisible(assertLoginFailure);
        return assertLoginFailure.getText();
    }

}
