package steps.IssuesFilters_Steps;

import Utils.DriverFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CollapseFiltersSteps extends DriverFactory {
    @Given("^I see the filters pane$")
    public void iSeeTheFiltersPaneByDefault() throws Throwable {
        filtercollapseicon.verifyExpandedFilterPane();
    }

    @When("^I click on collapse icon for filters$")
    public void iClickOnCollapseIconForFilters() throws Throwable {
        filtercollapseicon.clickOnFilterCollapseIcon();
    }

    @Then("^I should not be able to see the filters pane$")
    public void iShouldNotBeAbleToSeeTheFiltersPane() throws Throwable {
        filtercollapseicon.verifyNoFilterPane();
    }

    @When("^I click on expanding the collapse icon$")
    public void iClickOnExpandingTheCollapseIcon() throws Throwable {
        filtercollapseicon.clickOnExpandFilterIcon();
    }


}
