package pageObjects.Babylon_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObjects.BasePage;
import sun.jvm.hotspot.utilities.Assert;
import java.io.IOException;

public class login_page extends BasePage {

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


    public login_page() throws IOException {
        super();
    }

    public login_page getloginPage() throws IOException {
        getDriver().get("https://apiprod.aconex.com/Logon");
        return new login_page();

    }

    public login_page enterUsername(String userName) throws Exception {
        waitAndClickElement(textfield_UserName);
        sendKeysToWebElement(textfield_UserName, userName);
        return new login_page();
    }


    public login_page enterPassword(String password) throws Exception {
        waitAndClickElement(textfield_Password);
        sendKeysToWebElement(textfield_Password, password);
        return new login_page();
    }


    public login_page clickLoginButton() throws Exception {
        waitAndClickElement(button_Login);
        return new login_page();
    }

    public login_page assertLoginSuccess(String arg0) throws Exception {
        WaitUntilWebElementIsVisible(assert_LoginSuccess);
        org.testng.Assert.assertEquals(assert_LoginSuccess.getText(), arg0);
        return new login_page();
    }

    public login_page assertLoginFailure(String arg1) throws Exception {
        WaitUntilWebElementIsVisible(assert_LoginFailure);
        org.testng.Assert.assertEquals(assert_LoginFailure.getText(), arg1);
        return new login_page();


    }
}
