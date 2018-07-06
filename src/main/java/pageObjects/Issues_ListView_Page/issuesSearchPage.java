package pageObjects.Issues_ListView_Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pageObjects.BasePage;

import java.io.IOException;

public class issuesSearchPage extends BasePage{


    public issuesSearchPage() throws IOException {

        super();
    }

    @FindBy(xpath = "/html/body/div[1]/fm-app/div[3]/div/div/div/div/div[3]/div/div/div/div/div[2]/div/div/div/div[1]/div[1]/issues-search/div/form/div/input")
    WebElement issuesSearchField;

    @FindBy(xpath = "/html/body/div[1]/fm-app/div[3]/div/div/div/div/div[3]/div/div/div/div/div[2]/div/div/div/div[1]/div[1]/issues-search/div/form/button")
    WebElement buttonSearch;

    public issuesSearchPage clickSearchField() throws Exception {
        waitAndClickElement(issuesSearchField);
        return new issuesSearchPage();
    }

    public issuesSearchPage enterString() throws Exception {

        sendKeysToWebElement(issuesSearchField, "TestString");
        return new issuesSearchPage();
    }

    public issuesSearchPage clickSearchButton() throws Exception {
        waitAndClickElement(buttonSearch);
        return new issuesSearchPage();
    }






}
