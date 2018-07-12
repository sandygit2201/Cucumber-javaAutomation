package steps.IssuesListView_Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static Utils.DriverFactory.addIssue;

public class AddIssueSteps {


    @Given("^I click on Add Issue button$")
    public void iClickOnAddIssueButton() throws Throwable {
        addIssue.clickOnAddButton();
    }

    @Then("^I should see the New Issue pane$")
    public void iShouldSeeTheNewIssuePane() throws Throwable {
        org.testng.Assert.assertEquals("Issues", "Issues");
    }

    @And("^I select the Issue type$")
    public void iEnterTheIssueType() throws Throwable {
        addIssue.iEnterIssueType();
    }

    @And("^I enter the Issue description$")
    public void iEnterTheIssueDescription() throws Throwable {
        addIssue.iEnterIssueDescription();
    }

    @And("^I select a Issue type$")
    public void iSelectAIssueType() throws Throwable {
        addIssue.dropdownSelectIssueType();
    }

    @And("^I select a Issue description$")
    public void iSelectAIssueDescription() throws Throwable {
        addIssue.dropdownSelectIssueDescription();

    }

    @And("^I select a location detail$")
    public void iSelectALocationDetail() throws Throwable {
        addIssue.dropdownSelectLocation();
    }

    @When("^I click on Save button$")
    public void iClickOnSaveButton() throws Throwable {
        addIssue.clickOnSaveButton();
    }

    @Then("^the Issue should be saved$")
    public void theIssueShouldBeSaved() throws Throwable {
        addIssue.verifyIssueSaved();
    }

    @Then("^I click on Issue type$")
    public void iClickOnIssueType() throws Throwable {
        addIssue.clickOnIssueType();

    }

    @Then("^Issue types should be displayed alphabetically$")
    public void issueTypesShouldBeDisplayedAlphabetically() throws Throwable {
        addIssue.assertIssueTypeOrder();

    }

    @And("^I select a due date$")
    public void iSelectADueDate() throws Throwable {
        addIssue.selectDueDate();
    }

    @And("^I add a location detail$")
    public void iAddALocationDetail() throws Throwable {
        addIssue.addLocation();
    }


    @When("^I click on the Cancel button$")
    public void iClickOnTheCancelButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        addIssue.cancelIssueButton();
    }

    @Then("^I should see the Add button$")
    public void iShouldSeeTheAddButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        addIssue.addButton();
    }
}
