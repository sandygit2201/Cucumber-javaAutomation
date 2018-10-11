package com.aconex.fieldautomation.steps.issues.view.list;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.aconex.fieldautomation.utils.UIComponents.addIssue;

public class AddIssueSteps {


    @Given("^User click on Add Issue button$")
    public void iClickOnAddIssueButton() throws Throwable {
        addIssue.clickOnAddButton();
    }

    @Then("^User should see the New Issue pane$")
    public void iShouldSeeTheNewIssuePane() throws Throwable {
        org.testng.Assert.assertEquals("Issues", "Issues");
    }

    @And("^User select the Issue type$")
    public void iEnterTheIssueType() throws Throwable {
        addIssue.iEnterIssueType();
    }

    @And("^User enter the Issue description$")
    public void iEnterTheIssueDescription() throws Throwable {
        addIssue.iEnterIssueDescription();
    }

    @And("^User select a Issue type$")
    public void iSelectAIssueType() throws Throwable {
        addIssue.dropdownSelectIssueType();
    }

    @And("^User select a Issue description$")
    public void iSelectAIssueDescription() throws Throwable {
        addIssue.dropdownSelectIssueDescription();

    }

    @And("^User select a location detail$")
    public void iSelectALocationDetail() throws Throwable {
        addIssue.dropdownSelectLocation();
    }

    @When("^User click on Save button$")
    public void iClickOnSaveButton() throws Throwable {
        addIssue.clickOnSaveButton();
    }

    @Then("^the Issue should be saved$")
    public void theIssueShouldBeSaved() throws Throwable {
        addIssue.verifyIssueSaved();
    }

    @Then("^User click on Issue type$")
    public void iClickOnIssueType() throws Throwable {
        addIssue.clickOnIssueType();

    }

    @Then("^Issue types should be displayed alphabetically$")
    public void issueTypesShouldBeDisplayedAlphabetically() throws Throwable {
        addIssue.assertIssueTypeOrder();

    }

    @And("^User select a due date$")
    public void iSelectADueDate() throws Throwable {
        addIssue.selectDueDate();
    }

    @And("^User add a location detail$")
    public void iAddALocationDetail() throws Throwable {
        addIssue.addLocation();
    }


    @When("^User click on the Cancel button$")
    public void iClickOnTheCancelButton() throws Throwable {
        addIssue.cancelIssueButton();
    }

    @Then("^User should see the Assigned To text$")
    public void iShouldSeeTheAssignedToLink() throws Throwable {
        addIssue.checkAssignedTo();
    }
}
