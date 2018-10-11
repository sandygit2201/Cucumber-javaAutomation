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
import org.openqa.selenium.WebDriver;

public class UIComponents {

    public static WebDriver driver = DriverFactory.driver;

    public static Login login = org.openqa.selenium.support.PageFactory.initElements(driver, Login.class);
    public static AddIssue addIssue = org.openqa.selenium.support.PageFactory.initElements(driver, AddIssue.class);
    public static AccessField accessField = org.openqa.selenium.support.PageFactory.initElements(driver, AccessField.class);
    public static Comments addComments = org.openqa.selenium.support.PageFactory.initElements(driver, Comments.class);
    public static PhotoUpload photoUpload = org.openqa.selenium.support.PageFactory.initElements(driver, PhotoUpload.class);
    public static AreaSelect selectArea = org.openqa.selenium.support.PageFactory.initElements(driver, AreaSelect.class);
    public static IssuesSearch issuesSearch = org.openqa.selenium.support.PageFactory.initElements(driver, IssuesSearch.class);
    public static StatusChange statusChange = org.openqa.selenium.support.PageFactory.initElements(driver, StatusChange.class);
    public static SelectInspection selectInspection = org.openqa.selenium.support.PageFactory.initElements(driver, SelectInspection.class);
    public static EnterSettings enterSettings = org.openqa.selenium.support.PageFactory.initElements(driver, EnterSettings.class);
    public static AccessSections accessSections = org.openqa.selenium.support.PageFactory.initElements(driver, AccessSections.class);
    public static CreateChecklist createChecklist = org.openqa.selenium.support.PageFactory.initElements(driver, CreateChecklist.class);
    public static YourOrganization yourOrg = org.openqa.selenium.support.PageFactory.initElements(driver, YourOrganization.class);
    public static StatusFilters issuesFilters = org.openqa.selenium.support.PageFactory.initElements(driver, StatusFilters.class);
    public static ExportInspections exportInspections = org.openqa.selenium.support.PageFactory.initElements(driver, ExportInspections.class);
    public static IssueAssignment issueAssignment = org.openqa.selenium.support.PageFactory.initElements(driver, IssueAssignment.class);
    public static AccessGridView accessGridView = org.openqa.selenium.support.PageFactory.initElements(driver, AccessGridView.class);
    public static Logout logout = org.openqa.selenium.support.PageFactory.initElements(driver, Logout.class);
    public static SwitchProject switchProject = org.openqa.selenium.support.PageFactory.initElements(driver, SwitchProject.class);
    public static ProjectFieldFilters projectFieldFilter = org.openqa.selenium.support.PageFactory.initElements(driver, ProjectFieldFilters.class);
    public static CustomField selectCustomField = org.openqa.selenium.support.PageFactory.initElements(driver, CustomField.class);
    public static Refresh refreshButton = org.openqa.selenium.support.PageFactory.initElements(driver, Refresh.class);
    public static EventLog checkEventLogValues = org.openqa.selenium.support.PageFactory.initElements(driver, EventLog.class);
    public static SendMail sendMail = org.openqa.selenium.support.PageFactory.initElements(driver, SendMail.class);
    public static ClearAllFilters clearAllFilter = org.openqa.selenium.support.PageFactory.initElements(driver, ClearAllFilters.class);
    public static IssuesGroupBy issuesGroupBy = org.openqa.selenium.support.PageFactory.initElements(driver, IssuesGroupBy.class);
    public static CollapseFilters filtercollapseicon = org.openqa.selenium.support.PageFactory.initElements(driver, CollapseFilters.class);

}
