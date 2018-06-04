package Steps;

import Utils.DriverFactory;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class IssuePage_steps extends DriverFactory {

    @Given("^I click on Add Issue button$")
    public void iClickOnAddIssueButton() throws Throwable {
        addIssuePage.clickOnAddButton();
    }

    @Then("^I should see the New Issue pane$")
    public void iShouldSeeTheNewIssuePane() throws Throwable {
        org.testng.Assert.assertEquals("Issues", "Issues");
    }

    @And("^I enter the Issue type$")
    public void iEnterTheIssueType() throws Throwable {
        addIssuePage.iEnterIssueType();
    }

    @And("^I enter the Issue description$")
    public void iEnterTheIssueDescription() throws Throwable {
        addIssuePage.iEnterIssueDesc();
    }

    @When("^I click on Save button$")
    public void iClickOnSaveButton() throws Throwable {
        addIssuePage.clickOnSaveButton();
    }

    @Then("^the Issue should be saved$")
    public void theIssueShouldBeSaved() throws Throwable {
        addIssuePage.verifyIssueSaved();
    }


}
