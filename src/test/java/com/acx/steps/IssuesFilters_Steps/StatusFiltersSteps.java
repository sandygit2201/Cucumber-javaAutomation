package com.acx.steps.IssuesFilters_Steps;

import static com.acx.utils.DriverFactory.issuesFilters;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StatusFiltersSteps {
    @When("^User select Open status$")
    public void iSelectOpenStatus() throws Throwable {
        issuesFilters.clickOnOpenStatus();
    }

    @Then("^User should see Issues that are Open$")
    public void iShouldSeeIssuesThatAreOpen() throws Throwable {
        issuesFilters.assertOpenFilter();
    }

    @When("^User select Ready to Inspect status$")
    public void iSelectReadyToInspectStatus() throws Throwable {
        issuesFilters.clickOnReadyToInspectStatus();
    }

    @Then("^User should see Issues that are Ready to Inspect$")
    public void iShouldSeeIssuesThatAreReadyToInspect() throws Throwable {
        issuesFilters.assertReadyToInspectFilter();
    }

    @When("^User select In Dispute status$")
    public void iSelectInDisputeStatus() throws Throwable {
        issuesFilters.clickOnInDisputeStatus();
    }

    @Then("^User should see Issues that are In Dispute$")
    public void iShouldSeeIssuesThatAreInDispute() throws Throwable {
        issuesFilters.assertInDisputeFilter();
    }

    @When("^User select Closed status$")
    public void iSelectClosedStatus() throws Throwable {
        issuesFilters.clickOnClosedStatus();
    }

    @Then("^User should see Issues that are Closed$")
    public void iShouldSeeIssuesThatAreClosed() throws Throwable {
        issuesFilters.assertClosedFilter();
    }


    @When("^User select Work Done status$")
    public void iSelectWorkDoneStatus() throws Throwable {
        issuesFilters.clickOnWorkDoneStatus();

    }

    @Then("^User should see Issues that are Work Done$")
    public void iShouldSeeIssuesThatAreWorkDone() throws Throwable {
        issuesFilters.assertWorkDoneFilter();
    }

}
