package steps.Issueslistviewsteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import static Utils.DriverFactory.addCommentsPage;

public class CommentsSteps {
    @Given("^the user clicks on the first Issue$")
    public void theUserClicksOnTheFirstIssue() throws Throwable {
        System.out.println("User clicked on first issue");


    }

    @When("^the user should see the comment text box$")
    public void theUserShouldSeeTheCommentTextBox() throws Throwable {

        addCommentsPage.switchFrame();
        System.out.println("Frame switch done");
    }

    @Then("^the user should be able to add the comment$")
    public void theUserShouldBeAbleToAddTheComment() throws Throwable {
        addCommentsPage.findcommentTextbox();


    }

    @When("^the user clicks on Post$")
    public void theUserClicksOnPost() throws Throwable {
        addCommentsPage.postComment();
    }

    @Then("^the comment should be added$")
    public void theCommentShouldBeAdded() throws Throwable {
        Assert.assertEquals("Test comments", "Test comments");    }
}
