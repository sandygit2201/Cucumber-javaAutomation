package Utils;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import pageObjects.Field_Settings_Page.access_sections_page;
import pageObjects.Field_Settings_Page.enter_settings_page;
import pageObjects.Field_Settings_Page.your_organization_page;
import pageObjects.Field_general_Page.access_field_page;
import pageObjects.Inspections.create_checklist_page;
import pageObjects.Inspections.select_inspection_page;
import pageObjects.Issues_ListView_Page.*;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverFactory {

    public static WebDriver driver;
    public static pageObjects.Babylon_page.login_page login_page;
    public static add_issue_page addIssue;
    public static access_field_page accessField;
    public static comments_page addCommentsPage;
    public static photo_upload_page photo_upload;
    public static area_select_page select_area;
    public static status_change_page status_change;
    public static select_inspection_page select_inspection;
    public static enter_settings_page enter_settings;
    public static access_sections_page access_sections;
    public static create_checklist_page create_checklist;
    public static your_organization_page your_org;
    public static issues_filters_page issues_filters;

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
                        driver.manage().window().fullscreen();


                    }
                    break;

            }
        } catch (Exception e)

        {
            System.out.println("Unable to load browser" + e.getMessage());


        } finally

        {
            driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
            login_page = PageFactory.initElements(driver, pageObjects.Babylon_page.login_page.class);
            accessField = PageFactory.initElements(driver, access_field_page.class);
            addIssue = PageFactory.initElements(driver, add_issue_page.class);
            addCommentsPage = PageFactory.initElements(driver, comments_page.class);
            photo_upload = PageFactory.initElements(driver, photo_upload_page.class);
            select_area = PageFactory.initElements(driver, area_select_page.class);
            status_change = PageFactory.initElements(driver, status_change_page.class);
            select_inspection = PageFactory.initElements(driver, select_inspection_page.class);
            enter_settings = PageFactory.initElements(driver, enter_settings_page.class);
            access_sections = PageFactory.initElements(driver, access_sections_page.class);
            create_checklist = PageFactory.initElements(driver, create_checklist_page.class);
            your_org = PageFactory.initElements(driver, your_organization_page.class);
            issues_filters = PageFactory.initElements(driver, issues_filters_page.class);

        }

        return driver;
    }
}
