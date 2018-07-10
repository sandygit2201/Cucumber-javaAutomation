package pageobjects.issueslistviewpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.BasePage;

import java.io.IOException;

public class AddIssuePage extends BasePage {


    public @FindBy(className = "add-issue")
    WebElement button_Add;

    public @FindBy(css = "div:nth-child(1) > div > div > div > span > span.ui-select-match-text.pull-left")
    WebElement textfield_IssueType;

    public @FindBy(xpath = "(//INPUT[@type='search'])[3]/..//DIV[@ng-bind-html='item.name | issueTypeI18n | highlight: $select.search'][text()='Automation']")
    WebElement textfield_AutomationIssueType;

    public @FindBy(xpath = "// *[contains (@uib-typeahead, 'description for')]")
    WebElement textfield_Desc;

    public @FindBy(css = ".primary> span")
    WebElement button_Save;

    public @FindBy(xpath = "//DIV[@class='auiMessage success']//DIV[@class='auiMessage-content ng-binding'][text()='Issue captured']")
    WebElement growler;

    public @FindBy(css = "div:nth-child(2) > div > div > div > span > button > i")
    WebElement icon_dueDate;

    public @FindBy(css = "th:nth-child(3) > button[type=\"button\"] > i")
    WebElement icon_nextMonth;

    public @FindBy(css = "tr:nth-child(3) > td:nth-child(2) > button[type=\"button\"] > span")
    WebElement numeral_dateRandom;

    public @FindBy(css = "div:nth-child(5) > div > input")
    WebElement textfield_Location;


    public @FindBy(xpath = "//A[@href=''][text()='Issue Description  - Automation']")
    WebElement dropdown_IssueDesc;

    public @FindBy(xpath = "//A[@href=''][text()='Automation - East']")
    WebElement dropdown_Location;


    public AddIssuePage() throws IOException {
        super();
    }


    public AddIssuePage clickOnAddButton() throws IOException, InterruptedException {
        waitUntilPreLoadElementDissapears(By.cssSelector("fm-app > div:nth-child(4) > div > div > div"));
        waitAndClickElement(button_Add);
        return new AddIssuePage();
    }


    public AddIssuePage iEnterIssueType() throws Exception {
        waitAndClickElement(textfield_IssueType);
        waitAndClickElement(textfield_AutomationIssueType);
        return new AddIssuePage();
    }


    public AddIssuePage iEnterIssueDesc() throws Exception {
        sendKeysToWebElement(textfield_Desc, "Automation Test");
        return new AddIssuePage();
    }


    public AddIssuePage clickOnSaveButton() throws Exception {
        waitAndClickElement(button_Save);
        Thread.sleep(1000);
        return new AddIssuePage();
    }

    public AddIssuePage verifyIssueSaved() throws Exception {
        Thread.sleep(100);
        growler.isDisplayed();
        return new AddIssuePage();
    }

    public AddIssuePage clickOnIssueType() throws Exception {
        waitAndClickElement(textfield_IssueType);
        return new AddIssuePage();
    }

    public AddIssuePage assertIssueTypeOrder() throws Exception {
        boolean CheckOrder = CheckSorting("(//INPUT[@type='search'])[4]/following-sibling::UL");
        return new AddIssuePage();

    }

    public AddIssuePage selectDueDate() throws Exception {
        waitAndClickElement(icon_dueDate);
        waitAndClickElement(icon_nextMonth);
        waitAndClickElement(numeral_dateRandom);
        return new AddIssuePage();
    }


    public AddIssuePage addLocation() throws Exception {
        sendKeysToWebElement(textfield_Location, "Automation Location");
        return new AddIssuePage();
    }


    public AddIssuePage Dropdown_selectIssueDesc() throws Exception {
        waitAndClickElement(textfield_Desc);
        waitAndClickElement(dropdown_IssueDesc);
        return new AddIssuePage();
    }

    public AddIssuePage Dropdown_selectLocation() throws Exception {
        waitAndClickElement(textfield_Location);
        waitAndClickElement(dropdown_Location);
        return new AddIssuePage();
    }

}



