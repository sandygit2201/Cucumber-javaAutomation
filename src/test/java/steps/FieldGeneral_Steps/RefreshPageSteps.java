package steps.FieldGeneral_Steps;

import Utils.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;

public class RefreshPageSteps extends DriverFactory {

    @Given("^I know the Issue count in Issues page$")
    public void iKnowTheIssueCountInIssuesPage() throws Throwable {
        refreshButton.iKnowTheIssueCountInIssuesPage();
    }

    @When("^User clicks on Refresh button$")
    public void userClicksOnRefreshButton() throws Throwable {
        refreshButton.clickOnRefreshButton();
    }

    @And("^Issue should be saved$")
    public void issue_should_be_saved() throws Throwable {
        refreshButton.issueShouldBeSaved();
    }


    @And("^I click on Save button in Issues pane$")
    public void iClickOnSaveButtonInIssuesPane() throws Throwable {
            refreshButton.iClickOnSaveButtonInIssuesPane();
    }

    @Then("^I should see Issue number get updated$")
    public void iShouldSeeIssueNumberGetUpdated() throws Throwable {
        refreshButton.iShouldSeeIssueNumberUpdatedBy1();
    }
}