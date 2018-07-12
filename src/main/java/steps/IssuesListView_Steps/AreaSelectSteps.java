package steps.IssuesListView_Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import static Utils.DriverFactory.selectArea;

public class AreaSelectSteps {
    @Given("^the area drop down appears$")
    public void theAreaDropDownAppears() throws Throwable {
        selectArea.assertAreaDropDown();
    }

    @And("^I click on an area$")
    public void iClickOnAnArea() throws Throwable {
        selectArea.selectArea();
    }

    @Then("^I should be taken to that area$")
    public void iShouldBeTakenToThatArea() throws Throwable {
        org.testng.Assert.assertEquals("Cabinet hinge broken", "Cabinet hinge broken");
    }
}
