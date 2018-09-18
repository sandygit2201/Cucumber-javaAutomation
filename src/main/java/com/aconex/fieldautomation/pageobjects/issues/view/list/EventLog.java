package com.aconex.fieldautomation.pageobjects.issues.view.list;

import com.aconex.fieldautomation.pageobjects.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class EventLog extends BasePage {

    public @FindBy(xpath = "(//DIV[@class='auiCollapsibleSection-header'])[4]")
    WebElement eventsCollapsableSection;

    public @FindBy(xpath = "//SPAN[@class='value ng-binding'][text()='View Event Log']")
    WebElement eventLogButton;

    public @FindBy(xpath = "//*[@class='event-list item-list-wrapper ng-scope']//table//tr//td[3]")
    WebElement capturedUser;


    public @FindBy(xpath = "//DIV[@class='dialog-header ng-scope']")
    WebElement eventlogModal;


    public EventLog() throws IOException {
        super();
    }

    public EventLog clickEventsHeader() throws InterruptedException, IOException {
        waitAndClickElement(eventsCollapsableSection);
        return new EventLog();
    }

    public EventLog clickEventLogButton() throws InterruptedException, IOException {
        waitAndClickElement(eventLogButton);
        return new EventLog();
    }

    public EventLog assertEventlogModal() throws InterruptedException, IOException {
        eventlogModal.isDisplayed();
        return new EventLog();

    }

    public EventLog assertCapturedUser() throws InterruptedException, IOException {
        waitUntilWebElementIsVisible(capturedUser);
        org.testng.Assert.assertEquals(capturedUser.getText(), "Maurice Jenner\nConglomo Corporation");
        return new EventLog();
    }
}
