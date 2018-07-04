package pageObjects.Issues_GridView_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObjects.BasePage;

import java.io.IOException;

public class access_gridview_page extends BasePage {


    public @FindBy(css = "div.display-mode > div.table-view-button")
    WebElement button_GridView;
    public @FindBy(css = "div.auiToolbar-right.ng-scope > button")
    WebElement button_EditMode;

    public access_gridview_page() throws IOException {
        super();
    }

    public access_gridview_page preLoaderPage() throws InterruptedException, IOException {
        waitUntilPreLoadElementDissapears(By.cssSelector("fm-app > div:nth-child(4) > div > div > div"));
        return new access_gridview_page();
    }

    public access_gridview_page accessGridView() throws InterruptedException, IOException {
        waitAndClickElement(button_GridView);
        return new access_gridview_page();

    }
    public access_gridview_page verifytheGridView() throws InterruptedException, IOException {
//        WaitUntilWebElementIsVisible(button_EditMode);
        button_EditMode.isDisplayed();
        return new access_gridview_page();

    }


}
