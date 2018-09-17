package com.aconex.fieldautomation.steps.issues.view.grid;

import com.aconex.fieldautomation.utils.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AccessGridviewSteps extends DriverFactory {
    @When("^User click on grid view button$")
    public void userClickOnGridViewButton() throws Throwable {
        accessGridView.accessGridView();
    }

    @Then("^User should see the grid view$")
    public void userShouldSeeTheGridView() throws Throwable {
        accessGridView.verifytheGridView();
    }

    @And("^the page loader should disappear$")
    public void thePageLoadedShouldDisappear() throws Throwable {
        accessGridView.preLoaderPage();
    }
}
