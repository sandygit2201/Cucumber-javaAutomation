package com.acx.steps.FieldSetting_Steps;

import static com.acx.utils.DriverFactory.enterSettings;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class EnterSettingsSteps {
    @Given("^User click on Field-Settings$")
    public void iClickOnFieldSettings() throws Throwable {
        enterSettings.clickFieldSettings();
    }

    @Then("^User should be taken to Settings page$")
    public void iShouldBeTakenToSettingsPage() throws Throwable {
        enterSettings.assertSettingsPage();

    }
}
