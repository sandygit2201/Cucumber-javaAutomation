package pageobjects.IssuesListView_Page;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.BasePage;

public class CommentsPage extends BasePage {


    public @FindBy(css = "textarea#content")
    WebElement textfield_comments;

    public @FindBy(css = "div.actions.ng-scope > button.post-comment.auiButton.ng-binding")
    WebElement button_post;

    public @FindBy(className = "cancel-comment")
    WebElement button_cancel;

    public @FindBy(xpath = "// *[contains (@class, 'cross')]")
    WebElement FTUX;

    public @FindBy(xpath = "// *[contains (@class, 'close-btn')]")
    WebElement buttoncloseArea;


    public CommentsPage() throws IOException {
        super();

    }


    public CommentsPage switchFrame() throws Exception {
        driver.switchTo().frame("main");
        waitAndClickElement(FTUX);
        waitAndClickElement(buttoncloseArea);
        return new CommentsPage();
    }

    public CommentsPage findcommentTextbox() throws Exception {
        clickOnElementUsingCustomTimeout(textfield_comments,driver,1000);
        Thread.sleep(2000);
        sendKeysToWebElement(textfield_comments, "Test Comments");
        return new CommentsPage();
    }

    public CommentsPage postComment() throws Exception {
        clickOnElementUsingCustomTimeout(button_post,driver,1000);
        return new CommentsPage();
    }

}
