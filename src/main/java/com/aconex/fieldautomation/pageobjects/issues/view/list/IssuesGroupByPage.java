package com.aconex.fieldautomation.pageobjects.issues.view.list;

import com.aconex.fieldautomation.pageobjects.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.io.IOException;

public class IssuesGroupByPage extends BasePage {
    public @FindBy(xpath = "//BUTTON[@uib-dropdown-toggle='uib-dropdown-toggle'][text()='Group by: None']")
    WebElement selectGroupbyOption;
    public @FindBy(xpath = "(//A[@class='item ng-binding'][text()='Location'][text()='Location'])[2]")
    WebElement selectLocationOption;
    public @FindBy(xpath = "//DIV[@class='issues groupby header ng-binding ng-scope'][text()='BW6003-Residential']")
    WebElement textLocationInIssuesListView;
    public @FindBy(xpath = "(//A[@class='ellipsis-text ng-binding'][text()='BW6003-Residential'][text()='BW6003-Residential'])[2]")
    WebElement textLocationInIssuesDetailsView;

    public IssuesGroupByPage() throws IOException {
        super();
    }

    public IssuesGroupByPage clickGroupBy() throws Exception {
        waitAndClickElement(selectGroupbyOption);
        return new IssuesGroupByPage();
    }


    public IssuesGroupByPage clickLocation() throws Exception {
        waitAndClickElement(selectLocationOption);
        return new IssuesGroupByPage();
    }

    public IssuesGroupByPage assertLocationResult() throws Exception {
        Assert.assertEquals(textLocationInIssuesListView.getText(), textLocationInIssuesDetailsView.getText().toUpperCase());
        return new IssuesGroupByPage();
    }

}
