package com.aconex.fieldautomation.steps.field.setting;

import com.aconex.fieldautomation.utils.DriverFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AccessSectionsSteps {
    @Given("^User click on Templates$")
    public void iClickOnTemplates() throws Throwable {
        DriverFactory.accessSections.clickTemplates();
    }

    @Then("^I should see the FTUX and close it$")
    public void iShouldSeeTheFTUXAndCloseIt() throws Throwable {
        DriverFactory.accessSections.closeCLFTUX();
    }

    @Then("^User should see the Templates section$")
    public void iShouldSeeTheTemplatesSection() throws Throwable {
        DriverFactory.accessSections.assertTemplatePage();

    }
}
