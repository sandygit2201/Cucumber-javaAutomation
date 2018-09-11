package com.acx.pageobjects.IssuesListView_Page;

import com.acx.pageobjects.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class EventLogPage extends BasePage {

    public @FindBy(xpath = "(//DIV[@class='auiCollapsibleSection-header'])[4]")
    WebElement eventsCollapsableSection;

    public @FindBy(xpath = "//SPAN[@class='value ng-binding'][text()='View Event Log']")
    WebElement eventLogButton;

    public @FindBy(xpath = "//*[@class='event-list item-list-wrapper ng-scope']//table//tr//td[3]")
    WebElement capturedUser;


    public @FindBy(xpath = "//DIV[@class='dialog-header ng-scope']")
    WebElement eventlogModal;


    public EventLogPage() throws IOException {
        super();
    }

    public EventLogPage clickEventsHeader() throws InterruptedException, IOException {
        waitAndClickElement(eventsCollapsableSection);
        return new EventLogPage();
    }

    public EventLogPage clickEventLogButton() throws InterruptedException, IOException {
        waitAndClickElement(eventLogButton);
        return new EventLogPage();
    }

    public EventLogPage assertEventlogModal() throws InterruptedException, IOException {
        eventlogModal.isDisplayed();
        return new EventLogPage();

    }

    public EventLogPage assertCapturedUser() throws InterruptedException, IOException {
        waitUntilWebElementIsVisible(capturedUser);
        org.testng.Assert.assertEquals(capturedUser.getText(), "Maurice Jenner\nConglomo Corporation");
        return new EventLogPage();
    }
}
