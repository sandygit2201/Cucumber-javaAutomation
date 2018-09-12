package com.aconex.fieldautomation.steps.issues.view.list;

import com.aconex.fieldautomation.utils.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class IssueAssignmentSteps {
    @Given("^User select an Issue$")
    public void iSelectAnIssue() throws Throwable {
        DriverFactory.issueAssignment.selectIssue();
    }

    @When("^the Issue is not assigned to anyone$")
    public void theIssueIsNotAssignedToAnyone() throws Throwable {
        DriverFactory.issueAssignment.checkIssueNotAssigned();
    }

    @And("^User click on it and select Automation User from my org$")
    public void iClickOnItAndSelectAnUserFromMyOrg() throws Throwable {
        DriverFactory.issueAssignment.assignToUserInMyOrg();
    }

    @Then("^the Issue should be assigned to the User$")
    public void theIssueShouldBeAssignedToTheUser() throws Throwable {
        DriverFactory.issueAssignment.assertIssueAssignmentToUser();
    }

    @And("^User click on it and select Majestic Builders$")
    public void iClickOnItAndSelectAnOrg() throws Throwable {
        DriverFactory.issueAssignment.assignToOrg();
    }

    @Then("^the Issue should be assigned to that Org$")
    public void theIssueShouldBeAssignedToThatOrg() throws Throwable {
        DriverFactory.issueAssignment.assertIssueAssignmentToOrg();
    }

    @And("^User click on Assign to field$")
    public void iClickOnAssignToField() throws Throwable {
        DriverFactory.issueAssignment.clickAssignTo();
    }

    @And("^User select Automation User from the list$")
    public void iSelectAUserFromTheList() throws Throwable {
        DriverFactory.issueAssignment.assignToUserWhenAddingIssue();
    }

    @Then("^the Issue should be assigned to that User$")
    public void theIssueShouldBeAssignedToThatUser() throws Throwable {
        DriverFactory.issueAssignment.assertIssueAssignmentToUserWhileCreatingIssue();
    }


    @Then("^the Issue should be assigned to that User which I selected$")
    public void theIssueShouldBeAssignedToThatUserWhichISelected() throws Throwable {
        DriverFactory.issueAssignment.assertIssueAssignmentToUserWhileCreatingIssue();
    }

    @And("^User select Majestic Builders from the list$")
    public void iSelectAOrgFromTheList() throws Throwable {
        DriverFactory.issueAssignment.assignToOrgWhenAddingIssue();
    }


    @Then("^the Issue should be assigned to that Org which I selected$")
    public void theIssueShouldBeAssignedToThatOrgWhichISelected() throws Throwable {
        DriverFactory.issueAssignment.assertIssueAssignmentToOrgWhileCreatingIssue();
    }


}
