package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.interactions.internal.Locatable;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.JavascriptExecutor;


import java.io.IOException;

public class comments_page extends BasePage {


    public @FindBy(xpath = "//*[@id=\"content\"]")
    WebElement textfield_comments;

    public @FindBy(xpath = "// *[contains (@class, 'post-comment')]")
    WebElement button_post;

    public @FindBy(className = "cancel-comment")
    WebElement button_cancel;

    public @FindBy(xpath = "/html/body/div/fm-app/div[3]/div/div/div/div/daily-summary-notifications-ftux/div/div[2]/div/div[1]")
    WebElement FTUX;

    public @FindBy(xpath = "/html/body/div/fm-app/div[3]/div/div/div/div/div[2]/div/div[2]/ul/div[2]")
    WebElement buttoncloseArea;


    public comments_page() throws IOException {
        super();

    }


    public comments_page switchFrame() throws Exception {
        driver.switchTo().frame("main");
        waitAndClickElement(FTUX);
        waitAndClickElement(buttoncloseArea);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)", "");
        return new comments_page();
    }

    public comments_page findcommentTextbox() throws Exception {
        waitAndClickElement(textfield_comments);
        sendKeysToWebElement(textfield_comments, "Test Comments");
        return new comments_page();
    }

    public comments_page postComment() throws Exception {
        waitAndClickElement(button_post);
        return new comments_page();
    }

}
