package com.aconex.fieldautomation.pageobjects.issues.view.list;

import com.aconex.fieldautomation.pageobjects.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.io.IOException;

public class AreaSelect extends BasePage {

    public @FindBy(xpath = "// *[contains (@data-areaid, '271341877551153756')]")
    WebElement areaBLOCKA;
    public @FindBy(xpath = "// *[contains (@class, 'cross')]")
    WebElement FTUX;
    public @FindBy(xpath = "//DIV[@class='scrollable-content']")
    WebElement assertAreaDropDown;
    public @FindBy(xpath = "(//A[@class='ellipsis-text ng-binding'][text()='BLOCK A'][text()='BLOCK A'])[2]")
    WebElement areaInNewIssuePane;
    public @FindBy(xpath = "(//A[@class='ellipsis-text ng-binding'][text()='BLOCK A'][text()='BLOCK A'])[1]")
    WebElement areaSelectedByUser;

    public AreaSelect() throws IOException {
        super();
    }

    public AreaSelect assertAreaDropDown() throws Exception {
        assertAreaDropDown.isDisplayed();
        return new AreaSelect();
    }


    public AreaSelect selectArea() throws Exception {
        waitAndClickElement(areaBLOCKA);
        return new AreaSelect();
    }

    public AreaSelect assertUserSelectedArea() throws Exception {
        areaSelectedByUser.isDisplayed();
        return new AreaSelect();

    }

    public AreaSelect assertAreaInNewIssuePane() throws Exception {
        Assert.assertEquals(areaInNewIssuePane.getText(), areaSelectedByUser.getText());
        return new AreaSelect();

    }


}
