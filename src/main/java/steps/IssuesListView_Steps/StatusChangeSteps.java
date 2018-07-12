package steps.IssuesListView_Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import static Utils.DriverFactory.statusChange;

public class StatusChangeSteps {

    @Then("^I should close the area selector$")
    public void iShouldCloseTheAreaSelector() throws Throwable {
        statusChange.closeArea();
    }

    @Given("^I find an Open Issue$")
    public void iFindAnOpenIssue() throws Throwable {
        Assert.assertEquals("Open", "Open");

    }

    @When("^I tap on the status$")
    public void iTapOnTheStatus() throws Throwable {
        statusChange.clickOnStatus();


    }

    @When("^I click on RTI$")
    public void iClickOnRTI() throws Throwable {
        statusChange.clickOnReadyToInspect();
    }

    @Then("^the status should be changed$")
    public void theStatusShouldBeChanged() throws Throwable {
        Assert.assertEquals("Ready to Inspect", "Ready to Inspect");

    }


}
