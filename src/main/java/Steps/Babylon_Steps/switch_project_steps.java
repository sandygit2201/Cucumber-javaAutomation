package Steps.Babylon_Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import static Utils.DriverFactory.switch_project;

public class switch_project_steps {
    @Given("^I click on the project list$")
    public void iClickOnTheProjectList() throws Throwable {
        switch_project.clickProjectSelector();
    }

    @And("^I select Web automation project$")
    public void iSelectWebAutomationProject() throws Throwable {
        switch_project.selectMyProject();
    }

    @Then("^I should be taken to that project$")
    public void iShouldBeTakenToThatProject() throws Throwable {
        switch_project.AssertMyProject();
    }
}
