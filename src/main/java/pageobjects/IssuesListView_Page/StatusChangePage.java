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
    WebElement icon_Status;
    public @FindBy (xpath = "//STRONG[@class='ng-binding'][text()='Ready to inspect']")
    WebElement icon_RTI;
    public @FindBy (xpath = "    // *[contains (@class, 'close')]")
    WebElement dropdown_areaclose;





    public StatusChangePage closeArea () throws Exception {
        waitAndClickElement( dropdown_areaclose);
        return new StatusChangePage();
    }

    public StatusChangePage clickOnStatus () throws Exception {
        waitAndClickElement(icon_Status);
        return new StatusChangePage();
    }

    public StatusChangePage clickOnRTI () throws Exception {

        waitAndClickElement(icon_RTI);
        return new StatusChangePage();
    }



}
