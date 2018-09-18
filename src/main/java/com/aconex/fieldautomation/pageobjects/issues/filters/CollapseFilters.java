package com.aconex.fieldautomation.pageobjects.issues.filters;

import com.aconex.fieldautomation.pageobjects.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class CollapseFilters extends BasePage {

    public @FindBy(className = "issues-filters-list")
    WebElement expandedFilterSection;

    public @FindBy(xpath = "//SPAN[@class='auiIcon chevronLeft']")
    WebElement filterCollapseIcon;

    public @FindBy(xpath = "//ISSUES-FILTER[@class='issues-filter-component ng-isolate-scope']")
    WebElement noFilterSection;

    public @FindBy(xpath = "//SPAN[@class='auiIcon chevronUp']")
    WebElement filterExpandIcon;

    public CollapseFilters() throws IOException {
        super();
    }

    public CollapseFilters verifyExpandedFilterPane() throws InterruptedException, IOException {
        expandedFilterSection.isDisplayed();
        return new CollapseFilters();
    }

    public CollapseFilters clickOnFilterCollapseIcon() throws InterruptedException, IOException {
        waitAndClickElement(filterCollapseIcon);
        return new CollapseFilters();

    }

    public CollapseFilters verifyNoFilterPane() throws InterruptedException, IOException {
        noFilterSection.isDisplayed();
        return new CollapseFilters();

    }

    public CollapseFilters clickOnExpandFilterIcon() throws InterruptedException, IOException {
        waitAndClickElement(filterExpandIcon);
        return new CollapseFilters();
    }
}
