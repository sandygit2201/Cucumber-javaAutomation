package com.aconex.fieldautomation.pageobjects.issues.view.grid;

import com.aconex.fieldautomation.pageobjects.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class AccessGridViewPage extends BasePage {


    public @FindBy(css = "div.display-mode > div.table-view-button")
    WebElement button_GridView;
    public @FindBy(css = "div.auiToolbar-right.ng-scope > button")
    WebElement button_EditMode;

    public AccessGridViewPage() throws IOException {
        super();
    }

    public AccessGridViewPage preLoaderPage() throws InterruptedException, IOException {
        waitUntilPreLoadElementDisappears(By.cssSelector("fm-app > div:nth-child(4) > div > div > div"));
        return new AccessGridViewPage();
    }

    public AccessGridViewPage accessGridView() throws InterruptedException, IOException {
        waitAndClickElement(button_GridView);
        return new AccessGridViewPage();

    }

    public AccessGridViewPage verifytheGridView() throws InterruptedException, IOException {
        button_EditMode.isDisplayed();
        return new AccessGridViewPage();

    }


}
