package pageObjects.Field_general_Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObjects.BasePage;

import java.io.IOException;

public class access_field_page extends BasePage {


    public @FindBy(id = "userName")
    WebElement textfield_UserName;
    public @FindBy(id = "password")
    WebElement textfield_Password;
    public @FindBy(id = "login")
    WebElement button_Login;
    public @FindBy(css = "nav-infoHolder")
    WebElement Acx;
    public @FindBy(className = "ic-FIELD")
    WebElement field;
    public @FindBy(id = "nav-bar-FIELD-FIELD-ISSUES")
    WebElement issues;
    public @FindBy(xpath = "// *[contains (@class, 'cross')]")
    WebElement FTUX;


    public access_field_page() throws IOException {
        super();
    }

    public access_field_page enterUsername() throws Exception {
        waitAndClickElement(textfield_UserName);
        sendKeysToWebElement(textfield_UserName, "mjenner");
        return new access_field_page();
    }


    public access_field_page enterPassword() throws Exception {
        waitAndClickElement(textfield_Password);
        sendKeysToWebElement(textfield_Password, "Auth3nt1c");
        return new access_field_page();
    }


    public access_field_page clickLoginButton() throws Exception {
        waitAndClickElement(button_Login);
        return new access_field_page();
    }

    public access_field_page assertLogin() throws Exception {
        System.out.println("Login done");
        return new access_field_page();
    }

    public access_field_page selectIssues() throws Exception {

        waitAndClickElement(field);
        waitAndClickElement(issues);

        return new access_field_page();
    }

    public access_field_page closeFTUX() throws Exception {
        driver.switchTo().frame("main");
        waitAndClickElement(FTUX);
        return new access_field_page();
    }

}
