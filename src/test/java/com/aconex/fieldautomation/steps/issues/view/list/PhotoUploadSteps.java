package com.aconex.fieldautomation.steps.issues.view.list;

import com.aconex.fieldautomation.utils.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import java.net.URL;

public class PhotoUploadSteps {
    @And("^the user uploads a photo$")
    public void theUserShouldSelectThePhoto() throws Throwable {
        URL photo = getPhotoAttachment();
        DriverFactory.photoUpload.uploadPhoto(photo);
    }

    @Then("^the added photo should be visible$")
    public void theAddedPhotoShouldBeVisible() {
        System.out.println("Photo uploaded is complete");
    }

    private URL getPhotoAttachment() {
        return getClass().getClassLoader().getResource("images/sample_issue_attachment.jpg");
    }


}
