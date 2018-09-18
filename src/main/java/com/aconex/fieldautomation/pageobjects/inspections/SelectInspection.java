package com.aconex.fieldautomation.pageobjects.inspections;

import com.aconex.fieldautomation.pageobjects.BasePage;
import com.aconex.fieldautomation.utils.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class SelectInspection extends BasePage {

    public @FindBy(className = "ic-FIELD")
    WebElement field;
    public @FindBy(id = "nav-bar-FIELD-FIELD-CHECKLISTS")
    WebElement checklist;
    public @FindBy(xpath = "// *[contains (@class, 'close-btn')]")
    WebElement buttonCloseArea;
    public @FindBy(xpath = "//DIV[@class='auiToolbar-header ng-binding'][text()='Inspections']")
    WebElement assertInspection;

    public SelectInspection() throws IOException {
        super();
    }

    public SelectInspection clickField() throws Exception {

        waitAndClickElement(field);
        return new SelectInspection();
    }


    public SelectInspection clickInspections() throws Exception {

        waitAndClickElement(checklist);
        return new SelectInspection();
    }

    public SelectInspection closeArea() throws Exception {
        DriverFactory.driver.switchTo().frame("main");
        waitAndClickElement(buttonCloseArea);
        return new SelectInspection();
    }

    public SelectInspection assertInspectionPage() throws Exception {
        assertInspection.isDisplayed();
        return new SelectInspection();
    }


}


