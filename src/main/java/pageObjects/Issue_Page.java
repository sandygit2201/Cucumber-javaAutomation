package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.io.IOException;

public class Issue_Page extends BasePage {

    public @FindBy (className = "add-issue") WebElement button_Add;
    public @FindBy (className = "new-issue-title") WebElement data_NewIssue;
    public @FindBy (xpath = "/html/body/div[6]/input[1]") WebElement textfield_IssueType;
    public @FindBy (xpath = "// *[contains (@uib-typeahead, 'description for')]") WebElement textfield_Desc;
    public @FindBy (xpath = "// *[contains (@ng-click, 'NewIssueCtrl.save()')]") WebElement button_Save;


    public Issue_Page() throws IOException {
        super ();
    }


    public Issue_Page clickOnAddButton () throws IOException, InterruptedException {
        waitAndClickElement(button_Add);
        return new Issue_Page();
    }


    public Issue_Page iEnterIssueType () throws Exception {

        System.out.println ("selected issue type");
        return new Issue_Page();
    }


    public Issue_Page iEnterIssueDesc() throws Exception {
        sendKeysToWebElement(textfield_Desc, "New Issue Desc");
        return new Issue_Page();
    }


    public Issue_Page clickOnSaveButton() throws Exception {
        waitAndClickElement(button_Save);
        return new Issue_Page();
    }

    public Issue_Page verifyIssueSaved() throws Exception {
        Assert.assertEquals("New Issue Desc","New Issue Desc");
        return new Issue_Page();
    }

}
