package com.aconex.fieldautomation.pageobjects.babylon;

import com.aconex.fieldautomation.pageobjects.BasePage;
import com.aconex.fieldautomation.utils.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class LogoutPage extends BasePage {

    @FindBy(id = "logoff")
    private WebElement logoutLink;

    @FindBy(id = "btnLogin")
    private WebElement loginButton;

    public LogoutPage() throws IOException {
        super();
    }

    public LogoutPage clickLogout() throws InterruptedException {
        DriverFactory.driver.switchTo().defaultContent();
        waitAndClickElement(logoutLink);
        return this;
    }

    public LogoutPage successfulLogout() {
        waitUntilWebElementIsVisible(loginButton);
        loginButton.isDisplayed();
        return this;
    }
}
