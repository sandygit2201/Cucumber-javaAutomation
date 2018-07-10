package pageobjects.babylonpage;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pageobjects.BasePage;

public class SwitchProjectPage extends BasePage {

    public SwitchProjectPage() throws IOException {
        super();
    }

    public @FindBy(css = "div#nav span.nav-project > span")
    WebElement projectSelector;

    public @FindBy(xpath = "//SPAN[@class='projectChanger-container']/../../../../..//DIV[@id='projectChanger-1879048480']")
    WebElement myProject;



    public SwitchProjectPage clickProjectSelector() throws InterruptedException, IOException {
        waitAndClickElement(projectSelector);
        return new SwitchProjectPage();
    }

    public SwitchProjectPage selectMyProject() throws InterruptedException, IOException {
        waitAndClickElement(myProject);
        return new SwitchProjectPage();
    }

    public SwitchProjectPage assertMyProject() throws InterruptedException, IOException {
        Assert.assertEquals(projectSelector.getText(),"Web automation");
        return new SwitchProjectPage();
    }









}
