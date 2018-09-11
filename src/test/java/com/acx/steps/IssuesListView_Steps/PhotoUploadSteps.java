package com.acx.steps.IssuesListView_Steps;

import static com.acx.utils.DriverFactory.photoUpload;

import java.net.URL;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class PhotoUploadSteps {
    @And("^the user uploads a photo$")
    public void theUserShouldSelectThePhoto() throws Throwable {
        URL photo = getPhotoAttachment();
        photoUpload.uploadPhoto(photo);
    }

    @Then("^the added photo should be visible$")
    public void theAddedPhotoShouldBeVisible() {
        System.out.println("Photo uploaded is complete");
    }

    private URL getPhotoAttachment() {
        return getClass().getClassLoader().getResource("images/sample_issue_attachment.jpg");
    }


}
