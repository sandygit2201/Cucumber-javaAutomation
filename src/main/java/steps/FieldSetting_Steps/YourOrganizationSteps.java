package steps.FieldSetting_Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static Utils.DriverFactory.yourOrg;

public class YourOrganizationSteps {
    @Given("^I click on Your Organization$")
    public void iClickOnYourOrganization() throws Throwable {
        yourOrg.clickOnYourOrg();


    }

    @Then("^I should see the Your Organization section$")
    public void iShouldSeeTheYourOrganizationSection() throws Throwable {
        yourOrg.assertYourOrgPage();

    }
//----------------------To remove user from your organization----------------


    @When("^I click on the X mark for an user$")
    public void iClickOnTheXMark() throws Throwable {
        yourOrg.removeUser();
    }

    @Then("^the user should be removed from my Organization$")
    public void theUserShouldBeRemovedFromMyOrganization() throws Throwable {
        yourOrg.assertUserRemoved();
    }

    //----------------------Change role of an User----------------

    @Given("^I am an Inspector$")
    public void iAmAnInspector() throws Throwable {
        yourOrg.assertCurrentRole();
    }


    @When("^I click on the role of an Inspector$")
    public void iClickOnTheRoleOfAnUser() throws Throwable {
        yourOrg.clickOnUserRole();
    }

    @Then("^I should see the available user roles$")
    public void iShouldSeeTheAvailableUserRoles() throws Throwable {
        yourOrg.viewRoleOptions();
    }

    @When("^I select a user role$")
    public void iSelectAUserRole() throws Throwable {
        yourOrg.selectRole();
    }

    @Then("^the user role for the user should be changed$")
    public void theUserRoleForTheUserShouldBeChanged() throws Throwable {
        yourOrg.assertRoleChange();

    }


//    -------------------------------------------------------------------------------

}
