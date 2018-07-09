package pageobjects.issueslistviewpage;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.BasePage;

public class IssuesSearchPage extends BasePage{


    public IssuesSearchPage() throws IOException {

        super();
    }

    @FindBy(xpath = "/html/body/div[1]/fm-app/div[3]/div/div/div/div/div[3]/div/div/div/div/div[2]/div/div/div/div[1]/div[1]/issues-search/div/form/div/input")
    WebElement issuesSearchField;

    @FindBy(xpath = "/html/body/div[1]/fm-app/div[3]/div/div/div/div/div[3]/div/div/div/div/div[2]/div/div/div/div[1]/div[1]/issues-search/div/form/button")
    WebElement buttonSearch;

    public IssuesSearchPage clickSearchField() throws Exception {
        waitAndClickElement(issuesSearchField);
        return new IssuesSearchPage();
    }

    public IssuesSearchPage enterString() throws Exception {

        sendKeysToWebElement(issuesSearchField, "TestString");
        return new IssuesSearchPage();
    }

    public IssuesSearchPage clickSearchButton() throws Exception {
        waitAndClickElement(buttonSearch);
        return new IssuesSearchPage();
    }






}
