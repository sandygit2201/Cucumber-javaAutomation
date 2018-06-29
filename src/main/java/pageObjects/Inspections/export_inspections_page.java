package pageObjects.Inspections;

import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.io.RandomAccessRead;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pageObjects.BasePage;

import java.io.*;
import java.io.File;



public class export_inspections_page extends BasePage {


    public export_inspections_page() throws IOException {
    }


//    public @FindBy(css = "li.ng-scope.ng-isolate-scope.selected-checklist > div > div > div")
//    WebElement select_Checklist;

    public @FindBy(xpath = "(//DIV[@class='title ng-binding'][text()='Automation'][text()='Automation'])")
    WebElement select_Checklist;

    public @FindBy(css = "div.checklist-details-export-pdf.col-md-6.no-padding.ng-isolate-scope > button")
    WebElement button_Export;

    public @FindBy(css = "fm-app > div:nth-child(4) > div > div > div")
    WebElement loading_Growler;


    public export_inspections_page selectChecklist() throws Exception {
        Thread.sleep(1000);
        clickOnElementUsingCustomTimeout(select_Checklist, driver, 5000);
        return new export_inspections_page();

    }

    public export_inspections_page clickExport() throws Exception {

        waitAndClickElement(button_Export);
        Thread.sleep(200);
        waitUntilPreLoadElementDissapears(By.className("fm-app > div:nth-child(4) > div > div > div"));
        return new export_inspections_page();

    }

    public export_inspections_page verifyFileDownload() throws Exception {
        String downloadPath = "/Users/mohand/Downloads";
        Assert.assertTrue(isFileDownloaded(downloadPath, "Automation"),
                "Failed to download Expected document");
        return new export_inspections_page();

    }


    public boolean verifyPDFContent(String SearchText) throws IOException {

        File dir = new File("/Users/mohand/Downloads/");
        File[] files = dir.listFiles((dir1, name) ->  name.endsWith("Automation_BigTurnip_290618.pdf"));
        PDDocument doc = PDDocument.load(files[0]);
        PDFTextStripper pdfStripper = new PDFTextStripper();
        String text = pdfStripper.getText(doc);
        doc.close();
        System.out.println(text);
        System.out.println(SearchText);
        Assert.assertTrue(text.contains(SearchText));
        return text.contains(SearchText);

    }


}




