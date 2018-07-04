package Steps.Issues_ListView_Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static Utils.DriverFactory.issue_assignment;

public class issue_assignment_steps {
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
        issue_assignment.assignToUserinMyOrg();
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

    @And("^the Issue should be assigned to that User$")
    public void theIssueShouldBeAssignedToThatUser() throws Throwable {
        issue_assignment.assertIssueAssignmentToUserWhileCreatingIssue();
    }
}
