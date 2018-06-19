package Steps.Issues_ListView_Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static Utils.DriverFactory.issues_filters;

public class issues_filters_steps {
    @When("^I select Open status$")
    public void iSelectOpenStatus() throws Throwable {
        issues_filters.clickOnOpenStatus();
    }

    @Then("^I should see Issues that are Open$")
    public void iShouldSeeIssuesThatAreOpen() throws Throwable {
        issues_filters.assertOpenFilter();
    }
}
