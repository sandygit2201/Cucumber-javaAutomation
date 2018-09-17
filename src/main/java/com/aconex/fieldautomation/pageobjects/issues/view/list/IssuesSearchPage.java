package com.aconex.fieldautomation.pageobjects.issues.view.list;

import com.aconex.fieldautomation.pageobjects.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class IssuesSearchPage extends BasePage {


    @FindBy(xpath = "//INPUT[@class='search-input auiField-input large search-filter ng-pristine ng-untouched ng-valid ng-empty']")
    WebElement issuesSearchField;
    @FindBy(xpath = "//BUTTON[@class='auiButton ng-pristine ng-untouched ng-valid ng-binding ng-not-empty'][text()='Search']")
    WebElement buttonSearchEnabled;

    public IssuesSearchPage() throws IOException {

        super();
    }

    public IssuesSearchPage clickSearchField() throws Exception {
        waitAndClickElement(issuesSearchField);
        return new IssuesSearchPage();
    }

    public IssuesSearchPage enterString() throws Exception {
        sendKeysToWebElement(issuesSearchField, "TestString");
        return new IssuesSearchPage();
    }

    public IssuesSearchPage clickSearchButton() throws Exception {
        waitAndClickElement(buttonSearchEnabled);
        return new IssuesSearchPage();
    }


    public IssuesSearchPage assertSearchFieldIsBlank() throws Exception {
        issuesSearchField.isDisplayed();
        return new IssuesSearchPage();
    }

    public IssuesSearchPage assertSearchButtonIsEnabled() throws Exception {
        buttonSearchEnabled.isDisplayed();
        return new IssuesSearchPage();
    }

}
