package com.aconex.fieldautomation.steps.inspections;

import com.aconex.fieldautomation.utils.DriverFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SelectInspectionSteps {

    @Given("^User clicks on Field-Inspection$")
    public void userClicksOnFieldInspection() throws Throwable {
        DriverFactory.selectInspection.clickField();
        DriverFactory.selectInspection.clickInspections();

    }

    @Then("^User should close the CL area selector$")
    public void iShouldCloseTheCLAreaSelector() throws Throwable {
        DriverFactory.selectInspection.closeArea();
    }

    @Then("^User should see the Inspection page$")
    public void userShouldSeeTheInspectionPage() throws Throwable {

        DriverFactory.selectInspection.assertInspectionPage();

    }


}
