package pageobjects.Inspections_Page;

import Utils.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pageobjects.BasePage;

import java.io.*;


public class ExportInspectionsPage extends BasePage {


    public ExportInspectionsPage() throws IOException {
    }


    public @FindBy(xpath = "(//DIV[@class='title ng-binding'][text()='Automation'][text()='Automation'])")
    WebElement selectChecklist;

    public @FindBy(css = "div.checklist-details-export-pdf.col-md-6.no-padding.ng-isolate-scope > button")
    WebElement buttonExport;


    public ExportInspectionsPage selectChecklist() throws Exception {
        Thread.sleep(1000);
        clickOnElementUsingCustomTimeout(selectChecklist, driver, 10000);
        return new ExportInspectionsPage();

    }

    public ExportInspectionsPage clickExport() throws Exception {

        waitAndClickElement(buttonExport);
        Thread.sleep(200);
        waitUntilPreLoadElementDisappears(By.className("fm-app > div:nth-child(4) > div > div > div"));
        return new ExportInspectionsPage();

    }

    public ExportInspectionsPage verifyFileDownload() throws Exception {
        String downloadPath = Constant.PDF_DOWNLOAD_DIRECTORY;
        Assert.assertTrue(isFileDownloaded(downloadPath, "Automation"),
                "Failed to download Expected document");
        return new ExportInspectionsPage();

    }


    public boolean verifyPDFContent(String SearchText) throws IOException {

        return verifyPdfContent(SearchText);
    }


}




