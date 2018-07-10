package steps.issuesgridviewsteps;

import Utils.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AccessGridviewSteps extends DriverFactory {
    @When("^User click on grid view button$")
    public void userClickOnGridViewButton() throws Throwable {
        access_gridview.accessGridView();
    }

    @Then("^User should see the grid view$")
    public void userShouldSeeTheGridView() throws Throwable {
        access_gridview.verifyGridView();
    }

    @And("^the page loader should disappear$")
    public void thePageLoadedShouldDisappear() throws Throwable {
        access_gridview.preLoaderPage();
    }
}
