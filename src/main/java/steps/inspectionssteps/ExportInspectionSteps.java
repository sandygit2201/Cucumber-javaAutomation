package steps.inspectionssteps;

import static Utils.DriverFactory.export_inspections;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ExportInspectionSteps {
    @Given("^I select the first checklist$")
    public void iSelectTheFirstChecklist() throws Throwable {
        export_inspections.selectChecklist();
    }

    @When("^I click on the Export button$")
    public void iClickOnTheExportButton() throws Throwable {
        export_inspections.clickExport();

    }

    @Then("^the checklist report should be downloaded$")
    public void theChecklistReportShouldBeDownloaded() throws Throwable {
        export_inspections.verifyFileDownload();
    }

    @Then("^the PDF content should match with the Web app$")
    public void iShouldVerify() throws Throwable {
        export_inspections.verifyPDFContent("Test");
    }


}
