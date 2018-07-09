package pageobjects.babylonpage;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.BasePage;

public class LoginPage extends BasePage {

    public @FindBy(id = "userName")
    WebElement textfield_UserName;
    public @FindBy(id = "password")
    WebElement textfield_Password;
    public @FindBy(id = "login")
    WebElement button_Login;
    public @FindBy(css = "a#logoff")
    WebElement assert_LoginSuccess;
    public @FindBy(css = "form[name=\"sll\"] div.logon-messages > ul > li > div:nth-child(1) > div")
    WebElement assert_LoginFailure;


    public LoginPage() throws IOException {
        super();
    }

    public LoginPage getloginPage() throws IOException {
        getDriver().get("https://apiprod.aconex.com/Logon");
        return new LoginPage();

    }

    public LoginPage enterUsername(String userName) throws Exception {
        waitAndClickElement(textfield_UserName);
        sendKeysToWebElement(textfield_UserName, userName);
        return new LoginPage();
    }


    public LoginPage enterPassword(String password) throws Exception {
        waitAndClickElement(textfield_Password);
        sendKeysToWebElement(textfield_Password, password);
        return new LoginPage();
    }


    public LoginPage clickLoginButton() throws Exception {
        waitAndClickElement(button_Login);
        return new LoginPage();
    }

    public LoginPage assertLoginSuccess(String arg0) throws Exception {
        WaitUntilWebElementIsVisible(assert_LoginSuccess);
        org.testng.Assert.assertEquals(assert_LoginSuccess.getText(), arg0);
        return new LoginPage();
    }

    public LoginPage assertLoginFailure(String arg1) throws Exception {
        WaitUntilWebElementIsVisible(assert_LoginFailure);
        org.testng.Assert.assertEquals(assert_LoginFailure.getText(), arg1);
        return new LoginPage();


    }
}
