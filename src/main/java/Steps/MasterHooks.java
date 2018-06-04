package Steps;

import Utils.DriverFactory;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class MasterHooks extends DriverFactory {

    @Before
    public void setup() {
        driver = getDriver();

    }

    @After
    public void tearDownAndScreenshotonFailure(Scenario scenario) {

        try {

            if (driver != null && scenario.isFailed()) {
                scenario.embed(((TakesScreenshot)driver).getScreenshotAs (OutputType.BYTES), "image/png");

            }

            if (driver != null) {
                driver.quit();
                driver = null;


            }
        } catch (Exception e) {
            System.out.println("Methodfailed tearDownAndScreenshotonFailure, Exception:" + e.getMessage());
        }
    }
}
