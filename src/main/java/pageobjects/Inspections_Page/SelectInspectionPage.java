package pageobjects.Inspections_Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.BasePage;

import java.io.IOException;

public class SelectInspectionPage extends BasePage {

    public SelectInspectionPage() throws IOException {
        super();
    }

    public @FindBy(className = "ic-FIELD")
    WebElement field;
    public @FindBy(id = "nav-bar-FIELD-FIELD-CHECKLISTS")
    WebElement checklist;
    public @FindBy(xpath = "// *[contains (@class, 'close-btn')]")
    WebElement buttonCloseArea;
    public @FindBy(xpath = "//DIV[@class='auiToolbar-header ng-binding'][text()='Inspections']")
    WebElement assertInspection;


    public SelectInspectionPage clickField() throws Exception {

        waitAndClickElement(field);
        return new SelectInspectionPage();
    }


    public SelectInspectionPage clickInspections() throws Exception {

        waitAndClickElement(checklist);
        return new SelectInspectionPage();
    }

    public SelectInspectionPage closeArea() throws Exception {
        driver.switchTo().frame("main");
        waitAndClickElement(buttonCloseArea);
        return new SelectInspectionPage();
    }

    public SelectInspectionPage assertInspectionPage() throws Exception {
        assertInspection.isDisplayed();
        return new SelectInspectionPage();
    }


}


