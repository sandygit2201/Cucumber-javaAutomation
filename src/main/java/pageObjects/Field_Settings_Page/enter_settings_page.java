package pageObjects.Field_Settings_Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObjects.BasePage;

import java.io.IOException;

public class enter_settings_page extends BasePage {

    public enter_settings_page() throws IOException {
        super();

    }

    public @FindBy(className = "ic-FIELD")
    WebElement field;

    public @FindBy(id = "nav-bar-FIELD-FIELD-SETTINGS")
    WebElement settings;

    public @FindBy(xpath = "//DIV[@class='auiToolbar-header ng-binding'][text()='Settings']")
    WebElement assertFieldSettingPage;


    public enter_settings_page clickFieldSettings() throws Exception {

        waitAndClickElement(field);
        waitAndClickElement(settings);
        return new enter_settings_page();
    }


    public enter_settings_page assertSettingsPage() throws Exception {

        driver.switchTo().frame("main");
        Thread.sleep(1000);
        assertFieldSettingPage.isDisplayed();

        return new enter_settings_page();
    }
}
