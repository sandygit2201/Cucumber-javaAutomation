package pageobjects.issueslistviewpage;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.BasePage;

public class CommentsPage extends BasePage {


    public @FindBy(css = "textarea#content")
    WebElement textFieldComments;

    public @FindBy(css = "div.actions.ng-scope > button.post-comment.auiButton.ng-binding")
    WebElement buttonPost;

    public @FindBy(className = "cancel-comment")
    WebElement buttonCancel;

    public @FindBy(xpath = "// *[contains (@class, 'cross')]")
    WebElement FTUX;

    public @FindBy(xpath = "// *[contains (@class, 'close-btn')]")
    WebElement buttonCloseArea;


    public CommentsPage() throws IOException {
        super();

    }


    public CommentsPage switchFrame() throws Exception {
        driver.switchTo().frame("main");
        waitAndClickElement(FTUX);
        waitAndClickElement(buttonCloseArea);
        return new CommentsPage();
    }

    public CommentsPage findCommentTextBox() throws Exception {
        clickOnElementUsingCustomTimeout(textFieldComments,driver,1000);
        Thread.sleep(2000);
        sendKeysToWebElement(textFieldComments, "Test Comments");
        return new CommentsPage();
    }

    public CommentsPage postComment() throws Exception {
        clickOnElementUsingCustomTimeout(buttonPost,driver,1000);
        return new CommentsPage();
    }

}
