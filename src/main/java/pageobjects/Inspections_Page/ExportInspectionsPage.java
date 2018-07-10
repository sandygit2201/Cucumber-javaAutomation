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
    WebElement select_Checklist;

    public @FindBy(css = "div.checklist-details-export-pdf.col-md-6.no-padding.ng-isolate-scope > button")
    WebElement button_Export;


    public ExportInspectionsPage selectChecklist() throws Exception {
        Thread.sleep(1000);
        clickOnElementUsingCustomTimeout(select_Checklist, driver, 10000);
        return new ExportInspectionsPage();

    }

    public ExportInspectionsPage clickExport() throws Exception {

        waitAndClickElement(button_Export);
        Thread.sleep(200);
        waitUntilPreLoadElementDissapears(By.className("fm-app > div:nth-child(4) > div > div > div"));
        return new ExportInspectionsPage();

    }

    public ExportInspectionsPage verifyFileDownload() throws Exception {
        String downloadPath = Constant.PDF_DOWNLOAD_DIRECTORY;
        Assert.assertTrue(isFileDownloaded(downloadPath, "Automation"),
                "Failed to download Expected document");
        return new ExportInspectionsPage();

    }


    public boolean verifyPDFContent(String SearchText) throws IOException {

        return VerifyPdfContent(SearchText);
    }


}




