package Steps.Issues_ListView_Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static Utils.DriverFactory.issues_filters;

public class issues_filters_steps {
    @When("^I select Open status$")
    public void iSelectOpenStatus() throws Throwable {
        issues_filters.clickOnOpenStatus();
    }

    @Then("^I should see Issues that are Open$")
    public void iShouldSeeIssuesThatAreOpen() throws Throwable {
        issues_filters.assertOpenFilter();
    }

    @When("^I select Ready to Inspect status$")
    public void iSelectReadyToInspectStatus() throws Throwable {
        issues_filters.clickOnReadyToInspectStatus();
    }

    @Then("^I should see Issues that are Ready to Inspect$")
    public void iShouldSeeIssuesThatAreReadyToInspect() throws Throwable {
        issues_filters.assertReadtoInspectFilter();
    }

    @When("^I select In Dispute status$")
    public void iSelectInDisputeStatus() throws Throwable {
        issues_filters.clickOnInDisputeStatus();
    }

    @Then("^I should see Issues that are In Dispute$")
    public void iShouldSeeIssuesThatAreInDispute() throws Throwable {
        issues_filters.assertInDisputeFilter();
    }

    @When("^I select Closed status$")
    public void iSelectClosedStatus() throws Throwable {
        issues_filters.clickOnClosedStatus();
    }

    @Then("^I should see Issues that are Closed$")
    public void iShouldSeeIssuesThatAreClosed() throws Throwable {
        issues_filters.assertClosedFilter();
    }


    @When("^I select Work Done status$")
    public void iSelectWorkDoneStatus() throws Throwable {
        issues_filters.clickOnWorkDoneStatus();

    }

    @Then("^I should see Issues that are Work Done$")
    public void iShouldSeeIssuesThatAreWorkDone() throws Throwable {
        issues_filters.assertWorkDoneFilter();
    }

}