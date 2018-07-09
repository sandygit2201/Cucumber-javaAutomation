package Utils;


import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import pageobjects.babylonpage.LoginPage;
import pageobjects.babylonpage.LogoutPage;
import pageobjects.babylonpage.SwitchProjectPage;
import pageobjects.fieldgeneralpage.AccessFieldPage;
import pageobjects.fieldsettingspage.AccessSectionsPage;
import pageobjects.fieldsettingspage.EnterSettingsPage;
import pageobjects.fieldsettingspage.YourOrganizationPage;
import pageobjects.inspections.CreateChecklistPage;
import pageobjects.inspections.ExportInspectionsPage;
import pageobjects.inspections.SelectInspectionPage;
import pageobjects.issuesfilterspage.ProjectFieldFiltersPage;
import pageobjects.issuesfilterspage.StatusFiltersPage;
import pageobjects.issuesgridviewpage.AccessGridviewPage;
import pageobjects.issueslistviewpage.*;

public class DriverFactory {

    public static WebDriver driver;
    public static LoginPage login_page;
    public static AddIssuePage addIssue;
    public static AccessFieldPage accessField;
    public static CommentsPage addCommentsPage;
    public static PhotoUploadPage photo_upload;
    public static AreaSelectPage select_area;
    public static IssuesSearchPage issuesSearch;
    public static StatusChangePage status_change;
    public static SelectInspectionPage select_inspection;
    public static EnterSettingsPage enter_settings;
    public static AccessSectionsPage access_sections;
    public static CreateChecklistPage create_checklist;
    public static YourOrganizationPage your_org;
    public static StatusFiltersPage issues_filters;
    public static ExportInspectionsPage export_inspections;
    public static IssueAssignmentPage issue_assignment;
    public static AccessGridviewPage access_gridview;
    public static LogoutPage logout;
    public static SwitchProjectPage switch_project;
    public static ProjectFieldFiltersPage projectfield_filter;
    public static CustomFieldPage selectCustomField;


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
            login_page = PageFactory.initElements(driver, LoginPage.class);
            accessField = PageFactory.initElements(driver, AccessFieldPage.class);
            addIssue = PageFactory.initElements(driver, AddIssuePage.class);
            addCommentsPage = PageFactory.initElements(driver, CommentsPage.class);
            photo_upload = PageFactory.initElements(driver, PhotoUploadPage.class);
            select_area = PageFactory.initElements(driver, AreaSelectPage.class);
            status_change = PageFactory.initElements(driver, StatusChangePage.class);
            select_inspection = PageFactory.initElements(driver, SelectInspectionPage.class);
            enter_settings = PageFactory.initElements(driver, EnterSettingsPage.class);
            access_sections = PageFactory.initElements(driver, AccessSectionsPage.class);
            create_checklist = PageFactory.initElements(driver, CreateChecklistPage.class);
            your_org = PageFactory.initElements(driver, YourOrganizationPage.class);
            issues_filters = PageFactory.initElements(driver, StatusFiltersPage.class);
            export_inspections = PageFactory.initElements(driver, ExportInspectionsPage.class);
            issue_assignment = PageFactory.initElements(driver, IssueAssignmentPage.class);
            access_gridview = PageFactory.initElements(driver, AccessGridviewPage.class);
            logout = PageFactory.initElements(driver, LogoutPage.class);
            issuesSearch = PageFactory.initElements(driver, IssuesSearchPage.class);
            switch_project = PageFactory.initElements(driver, SwitchProjectPage.class);
            projectfield_filter = PageFactory.initElements(driver, ProjectFieldFiltersPage.class);
            selectCustomField = PageFactory.initElements(driver, CustomFieldPage.class);

        }

        return driver;
    }
}
