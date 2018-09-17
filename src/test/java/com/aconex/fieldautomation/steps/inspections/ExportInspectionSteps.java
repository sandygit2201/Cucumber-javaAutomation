package com.aconex.fieldautomation.steps.inspections;

import com.aconex.fieldautomation.utils.DriverFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ExportInspectionSteps {
    @Given("^User select the first checklist$")
    public void iSelectTheFirstChecklist() throws Throwable {
        DriverFactory.exportInspections.selectChecklist();
    }

    @When("^User click on the Export button$")
    public void iClickOnTheExportButton() throws Throwable {
        DriverFactory.exportInspections.clickExport();

    }

    @Then("^the checklist report should be downloaded$")
    public void theChecklistReportShouldBeDownloaded() throws Throwable {
        DriverFactory.exportInspections.verifyFileDownload();
    }

    @Then("^the PDF content should match with the Web app$")
    public void iShouldVerify() throws Throwable {
        DriverFactory.exportInspections.verifyPDFContent("Test");
    }


}
