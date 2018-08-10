package steps.FieldGeneral_Steps;

import Utils.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AccessFieldSteps extends DriverFactory {
    @And("^User enters a valid username$")
    public void userEntersAValidUsername() throws Throwable {
        accessField.enterUserName();

    }

    @And("^User enters a valid password$")
    public void userEntersAValidPassword() throws Throwable {
        accessField.enterPassword();

    }

    @Then("^User should be taken to the homepage$")
    public void userShouldBeTakenToTheHomepage() throws Throwable {
        accessField.verifyUserName();

    }

    @When("^User clicks on Field-Issues$")
    public void userClicksOnFieldIssues() throws Throwable {
        accessField.selectIssues();


    }

    @Then("^User should see the issues page$")
    public void userShouldSeeTheIssuesPage() throws Throwable {
        accessField.assertIssuesPage();
    }

    @And("^User should close the FTUX$")
    public void iShouldCloseTheFTUX() throws Throwable {
        accessField.closeFTUX();
    }
}

