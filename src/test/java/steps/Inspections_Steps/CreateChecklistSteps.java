package steps.Inspections_Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static Utils.DriverFactory.createChecklist;

public class CreateChecklistSteps {

    @Given("^I click on Add Template button$")
    public void iClickOnAddTemplateButton() throws Throwable {
        createChecklist.clickAddTemplate();
    }

    @And("^I select checklist$")
    public void iSelectChecklist() throws Throwable {
        createChecklist.clickChecklist();
    }

    @Then("^I should see the checklist create page$")
    public void iShouldSeeTheChecklistCreatePage() throws Throwable {
        createChecklist.assertCLCreatePage();
    }

    @And("^I add the title$")
    public void iAddTheTitle() throws Throwable {
        createChecklist.addTitle();
    }

    @And("^I enter the description$")
    public void iEnterTheDescription() throws Throwable {
        createChecklist.addDescription();
    }


    @Then("^I select a Category$")
    public void iSelectACategory() throws Throwable {
        createChecklist.selectCategory();
    }


    @And("^I enter a item$")
    public void iEnterAItem() throws Throwable {
        createChecklist.addItemText();
    }

    @And("^I select a type$")
    public void iSelectAType() throws Throwable {
        createChecklist.clickSelectType();
    }

    @And("^I click on Add button$")
    public void iClickOnAddButton() throws Throwable {
        createChecklist.clickAddItem();
    }

    @When("^I click on Publish button$")
    public void iClickOnPublishButton() throws Throwable {
        createChecklist.clickPublish();
    }

    @Then("^the checklist should be created$")
    public void theChecklistShouldBeCreated() throws Throwable {
        createChecklist.assertChecklistCreation();
    }

}
