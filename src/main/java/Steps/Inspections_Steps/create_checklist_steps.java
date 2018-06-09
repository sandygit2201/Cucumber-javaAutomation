package Steps.Inspections_Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static Utils.DriverFactory.create_checklist;

public class create_checklist_steps {

    @Given("^I click on Add Template button$")
    public void iClickOnAddTemplateButton() throws Throwable {
        create_checklist.clickAddTemplate ();
    }

    @And("^I select checklist$")
    public void iSelectChecklist() throws Throwable {
        create_checklist.clickChecklist ();
    }

    @Then("^I should see the checklist create page$")
    public void iShouldSeeTheChecklistCreatePage() throws Throwable {
        create_checklist.assertCLCreatePage ();
    }

    @And("^I add the title$")
    public void iAddTheTitle() throws Throwable {
        create_checklist.addTitle ();
    }

    @And("^I enter the description$")
    public void iEnterTheDescription() throws Throwable {
        create_checklist.addDesc ();
    }

//@Then("^I select a Category$")
//////public void iSelectACategory() throws Throwable {
//////    // Write code here that turns the phrase above into concrete actions
//////    throw new PendingException();
//}


    @And("^I enter a item$")
    public void iEnterAItem() throws Throwable {
        create_checklist.addItemText ();
    }

    @And("^I select a type$")
    public void iSelectAType() throws Throwable {
        create_checklist.clickSelectType ();
    }

    @And("^I click on Add button$")
    public void iClickOnAddButton() throws Throwable {
        create_checklist.clickAddItem ();
    }

    @When("^I click on Publish button$")
    public void iClickOnPublishButton() throws Throwable {
        create_checklist.clickPublish ();
    }

    @Then("^the checklist should be created$")
    public void theChecklistShouldBeCreated() throws Throwable {
System.out.println ("Use growler for assertion");
    }

}