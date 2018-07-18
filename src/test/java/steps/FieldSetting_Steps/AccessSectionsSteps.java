package steps.FieldSetting_Steps;

import static Utils.DriverFactory.accessSections;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AccessSectionsSteps {
    @Given("^I click on Templates$")
    public void iClickOnTemplates() throws Throwable {
        accessSections.clickTemplates();
    }

    @Then("^I should see the FTUX and close it$")
    public void iShouldSeeTheFTUXAndCloseIt() throws Throwable {
accessSections.closeCLFTUX ();
    }

    @Then("^I should see the Templates section$")
    public void iShouldSeeTheTemplatesSection() throws Throwable {
        accessSections.assertTemplatePage();

    }
}