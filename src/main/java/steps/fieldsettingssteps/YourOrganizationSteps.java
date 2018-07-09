package steps.fieldsettingssteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static Utils.DriverFactory.your_org;

public class YourOrganizationSteps {
    @Given("^I click on Your Organization$")
    public void iClickOnYourOrganization() throws Throwable {
        your_org.clickOnYourOrg();


    }

    @Then("^I should see the Your Organization section$")
    public void iShouldSeeTheYourOrganizationSection() throws Throwable {
        your_org.assertYOurOrgPage();

    }
//----------------------To remove user from your organization----------------


    @When("^I click on the X mark for an user$")
    public void iClickOnTheXMark() throws Throwable {
        your_org.removeUser();
    }

    @Then("^the user should be removed from my Organization$")
    public void theUserShouldBeRemovedFromMyOrganization() throws Throwable {
        your_org.assertUserRemoved();
    }

    //----------------------Change role of an User----------------

    @Given("^I am an Inspector$")
    public void iAmAnInspector() throws Throwable {
        your_org.assertCurrentRole();
    }


    @When("^I click on the role of an Inspector$")
    public void iClickOnTheRoleOfAnUser() throws Throwable {
        your_org.clickonUserRole();
    }

    @Then("^I should see the available user roles$")
    public void iShouldSeeTheAvailableUserRoles() throws Throwable {
        your_org.viewRoleOptions();
    }

    @When("^I select a user role$")
    public void iSelectAUserRole() throws Throwable {
        your_org.selectRole();
    }

    @Then("^the user role for the user should be changed$")
    public void theUserRoleForTheUserShouldBeChanged() throws Throwable {
        your_org.assertRoleChange();

    }


//    -------------------------------------------------------------------------------

}
