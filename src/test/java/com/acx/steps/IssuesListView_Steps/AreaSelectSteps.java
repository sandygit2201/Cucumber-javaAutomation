package com.acx.steps.IssuesListView_Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import static com.acx.utils.DriverFactory.selectArea;

public class AreaSelectSteps {
    @Given("^the area drop down appears$")
    public void theAreaDropDownAppears() throws Throwable {
        selectArea.assertAreaDropDown();
    }

    @And("^User click on BLOCK A area$")
    public void iClickOnAnArea() throws Throwable {
        selectArea.selectArea();
    }

    @Then("^User should be taken to that area$")
    public void iShouldBeTakenToThatArea() throws Throwable {
        selectArea.assertUserSelectedArea();
    }

    @Then("^the area in new issue pane should match the user selected area$")
    public void theAreaInNewIssuePaneShouldMatchTheUserSelectedArea() throws Throwable {
        selectArea.assertAreaInNewIssuePane();
    }
}
