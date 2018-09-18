package com.aconex.fieldautomation.pageobjects.issues.filters;


import com.aconex.fieldautomation.pageobjects.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class ClearAllFilters extends BasePage {

    public @FindBy(xpath = "//input[@type='checkbox'][@value='readytoinspect']")
    WebElement checkboxReadyToInspect;

    public @FindBy(xpath = "//input[@type='checkbox'][@value='271341877549073149']")
    WebElement checkboxAutomation;

    public @FindBy(xpath = "(//I[@class='glyphicon glyphicon-calendar'])[2]")
    WebElement dateCreatedOn;

    public @FindBy(css = "div:nth-child(8) > div.ranges > ul > li:nth-child(2)")
    WebElement selectTodayDate;

    public @FindBy(className = "auiText-large")
    WebElement assertNumberofFilters;

    public @FindBy(xpath = "//DIV[@class='clear-all-filter ng-binding ng-scope'][text()='Clear All']")
    WebElement clearAllFilter;

    public ClearAllFilters() throws IOException {
        super();
    }

    public ClearAllFilters clickReadyToInspectFilter() throws InterruptedException, IOException {
        waitAndClickElement(checkboxReadyToInspect);
        waitUntilPreLoadElementDisappears(By.cssSelector("fm-app > div:nth-child(4) > div > div > div"));
        return new ClearAllFilters();
    }

    public ClearAllFilters clickAutomationIssueTypeFilter() throws InterruptedException, IOException {
        waitAndClickElement(checkboxAutomation);
        waitUntilPreLoadElementDisappears(By.cssSelector("fm-app > div:nth-child(4) > div > div > div"));
        return new ClearAllFilters();

    }

    public ClearAllFilters selectCreatedOnfilter() throws InterruptedException, IOException {
        waitAndClickElement(dateCreatedOn);
        waitAndClickElement(selectTodayDate);
        waitUntilPreLoadElementDisappears(By.cssSelector("fm-app > div:nth-child(4) > div > div > div"));
        return new ClearAllFilters();

    }

    public ClearAllFilters assertFilterCount() throws InterruptedException, IOException {
        org.testng.Assert.assertEquals(assertNumberofFilters.getText(), "Filters (3)");
        return new ClearAllFilters();
    }

    public ClearAllFilters clickOnClearAllFilter() throws InterruptedException, IOException {
        waitAndClickElement(clearAllFilter);
        waitUntilPreLoadElementDisappears(By.cssSelector("fm-app > div:nth-child(4) > div > div > div"));
        return new ClearAllFilters();
    }

    public ClearAllFilters assertFilterCountAfterClearAll() throws InterruptedException, IOException {
        org.testng.Assert.assertEquals(assertNumberofFilters.getText(), "Filters ");
        return new ClearAllFilters();
    }
}
