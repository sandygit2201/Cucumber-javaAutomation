package com.aconex.fieldautomation.steps.inspections;

import com.aconex.fieldautomation.utils.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateChecklistSteps {

    @Given("^User click on Add Template button$")
    public void iClickOnAddTemplateButton() throws Throwable {
        DriverFactory.createChecklist.clickAddTemplate();
    }

    @And("^User select checklist$")
    public void iSelectChecklist() throws Throwable {
        DriverFactory.createChecklist.clickChecklist();
    }

    @Then("^User should see the checklist create page$")
    public void iShouldSeeTheChecklistCreatePage() throws Throwable {
        DriverFactory.createChecklist.assertCLCreatePage();
    }

    @And("^User add the title$")
    public void iAddTheTitle() throws Throwable {
        DriverFactory.createChecklist.addTitle();
    }

    @And("^User enter the description$")
    public void iEnterTheDescription() throws Throwable {
        DriverFactory.createChecklist.addDescription();
    }


    @Then("^User select a Category$")
    public void iSelectACategory() throws Throwable {
        DriverFactory.createChecklist.selectCategory();
    }


    @And("^User enter a item$")
    public void iEnterAItem() throws Throwable {
        DriverFactory.createChecklist.addItemText();
    }

    @And("^User select a type$")
    public void iSelectAType() throws Throwable {
        DriverFactory.createChecklist.clickSelectType();
    }

    @And("^User click on Add button$")
    public void iClickOnAddButton() throws Throwable {
        DriverFactory.createChecklist.clickAddItem();
    }

    @When("^User click on Publish button$")
    public void iClickOnPublishButton() throws Throwable {
        DriverFactory.createChecklist.clickPublish();
    }

    @Then("^the checklist should be created$")
    public void theChecklistShouldBeCreated() throws Throwable {
        DriverFactory.createChecklist.assertChecklistCreation();
    }

}
