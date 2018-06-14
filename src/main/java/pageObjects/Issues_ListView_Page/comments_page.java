package pageObjects.Issues_ListView_Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.JavascriptExecutor;
import pageObjects.BasePage;


import java.io.IOException;

public class comments_page extends BasePage {


    public @FindBy(xpath = "//SPAN[@class='ng-binding ng-scope'][text()='COMMENTS']/../../../..//TEXTAREA[@id='content']")
    WebElement textfield_comments;

    public @FindBy(css = "div.actions.ng-scope > button.post-comment.auiButton.ng-binding")
    WebElement button_post;

    public @FindBy(className = "cancel-comment")
    WebElement button_cancel;

    public @FindBy(xpath = "// *[contains (@class, 'cross')]")
    WebElement FTUX;

    public @FindBy(xpath = "// *[contains (@class, 'close-btn')]")
    WebElement buttoncloseArea;


    public comments_page() throws IOException {
        super();

    }


    public comments_page switchFrame() throws Exception {
        driver.switchTo().frame("main");
        waitAndClickElement(FTUX);
        waitAndClickElement(buttoncloseArea);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,350)", "");
        return new comments_page();
    }

    public comments_page findcommentTextbox() throws Exception {
        Thread.sleep(2000);
        waitAndClickElement(textfield_comments);
        sendKeysToWebElement(textfield_comments, "Test Comments");
        return new comments_page();
    }

    public comments_page postComment() throws Exception {
        Thread.sleep(1000);
        waitAndClickElement(button_post);
        return new comments_page();
    }

}
