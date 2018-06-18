package pageObjects.Issues_ListView_Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pageObjects.BasePage;

import java.io.IOException;

public class add_issue_page extends BasePage {


    public @FindBy(className = "add-issue")
    WebElement button_Add;
    public @FindBy(xpath = "//SPAN[@ng-hide='$select.isEmpty()'][text()='Building']/self::SPAN")
    WebElement textfield_IssueType;
    public @FindBy(xpath = "//DIV[@ng-bind-html='item.name | issueTypeI18n | highlight: $select.search'][text()='Defect']")
    WebElement textfield_SelectIssueType;

    public @FindBy(xpath = "// *[contains (@uib-typeahead, 'description for')]")
    WebElement textfield_Desc;
    public @FindBy(css = ".primary> span")
    WebElement button_Save;

    public @FindBy(xpath = "//DIV[@class='auiMessage success']//DIV[@class='auiMessage-content ng-binding'][text()='Issue captured']")
    WebElement growler;



    public add_issue_page() throws IOException {
        super();
    }


    public add_issue_page clickOnAddButton() throws IOException, InterruptedException {
        waitAndClickElement(button_Add);
        return new add_issue_page();
    }


    public add_issue_page iEnterIssueType() throws Exception {
        waitAndClickElement(textfield_IssueType);
        waitAndClickElement(textfield_SelectIssueType);

        return new add_issue_page();
    }


    public add_issue_page iEnterIssueDesc() throws Exception {
        sendKeysToWebElement(textfield_Desc, "Automation Test");
        return new add_issue_page();
    }


    public add_issue_page clickOnSaveButton() throws Exception {
        waitAndClickElement(button_Save);
        Thread.sleep(1000);
        return new add_issue_page();
    }

    public add_issue_page verifyIssueSaved() throws Exception {
        growler.isDisplayed();
        return new add_issue_page();
    }

}


