package Utils;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import pageObjects.*;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverFactory {

    public static WebDriver driver;
    public static Login_page login_page;
    public static add_issue_page addIssue;
    public static access_field_page accessField;
    public static comments_page addCommentsPage;
    public static photo_upload_page photo_upload;
    public static area_select_page select_area;
    public static status_change_page status_change;
    public static select_inspection_page select_inspection;


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
            accessField = PageFactory.initElements(driver, access_field_page.class);
            addIssue = PageFactory.initElements(driver, add_issue_page.class);
            addCommentsPage = PageFactory.initElements(driver, comments_page.class);
            photo_upload = PageFactory.initElements(driver, photo_upload_page.class);
            select_area = PageFactory.initElements(driver, area_select_page.class);
            status_change = PageFactory.initElements(driver, status_change_page.class);
            select_inspection = PageFactory.initElements(driver, select_inspection_page.class);

        }

        return driver;
    }
}
