package pageObjects.Inspections;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObjects.BasePage;

import java.io.IOException;

public class create_checklist_page extends BasePage {


    public create_checklist_page() throws IOException {
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

    public @FindBy(xpath = "//TEXTAREA[@class='template-description form-control ng-pristine ng-untouched " +
            "ng-valid ng-empty ng-valid-maxlength']")
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

    public @FindBy(xpath = "//BUTTON[@class='primary inline-button add-item ng-binding'][text()='Add']\n")
    WebElement buttonAddItem;


    public @FindBy(xpath = " //BUTTON[@class='publish-button primary ng-binding'][text()='Publish']\n")
    WebElement buttonPublish;


    public create_checklist_page clickAddTemplate() throws Exception {
        waitAndClickElement(buttonAddTemplate);
        return new create_checklist_page();
    }

    public create_checklist_page clickChecklist() throws Exception {

        waitAndClickElement(optionChecklist);
        return new create_checklist_page();

    }

    public create_checklist_page assertCLCreatePage() throws Exception {
        assertChecklistCreatePage.isDisplayed();
        return new create_checklist_page();

    }

    public create_checklist_page addTitle() throws Exception {

        waitAndClickElement(textTitle);
        sendKeysToWebElement(textTitle, "Automation Test");
        return new create_checklist_page();

    }

    public create_checklist_page addDesc() throws Exception {

        waitAndClickElement(textDesc);
        sendKeysToWebElement(textDesc, "Automation Test");
        return new create_checklist_page();

    }


    public create_checklist_page selectCategory() throws Exception {

        waitAndClickElement(clickCategory);
        waitAndClickElement(automationCategory);
//        Thread.sleep(1000);
        return new create_checklist_page();
    }


    public create_checklist_page addItemText() throws Exception {
        waitAndClickElement(textAdditem);
        sendKeysToWebElement(textAdditem, "Automation Test");
        return new create_checklist_page();

    }

    public create_checklist_page clickSelectType() throws Exception {
        waitAndClickElement(buttonSelectType);
        waitAndClickElement(textSelectType);
        return new create_checklist_page();

    }


    public create_checklist_page clickAddItem() throws Exception {
        waitAndClickElement(buttonAddItem);
        return new create_checklist_page();

    }

    public create_checklist_page clickPublish() throws Exception {
        waitAndClickElement(buttonPublish);
        return new create_checklist_page();

    }


}
