package com.acx.steps.IssuesListView_Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.acx.utils.DriverFactory.addCommentsPage;

public class CommentsSteps {
    @Given("^User clicks on the first Issue$")
    public void theUserClicksOnTheFirstIssue() throws Throwable {
        addCommentsPage.clickOnFirstIssue();

    }

    @When("^User should see the comment text box$")
    public void theUserShouldSeeTheCommentTextBox() throws Throwable {
        addCommentsPage.viewCommentSection();

    }

    @Then("^User should be able to add the comment$")
    public void theUserShouldBeAbleToAddTheComment() throws Throwable {
        addCommentsPage.addComments();

    }

    @When("^User clicks on Post$")
    public void theUserClicksOnPost() throws Throwable {
        addCommentsPage.postComment();
    }

    @Then("^the comment should be added$")
    public void theCommentShouldBeAdded() throws Throwable {
        addCommentsPage.assertComment();
    }
}
