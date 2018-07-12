package pageobjects.IssuesListView_Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pageobjects.BasePage;

import java.io.IOException;

public class AreaSelectPage extends BasePage {

    public AreaSelectPage() throws IOException {
        super();
    }

    public @FindBy(xpath = "// *[contains (@data-areaid, '271341877551153756')]")
    WebElement areaBLOCKA;
    public @FindBy(xpath = "// *[contains (@class, 'cross')]")
    WebElement FTUX;
    public @FindBy(xpath = "//DIV[@class='scrollable-content']")
    WebElement assertAreaDropDown;

    public @FindBy(xpath = "(//A[@class='ellipsis-text ng-binding'][text()='BLOCK A'][text()='BLOCK A'])[2]")
    WebElement AreaInNewIssuePane;

    public @FindBy(xpath = "(//A[@class='ellipsis-text ng-binding'][text()='BLOCK A'][text()='BLOCK A'])[1]")
    WebElement AreaSelectedByUser;


    public AreaSelectPage assertAreaDropDown() throws Exception {
        assertAreaDropDown.isDisplayed();
        return new AreaSelectPage();
    }


    public AreaSelectPage selectArea() throws Exception {
        waitAndClickElement(areaBLOCKA);
        return new AreaSelectPage();
    }

    public AreaSelectPage AssertUserSelectedArea() throws Exception {
        AreaSelectedByUser.isDisplayed();
        return new AreaSelectPage();

    }

    public AreaSelectPage AssertAreaInNewIssuePane() throws Exception {
        Assert.assertEquals(AreaInNewIssuePane.getText(), AreaSelectedByUser.getText());
        return new AreaSelectPage();

    }


}
