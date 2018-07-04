package pageObjects.Issues_ListView_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pageObjects.BasePage;

import java.io.IOException;

@SuppressWarnings("Duplicates")

public class issue_assignment_page extends BasePage {


    public issue_assignment_page() throws IOException {
        super();
    }

    public @FindBy(xpath = "(//DIV[@class='issues-list-item clearfix'])[1]")
    WebElement selectIssue;

    public @FindBy(css = "div.organization > div.ng-scope > fm-issue-edit-field > div " +
            "> div > div > div.text.help-text > span")
    WebElement issueNotAssigned;

    public @FindBy(xpath = "//INPUT[@type='search']/..//DIV[@ng-bind-html='item.name " +
            "| highlight: $select.search'][text()='test test']")
    WebElement AssignToUser;

    public @FindBy(xpath = "//INPUT[@type='search']/..//DIV[@ng-bind-html='item.name " +
            "| highlight: $select.search'][text()='Majestic Builders']")
    WebElement AssignToOrg;

    public @FindBy(xpath = "(//SPAN[@class='ng-binding'][text()='test test'][text()='test test'])[2]/../../../../../../../../..")
    WebElement assertAssignmentToUser;

    public @FindBy(xpath = "(//SPAN[@class='ng-binding'][text()='Majestic Builders']" +
            "[text()='Majestic Builders'])[8]/../../../../../../..")
    WebElement assertAssignmentToOrg;

    public @FindBy(css = "div.auiToolbar-left > div.refresh-issues")
    WebElement button_refresh;

    public @FindBy(css = "div:nth-child(3) > aui-collapsible-section > div >" +
            " div > aui-collapsible-section-body > div > div > div:nth-child(1) >" +
            " div > div > div > div > span")
    WebElement dropdown_AssignTo;

    public @FindBy(xpath = "(//INPUT[@type='search'])[4]/..//DIV[@ng-bind-html='item.name | " +
            "highlight: $select.search'][text()='test test']")
    WebElement assignToUserWhileAddingIssue;

    public @FindBy(xpath = "(//INPUT[@type='search'])[4]/..//DIV[@ng-bind-html='item.name " +
            "| highlight: $select.search'][text()='Majestic Builders']")
    WebElement assignToOrgWhileAddingIssue;


    public issue_assignment_page selectIssue() throws Exception {
        waitAndClickElement(selectIssue);
        return new issue_assignment_page();
    }

    public issue_assignment_page checkIssueNotAssigned() throws Exception {
        issueNotAssigned.isDisplayed();
        return new issue_assignment_page();
    }


    public issue_assignment_page assignToUserinMyOrg() throws Exception {
        waitAndClickElement(issueNotAssigned);
        waitAndClickElement(AssignToUser);
        waitAndClickElement(button_refresh);
        waitUntilPreLoadElementDissapears(By.cssSelector("fm-app > div:nth-child(4) > div > div > div"));
        return new issue_assignment_page();
    }

    public issue_assignment_page assertIssueAssignmentToUser() throws Exception {
        Assert.assertTrue(assertAssignmentToUser.isDisplayed());
        return new issue_assignment_page();
    }


    public issue_assignment_page assignToOrg() throws Exception {
        waitAndClickElement(issueNotAssigned);
        waitAndClickElement(AssignToOrg);
        waitAndClickElement(button_refresh);
        waitUntilPreLoadElementDissapears(By.cssSelector("fm-app > div:nth-child(4) > div > div > div"));
        return new issue_assignment_page();
    }

    public issue_assignment_page assertIssueAssignmentToOrg() throws Exception {
        Assert.assertTrue(assertAssignmentToOrg.isDisplayed());
        return new issue_assignment_page();
    }


    public issue_assignment_page clickAssignTo() throws Exception {
        waitAndClickElement(dropdown_AssignTo);
        return new issue_assignment_page();
    }

    public issue_assignment_page assignToUserWhenAddingIssue() throws Exception {
        waitAndClickElement(assignToUserWhileAddingIssue);
        return new issue_assignment_page();
    }

    public issue_assignment_page assertIssueAssignmentToUserWhileCreatingIssue() throws Exception {
        waitAndClickElement(button_refresh);
        waitAndClickElement(selectIssue);
        Assert.assertTrue(assertAssignmentToUser.isDisplayed());
        return new issue_assignment_page();
    }

    public issue_assignment_page assignToOrgWhenAddingIssue() throws Exception {
        waitAndClickElement(assignToOrgWhileAddingIssue);
        return new issue_assignment_page();
    }

    public issue_assignment_page assertIssueAssignmentToOrgWhileCreatingIssue() throws Exception {
        waitAndClickElement(button_refresh);
        waitAndClickElement(selectIssue);
        Assert.assertTrue(assertAssignmentToOrg.isDisplayed());
        return new issue_assignment_page();
    }
}




