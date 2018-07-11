
package steps.IssuesListView_Steps;


import Utils.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CustomFieldSteps extends DriverFactory {
    @And("^I click on the first custom field$")
    public void iClickOnTheFirstCustomField() throws Throwable {
        selectCustomField.clickOnFirstCustomField();
    }

    @And("^I select the value as High$")
    public void iSelectTheValueAsHigh() throws Throwable {
        selectCustomField.clickOnFirstDropdownValue();
    }

    @And("^I click on Refresh button$")
    public void iClickOnRefreshButton() throws Throwable {
        selectCustomField.clickRefresh();
    }

    @Then("^the selected custom field value should be saved for that issue$")
    public void theSelectedCustomFieldValueShouldBeSavedForThatIssue() throws Throwable {
        selectCustomField.assertCustomFieldWhileCreatingIssue();
    }


    @When("^user clicks on the first Issue$")
    public void userClicksOnTheFirstIssue() throws Throwable {
        selectCustomField.clickOnFirstIssue();
    }

    @Given("^I click on Extra Details Collapsible header$")
    public void iClickOnExtraDetailsCollapsibleHeader() throws Throwable {
        selectCustomField.clickExtraDetailCollapseHeader();
    }

    @When("^I select value High from dropdown$")
    public void iSelectValueHighFromDropdown() throws Throwable {
        selectCustomField.selectHighValueFromDropdown();
    }


    @Then("^User should verify the selected custom field value$")
    public void userShouldVerifyTheSelectedCustomFieldValue() throws Throwable {
        selectCustomField.assertCustomFieldForExistingIssue();
    }
}
