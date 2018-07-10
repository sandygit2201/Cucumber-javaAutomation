package pageobjects.IssuesListView_Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.BasePage;

import java.io.IOException;

public class StatusChangePage extends BasePage {

    public StatusChangePage() throws IOException {
        super();
    }

    public @FindBy (css = "div.status-selector.ng-isolate-scope > div > div > span")
    WebElement iconStatus;
    public @FindBy (xpath = "//STRONG[@class='ng-binding'][text()='Ready to inspect']")
    WebElement iconReadyToInspect;
    public @FindBy (xpath = "    // *[contains (@class, 'close')]")
    WebElement dropdownAreaclose;





    public StatusChangePage closeArea () throws Exception {
        waitAndClickElement(dropdownAreaclose);
        return new StatusChangePage();
    }

    public StatusChangePage clickOnStatus () throws Exception {
        waitAndClickElement(iconStatus);
        return new StatusChangePage();
    }

    public StatusChangePage clickOnReadyToInspect() throws Exception {

        waitAndClickElement(iconReadyToInspect);
        return new StatusChangePage();
    }



}
