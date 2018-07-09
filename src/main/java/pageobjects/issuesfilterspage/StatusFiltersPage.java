package pageobjects.issuesfilterspage;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pageobjects.BasePage;

@SuppressWarnings("Duplicates")


public class StatusFiltersPage extends BasePage {


    public StatusFiltersPage() throws IOException {
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


    public StatusFiltersPage clickOnOpenStatus() throws Exception {
        clickOnElementUsingCustomTimeout(filter_open, driver, 1000);
        Thread.sleep(2000);
        clickOnElementUsingCustomTimeout(button_Refresh, driver, 2000);
        Thread.sleep(2000);
        return new StatusFiltersPage();
    }

    public StatusFiltersPage clickOnReadyToInspectStatus() throws Exception {
        clickOnElementUsingCustomTimeout(filter_readyToinspect, driver, 1000);
        Thread.sleep(2000);
        clickOnElementUsingCustomTimeout(button_Refresh, driver, 2000);
        Thread.sleep(2000);
        return new StatusFiltersPage();
    }

    public StatusFiltersPage clickOnInDisputeStatus() throws Exception {
        clickOnElementUsingCustomTimeout(filter_inDispute, driver, 1000);
        Thread.sleep(2000);
        clickOnElementUsingCustomTimeout(button_Refresh, driver, 2000);
        Thread.sleep(2000);
        return new StatusFiltersPage();
    }

    public StatusFiltersPage clickOnClosedStatus() throws Exception {
        clickOnElementUsingCustomTimeout(filter_closed, driver, 1000);
        Thread.sleep(2000);
        clickOnElementUsingCustomTimeout(button_Refresh, driver, 2000);
        Thread.sleep(2000);
        return new StatusFiltersPage();
    }

    public StatusFiltersPage clickOnWorkDoneStatus() throws Exception {
        clickOnElementUsingCustomTimeout(filter_workDone, driver, 1000);
        Thread.sleep(2000);
        clickOnElementUsingCustomTimeout(button_Refresh, driver, 2000);
        Thread.sleep(2000);
        return new StatusFiltersPage();
    }

    public StatusFiltersPage assertOpenFilter() throws Exception {
        List<WebElement> lstItems = driver.findElements(By.xpath("//div[@class='issue-status-group']//span"));
        for (WebElement eleItem : lstItems) {
            Assert.assertEquals(eleItem.getText(), "OPEN");
        }
        return new StatusFiltersPage();
    }

    public StatusFiltersPage assertReadtoInspectFilter() throws Exception {
        List<WebElement> lstItems = driver.findElements(By.xpath("//div[@class='issue-status-group']//span"));
        for (WebElement eleItem : lstItems) {
            Assert.assertEquals(eleItem.getText(), "READY TO INSPECT");
        }
        return new StatusFiltersPage();
    }

    public StatusFiltersPage assertInDisputeFilter() throws Exception {
        List<WebElement> lstItems = driver.findElements(By.xpath("//div[@class='issue-status-group']//span"));
        for (WebElement eleItem : lstItems) {
            Assert.assertEquals(eleItem.getText(), "IN DISPUTE");
        }
        return new StatusFiltersPage();
    }

    public StatusFiltersPage assertClosedFilter() throws Exception {
        List<WebElement> lstItems = driver.findElements(By.xpath("//div[@class='issue-status-group']//span"));
        for (WebElement eleItem : lstItems) {
            Assert.assertEquals(eleItem.getText(), "CLOSED");
        }
        return new StatusFiltersPage();
    }

    public StatusFiltersPage assertWorkDoneFilter() throws Exception {
        List<WebElement> lstItems = driver.findElements(By.xpath("//div[@class='issue-status-group']//span"));
        for (WebElement eleItem : lstItems) {
            Assert.assertEquals(eleItem.getText(), "WORK DONE");
        }
        return new StatusFiltersPage();
    }
}


