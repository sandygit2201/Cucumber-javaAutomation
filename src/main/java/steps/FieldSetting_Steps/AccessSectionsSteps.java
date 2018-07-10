package steps.FieldSetting_Steps;

import static Utils.DriverFactory.access_sections;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AccessSectionsSteps {
    @Given("^I click on Templates$")
    public void iClickOnTemplates() throws Throwable {
        access_sections.clickTemplates();
    }

    @Then("^I should see the FTUX and close it$")
    public void iShouldSeeTheFTUXAndCloseIt() throws Throwable {
access_sections.closeCLFTUX ();
    }

    @Then("^I should see the Templates section$")
    public void iShouldSeeTheTemplatesSection() throws Throwable {
        access_sections.assertTemplatePage();

    }
}
