package pageobjects.IssuesListView_Page;

import gherkin.lexer.Th;
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
    WebElement FirstCustomField;

    public @FindBy(xpath = "(//INPUT[@type='search'])[3]/..//DIV[@ng-bind-html='label | highlight: $select.search'][text()='High']")
    WebElement DropDown_FirstValue;

    public @FindBy(css = "div.auiToolbar-left > div.refresh-issues")
    WebElement button_Refresh;

    public @FindBy(xpath = "(//DIV[@class='issues-list-item clearfix'])[1]")
    WebElement First_Issue;

    public @FindBy(xpath = "(//SPAN[@class='auiIcon auiCollapsibleSection-headerArrow chevronRight'])[1]")
    WebElement extraDetailsSection;

    public @FindBy(xpath = "(//DIV[@class='readonly-view ng-scope'])[5]")
    WebElement assertFirstValue;

    public @FindBy(xpath = "//*[@class='issues group']/child::li[1]")
    WebElement clickFirstIssue;


    public @FindBy(xpath = "//SPAN[@class='ng-binding ng-scope'][text()='Extra Details (1)']")
    WebElement extraDetailCollapse;

    public @FindBy(xpath = "//SPAN[@class='ng-binding'][text()='Select...']")
    WebElement customFieldDropdown;

    public @FindBy(xpath = "//DIV[@ng-bind-html='label | highlight: $select.search'][text()='High']")
    WebElement selectHighfromDropDown;

    public @FindBy(xpath = "(//DIV[@class='text'])[2]")
    WebElement assertHighValue;


    public CustomFieldPage ClickOnFirstCustomField() throws InterruptedException, IOException {
        waitAndClickElement(FirstCustomField);
        return new CustomFieldPage();
    }

    public CustomFieldPage ClickOnFirstDropdownValue() throws InterruptedException, IOException {
        waitAndClickElement(DropDown_FirstValue);
        return new CustomFieldPage();
    }


    public CustomFieldPage ClickRefresh() throws InterruptedException, IOException {
        waitAndClickElement(button_Refresh);
        waitUntilPreLoadElementDisappears(By.cssSelector("fm-app > div:nth-child(4) > div > div > div"));
        return new CustomFieldPage();
    }

    public CustomFieldPage AssertCustomFieldWhileCreatingIssue() throws InterruptedException, IOException {
        waitAndClickElement(First_Issue);
        waitAndClickElement(extraDetailsSection);
        Assert.assertEquals(assertFirstValue.getText(), "High");
        return new CustomFieldPage();
    }

    public CustomFieldPage ClickonFirstIssue() throws InterruptedException, IOException {
        waitAndClickElement(clickFirstIssue);
        return new CustomFieldPage();
    }

    public CustomFieldPage ClickExtraDetailCollapseHeader() throws InterruptedException, IOException {

        waitAndClickElement(extraDetailCollapse);
        return new CustomFieldPage();
    }

    public CustomFieldPage SelectHighValueFromDropdown() throws InterruptedException, IOException {
        waitAndClickElement(customFieldDropdown);
        waitAndClickElement(selectHighfromDropDown);
        return new CustomFieldPage();
    }

    public CustomFieldPage AssertCustomFieldforExistingIssue() throws InterruptedException, IOException {
        waitAndClickElement(button_Refresh);
        waitUntilPreLoadElementDissapears(By.cssSelector("fm-app > div:nth-child(4) > div > div > div"));
        waitAndClickElement(extraDetailCollapse);
        Assert.assertEquals(assertHighValue.getText(), "High");
        return new CustomFieldPage();
    }
}
