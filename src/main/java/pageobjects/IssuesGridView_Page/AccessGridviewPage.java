package pageobjects.IssuesGridView_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.BasePage;

import java.io.IOException;

public class AccessGridviewPage extends BasePage {


    public @FindBy(css = "div.display-mode > div.table-view-button")
    WebElement button_GridView;
    public @FindBy(css = "div.auiToolbar-right.ng-scope > button")
    WebElement button_EditMode;

    public AccessGridviewPage() throws IOException {
        super();
    }

    public AccessGridviewPage preLoaderPage() throws InterruptedException, IOException {
        waitUntilPreLoadElementDissapears(By.cssSelector("fm-app > div:nth-child(4) > div > div > div"));
        return new AccessGridviewPage();
    }

    public AccessGridviewPage accessGridView() throws InterruptedException, IOException {
        waitAndClickElement(button_GridView);
        return new AccessGridviewPage();

    }
    public AccessGridviewPage verifytheGridView() throws InterruptedException, IOException {
        button_EditMode.isDisplayed();
        return new AccessGridviewPage();

    }


}
