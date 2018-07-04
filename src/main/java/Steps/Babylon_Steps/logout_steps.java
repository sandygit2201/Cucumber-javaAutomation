package Steps.Babylon_Steps;

import Utils.DriverFactory;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class logout_steps extends DriverFactory {

    @When("^user clicks on logout link$")
    public void user_clicks_on_logout_link() throws Throwable {
    logout.Clicklogut();
    }

    @Then("^user should be successfully logged out$")
    public void user_should_be_successfully_logged_out() throws Throwable {
        logout.SuccessfulLogOut();
    }
}
