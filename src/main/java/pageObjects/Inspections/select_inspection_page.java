package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class select_inspection_page extends BasePage {

    public select_inspection_page() throws IOException {
        super();
    }

    public @FindBy(className = "ic-FIELD")
    WebElement field;
    public @FindBy(id = "nav-bar-FIELD-FIELD-CHECKLISTS")
    WebElement checklist;
    public @FindBy(xpath = "// *[contains (@class, 'close-btn')]")
    WebElement buttoncloseArea;
    public @FindBy(xpath = "//DIV[@class='auiToolbar-header ng-binding'][text()='Inspections']")
    WebElement assertInspection;


    public select_inspection_page clickField() throws Exception {

        waitAndClickElement(field);
        return new select_inspection_page();
    }


    public select_inspection_page clickInspections() throws Exception {

        waitAndClickElement(checklist);
        return new select_inspection_page();
    }

    public select_inspection_page closeArea() throws Exception {
        driver.switchTo().frame("main");
        waitAndClickElement(buttoncloseArea);
        return new select_inspection_page();
    }

    public select_inspection_page assertInspectionPage() throws Exception {
        if (assertInspection.isDisplayed()) {

            System.out.println("User landed on Inspection page");
        } else {
            System.out.println("User did not land on Inspection page");
        }
        return new select_inspection_page();
    }


}


