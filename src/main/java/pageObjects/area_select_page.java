package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class area_select_page extends BasePage {

    public area_select_page() throws IOException {
        super();
    }

    public @FindBy (xpath = "// *[contains (@data-areaid, '271341877551153748')]")
    WebElement area879;
    public @FindBy(xpath = "// *[contains (@class, 'cross')]")
    WebElement FTUX;


    public area_select_page areaDropDown() throws Exception {
        driver.switchTo().frame("main");
        waitAndClickElement(FTUX);
        return new area_select_page();
    }


    public area_select_page selectArea() throws Exception {
        waitAndClickElement(area879);
        return new area_select_page();
    }


}
