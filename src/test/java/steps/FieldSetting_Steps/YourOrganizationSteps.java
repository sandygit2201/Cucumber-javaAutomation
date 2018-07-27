package steps.FieldSetting_Steps;

import cucumber.api.java.en.And;
import cucumber.api.PendingException;
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

    //----------------------To add user from your organization----------------
    @Given("^User types Automation User1 in the Add more people search bar$")
    public void userTypesNewUser_AUtomationInTheAddMorePeopleSearchBar() throws Throwable {
        yourOrg.clickOnAddMorePeople();
    }

    @When("^User select the user from the drop down$")
    public void iSelectTheUserFromTheDropDown() throws Throwable {
        yourOrg.selectUserFromDropDown();
    }

    @Then("^the user should be added to my Org$")
    public void theUserShouldBeAddedToMyOrg() throws Throwable {
        yourOrg.verifyIfUserBeenAdded();
    }


    //----------------------Change role of an User----------------

    @Given("^User Automation User1 is an Inspector$")
    public void iAmAnInspector() throws Throwable {
        yourOrg.assertCurrentRole();
    }


    @And("^User clicks on the role of an Inspector$")
    public void iClickOnTheRoleOfAnUser() throws Throwable {
        yourOrg.clickOnUserRole();
    }

    @And("^User should see the available user roles$")
    public void iShouldSeeTheAvailableUserRoles() throws Throwable {
        yourOrg.viewRoleOptions();
    }

    @When("^User select a user role$")
    public void iSelectAUserRole() throws Throwable {
        yourOrg.selectRole();
    }

    @Then("^User role for the user should be changed$")
    public void theUserRoleForTheUserShouldBeChanged() throws Throwable {
        yourOrg.assertRoleChange();

    }

//----------------------To remove user from your organization----------------


    @When("^I click on the X mark for an Automation User1$")
    public void iClickOnTheXMark() throws Throwable {
        yourOrg.removeUser("Automation User1");
    }

    @Then("^the user Automation User1 should be removed from my Organization$")
    public void theUserShouldBeRemovedFromMyOrganization() throws Throwable {
        yourOrg.verifytheUserisRemoved("Automation User1");
    }

}
