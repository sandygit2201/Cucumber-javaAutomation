package Steps;

import Utils.Constant;
import Utils.DriverFactory;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

import java.io.File;


public class MasterHooks extends DriverFactory {


    @Before
    public void setup() {
        driver = getDriver();


    }

    @After
    public void tearDownAndScreenshotonFailure(Scenario scenario) {

        try {

            if (driver != null && scenario.isFailed()) {
                scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png");

            }

            if (driver != null) {
                driver.quit();
                driver = null;


            }
        } catch (Exception e) {
            System.out.println("Methodfailed tearDownAndScreenshotonFailure, Exception:" + e.getMessage());
        }
    }

    @After
    public static void clean() {
        File dir = new File(Constant.PDF_DOWNLOAD_DIRECTORY);
        for (File file : dir.listFiles((dir1, name) -> name.endsWith("SignTemplate_BigTurnip_290618.pdf"))) {
            file.delete();
        }
        dir.delete();
    }
}
