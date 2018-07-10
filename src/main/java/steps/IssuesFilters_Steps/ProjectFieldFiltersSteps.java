package steps.IssuesFilters_Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static Utils.DriverFactory.projectfield_filter;

public class ProjectFieldFiltersSteps {
    @Given("^I click on Extra details$")
    public void iClickOnExtraDetails() throws Throwable {
        projectfield_filter.clickOnExtraDetails();
    }

    @Then("^I should see the Extra details modal$")
    public void iShouldSeeTheExtraDetailsModal() throws Throwable {
        projectfield_filter.viewExtraDetailsModal();
    }

    @And("^I select the project field$")
    public void iSelectTheProjectField() throws Throwable {
        projectfield_filter.clickOnFirstProjectField();
    }

    @When("^I select one value in that project field$")
    public void iSelectOneValueInThatProjectField() throws Throwable {
        projectfield_filter.selectFirstValue();
    }

    @And("^I click on Apply button$")
    public void iClickOnApplyButton() throws Throwable {
        projectfield_filter.clickApplyButton();
    }

    @Then("^I should see the loading screen$")
    public void iShouldSeeTheLoadingScreen() throws Throwable {
        projectfield_filter.assertLoadingScreen();
    }

    @Then("^I should see the result as per the filter$")
    public void iShouldSeeTheResultAsPerTheFilter() throws Throwable {
        projectfield_filter.assertProjectFieldFilterResult();
    }
}
