package com.acx.pageobjects.IssuesFilters_Page;

import com.acx.pageobjects.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class CollapseFiltersPage extends BasePage {

    public @FindBy(className = "issues-filters-list")
    WebElement expandedFilterSection;

    public @FindBy(xpath = "//SPAN[@class='auiIcon chevronLeft']")
    WebElement filterCollapseIcon;

    public @FindBy(xpath = "//ISSUES-FILTER[@class='issues-filter-component ng-isolate-scope']")
    WebElement noFilterSection;

    public @FindBy(xpath = "//SPAN[@class='auiIcon chevronUp']")
    WebElement filterExpandIcon;

    public CollapseFiltersPage() throws IOException {
        super();
    }

    public CollapseFiltersPage verifyExpandedFilterPane() throws InterruptedException, IOException{
        expandedFilterSection.isDisplayed();
        return new CollapseFiltersPage();
    }

    public CollapseFiltersPage clickOnFilterCollapseIcon() throws InterruptedException, IOException{
        waitAndClickElement(filterCollapseIcon);
        return new CollapseFiltersPage();

    }

    public CollapseFiltersPage verifyNoFilterPane() throws InterruptedException, IOException{
        noFilterSection.isDisplayed();
        return new CollapseFiltersPage();

    }

    public CollapseFiltersPage clickOnExpandFilterIcon() throws InterruptedException, IOException{
        waitAndClickElement(filterExpandIcon);
        return new CollapseFiltersPage();
    }
}
