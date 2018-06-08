package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class Login_page extends BasePage {

    public @FindBy(id = "userName")
    WebElement textfield_UserName;
    public @FindBy(id = "password")
    WebElement textfield_Password;
    public @FindBy(id = "login")
    WebElement button_Login;


    public Login_page() throws IOException {
        super();
    }

    public Login_page getloginPage() throws IOException {
        getDriver().get("https://apiprod.aconex.com/Logon");
        return new Login_page();

    }

    public Login_page enterUsername(String userName) throws Exception {
        waitAndClickElement(textfield_UserName);
        sendKeysToWebElement(textfield_UserName, userName);
        return new Login_page();
    }


    public Login_page enterPassword(String password) throws Exception {
        waitAndClickElement(textfield_Password);
        sendKeysToWebElement(textfield_Password, password);
        return new Login_page();
    }


    public Login_page clickLoginButton() throws Exception {
        waitAndClickElement(button_Login);
        return new Login_page();


    }
}
