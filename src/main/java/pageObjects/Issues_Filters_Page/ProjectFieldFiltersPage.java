package pageObjects.Issues_Filters_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pageObjects.BasePage;

import java.io.IOException;

public class ProjectFieldFiltersPage extends BasePage {

    public ProjectFieldFiltersPage() throws IOException {
        super();
    }

    public @FindBy(css = "div.custom-fields-filter-link.ng-scope > span")
    WebElement filter_ExtraDetails;

    public @FindBy(css = "div.auiModal-header > h3")
    WebElement modal_ExtraDetails;

    public @FindBy(css = "div.custom-fields-list > li.ng-binding.ng-scope.active")
    WebElement select_FirstProjectField;

    public @FindBy(css = "div:nth-child(1) > label > input")
    WebElement checkbox_FirstValue;

    public @FindBy(css = "div.auiModal-footer > button.auiButton.primary.default.apply.ng-binding")
    WebElement button_Apply;

    public @FindBy(css = "fm-app > div:nth-child(4) > div > div > div")
    WebElement loader_PageLoader;

    public @FindBy(css = "div.extra-details.ng-scope > aui-collapsible-section > div >" +
            " div > aui-collapsible-section-header > div > span:nth-child(2) > span")
    WebElement extraDetailsSection;

    public @FindBy(xpath = "(//DIV[@class='text'])[2]")
    WebElement assertFirstValue;


    public ProjectFieldFiltersPage clickOnExtraDetails() throws Exception {
        waitAndClickElement(filter_ExtraDetails);
        return new ProjectFieldFiltersPage();
    }


    public ProjectFieldFiltersPage viewExtraDetailsModal() throws Exception {
        Assert.assertEquals(modal_ExtraDetails.getText(), "Extra details");
        return new ProjectFieldFiltersPage();
    }

    public ProjectFieldFiltersPage clickOnFirstProjectField() throws Exception {
        waitAndClickElement(select_FirstProjectField);
        return new ProjectFieldFiltersPage();
    }

    public ProjectFieldFiltersPage selectFirstValue() throws Exception {
        waitAndClickElement(checkbox_FirstValue);
        return new ProjectFieldFiltersPage();
    }

    public ProjectFieldFiltersPage clickApplyButton() throws Exception {
        waitAndClickElement(button_Apply);
        return new ProjectFieldFiltersPage();
    }

    public ProjectFieldFiltersPage assertLoadingScreen() throws Exception {
        loader_PageLoader.isDisplayed();
        waitUntilPreLoadElementDissapears(By.cssSelector("fm-app > div:nth-child(4) > div > div > div"));
        return new ProjectFieldFiltersPage();
    }

    public ProjectFieldFiltersPage assertProjectFieldFilterResult() throws Exception {

        waitAndClickElement(extraDetailsSection);
        Assert.assertEquals(assertFirstValue.getText(), "High");
        return new ProjectFieldFiltersPage();
    }


}
