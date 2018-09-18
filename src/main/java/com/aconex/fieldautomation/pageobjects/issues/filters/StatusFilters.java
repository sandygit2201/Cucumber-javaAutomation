package com.aconex.fieldautomation.pageobjects.issues.filters;

import com.aconex.fieldautomation.pageobjects.BasePage;
import com.aconex.fieldautomation.utils.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.io.IOException;
import java.util.List;

@SuppressWarnings("Duplicates")


public class StatusFilters extends BasePage {


    public @FindBy(xpath = "//SPAN[@class='ng-binding'][text()='Open']/preceding-sibling::INPUT")
    WebElement filterOpen;
    public @FindBy(xpath = "//SPAN[@class='ng-binding'][text()='Ready to inspect']/preceding-sibling::INPUT")
    WebElement filterReadyToInspect;
    public @FindBy(xpath = "//SPAN[@class='ng-binding'][text()='In dispute']/preceding-sibling::INPUT")
    WebElement filterInDispute;
    public @FindBy(xpath = "//SPAN[@class='ng-binding'][text()='Closed']/preceding-sibling::INPUT")
    WebElement filterClosed;
    public @FindBy(xpath = "//SPAN[@class='ng-binding'][text()='Work done']/preceding-sibling::INPUT")
    WebElement filterWorkDone;
    public @FindBy(css = "div.auiToolbar-left > div.refresh-issues")
    WebElement buttonRefresh;

    public StatusFilters() throws IOException {
        super();
    }

    public StatusFilters clickOnOpenStatus() throws Exception {
        clickOnElementUsingCustomTimeout(filterOpen, DriverFactory.driver, 10);
        waitUntilPreLoadElementDisappears(By.cssSelector("fm-app > div:nth-child(4) > div > div > div"));
        clickOnElementUsingCustomTimeout(buttonRefresh, DriverFactory.driver, 10);
        waitUntilPreLoadElementDisappears(By.cssSelector("fm-app > div:nth-child(4) > div > div > div"));
        return new StatusFilters();
    }

    public StatusFilters clickOnReadyToInspectStatus() throws Exception {
        clickOnElementUsingCustomTimeout(filterReadyToInspect, DriverFactory.driver, 10);
        waitUntilPreLoadElementDisappears(By.cssSelector("fm-app > div:nth-child(4) > div > div > div"));
        clickOnElementUsingCustomTimeout(buttonRefresh, DriverFactory.driver, 10);
        waitUntilPreLoadElementDisappears(By.cssSelector("fm-app > div:nth-child(4) > div > div > div"));
        return new StatusFilters();
    }

    public StatusFilters clickOnInDisputeStatus() throws Exception {
        clickOnElementUsingCustomTimeout(filterInDispute, DriverFactory.driver, 10);
        waitUntilPreLoadElementDisappears(By.cssSelector("fm-app > div:nth-child(4) > div > div > div"));
        clickOnElementUsingCustomTimeout(buttonRefresh, DriverFactory.driver, 10);
        waitUntilPreLoadElementDisappears(By.cssSelector("fm-app > div:nth-child(4) > div > div > div"));
        return new StatusFilters();
    }

    public StatusFilters clickOnClosedStatus() throws Exception {
        clickOnElementUsingCustomTimeout(filterClosed, DriverFactory.driver, 10);
        waitUntilPreLoadElementDisappears(By.cssSelector("fm-app > div:nth-child(4) > div > div > div"));
        clickOnElementUsingCustomTimeout(buttonRefresh, DriverFactory.driver, 10);
        waitUntilPreLoadElementDisappears(By.cssSelector("fm-app > div:nth-child(4) > div > div > div"));
        return new StatusFilters();
    }

    public StatusFilters clickOnWorkDoneStatus() throws Exception {
        clickOnElementUsingCustomTimeout(filterWorkDone, DriverFactory.driver, 10);
        waitUntilPreLoadElementDisappears(By.cssSelector("fm-app > div:nth-child(4) > div > div > div"));
        clickOnElementUsingCustomTimeout(buttonRefresh, DriverFactory.driver, 10);
        waitUntilPreLoadElementDisappears(By.cssSelector("fm-app > div:nth-child(4) > div > div > div"));
        return new StatusFilters();
    }

    public StatusFilters assertOpenFilter() throws Exception {
        List<WebElement> lstItems = DriverFactory.driver.findElements(By.xpath("//div[@class='issue-status-group']//span"));
        for (WebElement eleItem : lstItems) {
            Assert.assertEquals(eleItem.getText(), "OPEN");
        }
        return new StatusFilters();
    }

    public StatusFilters assertReadyToInspectFilter() throws Exception {
        List<WebElement> lstItems = DriverFactory.driver.findElements(By.xpath("//div[@class='issue-status-group']//span"));
        for (WebElement eleItem : lstItems) {
            Assert.assertEquals(eleItem.getText(), "READY TO INSPECT");
        }
        return new StatusFilters();
    }

    public StatusFilters assertInDisputeFilter() throws Exception {
        List<WebElement> lstItems = DriverFactory.driver.findElements(By.xpath("//div[@class='issue-status-group']//span"));
        for (WebElement eleItem : lstItems) {
            Assert.assertEquals(eleItem.getText(), "IN DISPUTE");
        }
        return new StatusFilters();
    }

    public StatusFilters assertClosedFilter() throws Exception {
        List<WebElement> lstItems = DriverFactory.driver.findElements(By.xpath("//div[@class='issue-status-group']//span"));
        for (WebElement eleItem : lstItems) {
            Assert.assertEquals(eleItem.getText(), "CLOSED");
        }
        return new StatusFilters();
    }

    public StatusFilters assertWorkDoneFilter() throws Exception {
        List<WebElement> lstItems = DriverFactory.driver.findElements(By.xpath("//div[@class='issue-status-group']//span"));
        for (WebElement eleItem : lstItems) {
            Assert.assertEquals(eleItem.getText(), "WORK DONE");
        }
        return new StatusFilters();
    }
}


