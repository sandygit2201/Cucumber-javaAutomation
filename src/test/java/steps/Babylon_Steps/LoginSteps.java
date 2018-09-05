package steps.Babylon_Steps;

import static org.testng.Assert.assertTrue;

import java.util.regex.Pattern;

import Utils.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends DriverFactory {

    private static final Pattern LOGIN_FAILURE = Pattern.compile("^Your login name or password is( still)? incorrect\\.");

    @Given("^User navigates to Field$")
    public void userNavigatesToField() throws Throwable {
        loginPage.getLoginPage();
    }


    @And("^User enters a \"([^\"]*)\" username$")
    public void userEntersAUsername(String userName) throws Throwable {
        loginPage.enterUserName(userName);

    }

    @And("^User enters a \"([^\"]*)\" password$")
    public void userEntersAPassword(String password) throws Throwable {
        loginPage.enterPassword(password);

    }

    @When("^User clicks on the login button$")
    public void userClicksOnTheLoginButton() throws Throwable {
        loginPage.clickLoginButton();

    }


    @Then("^User should see the \"([^\"]*)\"$")
    public void userShouldSeeThe(String arg0) throws Throwable {
        loginPage.assertLoginSuccessMessage(arg0);
    }


    @Then("^User should see the failure \"(.*)\"$")
    public void userShouldSeeTheFailure(String arg1) throws Throwable {
        loginPage.assertLoginFailureMessage(arg1);
    }


    @Then("^User should see the failure message$")
    public void userShouldSeeTheFailureMessage() {
        assertTrue(matches(LOGIN_FAILURE, loginPage.getLoginFailureMessage()));
    }

    private boolean matches(Pattern loginFailure, String msg) {
        return loginFailure.matcher(msg).find();
    }
}
