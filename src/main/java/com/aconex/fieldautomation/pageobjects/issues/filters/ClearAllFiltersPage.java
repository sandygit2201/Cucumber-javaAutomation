package com.aconex.fieldautomation.pageobjects.issues.filters;


import com.aconex.fieldautomation.pageobjects.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class ClearAllFiltersPage extends BasePage {

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

    public ClearAllFiltersPage() throws IOException {
        super();
    }

    public ClearAllFiltersPage clickReadyToInspectFilter() throws InterruptedException, IOException {
        waitAndClickElement(checkboxReadyToInspect);
        waitUntilPreLoadElementDisappears(By.cssSelector("fm-app > div:nth-child(4) > div > div > div"));
        return new ClearAllFiltersPage();
    }

    public ClearAllFiltersPage clickAutomationIssueTypeFilter() throws InterruptedException, IOException {
        waitAndClickElement(checkboxAutomation);
        waitUntilPreLoadElementDisappears(By.cssSelector("fm-app > div:nth-child(4) > div > div > div"));
        return new ClearAllFiltersPage();

    }

    public ClearAllFiltersPage selectCreatedOnfilter() throws InterruptedException, IOException {
        waitAndClickElement(dateCreatedOn);
        waitAndClickElement(selectTodayDate);
        waitUntilPreLoadElementDisappears(By.cssSelector("fm-app > div:nth-child(4) > div > div > div"));
        return new ClearAllFiltersPage();

    }

    public ClearAllFiltersPage assertFilterCount() throws InterruptedException, IOException {
        org.testng.Assert.assertEquals(assertNumberofFilters.getText(), "Filters (3)");
        return new ClearAllFiltersPage();
    }

    public ClearAllFiltersPage clickOnClearAllFilter() throws InterruptedException, IOException {
        waitAndClickElement(clearAllFilter);
        waitUntilPreLoadElementDisappears(By.cssSelector("fm-app > div:nth-child(4) > div > div > div"));
        return new ClearAllFiltersPage();
    }

    public ClearAllFiltersPage assertFilterCountAfterClearAll() throws InterruptedException, IOException {
        org.testng.Assert.assertEquals(assertNumberofFilters.getText(), "Filters ");
        return new ClearAllFiltersPage();
    }
}
