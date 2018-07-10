package pageobjects.issuesgridviewpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.BasePage;

import java.io.IOException;

public class AccessGridViewPage extends BasePage {


    public @FindBy(css = "div.display-mode > div.table-view-button")
    WebElement buttonGridView;
    public @FindBy(css = "div.auiToolbar-right.ng-scope > button")
    WebElement buttonEditMode;

    public AccessGridViewPage() throws IOException {
        super();
    }

    public AccessGridViewPage preLoaderPage() throws InterruptedException, IOException {
        waitUntilPreLoadElementDisappears(By.cssSelector("fm-app > div:nth-child(4) > div > div > div"));
        return new AccessGridViewPage();
    }

    public AccessGridViewPage accessGridView() throws InterruptedException, IOException {
        waitAndClickElement(buttonGridView);
        return new AccessGridViewPage();

    }
    public AccessGridViewPage verifyGridView() throws InterruptedException, IOException {
        buttonEditMode.isDisplayed();
        return new AccessGridViewPage();

    }


}
