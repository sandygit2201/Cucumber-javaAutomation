package com.aconex.fieldautomation.pageobjects.field.general;

import com.aconex.fieldautomation.pageobjects.BasePage;
import com.aconex.fieldautomation.utils.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.io.IOException;

public class AccessFieldPage extends BasePage {


    public @FindBy(id = "userName")
    WebElement textFieldUserName;

    public @FindBy(id = "password")
    WebElement textFieldPassword;

    public @FindBy(id = "login")
    WebElement buttonLogin;

    public @FindBy(css = "nav-infoHolder")
    WebElement Acx;

    public @FindBy(className = "ic-FIELD")
    WebElement field;

    public @FindBy(id = "nav-bar-FIELD-FIELD-ISSUES")
    WebElement issues;

    public @FindBy(xpath = "// *[contains (@class, 'cross')]")
    WebElement FTUX;

    public @FindBy(css = "div > div.auiToolbar-header.ng-binding")
    WebElement assertIssuesPage;

    public @FindBy(className = "nav-userDetails")
    WebElement getUserName;


    public AccessFieldPage() throws IOException {
        super();
    }

    public AccessFieldPage enterUserName() throws Exception {
        waitAndClickElement(textFieldUserName);
        sendKeysToWebElement(textFieldUserName, "mjenner");
        return new AccessFieldPage();
    }


    public AccessFieldPage enterPassword() throws Exception {
        waitAndClickElement(textFieldPassword);
        sendKeysToWebElement(textFieldPassword, "Auth3nt1c");
        return new AccessFieldPage();
    }


    public AccessFieldPage verifyUserName() throws Exception {
        waitUntilWebElementIsVisible(getUserName);
        Assert.assertEquals(getUserName.getText(), "Mr Maurice Jenner");
        return new AccessFieldPage();
    }

    public AccessFieldPage selectIssues() throws Exception {
        waitAndClickElement(field);
        waitAndClickElement(issues);
        return new AccessFieldPage();
    }

    public AccessFieldPage closeFTUX() throws Exception {
        DriverFactory.driver.switchTo().frame("main");
        waitAndClickElement(FTUX);
        return new AccessFieldPage();
    }

    public AccessFieldPage assertIssuesPage() throws Exception {
        waitUntilPreLoadElementDisappears(By.cssSelector("fm-app > div:nth-child(4) > div > div > div"));
        Assert.assertEquals(assertIssuesPage.getText(), "Issues");
        return new AccessFieldPage();
    }


}
