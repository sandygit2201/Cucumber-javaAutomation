package com.acx.steps.Babylon_Steps;

import com.acx.utils.DriverFactory;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LogoutSteps extends DriverFactory {

    @When("^user clicks on logout link$")
    public void userClicksOnLogoutLink() throws Throwable {
    logout.clickLogout();
    }

    @Then("^user should be successfully logged out$")
    public void userShouldBeSuccessfullyLoggedOut() throws Throwable {
        logout.successfulLogout();
    }
}
