package pageobjects.IssuesListView_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.BasePage;

import java.io.IOException;

public class AddIssuePage extends BasePage {


    public @FindBy(className = "add-issue")
    WebElement buttonAdd;

    public @FindBy(css = "div:nth-child(1) > div > div > div > span > span.ui-select-match-text.pull-left")
    WebElement textFieldIssueType;

    public @FindBy(xpath = "(//INPUT[@type='search'])[3]/..//DIV[@ng-bind-html='item.name | issueTypeI18n | highlight: $select.search'][text()='Automation']")
    WebElement textFieldAutomationIssueType;

    public @FindBy(xpath = "// *[contains (@uib-typeahead, 'description for')]")
    WebElement textFieldDescription;

    public @FindBy(xpath = "//SPAN[@class='ng-binding'][text()='Save']")
    WebElement buttonSave;

    public @FindBy(xpath = "//DIV[@class='auiMessage success']//DIV[@class='auiMessage-content ng-binding'][text()='Issue captured']")
    WebElement growler;

    public @FindBy(css = "div:nth-child(2) > div > div > div > span > button > i")
    WebElement iconDueDate;

    public @FindBy(css = "th:nth-child(3) > button[type=\"button\"] > i")
    WebElement iconNextMonth;

    public @FindBy(css = "tr:nth-child(3) > td:nth-child(2) > button[type=\"button\"] > span")
    WebElement numeralDateRandom;

    public @FindBy(css = "div:nth-child(5) > div > input")
    WebElement textFieldLocation;

    public @FindBy(css = "div#ui-select-choices-row-0-5 div")
    WebElement dropdownIssueType;

    public @FindBy(xpath = "//A[@href=''][text()='Issue Description  - Automation']")
    WebElement dropdownIssueDescription;

    public @FindBy(xpath = "//A[@href=''][text()='Automation - East']")
    WebElement dropdownLocation;

    public @FindBy(xpath = "//*[@class=\"secondary ng-binding\"]")
    WebElement cancelIssue;

    public @FindBy(xpath = "//*[@class=\"auiButton primary add-issue ng-binding ng-scope\"]")
    WebElement addButton;


    public AddIssuePage() throws IOException {
        super();
    }


    public AddIssuePage clickOnAddButton() throws IOException, InterruptedException {
        waitUntilPreLoadElementDisappears(By.cssSelector("fm-app > div:nth-child(4) > div > div > div"));
        waitAndClickElement(buttonAdd);
        return new AddIssuePage();
    }


    public AddIssuePage iEnterIssueType() throws Exception {
        waitAndClickElement(textFieldIssueType);
        waitAndClickElement(textFieldAutomationIssueType);
        return new AddIssuePage();
    }


    public AddIssuePage iEnterIssueDescription() throws Exception {
        sendKeysToWebElement(textFieldDescription, "Automation Test");
        return new AddIssuePage();
    }


    public AddIssuePage clickOnSaveButton() throws Exception {
        Thread.sleep(1000);
        waitAndClickElement(buttonSave);
        Thread.sleep(1000);
        return new AddIssuePage();
    }

    public AddIssuePage verifyIssueSaved() throws Exception {
        waitUntilWebElementIsVisible(growler);
        growler.isDisplayed();
        return new AddIssuePage();
    }

    public AddIssuePage clickOnIssueType() throws Exception {
        waitAndClickElement(textFieldIssueType);
        return new AddIssuePage();
    }

    public AddIssuePage assertIssueTypeOrder() throws Exception {
        boolean CheckOrder = checkSorting("(//INPUT[@type='search'])[4]/following-sibling::UL");
        return new AddIssuePage();

    }

    public AddIssuePage selectDueDate() throws Exception {
        waitAndClickElement(iconDueDate);
        waitAndClickElement(iconNextMonth);
        waitAndClickElement(numeralDateRandom);
        return new AddIssuePage();
    }


    public AddIssuePage addLocation() throws Exception {
        sendKeysToWebElement(textFieldLocation, "Automation Location");
        return new AddIssuePage();
    }


    public AddIssuePage dropdownSelectIssueType() throws Exception {
        waitAndClickElement(textFieldIssueType);
        waitAndClickElement(dropdownIssueType);
        return new AddIssuePage();
    }

    public AddIssuePage dropdownSelectIssueDescription() throws Exception {
        waitAndClickElement(textFieldDescription);
        waitAndClickElement(dropdownIssueDescription);
        return new AddIssuePage();
    }

    public AddIssuePage dropdownSelectLocation() throws Exception {
        waitAndClickElement(textFieldLocation);
        waitAndClickElement(dropdownLocation);
        return new AddIssuePage();
    }

    public AddIssuePage cancelIssueButton() throws Exception{
        waitAndClickElement(cancelIssue);
        return new AddIssuePage();

    }

    public AddIssuePage addButton() throws Exception{
        waitUntilWebElementIsVisible(addButton);
        return new AddIssuePage();
    }


}



