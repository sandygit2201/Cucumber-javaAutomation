package com.aconex.fieldautomation.pageobjects.inspections;

import com.aconex.fieldautomation.pageobjects.BasePage;
import com.aconex.fieldautomation.utils.Constants;
import com.aconex.fieldautomation.utils.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.io.IOException;


public class ExportInspections extends BasePage {


    public @FindBy(xpath = "//DIV[@class='checklist-checklist clearfix edit-title-enabled ng-scope']//DIV[@class='title ng-binding'][text()='Automation Template']")
    WebElement selectChecklist;
    public @FindBy(css = "div.checklist-details-export-pdf.col-md-6.no-padding.ng-isolate-scope > button")
    WebElement buttonExport;

    public ExportInspections() throws IOException {
    }

    public ExportInspections selectChecklist() throws Exception {
        Thread.sleep(1000);
        clickOnElementUsingCustomTimeout(selectChecklist, DriverFactory.driver, 10);
        return new ExportInspections();

    }

    public ExportInspections clickExport() throws Exception {

        waitAndClickElement(buttonExport);
        Thread.sleep(200);
        waitUntilPreLoadElementDisappears(By.className("fm-app > div:nth-child(4) > div > div > div"));
        return new ExportInspections();

    }

    public ExportInspections verifyFileDownload() throws Exception {
        String downloadPath = Constants.DOWNLOAD_DIRECTORY;
        Assert.assertTrue(isFileDownloaded(downloadPath), "Failed to download Expected document");
        return new ExportInspections();

    }


    public boolean verifyPDFContent(String searchText) throws IOException {

        return verifyPdfContent(searchText);
    }


}




