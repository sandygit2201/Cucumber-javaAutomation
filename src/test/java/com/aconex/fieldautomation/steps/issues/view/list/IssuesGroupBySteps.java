package com.aconex.fieldautomation.steps.issues.view.list;

import com.aconex.fieldautomation.utils.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class IssuesGroupBySteps {

    @Given("^User click on Group by option$")
    public void iClickOnGroupByOption() throws Throwable {
        DriverFactory.issuesGroupBy.clickGroupBy();
    }

    @And("^User select Location$")
    public void iSelectLocation() throws Throwable {
        DriverFactory.issuesGroupBy.clickLocation();
    }

    @Then("^the issues should be displayed based on the Location$")
    public void theIssuesShouldBeDisplayedBasedOnTheLocation() throws Throwable {
        DriverFactory.issuesGroupBy.assertLocationResult();
    }
}
