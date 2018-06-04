package Utils;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import pageObjects.Issue_Page;
import pageObjects.EnterField_page;
import pageObjects.Login_page;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverFactory {

    public static WebDriver driver;
    public static Login_page login_page;
    public static Issue_Page addIssuePage;
    public static EnterField_page enterFieldSteps;


    public WebDriver getDriver() {


        try

        {


            Properties p = new Properties();
            FileInputStream fi = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/properties/config.properties");
            p.load(fi);
            String browserName = p.getProperty("browser");


            switch (browserName) {

                case "firefox":

                    if (null == driver) {
                        System.setProperty("webdriver.gecko.driver", Constant.GECKO_DRIVER_DIRECTORY);
                        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
                        capabilities.setCapability("marionette", true);
                        driver = new FirefoxDriver();

                    }
                    break;

                case "chrome":

                    if (null == driver) {
                        System.setProperty("webdriver.chrome.driver", Constant.CHROME_DRIVER_DIRECTORY);
                         driver = new ChromeDriver();

                    }
                    break;

            }
        } catch (Exception e)

        {
            System.out.println("Unable to load browser" + e.getMessage());


        } finally

        {
            driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
            login_page = PageFactory.initElements(driver, Login_page.class);
            enterFieldSteps = PageFactory.initElements(driver, EnterField_page.class);
            addIssuePage = PageFactory.initElements(driver, Issue_Page.class);
        }

        return driver;
    }
}
