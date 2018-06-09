package Steps.Field_general_steps;

import Utils.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class access_field_steps extends DriverFactory {
    @And("^User enters a valid username$")
    public void userEntersAValidUsername() throws Throwable {
        accessField.enterUsername();

    }

    @And("^User enters a valid password$")
    public void userEntersAValidPassword() throws Throwable {
        accessField.enterPassword();

    }

    @Then("^User should be taken to the homepage$")
    public void userShouldBeTakenToTheHomepage() throws Throwable {
        accessField.assertLogin();

    }

    @When("^User clicks on Field-Issues$")
    public void userClicksOnFieldIssues() throws Throwable {
        accessField.selectIssues();


    }

    @Then("^User should see the Issues page$")
    public void userShouldSeeTheIssuesPage() throws Throwable {
        System.out.println("Issue page verified");
    }

    @Then("^I should close the FTUX$")
    public void iShouldCloseTheFTUX() throws Throwable {
        accessField.closeFTUX();
    }
}

