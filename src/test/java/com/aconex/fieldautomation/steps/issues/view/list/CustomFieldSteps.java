package com.aconex.fieldautomation.steps.issues.view.list;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.aconex.fieldautomation.utils.UIComponents.selectCustomField;

public class CustomFieldSteps {
    @And("^User click on the first custom field$")
    public void iClickOnTheFirstCustomField() throws Throwable {
        selectCustomField.clickOnFirstCustomField();
    }

    @And("^User select the value as High$")
    public void iSelectTheValueAsHigh() throws Throwable {
        selectCustomField.clickOnFirstDropdownValue();
    }

    @And("^User click on Refresh button$")
    public void iClickOnRefreshButton() throws Throwable {
        selectCustomField.clickRefresh();
    }

    @Then("^the selected custom field value should be saved for that issue$")
    public void theSelectedCustomFieldValueShouldBeSavedForThatIssue() throws Throwable {
        selectCustomField.assertCustomFieldWhileCreatingIssue();
    }

    @Given("^User click on Extra Details Collapsible header$")
    public void iClickOnExtraDetailsCollapsibleHeader() throws Throwable {
        selectCustomField.clickExtraDetailCollapseHeader();
    }

    @When("^User select value High from dropdown$")
    public void iSelectValueHighFromDropdown() throws Throwable {
        selectCustomField.selectHighValueFromDropdown();
    }


    @Then("^User should verify the selected custom field value$")
    public void userShouldVerifyTheSelectedCustomFieldValue() throws Throwable {
        selectCustomField.assertCustomFieldForExistingIssue();
    }
}
