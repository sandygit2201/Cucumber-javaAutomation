package com.aconex.fieldautomation.pageobjects.issues.filters;

import com.aconex.fieldautomation.pageobjects.BasePage;
import com.aconex.fieldautomation.utils.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.io.IOException;
import java.util.List;

public class ProjectFieldFilters extends BasePage {

    public @FindBy(css = "div.custom-fields-filter-link.ng-scope > span")
    WebElement filterExtraDetails;
    public @FindBy(css = "div.auiModal-header > h3")
    WebElement modalExtraDetails;
    public @FindBy(css = "div.custom-fields-list > li.ng-binding.ng-scope.active")
    WebElement selectFirstProjectField;
    public @FindBy(css = "div:nth-child(1) > label > input")
    WebElement checkboxFirstValue;
    public @FindBy(css = "div.auiModal-footer > button.auiButton.primary.default.apply.ng-binding")
    WebElement buttonApply;
    public @FindBy(css = "fm-app > div:nth-child(4) > div > div > div")
    WebElement loaderPageLoader;
    public @FindBy(xpath = "(//SPAN[@class='auiIcon auiCollapsibleSection-headerArrow chevronRight'])[1]")
    WebElement extraDetailsSection;
    public @FindBy(xpath = "(//DIV[@class='readonly-view ng-scope'])[5]")
    WebElement assertFirstValue;

    public ProjectFieldFilters() throws IOException {
        super();
    }

    public ProjectFieldFilters clickOnExtraDetails() throws Exception {
        waitAndClickElement(filterExtraDetails);
        return new ProjectFieldFilters();
    }


    public ProjectFieldFilters viewExtraDetailsModal() throws Exception {
        Assert.assertEquals(modalExtraDetails.getText(), "Extra details");
        return new ProjectFieldFilters();
    }

    public ProjectFieldFilters clickOnFirstProjectField() throws Exception {
        waitAndClickElement(selectFirstProjectField);
        return new ProjectFieldFilters();
    }

    public ProjectFieldFilters selectFirstValue() throws Exception {
        waitAndClickElement(checkboxFirstValue);
        return new ProjectFieldFilters();
    }

    public ProjectFieldFilters clickApplyButton() throws Exception {
        waitAndClickElement(buttonApply);
        return new ProjectFieldFilters();
    }

    public ProjectFieldFilters assertLoadingScreen() throws Exception {
        loaderPageLoader.isDisplayed();
        waitUntilPreLoadElementDisappears(By.cssSelector("fm-app > div:nth-child(4) > div > div > div"));
        return new ProjectFieldFilters();
    }

    public ProjectFieldFilters assertProjectFieldFilterResult() throws Exception {
        By issuesDisplayed = By.xpath("(//DIV[@class='issues-list-item clearfix'])[position() < 11]");
        List<WebElement> lstItems = DriverFactory.driver.findElements(issuesDisplayed);
        for (WebElement eleItem : lstItems) {
            waitAndClickElement(eleItem);
            waitAndClickElement(extraDetailsSection);
            Assert.assertEquals(assertFirstValue.getText(), "High");
        }
        return new ProjectFieldFilters();

    }
}







