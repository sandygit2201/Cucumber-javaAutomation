package com.acx.steps.IssuesFilters_Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.acx.utils.DriverFactory.projectFieldFilter;

public class ProjectFieldFiltersSteps {
    @Given("^User click on Extra details$")
    public void iClickOnExtraDetails() throws Throwable {
        projectFieldFilter.clickOnExtraDetails();
    }

    @Then("^User should see the Extra details modal$")
    public void iShouldSeeTheExtraDetailsModal() throws Throwable {
        projectFieldFilter.viewExtraDetailsModal();
    }

    @And("^User select the project field$")
    public void iSelectTheProjectField() throws Throwable {
        projectFieldFilter.clickOnFirstProjectField();
    }

    @When("^User select one value in that project field$")
    public void iSelectOneValueInThatProjectField() throws Throwable {
        projectFieldFilter.selectFirstValue();
    }

    @And("^User click on Apply button$")
    public void iClickOnApplyButton() throws Throwable {
        projectFieldFilter.clickApplyButton();
    }

    @Then("^User should see the loading screen$")
    public void iShouldSeeTheLoadingScreen() throws Throwable {
        projectFieldFilter.assertLoadingScreen();
    }

    @Then("^User should see the result as per the filter$")
    public void iShouldSeeTheResultAsPerTheFilter() throws Throwable {
        projectFieldFilter.assertProjectFieldFilterResult();
    }
}
