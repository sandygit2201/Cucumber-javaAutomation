package pageObjects.Issues_ListView_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pageObjects.BasePage;

import java.io.IOException;
import java.util.List;
@SuppressWarnings("Duplicates")


public class issues_filters_page extends BasePage {


    public issues_filters_page() throws IOException {
        super();
    }

    public @FindBy(xpath = "//SPAN[@class='ng-binding'][text()='Open']/preceding-sibling::INPUT")
    WebElement filter_open;

    public @FindBy(xpath = "//SPAN[@class='ng-binding'][text()='Ready to inspect']/preceding-sibling::INPUT")
    WebElement filter_readyToinspect;

    public @FindBy(xpath = "//SPAN[@class='ng-binding'][text()='In dispute']/preceding-sibling::INPUT")
    WebElement filter_inDispute;

    public @FindBy(xpath = "//SPAN[@class='ng-binding'][text()='Closed']/preceding-sibling::INPUT")
    WebElement filter_closed;

    public @FindBy(xpath = "//SPAN[@class='ng-binding'][text()='Work done']/preceding-sibling::INPUT")
    WebElement filter_workDone;

    public @FindBy(css = "div.auiToolbar-left > div.refresh-issues")
    WebElement button_Refresh;


    public issues_filters_page clickOnOpenStatus() throws Exception {
        clickOnElementUsingCustomTimeout(filter_open, driver, 1000);
        Thread.sleep(2000);
        clickOnElementUsingCustomTimeout(button_Refresh, driver, 2000);
        Thread.sleep(2000);
        return new issues_filters_page();
    }

    public issues_filters_page clickOnReadyToInspectStatus() throws Exception {
        clickOnElementUsingCustomTimeout(filter_readyToinspect, driver, 1000);
        Thread.sleep(2000);
        clickOnElementUsingCustomTimeout(button_Refresh, driver, 2000);
        Thread.sleep(2000);
        return new issues_filters_page();
    }

    public issues_filters_page clickOnInDisputeStatus() throws Exception {
        clickOnElementUsingCustomTimeout(filter_inDispute, driver, 1000);
        Thread.sleep(2000);
        clickOnElementUsingCustomTimeout(button_Refresh, driver, 2000);
        Thread.sleep(2000);
        return new issues_filters_page();
    }

    public issues_filters_page clickOnClosedStatus() throws Exception {
        clickOnElementUsingCustomTimeout(filter_closed, driver, 1000);
        Thread.sleep(2000);
        clickOnElementUsingCustomTimeout(button_Refresh, driver, 2000);
        Thread.sleep(2000);
        return new issues_filters_page();
    }

    public issues_filters_page clickOnWorkDoneStatus() throws Exception {
        clickOnElementUsingCustomTimeout(filter_workDone, driver, 1000);
        Thread.sleep(2000);
        clickOnElementUsingCustomTimeout(button_Refresh, driver, 2000);
        Thread.sleep(2000);
        return new issues_filters_page();
    }

    public issues_filters_page assertOpenFilter() throws Exception {
        List<WebElement> lstItems = driver.findElements(By.xpath("//div[@class='issue-status-group']//span"));
        for (WebElement eleItem : lstItems) {
            Assert.assertEquals(eleItem.getText(), "OPEN");
        }
        return new issues_filters_page();
    }

    public issues_filters_page assertReadtoInspectFilter() throws Exception {
        List<WebElement> lstItems = driver.findElements(By.xpath("//div[@class='issue-status-group']//span"));
        for (WebElement eleItem : lstItems) {
            Assert.assertEquals(eleItem.getText(), "READY TO INSPECT");
        }
        return new issues_filters_page();
    }
    public issues_filters_page assertInDisputeFilter() throws Exception {
        List<WebElement> lstItems = driver.findElements(By.xpath("//div[@class='issue-status-group']//span"));
        for (WebElement eleItem : lstItems) {
            Assert.assertEquals(eleItem.getText(), "IN DISPUTE");
        }
        return new issues_filters_page();
    }
    public issues_filters_page assertClosedFilter() throws Exception {
        List<WebElement> lstItems = driver.findElements(By.xpath("//div[@class='issue-status-group']//span"));
        for (WebElement eleItem : lstItems) {
            Assert.assertEquals(eleItem.getText(), "CLOSED");
        }
        return new issues_filters_page();
    }
    public issues_filters_page assertWorkDoneFilter() throws Exception {
        List<WebElement> lstItems = driver.findElements(By.xpath("//div[@class='issue-status-group']//span"));
        for (WebElement eleItem : lstItems) {
            Assert.assertEquals(eleItem.getText(), "WORK DONE");
        }
        return new issues_filters_page();
    }

    }


