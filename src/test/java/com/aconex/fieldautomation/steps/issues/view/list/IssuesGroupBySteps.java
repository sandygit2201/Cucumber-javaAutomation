package com.aconex.fieldautomation.steps.issues.view.list;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import static com.aconex.fieldautomation.utils.UIComponents.issuesGroupBy;

public class IssuesGroupBySteps {

    @Given("^User click on Group by option$")
    public void iClickOnGroupByOption() throws Throwable {
        issuesGroupBy.clickGroupBy();
    }

    @And("^User select Location$")
    public void iSelectLocation() throws Throwable {
        issuesGroupBy.clickLocation();
    }

    @Then("^the issues should be displayed based on the Location$")
    public void theIssuesShouldBeDisplayedBasedOnTheLocation() throws Throwable {
        issuesGroupBy.assertLocationResult();
    }
}
