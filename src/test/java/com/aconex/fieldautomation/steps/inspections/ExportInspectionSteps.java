package com.aconex.fieldautomation.steps.inspections;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.aconex.fieldautomation.utils.UIComponents.exportInspections;

public class ExportInspectionSteps {
    @Given("^User select the first checklist$")
    public void iSelectTheFirstChecklist() throws Throwable {
        exportInspections.selectChecklist();
    }

    @When("^User click on the Export button$")
    public void iClickOnTheExportButton() throws Throwable {
        exportInspections.clickExport();

    }

    @Then("^the checklist report should be downloaded$")
    public void theChecklistReportShouldBeDownloaded() throws Throwable {
        exportInspections.verifyFileDownload();
    }

    @Then("^the PDF content should match with the Web app$")
    public void iShouldVerify() throws Throwable {
        exportInspections.verifyPDFContent("Test");
    }


}
