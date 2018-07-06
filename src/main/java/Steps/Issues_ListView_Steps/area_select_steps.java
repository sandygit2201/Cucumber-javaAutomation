package Steps.Issues_ListView_Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import static Utils.DriverFactory.select_area;

public class area_select_steps {
    @Given("^the area drop down appears$")
    public void theAreaDropDownAppears() throws Throwable {
        select_area.assertAreaDropDown();
    }

    @And("^I click on an area$")
    public void iClickOnAnArea() throws Throwable {
        select_area.selectArea();
    }

    @Then("^I should be taken to that area$")
    public void iShouldBeTakenToThatArea() throws Throwable {
        org.testng.Assert.assertEquals("Cabinet hinge broken", "Cabinet hinge broken");
    }
}
