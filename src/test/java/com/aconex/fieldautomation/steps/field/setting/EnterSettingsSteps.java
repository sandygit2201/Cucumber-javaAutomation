package com.aconex.fieldautomation.steps.field.setting;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import static com.aconex.fieldautomation.utils.UIComponents.enterSettings;

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
