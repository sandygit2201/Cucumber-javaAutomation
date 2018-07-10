
package steps.IssuesListView_Steps;


import Utils.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class CustomFieldSteps extends DriverFactory {
    @And("^I click on the first custom field$")
    public void iClickOnTheFirstCustomField() throws Throwable {
        selectCustomField.ClickOnFirstCustomField();
    }

    @And("^I select the value as High$")
    public void iSelectTheValueAsHigh() throws Throwable {
        selectCustomField.ClickOnFirstDropdownValue();
    }

    @And("^I click on Refresh button$")
    public void iClickOnRefreshButton() throws Throwable {
        selectCustomField.ClickRefresh();
    }

    @Then("^the selected custom field value should be saved for that issue$")
    public void theSelectedCustomFieldValueShouldBeSavedForThatIssue() throws Throwable {
        selectCustomField.AssertCustomFieldWhileCreatingIssue();
    }
}
