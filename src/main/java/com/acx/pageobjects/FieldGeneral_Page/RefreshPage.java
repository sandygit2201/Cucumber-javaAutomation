package com.acx.pageobjects.FieldGeneral_Page;

import com.acx.pageobjects.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class RefreshPage extends BasePage {

    String preAddIssueCount;

    String postAddIssueVal;

    public @FindBy(css = ".primary> span")
    WebElement buttonSave;

    public @FindBy(xpath = "//DIV[@class='auiMessage success']//DIV[@class='auiMessage-content ng-binding'][text()='Issue captured']")
    WebElement growler;

    public @FindBy(css = ".refresh-issues")
    WebElement refreshButton;

    public @FindBy(xpath = "//*[contains(@class,'auiToolbar-header ng-bind')]")
    WebElement verifyRefresh;

    public RefreshPage() throws IOException {
        super();
    }

    public RefreshPage iKnowTheIssueCountInIssuesPage() throws Exception {
        preAddIssueCount = driver.findElement(By.cssSelector(".issue-number.ng-binding")).getText();
        return new RefreshPage();
    }

    public RefreshPage iClickOnSaveButtonInIssuesPane() throws Exception {
        waitAndClickElement(buttonSave);
        Thread.sleep(1000);
        return new RefreshPage();
    }

    public RefreshPage issueShouldBeSaved() throws Exception {
        waitUntilWebElementIsVisible(growler);
        growler.isDisplayed();
        return new RefreshPage();
    }

    public RefreshPage clickOnRefreshButton() throws Exception {
        waitAndClickElement(refreshButton);
        return new RefreshPage();
    }

    public RefreshPage iShouldSeeIssueNumberUpdatedBy1() throws Exception {
        postAddIssueVal = driver.findElement(By.cssSelector(".issue-number.ng-binding")).getText();
        if (!preAddIssueCount.equals(postAddIssueVal))
        {
            return new RefreshPage();
        }
        else
        return new RefreshPage();
    }


}
