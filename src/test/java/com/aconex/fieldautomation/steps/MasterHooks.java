package com.aconex.fieldautomation.steps;

import com.aconex.fieldautomation.utils.Constants;
import com.aconex.fieldautomation.utils.DataStoreUtils;
import com.aconex.fieldautomation.utils.DriverFactory;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import store.DataStore;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;


public class MasterHooks {


    private WebDriver driver;

    @After
    public static void clean() {
        Arrays.stream(new File(Constants.DOWNLOAD_DIRECTORY).listFiles())
                .forEach(File::delete);
    }

    @Before
    public void setup() throws IOException {
        driver = new DriverFactory().getDriver();
        Path downloadDir = Paths.get(Constants.DOWNLOAD_DIRECTORY);
        if (!Files.exists(downloadDir)) {
            Files.createDirectory(downloadDir);
        }
    }


    @Before
    public void clearDataStore(Scenario scenario){
        DataStore.clearUserMap();
    }


    @After
    public void tearDownAndScreenshotonFailure(Scenario scenario) {

        try {

            if (driver != null && scenario.isFailed()) {
                scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png");

            }

            if (driver != null) {
                driver.manage().deleteAllCookies();
                JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
                jsExecutor.executeScript("window.localStorage && window.localStorage.clear()");
                jsExecutor.executeScript("window.sessionStorage && window.sessionStorage.clear()");
            }

        } catch (Exception e) {
            System.out.println("Methodfailed tearDownAndScreenshotonFailure, Exception:" + e.getMessage());
        }
    }
}
