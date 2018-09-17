package com.aconex.fieldautomation.steps.field.setting;

import com.aconex.fieldautomation.utils.DriverFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class EnterSettingsSteps {
    @Given("^User click on Field-Settings$")
    public void iClickOnFieldSettings() throws Throwable {
        DriverFactory.enterSettings.clickFieldSettings();
    }

    @Then("^User should be taken to Settings page$")
    public void iShouldBeTakenToSettingsPage() throws Throwable {
        DriverFactory.enterSettings.assertSettingsPage();

    }
}
