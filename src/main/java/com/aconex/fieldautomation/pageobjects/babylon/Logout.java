package com.aconex.fieldautomation.pageobjects.babylon;

import com.aconex.fieldautomation.pageobjects.BasePage;
import com.aconex.fieldautomation.utils.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class Logout extends BasePage {

    @FindBy(css = "#logoff[href='/Logon?Action=Logoff']")
    private WebElement logoutLink;

    @FindBy(id = "btnLogin")
    private WebElement loginButton;

    @FindBy (css= "#nav-info.nav-user")
    private WebElement UserNameInfo;

    public Logout() throws IOException {
        super();
    }

    public Logout clickLogout() throws InterruptedException {
        DriverFactory.driver.switchTo().defaultContent();
        waitAndClickElement(UserNameInfo);
        waitAndClickElement(logoutLink);
        return this;
    }

    public Logout successfulLogout() {
        waitUntilWebElementIsVisible(loginButton);
        loginButton.isDisplayed();
        return this;
    }
}
