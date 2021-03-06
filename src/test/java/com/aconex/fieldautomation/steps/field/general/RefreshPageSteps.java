package com.aconex.fieldautomation.steps.field.general;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.aconex.fieldautomation.utils.UIComponents.refreshButton;

public class RefreshPageSteps {

    @Given("^User know the Issue count in Issues page$")
    public void iKnowTheIssueCountInIssuesPage() throws Throwable {
        refreshButton.iKnowTheIssueCountInIssuesPage();
    }

    @When("^User clicks on Refresh button$")
    public void userClicksOnRefreshButton() throws Throwable {
        refreshButton.clickOnRefreshButton();
    }

    @And("^Issue should be saved$")
    public void issueShouldBeSaved() throws Throwable {
        refreshButton.issueShouldBeSaved();
    }


    @And("^User click on Save button in Issues pane$")
    public void iClickOnSaveButtonInIssuesPane() throws Throwable {
        refreshButton.iClickOnSaveButtonInIssuesPane();
    }

    @Then("^User should see Issue number get updated$")
    public void iShouldSeeIssueNumberGetUpdated() throws Throwable {
        refreshButton.iShouldSeeIssueNumberUpdatedBy1();
    }
}
