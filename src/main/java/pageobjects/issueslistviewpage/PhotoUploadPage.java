package pageobjects.issueslistviewpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.BasePage;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

public class PhotoUploadPage extends BasePage {

    public @FindBy(xpath = "// *[contains (@for, 'photo-attachment')]")
    WebElement addPhoto;

    public @FindBy(xpath = "/html/body/div/fm-app/div[3]/div/div/div" +
            "/div/daily-summary-notifications-ftux/div/div[2]/div/div[1]")
    WebElement FTUX;

    public @FindBy(xpath = "// *[contains (@class, 'close-btn')]")
    WebElement buttonCloseArea;


    public @FindBy(xpath = "// *[contains (@ng-click, 'AttachmentUploadPreview.upload()')]")
    WebElement buttonUploadPhoto;


    public PhotoUploadPage() throws IOException {
        super();

    }

    public PhotoUploadPage clickOnAddPhoto() throws Exception {
        driver.switchTo().frame("main");

        waitAndClickElement(FTUX);
        waitAndClickElement(buttonCloseArea);
        Thread.sleep(3000);
        waitAndClickElement(addPhoto);
        return new PhotoUploadPage();

    }


    public PhotoUploadPage selectPhoto() throws Exception {

        Thread.sleep(1000);
        File file = new File("/Users/mohand/Desktop/Defect.jpg");
        StringSelection stringSelection = new StringSelection(file.getAbsolutePath());
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_META);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_META);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.delay(500);

//Open Goto window

        robot.keyPress(KeyEvent.VK_META);
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_G);
        robot.keyRelease(KeyEvent.VK_META);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyRelease(KeyEvent.VK_G);

//Paste the clipboard value

        robot.keyPress(KeyEvent.VK_META);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_META);
        robot.keyRelease(KeyEvent.VK_V);

//Press Enter key to close the Goto window and Upload window

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(500);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        Thread.sleep(3000);
        return new PhotoUploadPage();

    }

    public PhotoUploadPage clickUpload() throws Exception {

        waitAndClickElement(buttonUploadPhoto);
        Thread.sleep(3000);
        return new PhotoUploadPage();
    }


}



