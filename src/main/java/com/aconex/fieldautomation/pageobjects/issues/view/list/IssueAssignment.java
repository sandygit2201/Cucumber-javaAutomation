package com.aconex.fieldautomation.pageobjects.issues.view.list;

import com.aconex.fieldautomation.pageobjects.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static org.awaitility.Awaitility.await;
import static org.hamcrest.Matchers.is;

@SuppressWarnings("Duplicates")

public class IssueAssignment extends BasePage {


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

    public IssueAssignment() throws IOException {
        super();
    }

    public IssueAssignment selectIssue() throws Exception {
        waitAndClickElement(selectIssue);
        Thread.sleep(1000);
        return new IssueAssignment();
    }

    public IssueAssignment checkIssueNotAssigned() throws Exception {
        waitAndClickElement(buttonRefresh);
        waitUntilPreLoadElementDisappears(By.cssSelector("fm-app > div:nth-child(4) > div > div > div"));
        await("Unassigned Issue").atMost(60, TimeUnit.SECONDS)
                .until(issueNotAssigned::getText, is("Not Assigned"));
        issueNotAssigned.isDisplayed();
        return new IssueAssignment();
    }


    public IssueAssignment assignToUserInMyOrg() throws Exception {
        await("Unassigned Issue").atMost(40, TimeUnit.SECONDS)
                .until(issueNotAssigned::getText, is("Not Assigned"));
        waitAndClickElement(issueNotAssigned);
        waitAndClickElement(assignToUser);
        Thread.sleep(1000);
        waitAndClickElement(buttonRefresh);
        waitUntilPreLoadElementDisappears(By.cssSelector("fm-app > div:nth-child(4) > div > div > div"));
        return new IssueAssignment();
    }

    public IssueAssignment assertIssueAssignmentToUser() throws Exception {
        waitAndClickElement(selectIssue);
        Thread.sleep(1000);
        Assert.assertTrue(assertAssignmentToUser.isDisplayed());
        return new IssueAssignment();
    }


    public IssueAssignment assignToOrg() throws Exception {
        waitAndClickElement(issueNotAssigned);
        waitAndClickElement(assignToOrg);
        Thread.sleep(1000);
        waitAndClickElement(buttonRefresh);
        waitUntilPreLoadElementDisappears(By.cssSelector("fm-app > div:nth-child(4) > div > div > div"));
        return new IssueAssignment();
    }

    public IssueAssignment assertIssueAssignmentToOrg() throws Exception {
        Assert.assertTrue(assertAssignmentToOrg.isDisplayed());
        return new IssueAssignment();
    }


    public IssueAssignment clickAssignTo() throws Exception {
        waitAndClickElement(dropdownAssignTo);
        return new IssueAssignment();
    }

    public IssueAssignment assignToUserWhenAddingIssue() throws Exception {
        waitAndClickElement(assignToUserWhileAddingIssue);
        return new IssueAssignment();
    }

    public IssueAssignment assertIssueAssignmentToUserWhileCreatingIssue() throws Exception {
        waitAndClickElement(buttonRefresh);
        waitUntilPreLoadElementDisappears(By.cssSelector("fm-app > div:nth-child(4) > div > div > div"));
        Thread.sleep(1000);
        waitAndClickElement(selectIssue);
        Assert.assertTrue(assertAssignmentToUser.isDisplayed());
        return new IssueAssignment();
    }

    public IssueAssignment assignToOrgWhenAddingIssue() throws Exception {
        waitAndClickElement(assignToOrgWhileAddingIssue);
        return new IssueAssignment();
    }

    public IssueAssignment assertIssueAssignmentToOrgWhileCreatingIssue() throws Exception {
        waitAndClickElement(buttonRefresh);
        waitUntilPreLoadElementDisappears(By.cssSelector("fm-app > div:nth-child(4) > div > div > div"));
        waitUntilWebElementIsVisible(selectIssue);
        waitAndClickElement(selectIssue);
        Assert.assertTrue(assertAssignmentToOrg.isDisplayed());
        return new IssueAssignment();
    }
}




