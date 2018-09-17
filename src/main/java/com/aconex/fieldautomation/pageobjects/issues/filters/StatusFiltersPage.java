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


public class StatusFiltersPage extends BasePage {


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

    public StatusFiltersPage() throws IOException {
        super();
    }

    public StatusFiltersPage clickOnOpenStatus() throws Exception {
        clickOnElementUsingCustomTimeout(filterOpen, DriverFactory.driver, 10);
        waitUntilPreLoadElementDisappears(By.cssSelector("fm-app > div:nth-child(4) > div > div > div"));
        clickOnElementUsingCustomTimeout(buttonRefresh, DriverFactory.driver, 10);
        waitUntilPreLoadElementDisappears(By.cssSelector("fm-app > div:nth-child(4) > div > div > div"));
        return new StatusFiltersPage();
    }

    public StatusFiltersPage clickOnReadyToInspectStatus() throws Exception {
        clickOnElementUsingCustomTimeout(filterReadyToInspect, DriverFactory.driver, 10);
        waitUntilPreLoadElementDisappears(By.cssSelector("fm-app > div:nth-child(4) > div > div > div"));
        clickOnElementUsingCustomTimeout(buttonRefresh, DriverFactory.driver, 10);
        waitUntilPreLoadElementDisappears(By.cssSelector("fm-app > div:nth-child(4) > div > div > div"));
        return new StatusFiltersPage();
    }

    public StatusFiltersPage clickOnInDisputeStatus() throws Exception {
        clickOnElementUsingCustomTimeout(filterInDispute, DriverFactory.driver, 10);
        waitUntilPreLoadElementDisappears(By.cssSelector("fm-app > div:nth-child(4) > div > div > div"));
        clickOnElementUsingCustomTimeout(buttonRefresh, DriverFactory.driver, 10);
        waitUntilPreLoadElementDisappears(By.cssSelector("fm-app > div:nth-child(4) > div > div > div"));
        return new StatusFiltersPage();
    }

    public StatusFiltersPage clickOnClosedStatus() throws Exception {
        clickOnElementUsingCustomTimeout(filterClosed, DriverFactory.driver, 10);
        waitUntilPreLoadElementDisappears(By.cssSelector("fm-app > div:nth-child(4) > div > div > div"));
        clickOnElementUsingCustomTimeout(buttonRefresh, DriverFactory.driver, 10);
        waitUntilPreLoadElementDisappears(By.cssSelector("fm-app > div:nth-child(4) > div > div > div"));
        return new StatusFiltersPage();
    }

    public StatusFiltersPage clickOnWorkDoneStatus() throws Exception {
        clickOnElementUsingCustomTimeout(filterWorkDone, DriverFactory.driver, 10);
        waitUntilPreLoadElementDisappears(By.cssSelector("fm-app > div:nth-child(4) > div > div > div"));
        clickOnElementUsingCustomTimeout(buttonRefresh, DriverFactory.driver, 10);
        waitUntilPreLoadElementDisappears(By.cssSelector("fm-app > div:nth-child(4) > div > div > div"));
        return new StatusFiltersPage();
    }

    public StatusFiltersPage assertOpenFilter() throws Exception {
        List<WebElement> lstItems = DriverFactory.driver.findElements(By.xpath("//div[@class='issue-status-group']//span"));
        for (WebElement eleItem : lstItems) {
            Assert.assertEquals(eleItem.getText(), "OPEN");
        }
        return new StatusFiltersPage();
    }

    public StatusFiltersPage assertReadyToInspectFilter() throws Exception {
        List<WebElement> lstItems = DriverFactory.driver.findElements(By.xpath("//div[@class='issue-status-group']//span"));
        for (WebElement eleItem : lstItems) {
            Assert.assertEquals(eleItem.getText(), "READY TO INSPECT");
        }
        return new StatusFiltersPage();
    }

    public StatusFiltersPage assertInDisputeFilter() throws Exception {
        List<WebElement> lstItems = DriverFactory.driver.findElements(By.xpath("//div[@class='issue-status-group']//span"));
        for (WebElement eleItem : lstItems) {
            Assert.assertEquals(eleItem.getText(), "IN DISPUTE");
        }
        return new StatusFiltersPage();
    }

    public StatusFiltersPage assertClosedFilter() throws Exception {
        List<WebElement> lstItems = DriverFactory.driver.findElements(By.xpath("//div[@class='issue-status-group']//span"));
        for (WebElement eleItem : lstItems) {
            Assert.assertEquals(eleItem.getText(), "CLOSED");
        }
        return new StatusFiltersPage();
    }

    public StatusFiltersPage assertWorkDoneFilter() throws Exception {
        List<WebElement> lstItems = DriverFactory.driver.findElements(By.xpath("//div[@class='issue-status-group']//span"));
        for (WebElement eleItem : lstItems) {
            Assert.assertEquals(eleItem.getText(), "WORK DONE");
        }
        return new StatusFiltersPage();
    }
}


