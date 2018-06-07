package Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.BasePage;

import java.io.IOException;

import static Utils.DriverFactory.addIssue;

public class add_issue_steps  {



    @Given("^I click on Add Issue button$")
    public void iClickOnAddIssueButton() throws Throwable {
        addIssue.clickOnAddButton();
    }

    @Then("^I should see the New Issue pane$")
    public void iShouldSeeTheNewIssuePane() throws Throwable {
        org.testng.Assert.assertEquals("Issues", "Issues");
    }

    @And("^I enter the Issue type$")
    public void iEnterTheIssueType() throws Throwable {
        addIssue.iEnterIssueType();
    }

    @And("^I enter the Issue description$")
    public void iEnterTheIssueDescription() throws Throwable {
        addIssue.iEnterIssueDesc();
    }

    @When("^I click on Save button$")
    public void iClickOnSaveButton() throws Throwable {
        addIssue.clickOnSaveButton();
    }

    @Then("^the Issue should be saved$")
    public void theIssueShouldBeSaved() throws Throwable {
        addIssue.verifyIssueSaved();
    }

}
