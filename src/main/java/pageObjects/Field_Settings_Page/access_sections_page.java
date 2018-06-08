package pageObjects.Field_Settings_Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObjects.BasePage;

import java.io.IOException;

public class access_sections_page extends BasePage {

    public access_sections_page() throws IOException {
        super();
    }

    public @FindBy (xpath = "//A[@ui-sref='.checklist-templates'][text()='Templates']")
    WebElement settingsTemplates;
    public @FindBy (xpath = "// *[contains (@class, 'cross')]")
    WebElement closeCLFTUX;
    public @FindBy (xpath = "//H1[@class='ng-binding'][text()='Templates']")
    WebElement assertTemplatePage;

public access_sections_page clickTemplates () throws Exception {
    waitAndClickElement(settingsTemplates);
    return new access_sections_page ();
}

    public access_sections_page closeCLFTUX () throws Exception {
        waitAndClickElement(closeCLFTUX);
        return new access_sections_page ();
    }

    public access_sections_page assertTemplatePage () throws Exception {
        assertTemplatePage.isDisplayed();
        return new access_sections_page ();
    }



}
