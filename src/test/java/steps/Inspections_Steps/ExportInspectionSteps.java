package steps.Inspections_Steps;

import static Utils.DriverFactory.exportInspections;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ExportInspectionSteps {
    @Given("^I select the first checklist$")
    public void iSelectTheFirstChecklist() throws Throwable {
        exportInspections.selectChecklist();
    }

    @When("^I click on the Export button$")
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