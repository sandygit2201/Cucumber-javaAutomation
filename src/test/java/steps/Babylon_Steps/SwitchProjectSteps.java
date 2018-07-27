package steps.Babylon_Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import static Utils.DriverFactory.switchProject;

public class SwitchProjectSteps {
    @Given("^User clicks on the project list$")
    public void iClickOnTheProjectList() throws Throwable {
        switchProject.clickProjectSelector();
    }

    @And("^User selects Web automation project$")
    public void iSelectWebAutomationProject() throws Throwable {
        switchProject.selectMyProject();
    }

    @And("^User agrees to Terms of Service Update if prompted$")
    public void userAgressToTermsOfServiceUpdateIfPrompted() throws Throwable {
        switchProject.checkForServiceUpdatePage();

    }

    @Then("^User should be taken to that project$")
    public void iShouldBeTakenToThatProject() throws Throwable {
        switchProject.assertMyProject();
    }
}
