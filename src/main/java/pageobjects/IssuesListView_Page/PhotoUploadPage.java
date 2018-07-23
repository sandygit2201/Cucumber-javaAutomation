package pageobjects.IssuesListView_Page;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.BasePage;

public class PhotoUploadPage extends BasePage {

    @FindBy(id = "photo-attachment")
    private WebElement photoFileUpload;

    @FindBy(css = "attachment-upload-preview button.primary")
    private WebElement uploadButton;

    public PhotoUploadPage() throws IOException {
        super();
    }

    public PhotoUploadPage uploadPhoto(URL file) throws InterruptedException {
        photoFileUpload.sendKeys(Objects.requireNonNull(file).getPath());
        waitAndClickElement(uploadButton);
        return this;
    }

}



