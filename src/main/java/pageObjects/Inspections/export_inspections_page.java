package pageObjects.Inspections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pageObjects.BasePage;

import java.io.File;
import java.io.IOException;

public class export_inspections_page extends BasePage {


    public export_inspections_page() throws IOException {
    }


    public @FindBy(xpath = "(//DIV[@class='checklist-checklist clearfix edit-title-enabled ng-scope'])[1]")
    WebElement select_Checklist;

    public @FindBy(css = "div.checklist-details-export-pdf.col-md-6.no-padding.ng-isolate-scope > button")
    WebElement button_Export;

    public @FindBy(css = "fm-app > div:nth-child(4) > div > div > div")
    WebElement loading_Growler;


    public export_inspections_page selectChecklist() throws Exception {

        waitAndClickElement(select_Checklist);
        return new export_inspections_page();

    }

    public export_inspections_page clickExport() throws Exception {

        waitAndClickElement(button_Export);
        Thread.sleep(200);
        waitUntilPreLoadElementDissapears (By.className("fm-app > div:nth-child(4) > div > div > div") );
        return new export_inspections_page();

    }

    public export_inspections_page verifyFileDownload() throws Exception {
        String downloadPath = "/Users/mohand/Downloads";
        Assert.assertTrue(isFileDownloaded(downloadPath, "1956_ANewChecklistTemplate1Updated_BigTurnip_270618.pdf"),
                "Failed to download Expected document");
        return new export_inspections_page();

    }





}


