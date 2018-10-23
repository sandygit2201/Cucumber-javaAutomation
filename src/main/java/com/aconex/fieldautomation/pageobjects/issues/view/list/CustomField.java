package com.aconex.fieldautomation.pageobjects.issues.view.list;

import com.aconex.fieldautomation.helper.Waiter;
import com.aconex.fieldautomation.pageobjects.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.io.IOException;

public class CustomField extends BasePage {

    Waiter waiter = new Waiter(driver);

    public @FindBy(xpath = "(//SPAN[@tabindex='-1'])[2]")
    WebElement firstCustomField;
    public @FindBy(xpath = "(//INPUT[@type='search'])[3]/..//DIV[@ng-bind-html='label | highlight: $select.search'][text()='High']")
    WebElement dropDownFirstValue;
    public @FindBy(css = "div.auiToolbar-left > div.refresh-issues")
    WebElement buttonRefresh;
    public @FindBy(css = ".issues.group li:first-child")
    WebElement firstIssue;
    public @FindBy(css = ".extra-details .chevronRight")
    WebElement extraDetailsSection;
    public @FindBy(css = ".extra-details .value")
    WebElement assertFirstValue;
    public @FindBy(xpath = "//*[@class='issues group']/child::li[1]")
    WebElement clickFirstIssue;
    public @FindBy(xpath = "//SPAN[@class='ng-binding ng-scope'][text()='Extra Details (1) ']")
    WebElement extraDetailCollapse;
    public @FindBy(xpath = "//SPAN[@class='ng-binding'][text()='Select...']")
    WebElement customFieldDropdown;
    public @FindBy(xpath = "//DIV[@ng-bind-html='label | highlight: $select.search'][text()='High']")
    WebElement selectHighfromDropDown;
    public @FindBy(xpath = "(//DIV[@class='text'])[2]")
    WebElement assertHighValue;

    public CustomField() throws IOException {
        super();
    }

    public CustomField clickOnFirstCustomField() throws InterruptedException, IOException {
        waitAndClickElement(firstCustomField);
        return new CustomField();
    }

    public CustomField clickOnFirstDropdownValue() throws InterruptedException, IOException {
        waitAndClickElement(dropDownFirstValue);
        return new CustomField();
    }


    public CustomField clickRefresh() throws InterruptedException, IOException {
        waitAndClickElement(buttonRefresh);
        waitUntilPreLoadElementDisappears(By.cssSelector("fm-app > div:nth-child(4) > div > div > div"));
        return new CustomField();
    }

    public CustomField assertCustomFieldWhileCreatingIssue() throws Exception {
        waitAndClickElement(firstIssue);
        waiter.hasElement(By.cssSelector(".extra-details"), 5);
        waitAndClickElement(extraDetailsSection);
        waiter.hasElement(assertFirstValue,5);
        Assert.assertEquals(assertFirstValue.getText(), "High");
        return new CustomField();
    }

    public CustomField clickOnFirstIssue() throws InterruptedException, IOException {
        waitAndClickElement(clickFirstIssue);
        return new CustomField();
    }

    public CustomField clickExtraDetailCollapseHeader() throws InterruptedException, IOException {

        waitAndClickElement(extraDetailCollapse);
        Thread.sleep(2000);
        return new CustomField();
    }

    public CustomField selectHighValueFromDropdown() throws InterruptedException, IOException {

        waitUntilWebElementIsVisible(customFieldDropdown);
        waitAndClickElement(customFieldDropdown);
        waitUntilWebElementIsVisible(selectHighfromDropDown);
        waitAndClickElement(selectHighfromDropDown);
        return new CustomField();
    }


    public CustomField assertCustomFieldForExistingIssue() throws InterruptedException, IOException {
        waitAndClickElement(buttonRefresh);
        waitUntilPreLoadElementDisappears(By.cssSelector("fm-app > div:nth-child(4) > div > div > div"));
        waitAndClickElement(extraDetailCollapse);
        waitUntilWebElementIsVisible(assertHighValue);
        Assert.assertEquals(assertHighValue.getText(), "High");
        return new CustomField();
    }
}
