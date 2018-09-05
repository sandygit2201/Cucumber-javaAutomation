package steps.IssuesListView_Steps;

import Utils.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EventLogSteps extends DriverFactory {
    @When("^User click on Event log Collapsible header$")
    public void iClickOnEventlogCollapsibleHeader() throws Throwable {
    checkEventLogValues.clickEventsHeader();
    }

    @And("^User click on Event log button$")
    public void iClickOnEventLogButton() throws Throwable {
    checkEventLogValues.clickEventLogButton();
    }

    @Then("^User should see the Event log modal$")
    public void iShouldSeeTheEventLogModal() throws Throwable {
        checkEventLogValues.assertEventlogModal();
    }

    @And("^User should verify the captured user$")
    public void iShouldSeeTheCapturedUserAlongWithDate() throws Throwable {
    checkEventLogValues.assertCapturedUser();
    }


}
