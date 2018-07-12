package steps.FieldSetting_Steps;

import static Utils.DriverFactory.enterSettings;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class EnterSettingsSteps {
    @Given("^I click on Field-Settings$")
    public void iClickOnFieldSettings() throws Throwable {
        enterSettings.clickFieldSettings();
    }

    @Then("^I should be taken to Settings page$")
    public void iShouldBeTakenToSettingsPage() throws Throwable {
        enterSettings.assertSettingsPage();

    }
}
