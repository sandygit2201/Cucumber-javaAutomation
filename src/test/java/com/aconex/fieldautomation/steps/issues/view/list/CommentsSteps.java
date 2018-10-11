package com.aconex.fieldautomation.steps.issues.view.list;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.aconex.fieldautomation.utils.UIComponents.addComments;


public class CommentsSteps {
    @Given("^User clicks on the first Issue$")
    public void theUserClicksOnTheFirstIssue() throws Throwable {
        addComments.clickOnFirstIssue();

    }

    @When("^User should see the comment text box$")
    public void theUserShouldSeeTheCommentTextBox() throws Throwable {
        addComments.viewCommentSection();

    }

    @Then("^User should be able to add the comment$")
    public void theUserShouldBeAbleToAddTheComment() throws Throwable {
        addComments.addComments();

    }

    @When("^User clicks on Post$")
    public void theUserClicksOnPost() throws Throwable {
        addComments.postComment();
    }

    @Then("^the comment should be added$")
    public void theCommentShouldBeAdded() throws Throwable {
        addComments.assertComment();
    }
}
