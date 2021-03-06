package com.aconex.fieldautomation.steps.field.general;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.aconex.fieldautomation.utils.UIComponents.accessField;


public class AccessFieldSteps {
    @And("^User enters a valid username$")
    public void userEntersAValidUsername() throws Throwable {
        accessField.enterUserName("mjenner");

    }

    @And("^User enters a valid password$")
    public void userEntersAValidPassword() throws Throwable {
        accessField.enterPassword("Auth3nt1c");

    }

    @Then("^User should be taken to the homepage$")
    public void userShouldBeTakenToTheHomepage() throws Throwable {
        accessField.verifyUserName("Mr Maurice Jenner");

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

