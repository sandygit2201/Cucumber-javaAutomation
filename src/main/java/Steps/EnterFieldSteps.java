package Steps;

import Utils.DriverFactory;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EnterFieldSteps extends DriverFactory {
    @And("^User enters a valid username$")
    public void userEntersAValidUsername() throws Throwable {
        enterFieldSteps.enterUsername();

    }

    @And("^User enters a valid password$")
    public void userEntersAValidPassword() throws Throwable {
        enterFieldSteps.enterPassword();

    }

    @Then("^User should be taken to the homepage$")
    public void userShouldBeTakenToTheHomepage() throws Throwable {
        enterFieldSteps.assertLogin();

    }

    @When("^User clicks on Field-Issues$")
    public void userClicksOnFieldIssues() throws Throwable {
        enterFieldSteps.selectIssues();


    }

    @Then("^User should see the Issues page$")
    public void userShouldSeeTheIssuesPage() throws Throwable {
        System.out.println("Issue page verified");
    }

    @Then("^I should close the FTUX$")
    public void iShouldCloseTheFTUX() throws Throwable {
        enterFieldSteps.closeFTUX();
    }
}

