package pageobjects.Babylon;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.BasePage;

public class LogoutPage extends BasePage {

    @FindBy(id = "logoff")
    private WebElement logoutLink;

    @FindBy(id ="btnLogin")
    private WebElement loginButton;

    public LogoutPage() throws IOException {
        super();
    }

    public LogoutPage clickLogout() throws InterruptedException {
        driver.switchTo().defaultContent();
        waitAndClickElement(logoutLink);
        return this;
    }

    public LogoutPage successfulLogout() {
        waitUntilWebElementIsVisible(loginButton);
        loginButton.isDisplayed();
        return this;
    }
}
