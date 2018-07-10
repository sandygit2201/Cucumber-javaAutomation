package steps.FieldSetting_Steps;

import static Utils.DriverFactory.enter_settings;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class EnterSettingsSteps {
    @Given("^I click on Field-Settings$")
    public void iClickOnFieldSettings() throws Throwable {
        enter_settings.clickFieldSettings();
    }

    @Then("^I should be taken to Settings page$")
    public void iShouldBeTakenToSettingsPage() throws Throwable {
        enter_settings.assertSettingsPage();

    }
}
