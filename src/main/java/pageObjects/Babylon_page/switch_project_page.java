package pageObjects.Babylon_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pageObjects.BasePage;

import java.io.IOException;

public class switch_project_page extends BasePage {

    public switch_project_page() throws IOException {
        super();
    }

    public @FindBy(css = "div#nav span.nav-project > span")
    WebElement Project_selector;

    public @FindBy(xpath = "//SPAN[@class='projectChanger-container']/../../../../..//DIV[@id='projectChanger-1879048480']")
    WebElement MyProject;



    public switch_project_page clickProjectSelector() throws InterruptedException, IOException {
        waitAndClickElement(Project_selector);
        return new switch_project_page();
    }

    public switch_project_page selectMyProject() throws InterruptedException, IOException {
        waitAndClickElement(MyProject);
        return new switch_project_page();
    }

    public switch_project_page AssertMyProject() throws InterruptedException, IOException {
        Assert.assertEquals(Project_selector.getText(),"Web automation");
        return new switch_project_page();
    }









}
