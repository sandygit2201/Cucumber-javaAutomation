package com.aconex.fieldautomation.pageobjects.field.settings;

import com.aconex.fieldautomation.pageobjects.BasePage;
import com.aconex.fieldautomation.utils.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class EnterSettings extends BasePage {

    public @FindBy(className = "ic-FIELD")
    WebElement field;
    public @FindBy(id = "nav-bar-FIELD-FIELD-SETTINGS")
    WebElement settings;
    public @FindBy(xpath = "//DIV[@class='auiToolbar-header ng-binding'][text()='Settings']")
    WebElement assertFieldSettingPage;

    public EnterSettings() throws IOException {
        super();

    }

    public EnterSettings clickFieldSettings() throws Exception {

        waitAndClickElement(field);
        waitAndClickElement(settings);
        return new EnterSettings();
    }


    public EnterSettings assertSettingsPage() throws Exception {

        DriverFactory.driver.switchTo().frame("main");
        Thread.sleep(1000);
        assertFieldSettingPage.isDisplayed();
        return new EnterSettings();
    }
}
