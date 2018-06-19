package pageObjects.Issues_ListView_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pageObjects.BasePage;

import java.io.IOException;
import java.util.List;

public class issues_filters_page extends BasePage {


    public issues_filters_page() throws IOException {
        super();
    }

    public @FindBy(xpath = "//SPAN[@class='ng-binding'][text()='Open']/preceding-sibling::INPUT")
    WebElement filter_openStatus;

    public @FindBy(xpath = "//div[@class='issue-status-group']/div/span [class='ng-binding']")
    WebElement assert_openStatus;

    public @FindBy(css = "div.auiToolbar-left > div.refresh-issues")
    WebElement button_Refresh;


    public issues_filters_page clickOnOpenStatus() throws Exception {
        clickOnElementUsingCustomTimeout(filter_openStatus, driver, 1000);
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


}
