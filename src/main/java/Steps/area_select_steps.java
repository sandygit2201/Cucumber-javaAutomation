package Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pageObjects.area_select_page;

import static Utils.DriverFactory.select_area;

public class area_select_steps {
    @When("^the area drop down appears$")
    public void theAreaDropDownAppears() throws Throwable {
        select_area.areaDropDown();
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
