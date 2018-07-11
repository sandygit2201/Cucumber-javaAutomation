package pageobjects.IssuesListView_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pageobjects.BasePage;

import java.io.IOException;

public class CustomFieldPage extends BasePage {

    public CustomFieldPage() throws IOException {
        super();
    }


    public @FindBy(xpath = "(//SPAN[@tabindex='-1'])[2]")
    WebElement firstCustomField;

    public @FindBy(xpath = "(//INPUT[@type='search'])[3]/..//DIV[@ng-bind-html='label | highlight: $select.search'][text()='High']")
    WebElement dropDownFirstValue;

    public @FindBy(css = "div.auiToolbar-left > div.refresh-issues")
    WebElement buttonRefresh;

    public @FindBy(xpath = "(//DIV[@class='issues-list-item clearfix'])[1]")
    WebElement firstIssue;

    public @FindBy(xpath = "(//SPAN[@class='auiIcon auiCollapsibleSection-headerArrow chevronRight'])[1]")
    WebElement extraDetailsSection;

    public @FindBy(xpath = "(//DIV[@class='readonly-view ng-scope'])[5]")
    WebElement assertFirstValue;

    public CustomFieldPage clickOnFirstCustomField() throws InterruptedException, IOException {
        waitAndClickElement(firstCustomField);
        return new CustomFieldPage();
    }

    public CustomFieldPage clickOnFirstDropdownValue() throws InterruptedException, IOException {
        waitAndClickElement(dropDownFirstValue);
        return new CustomFieldPage();
    }


    public CustomFieldPage clickRefresh() throws InterruptedException, IOException {
        waitAndClickElement(buttonRefresh);
        waitUntilPreLoadElementDisappears(By.cssSelector("fm-app > div:nth-child(4) > div > div > div"));
        return new CustomFieldPage();
    }

    public CustomFieldPage assertCustomFieldWhileCreatingIssue() throws InterruptedException, IOException {
        waitAndClickElement(firstIssue);
        waitAndClickElement(extraDetailsSection);
        Assert.assertEquals(assertFirstValue.getText(), "High");
        return new CustomFieldPage();
    }

}
