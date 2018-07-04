package pageObjects.Babylon_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObjects.BasePage;

import java.io.IOException;

public class logout_page extends BasePage {

    public @FindBy(css = "a#logoff")
    WebElement Logout;

    public @FindBy(className ="uiButton-label")
    WebElement button_Login;

    public logout_page() throws IOException {
        super();
    }

    public logout_page Clicklogut() throws InterruptedException, IOException {
        driver.switchTo().defaultContent();
        waitAndClickElement(Logout);
        return new logout_page();
    }

    public logout_page SuccessfulLogOut() throws InterruptedException, IOException{
        WaitUntilWebElementIsVisible (button_Login);
        button_Login.isDisplayed();
        return new logout_page();
    }
}
