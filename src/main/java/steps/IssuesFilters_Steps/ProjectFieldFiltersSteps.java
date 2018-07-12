package steps.IssuesFilters_Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static Utils.DriverFactory.projectFieldFilter;

public class ProjectFieldFiltersSteps {
    @Given("^I click on Extra details$")
    public void iClickOnExtraDetails() throws Throwable {
        projectFieldFilter.clickOnExtraDetails();
    }

    @Then("^I should see the Extra details modal$")
    public void iShouldSeeTheExtraDetailsModal() throws Throwable {
        projectFieldFilter.viewExtraDetailsModal();
    }

    @And("^I select the project field$")
    public void iSelectTheProjectField() throws Throwable {
        projectFieldFilter.clickOnFirstProjectField();
    }

    @When("^I select one value in that project field$")
    public void iSelectOneValueInThatProjectField() throws Throwable {
        projectFieldFilter.selectFirstValue();
    }

    @And("^I click on Apply button$")
    public void iClickOnApplyButton() throws Throwable {
        projectFieldFilter.clickApplyButton();
    }

    @Then("^I should see the loading screen$")
    public void iShouldSeeTheLoadingScreen() throws Throwable {
        projectFieldFilter.assertLoadingScreen();
    }

    @Then("^I should see the result as per the filter$")
    public void iShouldSeeTheResultAsPerTheFilter() throws Throwable {
        projectFieldFilter.assertProjectFieldFilterResult();
    }
}
