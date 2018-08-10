package steps.Babylon_Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import static Utils.DriverFactory.switchProject;

public class SwitchProjectSteps {
    @Given("^User click on the project list$")
    public void iClickOnTheProjectList() throws Throwable {
        switchProject.clickProjectSelector();
    }

    @And("^User select Web automation project$")
    public void iSelectWebAutomationProject() throws Throwable {
        switchProject.selectMyProject();
    }

    @And("^User agree to Terms of Service Update if prompted$")
    public void userAgressToTermsOfServiceUpdateIfPrompted() throws Throwable {
        switchProject.checkForServiceUpdatePage();

    }

    @Then("^User should be taken to that project$")
    public void iShouldBeTakenToThatProject() throws Throwable {
        switchProject.assertMyProject();
    }
}
