package steps.IssuesFilters_Steps;

import static Utils.DriverFactory.issuesFilters;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StatusFiltersSteps {
    @When("^I select Open status$")
    public void iSelectOpenStatus() throws Throwable {
        issuesFilters.clickOnOpenStatus();
    }

    @Then("^I should see Issues that are Open$")
    public void iShouldSeeIssuesThatAreOpen() throws Throwable {
        issuesFilters.assertOpenFilter();
    }

    @When("^I select Ready to Inspect status$")
    public void iSelectReadyToInspectStatus() throws Throwable {
        issuesFilters.clickOnReadyToInspectStatus();
    }

    @Then("^I should see Issues that are Ready to Inspect$")
    public void iShouldSeeIssuesThatAreReadyToInspect() throws Throwable {
        issuesFilters.assertReadyToInspectFilter();
    }

    @When("^I select In Dispute status$")
    public void iSelectInDisputeStatus() throws Throwable {
        issuesFilters.clickOnInDisputeStatus();
    }

    @Then("^I should see Issues that are In Dispute$")
    public void iShouldSeeIssuesThatAreInDispute() throws Throwable {
        issuesFilters.assertInDisputeFilter();
    }

    @When("^I select Closed status$")
    public void iSelectClosedStatus() throws Throwable {
        issuesFilters.clickOnClosedStatus();
    }

    @Then("^I should see Issues that are Closed$")
    public void iShouldSeeIssuesThatAreClosed() throws Throwable {
        issuesFilters.assertClosedFilter();
    }


    @When("^I select Work Done status$")
    public void iSelectWorkDoneStatus() throws Throwable {
        issuesFilters.clickOnWorkDoneStatus();

    }

    @Then("^I should see Issues that are Work Done$")
    public void iShouldSeeIssuesThatAreWorkDone() throws Throwable {
        issuesFilters.assertWorkDoneFilter();
    }

}
