package pageobjects.FieldSettings_Page;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.BasePage;

public class AccessSectionsPage extends BasePage {

    public AccessSectionsPage() throws IOException {
        super();
    }

    public @FindBy (xpath = "//A[@ui-sref='.checklist-templates'][text()='Templates']")
    WebElement settingsTemplates;
    public @FindBy (xpath = "// *[contains (@class, 'cross')]")
    WebElement closeCLFTUX;
    public @FindBy (xpath = "//H1[@class='ng-binding'][text()='Templates']")
    WebElement assertTemplatePage;

public AccessSectionsPage clickTemplates () throws Exception {
    waitAndClickElement(settingsTemplates);
    return new AccessSectionsPage();
}

    public AccessSectionsPage closeCLFTUX () throws Exception {
        waitAndClickElement(closeCLFTUX);
        return new AccessSectionsPage();
    }

    public AccessSectionsPage assertTemplatePage () throws Exception {
        assertTemplatePage.isDisplayed();
        return new AccessSectionsPage();
    }



}
