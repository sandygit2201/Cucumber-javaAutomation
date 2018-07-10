package pageobjects.issueslistviewpage;

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
        waitUntilPreLoadElementDissapears(By.cssSelector("fm-app > div:nth-child(4) > div > div > div"));
        return new CustomFieldPage();
    }

    public CustomFieldPage AssertCustomFieldWhileCreatingIssue() throws InterruptedException, IOException {
        waitAndClickElement(First_Issue);
        waitAndClickElement(extraDetailsSection);
        Assert.assertEquals(assertFirstValue.getText(), "High");
        return new CustomFieldPage();
    }

}
