package Utils;


import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.SystemUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
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
import pageobjects.IssuesFilters_Page.ProjectFieldFiltersPage;
import pageobjects.IssuesFilters_Page.StatusFiltersPage;
import pageobjects.IssuesGridView_Page.AccessGridViewPage;
import pageobjects.IssuesListView_Page.*;
import pageobjects.SendMailPage.SendMailPage;

public class DriverFactory {

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


    public WebDriver getDriver() throws IOException {
        if(driver == null) {
            Properties p = new Properties();
            InputStream input = getClass().getClassLoader().getResourceAsStream("config.properties");
            p.load(input);
            String browserName = p.getProperty("browser");

            switch (browserName) {
                case "firefox":
                    System.setProperty("webdriver.gecko.driver", getDriverExecutable("geckodriver"));
                    DesiredCapabilities capabilities = DesiredCapabilities.firefox();
                    capabilities.setCapability("marionette", true);
                    driver = new FirefoxDriver();
                    break;
                case "chrome":
                    System.setProperty("webdriver.chrome.driver", getDriverExecutable("chromedriver"));
                    driver = new ChromeDriver();
                    driver.manage().window().fullscreen();
                    break;
                default:
                    throw new RuntimeException("Unable to load browser for '"+browserName+"'");
            }
            driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
            setupPages();
        }

        return driver;
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
    }

}
