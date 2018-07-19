package steps;

import java.io.File;
import java.io.IOException;
import java.util.Optional;

import Utils.Constant;
import Utils.DriverFactory;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class MasterHooks extends DriverFactory {


    @Before
    public void setup() throws IOException {
        driver = getDriver();


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

    @After
    public static void clean() {
        File downloadDir = new File(Constant.PDF_DOWNLOAD_DIRECTORY);
        File[] files = Optional.ofNullable(downloadDir.listFiles((dir, name) -> name.endsWith("SignTemplate_BigTurnip_290618.pdf")))
                .orElse(new File[]{});
        for (File file : files) {
            file.delete();
        }
    }
}
