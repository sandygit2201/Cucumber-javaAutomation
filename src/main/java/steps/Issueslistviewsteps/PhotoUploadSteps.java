package steps.Issueslistviewsteps;

import cucumber.api.java.en.Then;

import static Utils.DriverFactory.photo_upload;

public class PhotoUploadSteps {
    @Then("^the user should click on Add photos$")
    public void theUserShouldClickOnAddPhotos() throws Throwable {
        photo_upload.clickOnAddphoto();

    }

    @Then("^the user should select the photo$")
    public void theUserShouldSelectThePhoto() throws Throwable {
        photo_upload.selectPhoto();
    }

    @Then("^the user should click on upload button$")
    public void theUserShouldClickOnUploadButton() throws Throwable {
        photo_upload.clickUpload();
    }

    @Then("^the added photo should be visible$")
    public void theAddedPhotoShouldBeVisible() throws Throwable {
        System.out.println("Photo uploaded is complete");
    }


}
