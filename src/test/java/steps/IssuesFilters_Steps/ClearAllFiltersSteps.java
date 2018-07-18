package steps.IssuesFilters_Steps;

import Utils.DriverFactory;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ClearAllFiltersSteps extends DriverFactory {
    @Given("^User clicks on Ready to Inspect filter$")
    public void userClicksOnReadyToInspectFilter() throws Throwable {
        clearAllFilter.clickReadyToInspectFilter();
    }


    @And("^User selects the Issue Type as Automation$")
    public void userClicksOnIssueTypeAutomation() throws Throwable {
        clearAllFilter.clickAutomationIssueTypeFilter();
    }

    @And("^User selects the created date as Today$")
    public void userSelectsTheCreatedDateFilterAsToday() throws Throwable {
        clearAllFilter.selectCreatedOnfilter();
    }

    @And("^User checks the filter count as three$")
    public void userChecksTheFilterCountAsThree() throws Throwable {
        clearAllFilter.assertFilterCount();
    }

    @When("^User clicks on clear all filter option$")
    public void userClicksOnClearAllFilterOption() throws Throwable {
        clearAllFilter.clickOnClearAllFilter();
    }

    @Then("^Filter count should be removed$")
    public void filterCountShouldBeChangedToZero() throws Throwable {
        clearAllFilter.assertFilterCountAfterClearAll();
    }
}
