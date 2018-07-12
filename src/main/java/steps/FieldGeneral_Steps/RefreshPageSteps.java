package steps.FieldGeneral_Steps;

import Utils.DriverFactory;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RefreshPageSteps extends DriverFactory {

    @When("^User clicks on Refresh button$")
    public void userClicksOnRefreshButton() throws Throwable {
        refreshButton.clickOnRefreshButton();
    }

    @Then("^Issues page should be refreshed$")
    public void issuesPageShouldBeRefreshed() throws Throwable {
        refreshButton.verifyIssuePageRefresh();
    }
}
