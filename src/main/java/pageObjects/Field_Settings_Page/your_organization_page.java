package pageObjects.Field_Settings_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pageObjects.BasePage;

import java.io.IOException;
import java.util.List;

public class your_organization_page extends BasePage {

    public your_organization_page() throws IOException {
        super();
    }


    public @FindBy(css = "div:nth-child(1) > ul > li:nth-child(1) > a ")
    WebElement sectionYourOrg;

    public @FindBy(xpath = "//H1[@class='ng-binding'][text()='Your organization']")
    WebElement assertYourOrgPage;

    public @FindBy(css = "tr:nth-child(10) > td.delete.icon")
    WebElement removeUser;

    public @FindBy(css = "tr:nth-child(10) > td.user-role.select > div > div > div > div > div > div")
    WebElement clickOnRole;

    public @FindBy(css = "td.user-role.select > div > div > div > div > div > ul > li")
    WebElement assertRoleOptions;

    public @FindBy(css = "td.user-role.select > div > div > div > div > div > ul > li:nth-child(1)")
    WebElement selectRole;

    public @FindBy(xpath = "(//TD[@class='user-name'])[10]/..//SPAN[@class='ng-binding']" +
            "[text()='Project Administrator'][text()='Project Administrator']")
    WebElement assertRoleChange;

    public @FindBy(xpath = "(//TD[@class='user-name'])[10]/..//SPAN[@class='ng-binding']" +
            "[text()='Inspector'][text()='Inspector']")
    WebElement assertCurrentRole;



    public your_organization_page clickOnYourOrg() throws Exception {
        waitAndClickElement(sectionYourOrg);
        return new your_organization_page();
    }

    public your_organization_page assertYOurOrgPage() throws Exception {
        assertYourOrgPage.isDisplayed();
        return new your_organization_page();
    }

    public your_organization_page removeUser() throws Exception {
        waitAndClickElement(removeUser);
        return new your_organization_page();
    }

    public your_organization_page assertUserRemoved() throws Exception {
        List removedUser = driver.findElements(By.xpath("//SPAN[@ng-switch-when='false'][text()='test test']"));
        int Count = removedUser.size();
        Assert.assertFalse(removedUser.equals(Count));
        return new your_organization_page();
    }

    public your_organization_page assertCurrentRole() throws Exception {
        assertCurrentRole.isDisplayed();
        return new your_organization_page();
    }

    public your_organization_page clickonUserRole() throws Exception {
        waitAndClickElement(clickOnRole);
        return new your_organization_page();
    }

    public your_organization_page viewRoleOptions() throws Exception {
        assertRoleOptions.isDisplayed();
        return new your_organization_page();
    }

    public your_organization_page selectRole() throws Exception {
        waitAndClickElement(selectRole);
        return new your_organization_page();
    }

    public your_organization_page assertRoleChange() throws Exception {
        assertRoleChange.isDisplayed();
        return new your_organization_page();
    }

}





