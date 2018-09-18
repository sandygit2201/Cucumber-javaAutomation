package com.aconex.fieldautomation.pageobjects.issues.view.list;

import com.aconex.fieldautomation.pageobjects.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;

public class PhotoUpload extends BasePage {

    @FindBy(id = "photo-attachment")
    private WebElement photoFileUpload;

    @FindBy(css = "attachment-upload-preview button.primary")
    private WebElement uploadButton;

    public PhotoUpload() throws IOException {
        super();
    }

    public PhotoUpload uploadPhoto(URL file) throws InterruptedException {
        photoFileUpload.sendKeys(Objects.requireNonNull(file).getPath());
        waitAndClickElement(uploadButton);
        return this;
    }

}



