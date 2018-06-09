package Steps.Field_Settings_Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import static Utils.DriverFactory.enter_settings;

public class enter_settings_steps {
    @Given("^I click on Field-Settings$")
    public void iClickOnFieldSettings() throws Throwable {
        enter_settings.clickFieldSettings();
    }

    @Then("^I should be taken to Settings page$")
    public void iShouldBeTakenToSettingsPage() throws Throwable {
        enter_settings.assertSettingsPage();

    }
}
