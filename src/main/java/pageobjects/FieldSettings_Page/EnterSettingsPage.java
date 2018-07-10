package pageobjects.FieldSettings_Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.BasePage;

import java.io.IOException;

public class EnterSettingsPage extends BasePage {

    public EnterSettingsPage() throws IOException {
        super();

    }

    public @FindBy(className = "ic-FIELD")
    WebElement field;

    public @FindBy(id = "nav-bar-FIELD-FIELD-SETTINGS")
    WebElement settings;

    public @FindBy(xpath = "//DIV[@class='auiToolbar-header ng-binding'][text()='Settings']")
    WebElement assertFieldSettingPage;


    public EnterSettingsPage clickFieldSettings() throws Exception {

        waitAndClickElement(field);
        waitAndClickElement(settings);
        return new EnterSettingsPage();
    }


    public EnterSettingsPage assertSettingsPage() throws Exception {

        driver.switchTo().frame("main");
        Thread.sleep(1000);
        assertFieldSettingPage.isDisplayed();
        return new EnterSettingsPage();
    }
}
