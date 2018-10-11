package com.aconex.fieldautomation.steps.issues.filters;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.aconex.fieldautomation.utils.UIComponents.filtercollapseicon;

public class CollapseFiltersSteps {
    @Given("^User see the filters pane$")
    public void iSeeTheFiltersPaneByDefault() throws Throwable {
        filtercollapseicon.verifyExpandedFilterPane();
    }

    @When("^User click on collapse icon for filters$")
    public void iClickOnCollapseIconForFilters() throws Throwable {
        filtercollapseicon.clickOnFilterCollapseIcon();
    }

    @Then("^User should not be able to see the filters pane$")
    public void iShouldNotBeAbleToSeeTheFiltersPane() throws Throwable {
        filtercollapseicon.verifyNoFilterPane();
    }

    @When("^User click on expanding the collapse icon$")
    public void iClickOnExpandingTheCollapseIcon() throws Throwable {
        filtercollapseicon.clickOnExpandFilterIcon();
    }


}
