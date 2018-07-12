package steps.IssuesListView_Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static Utils.DriverFactory.issueAssignment;

public class IssueAssignmentSteps {
    @Given("^I select an Issue$")
    public void iSelectAnIssue() throws Throwable {
        issueAssignment.selectIssue();
    }

    @When("^the Issue is not assigned to anyone$")
    public void theIssueIsNotAssignedToAnyone() throws Throwable {
        issueAssignment.checkIssueNotAssigned();
    }

    @And("^I click on it and select Automation User from my org$")
    public void iClickOnItAndSelectAnUserFromMyOrg() throws Throwable {
        issueAssignment.assignToUserInMyOrg();
    }

    @Then("^the Issue should be assigned to the User$")
    public void theIssueShouldBeAssignedToTheUser() throws Throwable {
        issueAssignment.assertIssueAssignmentToUser();
    }

    @And("^I click on it and select Majestic Builders$")
    public void iClickOnItAndSelectAnOrg() throws Throwable {
        issueAssignment.assignToOrg();
    }

    @Then("^the Issue should be assigned to that Org$")
    public void theIssueShouldBeAssignedToThatOrg() throws Throwable {
        issueAssignment.assertIssueAssignmentToOrg();
    }

    @And("^I click on Assign to field$")
    public void iClickOnAssignToField() throws Throwable {
        issueAssignment.clickAssignTo();
    }

    @And("^I select Automation User from the list$")
    public void iSelectAUserFromTheList() throws Throwable {
        issueAssignment.assignToUserWhenAddingIssue();
    }

    @Then("^the Issue should be assigned to that User$")
    public void theIssueShouldBeAssignedToThatUser() throws Throwable {
        issueAssignment.assertIssueAssignmentToUserWhileCreatingIssue();
    }


    @Then("^the Issue should be assigned to that User which I selected$")
    public void theIssueShouldBeAssignedToThatUserWhichISelected() throws Throwable {
        issueAssignment.assertIssueAssignmentToUserWhileCreatingIssue();
    }

    @And("^I select Majestic Builders from the list$")
    public void iSelectAOrgFromTheList() throws Throwable {
        issueAssignment.assignToOrgWhenAddingIssue();
    }


    @Then("^the Issue should be assigned to that Org which I selected$")
    public void theIssueShouldBeAssignedToThatOrgWhichISelected() throws Throwable {
        issueAssignment.assertIssueAssignmentToOrgWhileCreatingIssue();
    }


}
