package steps.inspectionssteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import static Utils.DriverFactory.select_inspection;

public class select_inspection_steps {

    @Given("^User clicks on Field-Inspection$")
    public void userClicksOnFieldInspection() throws Throwable {
        select_inspection.clickField();
        select_inspection.clickInspections();

    }

    @Then("^I should close the CL area selector$")
    public void iShouldCloseTheCLAreaSelector() throws Throwable {
        select_inspection.closeArea();
    }

    @Then("^User should see the Inspection page$")
    public void userShouldSeeTheInspectionPage() throws Throwable {

        select_inspection.assertInspectionPage();

    }


}
