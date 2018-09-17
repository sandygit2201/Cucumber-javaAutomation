package com.aconex.fieldautomation.steps.issues.view.list;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.aconex.fieldautomation.utils.DriverFactory.issuesSearch;

public class IssuesSearchSteps {


    @Given("^User clicks on the issues search field$")
    public void userClicksOnTheIssuesSearchField() throws Throwable {
        issuesSearch.clickSearchField();
    }

    @And("^User clicks on the search button$")
    public void userClicksOnTheSearchButton() throws Throwable {
        issuesSearch.clickSearchButton();
    }

    @When("^User enters a string in the issues search field$")
    public void userEntersAStringInTheIssuesSearchField() throws Throwable {
        issuesSearch.enterString();
    }

    @Given("^there is no text entered in the search field$")
    public void thereIsNoTextEnteredInTheSearchField() throws Throwable {
        issuesSearch.assertSearchFieldIsBlank();
    }

    @Then("^the search button should be enabled$")
    public void theSearchButtonShouldBeEnabled() throws Throwable {
        issuesSearch.assertSearchButtonIsEnabled();
    }
//
//    @Then("^User should be able to see searched item in the issues list view$")
//    public void userShouldBeAbleToSeeAListOfResultsInTheListViewPage() throws Throwable {
//
//
//    }


}
