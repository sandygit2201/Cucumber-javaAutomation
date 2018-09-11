package com.acx.steps.Inspections_Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import static com.acx.utils.DriverFactory.selectInspection;

public class SelectInspectionSteps {

    @Given("^User clicks on Field-Inspection$")
    public void userClicksOnFieldInspection() throws Throwable {
        selectInspection.clickField();
        selectInspection.clickInspections();

    }

    @Then("^User should close the CL area selector$")
    public void iShouldCloseTheCLAreaSelector() throws Throwable {
        selectInspection.closeArea();
    }

    @Then("^User should see the Inspection page$")
    public void userShouldSeeTheInspectionPage() throws Throwable {

        selectInspection.assertInspectionPage();

    }


}
