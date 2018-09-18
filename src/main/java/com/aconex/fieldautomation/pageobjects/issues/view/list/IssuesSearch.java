package com.aconex.fieldautomation.pageobjects.issues.view.list;

import com.aconex.fieldautomation.pageobjects.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class IssuesSearch extends BasePage {


    @FindBy(xpath = "//INPUT[@class='search-input auiField-input large search-filter ng-pristine ng-untouched ng-valid ng-empty']")
    WebElement issuesSearchField;
    @FindBy(xpath = "//BUTTON[@class='auiButton ng-pristine ng-untouched ng-valid ng-binding ng-not-empty'][text()='Search']")
    WebElement buttonSearchEnabled;

    public IssuesSearch() throws IOException {

        super();
    }

    public IssuesSearch clickSearchField() throws Exception {
        waitAndClickElement(issuesSearchField);
        return new IssuesSearch();
    }

    public IssuesSearch enterString() throws Exception {
        sendKeysToWebElement(issuesSearchField, "TestString");
        return new IssuesSearch();
    }

    public IssuesSearch clickSearchButton() throws Exception {
        waitAndClickElement(buttonSearchEnabled);
        return new IssuesSearch();
    }


    public IssuesSearch assertSearchFieldIsBlank() throws Exception {
        issuesSearchField.isDisplayed();
        return new IssuesSearch();
    }

    public IssuesSearch assertSearchButtonIsEnabled() throws Exception {
        buttonSearchEnabled.isDisplayed();
        return new IssuesSearch();
    }

}
