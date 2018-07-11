package pageobjects.IssuesListView_Page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pageobjects.BasePage;

@SuppressWarnings("Duplicates")

public class IssueAssignmentPage extends BasePage {


    public IssueAssignmentPage() throws IOException {
        super();
    }

    public @FindBy(xpath = "(//DIV[@class='issues-list-item clearfix'])[1]")
    WebElement selectIssue;

    public @FindBy(css = "div.organization > div.ng-scope > fm-issue-edit-field > div > div > div > div.text.help-text > span")
    WebElement issueNotAssigned;

    public @FindBy(xpath = "//INPUT[@type='search']/..//DIV[@ng-bind-html='item.name " +
            "| highlight: $select.search'][text()='Automation User']")
    WebElement assignToUser;

    public @FindBy(xpath = "//INPUT[@type='search']/..//DIV[@ng-bind-html='item.name " +
            "| highlight: $select.search'][text()='Majestic Builders']")
    WebElement assignToOrg;

    public @FindBy(xpath = "//DIV[@class='title assigned-to-title ng-binding'][text()='Assigned to']/..//" +
            "SPAN[@class='ng-binding'][text()='Automation User'][text()='Automation User']")
    WebElement assertAssignmentToUser;

    public @FindBy(xpath = "//DIV[@class='header']//SPAN[@class='ng-binding'][text()='Majestic Builders'][text()='Majestic Builders']")
    WebElement assertAssignmentToOrg;

    public @FindBy(css = "div.auiToolbar-left > div.refresh-issues")
    WebElement buttonRefresh;

    public @FindBy(css = "div:nth-child(3) > aui-collapsible-section > div >" +
            " div > aui-collapsible-section-body > div > div > div:nth-child(1) >" +
            " div > div > div > div > span")
    WebElement dropdownAssignTo;

    public @FindBy(xpath = "(//INPUT[@type='search'])[3]/..//DIV[@ng-bind-html='item.name | " +
            "highlight: $select.search'][text()='Automation User']")
    WebElement assignToUserWhileAddingIssue;

    public @FindBy(xpath = "(//INPUT[@type='search'])[3]/..//DIV[@ng-bind-html='item.name " +
            "| highlight: $select.search'][text()='Majestic Builders']")
    WebElement assignToOrgWhileAddingIssue;


    public IssueAssignmentPage selectIssue() throws Exception {
        waitAndClickElement(selectIssue);
        return new IssueAssignmentPage();
    }

    public IssueAssignmentPage checkIssueNotAssigned() throws Exception {
        issueNotAssigned.isDisplayed();
        return new IssueAssignmentPage();
    }


    public IssueAssignmentPage assignToUserInMyOrg() throws Exception {
        waitAndClickElement(issueNotAssigned);
        waitAndClickElement(assignToUser);
        Thread.sleep(500);
        waitAndClickElement(buttonRefresh);
        waitUntilPreLoadElementDisappears(By.cssSelector("fm-app > div:nth-child(4) > div > div > div"));
        return new IssueAssignmentPage();
    }

    public IssueAssignmentPage assertIssueAssignmentToUser() throws Exception {
        Assert.assertTrue(assertAssignmentToUser.isDisplayed());
        return new IssueAssignmentPage();
    }


    public IssueAssignmentPage assignToOrg() throws Exception {
        waitAndClickElement(issueNotAssigned);
        waitAndClickElement(assignToOrg);
        Thread.sleep(1000);
        waitAndClickElement(buttonRefresh);
        waitUntilPreLoadElementDisappears(By.cssSelector("fm-app > div:nth-child(4) > div > div > div"));
        return new IssueAssignmentPage();
    }

    public IssueAssignmentPage assertIssueAssignmentToOrg() throws Exception {
        Assert.assertTrue(assertAssignmentToOrg.isDisplayed());
        return new IssueAssignmentPage();
    }


    public IssueAssignmentPage clickAssignTo() throws Exception {
        waitAndClickElement(dropdownAssignTo);
        return new IssueAssignmentPage();
    }

    public IssueAssignmentPage assignToUserWhenAddingIssue() throws Exception {
        waitAndClickElement(assignToUserWhileAddingIssue);
        return new IssueAssignmentPage();
    }

    public IssueAssignmentPage assertIssueAssignmentToUserWhileCreatingIssue() throws Exception {
        waitAndClickElement(buttonRefresh);
        waitUntilPreLoadElementDisappears(By.cssSelector("fm-app > div:nth-child(4) > div > div > div"));
        waitAndClickElement(selectIssue);
        Assert.assertTrue(assertAssignmentToUser.isDisplayed());
        return new IssueAssignmentPage();
    }

    public IssueAssignmentPage assignToOrgWhenAddingIssue() throws Exception {
        waitAndClickElement(assignToOrgWhileAddingIssue);
        return new IssueAssignmentPage();
    }

    public IssueAssignmentPage assertIssueAssignmentToOrgWhileCreatingIssue() throws Exception {
        waitAndClickElement(buttonRefresh);
        waitUntilPreLoadElementDisappears(By.cssSelector("fm-app > div:nth-child(4) > div > div > div"));
        waitAndClickElement(selectIssue);
        Assert.assertTrue(assertAssignmentToOrg.isDisplayed());
        return new IssueAssignmentPage();
    }
}




