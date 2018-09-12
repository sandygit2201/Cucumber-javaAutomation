package com.aconex.fieldautomation.steps.field.setting;

import com.aconex.fieldautomation.utils.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class YourOrganizationSteps {
    @Given("^User click on Your Organization$")
    public void iClickOnYourOrganization() throws Throwable {
        DriverFactory.yourOrg.clickOnYourOrg();


    }

    @Then("^User should see the Your Organization section$")
    public void iShouldSeeTheYourOrganizationSection() throws Throwable {
        DriverFactory.yourOrg.assertYourOrgPage();

    }

    //----------------------To add user from your organization----------------
    @Given("^User types Automation User1 in the Add more people search bar$")
    public void userTypesNewUserAUtomationInTheAddMorePeopleSearchBar() throws Throwable {
        DriverFactory.yourOrg.clickOnAddMorePeople();
    }

    @When("^User select the user from the drop down$")
    public void iSelectTheUserFromTheDropDown() throws Throwable {
        DriverFactory.yourOrg.selectUserFromDropDown();
    }

    @Then("^the user should be added to my Org$")
    public void theUserShouldBeAddedToMyOrg() throws Throwable {
        DriverFactory.yourOrg.verifyIfUserBeenAdded();
    }


    //----------------------Change role of an User----------------

    @Given("^User Automation User1 is an Inspector$")
    public void iAmAnInspector() throws Throwable {
        DriverFactory.yourOrg.assertCurrentRole();
    }


    @And("^User clicks on the role of an Inspector$")
    public void iClickOnTheRoleOfAnUser() throws Throwable {
        DriverFactory.yourOrg.clickOnUserRole();
    }

    @And("^User should see the available user roles$")
    public void iShouldSeeTheAvailableUserRoles() throws Throwable {
        DriverFactory.yourOrg.viewRoleOptions();
    }

    @When("^User select a user role$")
    public void iSelectAUserRole() throws Throwable {
        DriverFactory.yourOrg.selectRole();
    }

    @Then("^User role for the user should be changed$")
    public void theUserRoleForTheUserShouldBeChanged() throws Throwable {
        DriverFactory.yourOrg.assertRoleChange();

    }

//----------------------To remove user from your organization----------------


    @When("^User click on the X mark for an Automation User1$")
    public void iClickOnTheXMark() throws Throwable {
        DriverFactory.yourOrg.removeUser("Automation User1");
    }

    @Then("^the user Automation User1 should be removed from my Organization$")
    public void theUserShouldBeRemovedFromMyOrganization() throws Throwable {
        DriverFactory.yourOrg.verifytheUserisRemoved("Automation User1");
    }

}
