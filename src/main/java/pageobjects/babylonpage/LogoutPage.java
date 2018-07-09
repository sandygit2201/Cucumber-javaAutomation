package pageobjects.babylonpage;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.BasePage;

public class LogoutPage extends BasePage {

    public @FindBy(css = "a#logoff")
    WebElement Logout;

    public @FindBy(className ="uiButton-label")
    WebElement button_Login;

    public LogoutPage() throws IOException {
        super();
    }

    public LogoutPage Clicklogut() throws InterruptedException, IOException {
        driver.switchTo().defaultContent();
        waitAndClickElement(Logout);
        return new LogoutPage();
    }

    public LogoutPage SuccessfulLogOut() throws InterruptedException, IOException{
        WaitUntilWebElementIsVisible (button_Login);
        button_Login.isDisplayed();
        return new LogoutPage();
    }
}
