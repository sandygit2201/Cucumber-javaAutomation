package steps.IssuesListView_Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static Utils.DriverFactory.issue_assignment;

public class IssueAssignmentSteps {
    @Given("^I select an Issue$")
    public void iSelectAnIssue() throws Throwable {
        issue_assignment.selectIssue();
    }

    @When("^the Issue is not assigned to anyone$")
    public void theIssueIsNotAssignedToAnyone() throws Throwable {
        issue_assignment.checkIssueNotAssigned();
    }

    @And("^I click on it and select an User from my org$")
    public void iClickOnItAndSelectAnUserFromMyOrg() throws Throwable {
        issue_assignment.assignToUserInMyOrg();
    }

    @Then("^the Issue should be assigned to the User$")
    public void theIssueShouldBeAssignedToTheUser() throws Throwable {
        issue_assignment.assertIssueAssignmentToUser();
    }

    @And("^I click on it and select an Org$")
    public void iClickOnItAndSelectAnOrg() throws Throwable {
        issue_assignment.assignToOrg();
    }

    @Then("^the Issue should be assigned to that Org$")
    public void theIssueShouldBeAssignedToThatOrg() throws Throwable {
        issue_assignment.assertIssueAssignmentToOrg();
    }

    @And("^I click on Assign to field$")
    public void iClickOnAssignToField() throws Throwable {
        issue_assignment.clickAssignTo();
    }

    @And("^I select a User from the list$")
    public void iSelectAUserFromTheList() throws Throwable {
        issue_assignment.assignToUserWhenAddingIssue();
    }

    @Then("^the Issue should be assigned to that User$")
    public void theIssueShouldBeAssignedToThatUser() throws Throwable {
        issue_assignment.assertIssueAssignmentToUserWhileCreatingIssue();
    }


    @Then("^the Issue should be assigned to that User which I selected$")
    public void theIssueShouldBeAssignedToThatUserWhichISelected() throws Throwable {
        issue_assignment.assertIssueAssignmentToUserWhileCreatingIssue();
    }

    @And("^I select a Org from the list$")
    public void iSelectAOrgFromTheList() throws Throwable {
        issue_assignment.assignToOrgWhenAddingIssue();
    }


    @Then("^the Issue should be assigned to that Org which I selected$")
    public void theIssueShouldBeAssignedToThatOrgWhichISelected() throws Throwable {
        issue_assignment.assertIssueAssignmentToOrgWhileCreatingIssue();
    }
}
