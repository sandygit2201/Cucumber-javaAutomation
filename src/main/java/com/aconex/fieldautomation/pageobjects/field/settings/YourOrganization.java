package com.aconex.fieldautomation.pageobjects.field.settings;

import com.aconex.fieldautomation.pageobjects.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.io.IOException;
import java.util.Optional;

public class YourOrganization extends BasePage {

    public @FindBy(css = "div:nth-child(1) > ul > li:nth-child(1) > a ")
    WebElement sectionYourOrg;
    public @FindBy(xpath = "//H1[@class='ng-binding'][text()='Your organization']")
    WebElement assertYourOrgPage;

    public @FindBy(xpath = "//INPUT[@class='form-control ng-isolate-scope ui-autocomplete-input']")
    WebElement addMorePeople;
    public @FindBy(xpath = "(//FIELDSET)[1]/../../../../../../../../../../../..//A[@id='ui-id-2']")
    WebElement selectNewUser;
    public @FindBy(xpath = "//span[text()='test test']")
    WebElement verifyAddedUser;

    public @FindBy(xpath = "//")
    WebElement searchExistingUser;

    public @FindBy(css = "tr:nth-child(10) > td.delete.icon")
    WebElement removeUser;

    public @FindBy(css = "tr:nth-child(10) > td.user-role.select > div > div > div > div > div > div")
    WebElement clickOnRole;

    public @FindBy(css = "td.user-role.select > div > div > div > div > div > ul > li")
    WebElement assertRoleOptions;
    public @FindBy(css = "td.user-role.select > div > div > div > div > div > ul > li:nth-child(1)")
    WebElement selectRole;
    public @FindBy(xpath = "//SPAN[@ng-switch-when='false'][text()='Automation User1']/../../..//" +
            "SPAN[@class='ng-binding'][text()='Project Administrator'][text()='Project Administrator']")
    WebElement assertRoleChange;
    public @FindBy(xpath = "//SPAN[@ng-switch-when='false'][text()='Automation User1']/../../..//" +
            "SPAN[@class='ng-binding'][text()='Inspector']")
    WebElement assertCurrentRole;


    public @FindBy(xpath = "//DIV[@class='spinner ng-binding ng-scope done'][text()='Done']")
    WebElement successMessage;


    public YourOrganization() throws IOException {
        super();
    }

    public YourOrganization clickOnYourOrg() throws Exception {
        waitAndClickElement(sectionYourOrg);
        return new YourOrganization();
    }

    public YourOrganization assertYourOrgPage() throws Exception {
        assertYourOrgPage.isDisplayed();
        return new YourOrganization();
    }

    public YourOrganization clickOnAddMorePeople() throws Exception {
        waitAndClickElement(addMorePeople);
        sendKeysToWebElement(addMorePeople, "Automation User1");
        return new YourOrganization();
    }

    public YourOrganization searchExistingUser() throws Exception {
        waitAndClickElement(searchExistingUser);
        return new YourOrganization();
    }

    public YourOrganization removeUser() throws Exception {
        waitAndClickElement(removeUser);
        return new YourOrganization();
    }

    public YourOrganization selectUserFromDropDown() throws Exception {
        waitAndClickElement(selectNewUser);
        return new YourOrganization();
    }

    public YourOrganization verifyIfUserBeenAdded() throws Exception {
        verifyAddedUser.isDisplayed();
        return new YourOrganization();
    }

    public YourOrganization assertCurrentRole() throws Exception {
        assertCurrentRole.isDisplayed();
        return new YourOrganization();
    }

    public YourOrganization clickOnUserRole() throws Exception {
        waitAndClickElement(assertCurrentRole);
        return new YourOrganization();
    }

    public YourOrganization viewRoleOptions() throws Exception {
        assertRoleOptions.isDisplayed();
        return new YourOrganization();
    }

    public YourOrganization selectRole() throws Exception {
        waitAndClickElement(selectRole);
        return new YourOrganization();
    }

    public YourOrganization assertRoleChange() throws Exception {
        assertRoleChange.isDisplayed();
        return new YourOrganization();
    }

    public YourOrganization removeUser(String user) throws Exception {
        Optional<WebElement> requiredRow = driver.findElements(By.cssSelector(".fieldset-group tr"))
                .stream()
                .filter(e ->
                        e.findElement(By.cssSelector(".user-name span span")).getText().contains(user)
                )
                .findFirst();
        requiredRow.ifPresent(e -> e.findElement(By.cssSelector(".delete.icon")).click());
        return new YourOrganization();
    }


    public YourOrganization verifytheUserisRemoved(String user) throws Exception {
        waitUntilWebElementIsVisible(successMessage);
        Assert.assertTrue(userIsRemoved(user), "Expected user to be removed, but he was still there ");
        return new YourOrganization();
    }

    private boolean userIsRemoved(String user) {
        return !(driver.findElements(By.cssSelector(".user-name span span"))
                .stream()
                .map(WebElement::getText)
                .anyMatch(text -> text.contains(user)));
    }
}





