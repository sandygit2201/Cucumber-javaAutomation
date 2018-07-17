package steps.Babylon_Steps;

import Utils.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends DriverFactory {


    @Given("^User navigates to Field$")
    public void user_navigates_to_Field() throws Throwable {
        login_page.getLoginPage();
    }


    @And("^User enters a \"([^\"]*)\" username$")
    public void userEntersAUsername(String userName) throws Throwable {
        login_page.enterUserName(userName);

    }

    @And("^User enters a \"([^\"]*)\" password$")
    public void userEntersAPassword(String password) throws Throwable {
        login_page.enterPassword(password);

    }

    @When("^User clicks on the login button$")
    public void user_clicks_on_the_login_button() throws Throwable {
        login_page.clickLoginButton();

    }


    @Then("^User should see the \"([^\"]*)\"$")
    public void userShouldSeeThe(String arg0) throws Throwable {
        login_page.assertLoginSuccess(arg0);
    }


    @Then("^User should see the failure \"([^\"]*)\"$")
    public void user_should_see_the_failure(String arg1) throws Throwable {
        login_page.assertLoginFailure(arg1);
    }


}
