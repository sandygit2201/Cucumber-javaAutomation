package com.aconex.fieldautomation.steps.babylon;

import com.aconex.fieldautomation.utils.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SwitchProjectSteps {
    @Given("^User click on the project list$")
    public void iClickOnTheProjectList() throws Throwable {
        DriverFactory.switchProject.clickProjectSelector();
    }

    @And("^User select Web automation project$")
    public void iSelectWebAutomationProject() throws Throwable {
        DriverFactory.switchProject.selectMyProject();
    }

    @And("^User agree to Terms of Service Update if prompted$")
    public void userAgreesToTermsOfServiceUpdateIfPrompted() throws Throwable {
        DriverFactory.switchProject.checkForServiceUpdatePage();

    }

    @Then("^User should be taken to that project$")
    public void iShouldBeTakenToThatProject() throws Throwable {
        DriverFactory.switchProject.assertMyProject();
    }
}
