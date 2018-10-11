package com.aconex.fieldautomation.steps.babylon;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.aconex.fieldautomation.utils.UIComponents.logout;


public class LogoutSteps {

    @When("^user clicks on logout link$")
    public void userClicksOnLogoutLink() throws Throwable {
        logout.clickLogout();
    }

    @Then("^user should be successfully logged out$")
    public void userShouldBeSuccessfullyLoggedOut() throws Throwable {
        logout.successfulLogout();
    }
}
