package pageobjects.issueslistviewpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.BasePage;

import java.io.IOException;

public class AreaSelectPage extends BasePage {

    public AreaSelectPage() throws IOException {
        super();
    }

    public @FindBy(xpath = "// *[contains (@data-areaid, '271341877551153756')]")
    WebElement areaBLOCKA;
    public @FindBy(xpath = "// *[contains (@class, 'cross')]")
    WebElement FTUX;
    public @FindBy(xpath = "//DIV[@class='scrollable-content']")
    WebElement assertAreaDropDown;


    public AreaSelectPage assertAreaDropDown() throws Exception {
        assertAreaDropDown.isDisplayed();
        return new AreaSelectPage();
    }


    public AreaSelectPage selectArea() throws Exception {
        waitAndClickElement(areaBLOCKA);
        return new AreaSelectPage();
    }


}
