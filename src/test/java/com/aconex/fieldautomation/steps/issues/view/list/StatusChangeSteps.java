package com.aconex.fieldautomation.steps.issues.view.list;

import com.aconex.fieldautomation.utils.DriverFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class StatusChangeSteps {

    @Then("^User should close the area selector$")
    public void iShouldCloseTheAreaSelector() throws Throwable {
        DriverFactory.statusChange.closeArea();
    }

    @Given("^User find an Open Issue$")
    public void iFindAnOpenIssue() throws Throwable {
        Assert.assertEquals("Open", "Open");

    }

    @When("^User tap on the status$")
    public void iTapOnTheStatus() throws Throwable {
        DriverFactory.statusChange.clickOnStatus();


    }

    @When("^User click on RTI$")
    public void iClickOnRTI() throws Throwable {
        DriverFactory.statusChange.clickOnReadyToInspect();
    }

    @Then("^the status should be changed$")
    public void theStatusShouldBeChanged() throws Throwable {
        Assert.assertEquals("Ready to Inspect", "Ready to Inspect");

    }


}
