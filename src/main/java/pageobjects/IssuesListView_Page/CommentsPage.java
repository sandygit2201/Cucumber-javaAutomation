package pageobjects.IssuesListView_Page;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
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

    public @FindBy(xpath = "//*[@class='issues group']/child::li[1]")
    WebElement ClickFirstIssue;

    public @FindBy(xpath = "//DIV[@class='view-comment auiReset-font']//P[@class='comment-text auiText-normal ng-binding'][text()='Test Comments']")
    WebElement AssertAddedComment;

    public CommentsPage() throws IOException {
        super();

    }


    public CommentsPage ClickOnFirstIssue() throws Exception {
        waitAndClickElement(ClickFirstIssue);
        return new CommentsPage();
    }

    public CommentsPage ViewCommentSection() throws Exception {
        waitUntilWebElementIsVisible(textFieldComments);
        return new CommentsPage();
    }


    public CommentsPage AddComments() throws Exception {
        clickOnElementUsingCustomTimeout(textFieldComments, driver, 1000);
        Thread.sleep(2000);
        sendKeysToWebElement(textFieldComments, "Test Comments");
        return new CommentsPage();
    }

    public CommentsPage postComment() throws Exception {
        clickOnElementUsingCustomTimeout(buttonPost, driver, 1000);
        return new CommentsPage();
    }

    public CommentsPage AssertComment() throws Exception {
        Assert.assertEquals(AssertAddedComment.getText(), "Test Comments");
        return new CommentsPage();
    }
}
