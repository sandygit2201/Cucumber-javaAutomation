package pageObjects.Issues_ListView_Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObjects.BasePage;

import java.io.IOException;

public class area_select_page extends BasePage {

    public area_select_page() throws IOException {
        super();
    }

    public @FindBy(xpath = "// *[contains (@data-areaid, '271341877551153756')]")
    WebElement areaBLOCKA;
    public @FindBy(xpath = "// *[contains (@class, 'cross')]")
    WebElement FTUX;
    public @FindBy(xpath = "//DIV[@class='scrollable-content']")
    WebElement assertAreaDropDown;


    public area_select_page assertAreaDropDown() throws Exception {
        assertAreaDropDown.isDisplayed();
        return new area_select_page();
    }


    public area_select_page selectArea() throws Exception {
        waitAndClickElement(areaBLOCKA);
        return new area_select_page();
    }


}
