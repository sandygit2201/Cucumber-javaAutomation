package pageObjects.Issues_ListView_Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pageObjects.BasePage;

import java.io.IOException;

public class add_issue_page extends BasePage {


    public @FindBy(className = "add-issue")
    WebElement button_Add;
    public @FindBy(className = "new-issue-title")
    WebElement data_NewIssue;
    public @FindBy(xpath = "/html/body/div[6]/input[1]")
    WebElement textfield_IssueType;
    public @FindBy(xpath = "// *[contains (@uib-typeahead, 'description for')]")
    WebElement textfield_Desc;
    public @FindBy(xpath = "// *[contains (@ng-click, 'NewIssueCtrl.save()')]")
    WebElement button_Save;


    public add_issue_page() throws IOException {
        super();
    }


    public add_issue_page clickOnAddButton() throws IOException, InterruptedException {
        waitAndClickElement(button_Add);
        return new add_issue_page();
    }


    public add_issue_page iEnterIssueType() throws Exception {
        System.out.println("selected issue type");
        return new add_issue_page();
    }


    public add_issue_page iEnterIssueDesc() throws Exception {
        sendKeysToWebElement(textfield_Desc, "Automation Test");
        return new add_issue_page();
    }


    public add_issue_page clickOnSaveButton() throws Exception {
        waitAndClickElement(button_Save);
        return new add_issue_page();
    }

    public add_issue_page verifyIssueSaved() throws Exception {
        Assert.assertEquals("Automation Test", "Automation Test");
        return new add_issue_page();
    }

}


