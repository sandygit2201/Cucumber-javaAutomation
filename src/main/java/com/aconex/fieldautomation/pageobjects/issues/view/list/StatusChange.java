package com.aconex.fieldautomation.pageobjects.issues.view.list;

import com.aconex.fieldautomation.pageobjects.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class StatusChange extends BasePage {

    public @FindBy(css = "div.status-selector.ng-isolate-scope > div > div > span")
    WebElement iconStatus;
    public @FindBy(xpath = "//STRONG[@class='ng-binding'][text()='Ready to inspect']")
    WebElement iconReadyToInspect;
    public @FindBy(xpath = "    // *[contains (@class, 'close')]")
    WebElement dropdownAreaclose;

    public StatusChange() throws IOException {
        super();
    }

    public StatusChange closeArea() throws Exception {
        waitAndClickElement(dropdownAreaclose);
        return new StatusChange();
    }

    public StatusChange clickOnStatus() throws Exception {
        waitAndClickElement(iconStatus);
        return new StatusChange();
    }

    public StatusChange clickOnReadyToInspect() throws Exception {

        waitAndClickElement(iconReadyToInspect);
        return new StatusChange();
    }


}
