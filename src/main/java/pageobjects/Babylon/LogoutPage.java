package pageobjects.Babylon;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.BasePage;

public class LogoutPage extends BasePage {

    public @FindBy(css = "a#logoff")
    WebElement Logout;

    public @FindBy(className ="uiButton-label")
    WebElement buttonLogin;

    public LogoutPage() throws IOException {
        super();
    }

    public LogoutPage clickLogout() throws InterruptedException, IOException {
        driver.switchTo().defaultContent();
        waitAndClickElement(Logout);
        return new LogoutPage();
    }

    public LogoutPage successfulLogout() throws InterruptedException, IOException{
        waitUntilWebElementIsVisible(buttonLogin);
        buttonLogin.isDisplayed();
        return new LogoutPage();
    }
}
