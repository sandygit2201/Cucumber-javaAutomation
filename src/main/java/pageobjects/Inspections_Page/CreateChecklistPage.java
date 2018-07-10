package pageobjects.Inspections_Page;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.BasePage;

public class CreateChecklistPage extends BasePage {


    public CreateChecklistPage() throws IOException {
        super();

    }

    public @FindBy(id = "new-template")
    WebElement buttonAddTemplate;

    public @FindBy(xpath = "//LI[@class='new-template-list-item ng-binding'][text()='Checklist']")
    WebElement optionChecklist;

    public @FindBy(xpath = "//H1[@class='ng-binding'][text()='Add checklist template']")
    WebElement assertChecklistCreatePage;

    public @FindBy(css = "fieldset > input")
    WebElement textTitle;

    public @FindBy(css = "fieldset > textarea")
    WebElement textDesc;

    public @FindBy(css = " span > span.ui-select-match-text.pull-left")
    WebElement clickCategory;

    public @FindBy(xpath = "//INPUT[@type='search']/..//DIV[@class='template-category" +
            " ng-binding ng-scope'][text()='Automation']")
    WebElement automationCategory;

    public @FindBy(id = "add-more-items")
    WebElement textAdditem;

    public @FindBy(css = "form > div:nth-child(1) > div > div > div")
    WebElement buttonSelectType;

    public @FindBy(xpath = "//DIV[@class='fm-select-title fm-select-title-highlighted']" +
            "/..//STRONG[@class='ng-binding'][text()='Text']")
    WebElement textSelectType;

    public @FindBy(css = "div:nth-child(1) > button[type=\"submit\"]")
    WebElement buttonAddItem;


    public @FindBy(css = "div > button[type=\"button\"].publish-button.primary.ng-binding")
    WebElement buttonPublish;

    public @FindBy(css = "div.right-growler.ng-scope > div > div > div")
    WebElement assertChecklistCreation;


    public CreateChecklistPage clickAddTemplate() throws Exception {
        waitAndClickElement(buttonAddTemplate);
        return new CreateChecklistPage();
    }

    public CreateChecklistPage clickChecklist() throws Exception {

        waitAndClickElement(optionChecklist);
        Thread.sleep(1000);
        return new CreateChecklistPage();

    }

    public CreateChecklistPage assertCLCreatePage() throws Exception {
        assertChecklistCreatePage.isDisplayed();
        return new CreateChecklistPage();

    }


    public CreateChecklistPage addTitle() throws Exception {
        waitAndClickElement(textTitle);
        sendKeysToWebElement(textTitle, "Checklist_Title_Test " + genUniqueInt());
        return new CreateChecklistPage();

    }


    public CreateChecklistPage addDesc() throws Exception {

        waitAndClickElement(textDesc);
        sendKeysToWebElement(textDesc, "Checklist_Description_Test " + genUniqueInt());
        return new CreateChecklistPage();

    }


    public CreateChecklistPage selectCategory() throws Exception {

        waitAndClickElement(clickCategory);
        waitAndClickElement(automationCategory);
        return new CreateChecklistPage();
    }


    public CreateChecklistPage addItemText() throws Exception {
        waitAndClickElement(textAdditem);
        sendKeysToWebElement(textAdditem, "Automation Test");
        return new CreateChecklistPage();

    }

    public CreateChecklistPage clickSelectType() throws Exception {
        waitAndClickElement(buttonSelectType);
        waitAndClickElement(textSelectType);
        return new CreateChecklistPage();

    }


    public CreateChecklistPage clickAddItem() throws Exception {
        waitAndClickElement(buttonAddItem);
        return new CreateChecklistPage();

    }

    public CreateChecklistPage clickPublish() throws Exception {
        waitAndClickElement(buttonPublish);
        return new CreateChecklistPage();

    }

    public CreateChecklistPage assertChecklistCreation() throws Exception {
        WaitUntilWebElementIsVisible(assertChecklistCreation);
        org.testng.Assert.assertEquals(assertChecklistCreation.getText(), "Checklist template has been saved successfully.");
        return new CreateChecklistPage();

    }

}
