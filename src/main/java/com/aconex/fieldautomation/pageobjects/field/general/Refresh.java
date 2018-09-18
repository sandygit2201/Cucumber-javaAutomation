package com.aconex.fieldautomation.pageobjects.field.general;

import com.aconex.fieldautomation.pageobjects.BasePage;
import com.aconex.fieldautomation.utils.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class Refresh extends BasePage {

    public @FindBy(css = ".primary> span")
    WebElement buttonSave;
    public @FindBy(xpath = "//DIV[@class='auiMessage success']//DIV[@class='auiMessage-content ng-binding'][text()='Issue captured']")
    WebElement growler;
    public @FindBy(css = ".refresh-issues")
    WebElement refreshButton;
    public @FindBy(xpath = "//*[contains(@class,'auiToolbar-header ng-bind')]")
    WebElement verifyRefresh;
    String preAddIssueCount;
    String postAddIssueVal;

    public Refresh() throws IOException {
        super();
    }

    public Refresh iKnowTheIssueCountInIssuesPage() throws Exception {
        preAddIssueCount = DriverFactory.driver.findElement(By.cssSelector(".issue-number.ng-binding")).getText();
        return new Refresh();
    }

    public Refresh iClickOnSaveButtonInIssuesPane() throws Exception {
        waitAndClickElement(buttonSave);
        Thread.sleep(1000);
        return new Refresh();
    }

    public Refresh issueShouldBeSaved() throws Exception {
        waitUntilWebElementIsVisible(growler);
        growler.isDisplayed();
        return new Refresh();
    }

    public Refresh clickOnRefreshButton() throws Exception {
        waitAndClickElement(refreshButton);
        return new Refresh();
    }

    public Refresh iShouldSeeIssueNumberUpdatedBy1() throws Exception {
        postAddIssueVal = DriverFactory.driver.findElement(By.cssSelector(".issue-number.ng-binding")).getText();
        if (!preAddIssueCount.equals(postAddIssueVal)) {
            return new Refresh();
        } else
            return new Refresh();
    }


}
