package steps.IssuesListView_Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import static Utils.DriverFactory.issuesGroupBy;

public class IssuesGroupBySteps {

    @Given("^I click on Group by option$")
    public void iClickOnGroupByOption() throws Throwable {
        issuesGroupBy.clickGroupBy();
    }

    @And("^I select Location$")
    public void iSelectLocation() throws Throwable {
        issuesGroupBy.clickLocation();
    }

    @Then("^the issues should be displayed based on the Location$")
    public void theIssuesShouldBeDisplayedBasedOnTheLocation() throws Throwable {
        issuesGroupBy.assertLocationResult();
    }
}
