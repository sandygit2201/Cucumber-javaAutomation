package Steps.Inspections_Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static Utils.DriverFactory.export_inspections;

public class export_inspection_steps {
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

    @Then("^I should verify$")
    public void iShouldVerify() throws Throwable {
        export_inspections.verifyPDFContent("Test");
    }
}
