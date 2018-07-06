package Steps.Issues_ListView_Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static Utils.DriverFactory.issuesSearch;

public class issuesSearchSteps {


//    @Given("^User is in the issues page$")
//    public void userIsInTheIssuesPage() throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//
//    }

    @Given("^User clicks on the issues search field$")
    public void userClicksOnTheIssuesSearchField() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        issuesSearch.clickSearchField();
    }

    @And("^User clicks on the search button$")
    public void userClicksOnTheSearchButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        issuesSearch.clickSearchButton();
    }

    @When("^User enters a string in the issues search field$")
    public void userEntersAStringInTheIssuesSearchField() throws Throwable {
        issuesSearch.enterString();
    }
//
//    @Then("^User should be able to see searched item in the issues list view$")
//    public void userShouldBeAbleToSeeAListOfResultsInTheListViewPage() throws Throwable {
//
//
//    }


}
