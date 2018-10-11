package com.aconex.fieldautomation.steps.field.setting;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import static com.aconex.fieldautomation.utils.UIComponents.accessSections;


public class AccessSectionsSteps {
    @Given("^User click on Templates$")
    public void iClickOnTemplates() throws Throwable {
        accessSections.clickTemplates();
    }

    @Then("^I should see the FTUX and close it$")
    public void iShouldSeeTheFTUXAndCloseIt() throws Throwable {
        accessSections.closeCLFTUX();
    }

    @Then("^User should see the Templates section$")
    public void iShouldSeeTheTemplatesSection() throws Throwable {
        accessSections.assertTemplatePage();

    }
}
