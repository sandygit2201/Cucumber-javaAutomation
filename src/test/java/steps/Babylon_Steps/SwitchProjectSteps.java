package steps.Babylon_Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import static Utils.DriverFactory.switchProject;

public class SwitchProjectSteps {
    @Given("^I click on the project list$")
    public void iClickOnTheProjectList() throws Throwable {
        switchProject.clickProjectSelector();
    }

    @And("^I select Web automation project$")
    public void iSelectWebAutomationProject() throws Throwable {
        switchProject.selectMyProject();
    }

    @And("^I agree to Terms of Service Update if prompted$")
    public void userAgressToTermsOfServiceUpdateIfPrompted() throws Throwable {
        switchProject.checkForServiceUpdatePage();

    }

    @Then("^I should be taken to that project$")
    public void iShouldBeTakenToThatProject() throws Throwable {
        switchProject.assertMyProject();
    }
}
