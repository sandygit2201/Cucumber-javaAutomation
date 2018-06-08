package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class status_change_page extends BasePage {

    public status_change_page() throws IOException {
        super();
    }

    public @FindBy (xpath = "//div[@class='selected-item-icon']/following-sibling::span[text()='Open' and @class='ng-binding']\n")
    WebElement icon_Status;
    public @FindBy (xpath = "//STRONG[@class='ng-binding'][text()='Ready to inspect']")
    WebElement icon_RTI;
    public @FindBy (xpath = "    // *[contains (@class, 'close')]")
    WebElement dropdown_areaclose;





    public status_change_page closeArea () throws Exception {

        waitAndClickElement( dropdown_areaclose);
        return new status_change_page();
    }

    public status_change_page clickOnStatus () throws Exception {
        Thread.sleep(1500);
        waitAndClickElement(icon_Status);
        return new status_change_page();
    }

    public status_change_page clickOnRTI () throws Exception {

        waitAndClickElement(icon_RTI);
        return new status_change_page();
    }



}
