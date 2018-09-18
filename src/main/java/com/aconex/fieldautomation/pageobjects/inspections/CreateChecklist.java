package com.aconex.fieldautomation.pageobjects.inspections;

import com.aconex.fieldautomation.pageobjects.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class CreateChecklist extends BasePage {


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
    WebElement textAddItem;
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

    public CreateChecklist() throws IOException {
        super();

    }

    public CreateChecklist clickAddTemplate() throws Exception {
        waitAndClickElement(buttonAddTemplate);
        return new CreateChecklist();
    }

    public CreateChecklist clickChecklist() throws Exception {

        waitAndClickElement(optionChecklist);
        Thread.sleep(1000);
        return new CreateChecklist();

    }

    public CreateChecklist assertCLCreatePage() throws Exception {
        assertChecklistCreatePage.isDisplayed();
        return new CreateChecklist();

    }


    public CreateChecklist addTitle() throws Exception {
        waitAndClickElement(textTitle);
        sendKeysToWebElement(textTitle, "Checklist_Title_Test " + genUniqueInt());
        return new CreateChecklist();

    }


    public CreateChecklist addDescription() throws Exception {

        waitAndClickElement(textDesc);
        sendKeysToWebElement(textDesc, "Checklist_Description_Test " + genUniqueInt());
        return new CreateChecklist();

    }


    public CreateChecklist selectCategory() throws Exception {

        waitAndClickElement(clickCategory);
        waitAndClickElement(automationCategory);
        return new CreateChecklist();
    }


    public CreateChecklist addItemText() throws Exception {
        waitAndClickElement(textAddItem);
        sendKeysToWebElement(textAddItem, "Automation Test");
        return new CreateChecklist();

    }

    public CreateChecklist clickSelectType() throws Exception {
        waitAndClickElement(buttonSelectType);
        waitAndClickElement(textSelectType);
        return new CreateChecklist();

    }


    public CreateChecklist clickAddItem() throws Exception {
        waitAndClickElement(buttonAddItem);
        return new CreateChecklist();

    }

    public CreateChecklist clickPublish() throws Exception {
        waitAndClickElement(buttonPublish);
        return new CreateChecklist();

    }

    public CreateChecklist assertChecklistCreation() throws Exception {
        waitUntilWebElementIsVisible(assertChecklistCreation);
        org.testng.Assert.assertEquals(assertChecklistCreation.getText(), "Checklist template has been saved successfully.");
        return new CreateChecklist();

    }

}
