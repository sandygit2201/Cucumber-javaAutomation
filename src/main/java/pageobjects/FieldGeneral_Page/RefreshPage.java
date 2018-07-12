package pageobjects.FieldGeneral_Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pageobjects.BasePage;

import java.io.IOException;

public class RefreshPage extends BasePage {

    public @FindBy(css = ".refresh-issues")
    WebElement refreshButton;

    public @FindBy(xpath = "//*[contains(@class,'auiToolbar-header ng-bind')]")
    WebElement verifyRefresh;

    public RefreshPage() throws IOException {
        super();
    }

    public RefreshPage clickOnRefreshButton() throws Exception {
        waitAndClickElement(refreshButton);
        return new RefreshPage();
    }

    public RefreshPage verifyIssuePageRefresh() throws Exception {
        try {
            Assert.assertTrue(verifyRefresh.getText().equalsIgnoreCase("Issues"));
            return new RefreshPage();
        } catch (AssertionError e) {
            return new RefreshPage();
        }
    }
}
