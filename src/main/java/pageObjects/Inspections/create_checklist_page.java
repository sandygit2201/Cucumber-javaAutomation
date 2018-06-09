package pageObjects.Inspections;

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

    public @FindBy(xpath = "//INPUT[@class='form-control ng-pristine ng-untouched ng-empty ng-invalid ng-invalid-required ng-valid-maxlength']")
    WebElement textTitle;

    public @FindBy(xpath = "//TEXTAREA[@class='template-description form-control ng-pristine ng-untouched ng-valid ng-empty ng-valid-maxlength']")
    WebElement textDesc;

    public @FindBy(id = "add-more-items")
    WebElement textAdditem;

    public @FindBy(xpath = " /html/body/div[1]/fm-app/div[3]/div/div/div/div[2]/div[2]/div/div" +
            "/div[2]/fieldset/div/div[2]/fieldset/form/div[1]/div/div/div/span")
    WebElement buttonSelectType;

    public @FindBy(xpath = "//STRONG[@class='ng-binding'][text()='Text']")
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

    public create_checklist_page addItemText() throws Exception {
        waitAndClickElement(textAdditem);
        sendKeysToWebElement(textAdditem, "Automation Test");
        return new create_checklist_page();

    }

    public create_checklist_page clickSelectType() throws Exception {
        waitAndClickElement(buttonSelectType);
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
