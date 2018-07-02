package pageObjects.Inspections;

import Utils.Constant;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import pageObjects.BasePage;

import java.io.*;
import java.io.File;


public class export_inspections_page extends BasePage {


    public export_inspections_page() throws IOException {
    }


    public @FindBy(xpath = "(//DIV[@class='title ng-binding'][text()='Automation'][text()='Automation'])")
    WebElement select_Checklist;

    public @FindBy(css = "div.checklist-details-export-pdf.col-md-6.no-padding.ng-isolate-scope > button")
    WebElement button_Export;


    public export_inspections_page selectChecklist() throws Exception {
        Thread.sleep(1000);
        clickOnElementUsingCustomTimeout(select_Checklist, driver, 10000);
        return new export_inspections_page();

    }

    public export_inspections_page clickExport() throws Exception {

        waitAndClickElement(button_Export);
        Thread.sleep(200);
        waitUntilPreLoadElementDissapears(By.className("fm-app > div:nth-child(4) > div > div > div"));
        return new export_inspections_page();

    }

    public export_inspections_page verifyFileDownload() throws Exception {
        String downloadPath = Constant.PDF_DOWNLOAD_DIRECTORY;
        Assert.assertTrue(isFileDownloaded(downloadPath, "Automation"),
                "Failed to download Expected document");
        return new export_inspections_page();

    }


    public boolean verifyPDFContent(String SearchText) throws IOException {

        return VerifyPdfContent(SearchText);
    }


}




