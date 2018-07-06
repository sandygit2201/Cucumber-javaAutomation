package pageObjects.Babylon_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pageObjects.BasePage;

import java.io.IOException;

public class SwitchProjectPage extends BasePage {

    public SwitchProjectPage() throws IOException {
        super();
    }

    public @FindBy(css = "div#nav span.nav-project > span")
    WebElement Project_selector;

    public @FindBy(xpath = "//SPAN[@class='projectChanger-container']/../../../../..//DIV[@id='projectChanger-1879048480']")
    WebElement MyProject;



    public SwitchProjectPage clickProjectSelector() throws InterruptedException, IOException {
        waitAndClickElement(Project_selector);
        return new SwitchProjectPage();
    }

    public SwitchProjectPage selectMyProject() throws InterruptedException, IOException {
        waitAndClickElement(MyProject);
        return new SwitchProjectPage();
    }

    public SwitchProjectPage AssertMyProject() throws InterruptedException, IOException {
        Assert.assertEquals(Project_selector.getText(),"Web automation");
        return new SwitchProjectPage();
    }









}
