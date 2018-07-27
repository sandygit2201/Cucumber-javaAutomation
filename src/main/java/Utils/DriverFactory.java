package Utils;


import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Objects;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.SystemUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.Babylon.LoginPage;
import pageobjects.Babylon.LogoutPage;
import pageobjects.Babylon.SwitchProjectPage;
import pageobjects.FieldGeneral_Page.AccessFieldPage;
import pageobjects.FieldGeneral_Page.RefreshPage;
import pageobjects.FieldSettings_Page.AccessSectionsPage;
import pageobjects.FieldSettings_Page.EnterSettingsPage;
import pageobjects.FieldSettings_Page.YourOrganizationPage;
import pageobjects.Inspections_Page.CreateChecklistPage;
import pageobjects.Inspections_Page.ExportInspectionsPage;
import pageobjects.Inspections_Page.SelectInspectionPage;
import pageobjects.IssuesFilters_Page.ClearAllFiltersPage;
import pageobjects.IssuesFilters_Page.CollapseFiltersPage;
import pageobjects.IssuesFilters_Page.ProjectFieldFiltersPage;
import pageobjects.IssuesFilters_Page.StatusFiltersPage;
import pageobjects.IssuesGridView_Page.AccessGridViewPage;
import pageobjects.IssuesListView_Page.AddIssuePage;
import pageobjects.IssuesListView_Page.AreaSelectPage;
import pageobjects.IssuesListView_Page.CommentsPage;
import pageobjects.IssuesListView_Page.CustomFieldPage;
import pageobjects.IssuesListView_Page.EventLogPage;
import pageobjects.IssuesListView_Page.IssueAssignmentPage;
import pageobjects.IssuesListView_Page.IssuesGroupByPage;
import pageobjects.IssuesListView_Page.IssuesSearchPage;
import pageobjects.IssuesListView_Page.PhotoUploadPage;
import pageobjects.IssuesListView_Page.StatusChangePage;
import pageobjects.SendMailPage.SendMailPage;

public class DriverFactory {

    private static final String HUB_URL = "http://localhost:4444/wd/hub";
    private static final String DRIVER_ENV_VAR = "DRIVER";


    public static WebDriver driver;
    public static LoginPage login_page;
    public static AddIssuePage addIssue;
    public static AccessFieldPage accessField;
    public static CommentsPage addCommentsPage;
    public static PhotoUploadPage photoUpload;
    public static AreaSelectPage selectArea;
    public static IssuesSearchPage issuesSearch;
    public static StatusChangePage statusChange;
    public static SelectInspectionPage selectInspection;
    public static EnterSettingsPage enterSettings;
    public static AccessSectionsPage accessSections;
    public static CreateChecklistPage createChecklist;
    public static YourOrganizationPage yourOrg;
    public static StatusFiltersPage issuesFilters;
    public static ExportInspectionsPage exportInspections;
    public static IssueAssignmentPage issueAssignment;
    public static AccessGridViewPage accessGridView;
    public static LogoutPage logout;
    public static SwitchProjectPage switchProject;
    public static ProjectFieldFiltersPage projectFieldFilter;
    public static CustomFieldPage selectCustomField;
    public static RefreshPage refreshButton;
    public static EventLogPage checkEventLogValues;
    public static AddIssuePage cancelIssueButton;
    public static SendMailPage sendMail;
    public static ClearAllFiltersPage clearAllFilter;
    public static IssuesGroupByPage issuesGroupBy;
    public static CollapseFiltersPage filtercollapseicon;


    public WebDriver getDriver() throws IOException {
        if(driver == null) {
            String browserName = getDriverName();
            switch (browserName) {
                case "firefox":
                    System.setProperty("webdriver.gecko.driver", getDriverExecutable("geckodriver"));
                    DesiredCapabilities capabilities = DesiredCapabilities.firefox();
                    capabilities.setCapability("marionette", true);
                    driver = new FirefoxDriver();
                    break;
                case "chrome":
                    System.setProperty("webdriver.chrome.driver", getDriverExecutable("chromedriver"));
                    driver = new ChromeDriver(buildLocalChromeOptions());
                    break;
                case "grid-chrome":
                    driver = new RemoteWebDriver(new URL(HUB_URL), DesiredCapabilities.chrome());
                    ((RemoteWebDriver) driver).setFileDetector(new LocalFileDetector());
                    break;
                case "grid-firefox":
                    driver = new RemoteWebDriver(new URL(HUB_URL), DesiredCapabilities.firefox());
                    ((RemoteWebDriver) driver).setFileDetector(new LocalFileDetector());
                    break;
                default:
                    throw new RuntimeException("Unable to load browser for '"+browserName+"'");
            }
            driver.manage().window().setSize(new Dimension(1920, 1080));
            driver.manage().window().fullscreen();
            driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
            Runtime.getRuntime().addShutdownHook(new Thread(driver::quit));
            setupPages();
        }

        return driver;
    }

    private ChromeOptions buildLocalChromeOptions() {
        ChromeOptions chromeOptions = new ChromeOptions();
        setChromeDownloadDirectory(chromeOptions, Constants.DOWNLOAD_DIRECTORY);

        return chromeOptions;
    }

    private void setChromeDownloadDirectory(ChromeOptions chromeOptions, String downloadDir) {
        HashMap<String, Object> chromePrefs = new HashMap<>();
        chromePrefs.put("profile.default_content_settings.popups", 0);
        chromePrefs.put("download.default_directory", downloadDir);
        chromeOptions.setExperimentalOption("prefs", chromePrefs);
        chromeOptions.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
    }

    private String getDriverName() throws IOException {
        String envVar = System.getenv(DRIVER_ENV_VAR);
        if(envVar != null) {
            return envVar;
        }

        Properties p = new Properties();
        InputStream input = getClass().getClassLoader().getResourceAsStream("config.properties");
        p.load(input);
        return p.getProperty("browser");
    }

    private String getDriverExecutable(String executable) {
        String os = SystemUtils.IS_OS_MAC_OSX ? "mac64" : "linux64";
        return Objects.requireNonNull(getClass().getClassLoader().getResource("drivers/"+os+"/"+executable)).getFile();
    }

    private void setupPages() {
        login_page = PageFactory.initElements(driver, LoginPage.class);
        accessField = PageFactory.initElements(driver, AccessFieldPage.class);
        addIssue = PageFactory.initElements(driver, AddIssuePage.class);
        addCommentsPage = PageFactory.initElements(driver, CommentsPage.class);
        photoUpload = PageFactory.initElements(driver, PhotoUploadPage.class);
        selectArea = PageFactory.initElements(driver, AreaSelectPage.class);
        statusChange = PageFactory.initElements(driver, StatusChangePage.class);
        selectInspection = PageFactory.initElements(driver, SelectInspectionPage.class);
        enterSettings = PageFactory.initElements(driver, EnterSettingsPage.class);
        accessSections = PageFactory.initElements(driver, AccessSectionsPage.class);
        createChecklist = PageFactory.initElements(driver, CreateChecklistPage.class);
        yourOrg = PageFactory.initElements(driver, YourOrganizationPage.class);
        issuesFilters = PageFactory.initElements(driver, StatusFiltersPage.class);
        exportInspections = PageFactory.initElements(driver, ExportInspectionsPage.class);
        issueAssignment = PageFactory.initElements(driver, IssueAssignmentPage.class);
        accessGridView = PageFactory.initElements(driver, AccessGridViewPage.class);
        logout = PageFactory.initElements(driver, LogoutPage.class);
        issuesSearch = PageFactory.initElements(driver, IssuesSearchPage.class);
        switchProject = PageFactory.initElements(driver, SwitchProjectPage.class);
        projectFieldFilter = PageFactory.initElements(driver, ProjectFieldFiltersPage.class);
        selectCustomField = PageFactory.initElements(driver, CustomFieldPage.class);
        checkEventLogValues = PageFactory.initElements(driver, EventLogPage.class);
        cancelIssueButton = PageFactory.initElements(driver, AddIssuePage.class);
        refreshButton = PageFactory.initElements(driver, RefreshPage.class);
        sendMail = PageFactory.initElements(driver, SendMailPage.class);
        clearAllFilter = PageFactory.initElements(driver, ClearAllFiltersPage.class);
        issuesGroupBy = PageFactory.initElements(driver, IssuesGroupByPage.class);
        filtercollapseicon = PageFactory.initElements(driver, CollapseFiltersPage.class);

    }

}
