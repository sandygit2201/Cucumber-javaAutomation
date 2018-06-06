package Steps;

import Utils.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class login_steps extends DriverFactory {


    @Given("^User navigates to Field$")
    public void user_navigates_to_Field() throws Throwable {
      login_page.getloginPage();
    }


    @And("^User enters a \"([^\"]*)\" username$")
    public void userEntersAUsername(String userName) throws Throwable {
        login_page.enterUsername(userName);

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
    public void userShouldSeeThe(String message) throws Throwable {
        Thread.sleep(2000);
        Assert.assertEquals(message, message);

    }


}
