package com.aconex.fieldautomation.pageobjects.issues.view.list;

import com.aconex.fieldautomation.pageobjects.BasePage;
import com.aconex.fieldautomation.utils.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.io.IOException;

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
    WebElement clickFirstIssue;

    public @FindBy(xpath = "//DIV[@class='view-comment auiReset-font']//P[@class='comment-text auiText-normal ng-binding'][text()='Test Comments']")
    WebElement assertAddedComment;

    public CommentsPage() throws IOException {
        super();

    }


    public CommentsPage clickOnFirstIssue() throws Exception {
        waitUntilWebElementIsVisible(clickFirstIssue);
        waitAndClickElement(clickFirstIssue);
        return new CommentsPage();
    }

    public CommentsPage viewCommentSection() throws Exception {
        waitUntilWebElementIsVisible(textFieldComments);
        return new CommentsPage();
    }


    public CommentsPage addComments() throws Exception {
        clickOnElementUsingCustomTimeout(textFieldComments, DriverFactory.driver, 10);
        Thread.sleep(2000);
        sendKeysToWebElement(textFieldComments, "Test Comments");
        return new CommentsPage();
    }

    public CommentsPage postComment() throws Exception {
        clickOnElementUsingCustomTimeout(buttonPost, DriverFactory.driver, 10);
        return new CommentsPage();
    }

    public CommentsPage assertComment() throws Exception {
        Assert.assertEquals(assertAddedComment.getText(), "Test Comments");
        return new CommentsPage();
    }
}
