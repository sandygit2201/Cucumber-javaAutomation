package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class EnterField_page extends BasePage {


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
    public @FindBy(xpath = "/html/body/div/fm-app/div[3]/div/div/div/div/daily-summary-notifications-ftux/div/div[2]/div/div[1]")
    WebElement FTUX;


    public EnterField_page() throws IOException {
        super();
    }

    public EnterField_page enterUsername() throws Exception {
        waitAndClickElement(textfield_UserName);
        sendKeysToWebElement(textfield_UserName, "mjenner");
        return new EnterField_page();
    }


    public EnterField_page enterPassword() throws Exception {
        waitAndClickElement(textfield_Password);
        sendKeysToWebElement(textfield_Password, "Auth3nt1c");
        return new EnterField_page();
    }


    public EnterField_page clickLoginButton() throws Exception {
        waitAndClickElement(button_Login);
        return new EnterField_page();
    }

    public EnterField_page assertLogin() throws Exception {
        System.out.println("Login done");
        return new EnterField_page();
    }

    public EnterField_page selectIssues() throws Exception {

        waitAndClickElement(field);
        waitAndClickElement(issues);

        return new EnterField_page();
    }

    public EnterField_page closeFTUX() throws Exception {
        driver.switchTo().frame("main");
        waitAndClickElement(FTUX);


        return new EnterField_page();
    }

}
