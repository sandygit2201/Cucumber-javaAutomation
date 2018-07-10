package pageobjects.issuesfilterspage;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pageobjects.BasePage;

public class ProjectFieldFiltersPage extends BasePage {

    public ProjectFieldFiltersPage() throws IOException {
        super();
    }

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


    public ProjectFieldFiltersPage clickOnExtraDetails() throws Exception {
        waitAndClickElement(filterExtraDetails);
        return new ProjectFieldFiltersPage();
    }


    public ProjectFieldFiltersPage viewExtraDetailsModal() throws Exception {
        Assert.assertEquals(modalExtraDetails.getText(), "Extra details");
        return new ProjectFieldFiltersPage();
    }

    public ProjectFieldFiltersPage clickOnFirstProjectField() throws Exception {
        waitAndClickElement(selectFirstProjectField);
        return new ProjectFieldFiltersPage();
    }

    public ProjectFieldFiltersPage selectFirstValue() throws Exception {
        waitAndClickElement(checkboxFirstValue);
        return new ProjectFieldFiltersPage();
    }

    public ProjectFieldFiltersPage clickApplyButton() throws Exception {
        waitAndClickElement(buttonApply);
        return new ProjectFieldFiltersPage();
    }

    public ProjectFieldFiltersPage assertLoadingScreen() throws Exception {
        loaderPageLoader.isDisplayed();
        waitUntilPreLoadElementDisappears(By.cssSelector("fm-app > div:nth-child(4) > div > div > div"));
        return new ProjectFieldFiltersPage();
    }

    public ProjectFieldFiltersPage assertProjectFieldFilterResult() throws Exception {
        List<WebElement> lstItems = driver.findElements(By.xpath("//DIV[@class='issues-list-item clearfix']/self::DIV"));
        for (WebElement eleItem : lstItems) {
            waitAndClickElement(eleItem);
            waitAndClickElement(extraDetailsSection);
            Assert.assertEquals(assertFirstValue.getText(), "High");
        }
        return new ProjectFieldFiltersPage();

    }
}







