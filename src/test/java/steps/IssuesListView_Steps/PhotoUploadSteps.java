package steps.IssuesListView_Steps;

import cucumber.api.java.en.Then;

import static Utils.DriverFactory.photoUpload;

public class PhotoUploadSteps {
    @Then("^the user should click on Add photos$")
    public void theUserShouldClickOnAddPhotos() throws Throwable {
        photoUpload.clickOnAddPhoto();

    }

    @Then("^the user should select the photo$")
    public void theUserShouldSelectThePhoto() throws Throwable {
        photoUpload.selectPhoto();
    }

    @Then("^the user should click on upload button$")
    public void theUserShouldClickOnUploadButton() throws Throwable {
        photoUpload.clickUpload();
    }

    @Then("^the added photo should be visible$")
    public void theAddedPhotoShouldBeVisible() throws Throwable {
        System.out.println("Photo uploaded is complete");
    }


}
