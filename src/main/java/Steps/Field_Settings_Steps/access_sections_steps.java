package Steps.Field_Settings_Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import static Utils.DriverFactory.access_sections;

public class access_sections_steps {
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
