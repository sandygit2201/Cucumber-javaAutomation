package com.aconex.fieldautomation.utils;


import com.aconex.fieldautomation.pageobjects.babylon.Login;
import com.aconex.fieldautomation.pageobjects.babylon.Logout;
import com.aconex.fieldautomation.pageobjects.babylon.SwitchProject;
import com.aconex.fieldautomation.pageobjects.field.general.AccessField;
import com.aconex.fieldautomation.pageobjects.field.general.Refresh;
import com.aconex.fieldautomation.pageobjects.field.settings.AccessSections;
import com.aconex.fieldautomation.pageobjects.field.settings.EnterSettings;
import com.aconex.fieldautomation.pageobjects.field.settings.YourOrganization;
import com.aconex.fieldautomation.pageobjects.inspections.CreateChecklist;
import com.aconex.fieldautomation.pageobjects.inspections.ExportInspections;
import com.aconex.fieldautomation.pageobjects.inspections.SelectInspection;
import com.aconex.fieldautomation.pageobjects.issues.filters.ClearAllFilters;
import com.aconex.fieldautomation.pageobjects.issues.filters.CollapseFilters;
import com.aconex.fieldautomation.pageobjects.issues.filters.ProjectFieldFilters;
import com.aconex.fieldautomation.pageobjects.issues.filters.StatusFilters;
import com.aconex.fieldautomation.pageobjects.issues.view.grid.AccessGridView;
import com.aconex.fieldautomation.pageobjects.issues.view.list.*;
import com.aconex.fieldautomation.pageobjects.mail.SendMail;
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

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Objects;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverFactory {

    private static final String HUB_URL = "http://localhost:4444/wd/hub";
    private static final String DRIVER_ENV_VAR = "DRIVER";


    public static WebDriver driver;
    public static Login login;
    public static AddIssue addIssue;
    public static AccessField accessField;
    public static Comments addComments;
    public static PhotoUpload photoUpload;
    public static AreaSelect selectArea;
    public static IssuesSearch issuesSearch;
    public static StatusChange statusChange;
    public static SelectInspection selectInspection;
    public static EnterSettings enterSettings;
    public static AccessSections accessSections;
    public static CreateChecklist createChecklist;
    public static YourOrganization yourOrg;
    public static StatusFilters issuesFilters;
    public static ExportInspections exportInspections;
    public static IssueAssignment issueAssignment;
    public static AccessGridView accessGridView;
    public static Logout logout;
    public static SwitchProject switchProject;
    public static ProjectFieldFilters projectFieldFilter;
    public static CustomField selectCustomField;
    public static Refresh refreshButton;
    public static EventLog checkEventLogValues;
    public static AddIssue cancelIssueButton;
    public static SendMail sendMail;
    public static ClearAllFilters clearAllFilter;
    public static IssuesGroupBy issuesGroupBy;
    public static CollapseFilters filtercollapseicon;


    public WebDriver getDriver() throws IOException {
        if (driver == null) {
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
                    throw new RuntimeException("Unable to load browser for '" + browserName + "'");
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
        if (envVar != null) {
            return envVar;
        }

        Properties p = new Properties();
        InputStream input = getClass().getClassLoader().getResourceAsStream("config.properties");
        p.load(input);
        return p.getProperty("browser");
    }

    private String getDriverExecutable(String executable) {
        String os = SystemUtils.IS_OS_MAC_OSX ? "mac64" : "linux64";
        return Objects.requireNonNull(getClass().getClassLoader().getResource("drivers/" + os + "/" + executable)).getFile();
    }

    private void setupPages() {
        login = PageFactory.initElements(driver, Login.class);
        accessField = PageFactory.initElements(driver, AccessField.class);
        addIssue = PageFactory.initElements(driver, AddIssue.class);
        addComments = PageFactory.initElements(driver, Comments.class);
        photoUpload = PageFactory.initElements(driver, PhotoUpload.class);
        selectArea = PageFactory.initElements(driver, AreaSelect.class);
        statusChange = PageFactory.initElements(driver, StatusChange.class);
        selectInspection = PageFactory.initElements(driver, SelectInspection.class);
        enterSettings = PageFactory.initElements(driver, EnterSettings.class);
        accessSections = PageFactory.initElements(driver, AccessSections.class);
        createChecklist = PageFactory.initElements(driver, CreateChecklist.class);
        yourOrg = PageFactory.initElements(driver, YourOrganization.class);
        issuesFilters = PageFactory.initElements(driver, StatusFilters.class);
        exportInspections = PageFactory.initElements(driver, ExportInspections.class);
        issueAssignment = PageFactory.initElements(driver, IssueAssignment.class);
        accessGridView = PageFactory.initElements(driver, AccessGridView.class);
        logout = PageFactory.initElements(driver, Logout.class);
        issuesSearch = PageFactory.initElements(driver, IssuesSearch.class);
        switchProject = PageFactory.initElements(driver, SwitchProject.class);
        projectFieldFilter = PageFactory.initElements(driver, ProjectFieldFilters.class);
        selectCustomField = PageFactory.initElements(driver, CustomField.class);
        checkEventLogValues = PageFactory.initElements(driver, EventLog.class);
        cancelIssueButton = PageFactory.initElements(driver, AddIssue.class);
        refreshButton = PageFactory.initElements(driver, Refresh.class);
        sendMail = PageFactory.initElements(driver, SendMail.class);
        clearAllFilter = PageFactory.initElements(driver, ClearAllFilters.class);
        issuesGroupBy = PageFactory.initElements(driver, IssuesGroupBy.class);
        filtercollapseicon = PageFactory.initElements(driver, CollapseFilters.class);

    }

}
