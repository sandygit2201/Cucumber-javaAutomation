package pageobjects.Babylon;

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

    public @FindBy(xpath = "//H1[text()='Terms of Service Update']")
    WebElement headingServiceUpdatePage;

    public @FindBy(xpath = "//INPUT[@id='acceptTermsOfService']")
    WebElement checkBoxAgree;

    public @FindBy(xpath = "//DIV[@class='uiButton-label'][text()='Submit']")
    WebElement buttonSubmit;


    public SwitchProjectPage clickProjectSelector() throws InterruptedException, IOException {

        waitAndClickElement(projectSelector);
        return new SwitchProjectPage();
    }

    public SwitchProjectPage selectMyProject() throws InterruptedException, IOException {
        waitAndClickElement(myProject);
        return new SwitchProjectPage();
    }

    public SwitchProjectPage checkForServiceUpdatePage() throws Exception {

        try {
            if (headingServiceUpdatePage.isDisplayed()) {
                waitAndClickElement(checkBoxAgree);
                waitAndClickElement(buttonSubmit);
            }
        } catch (Exception e) {
            {
                System.out.println("Proceeding to switch project");
            }
        }
        return new SwitchProjectPage();
    }


    public SwitchProjectPage assertMyProject() throws InterruptedException, IOException {
        Assert.assertEquals(projectSelector.getText(), "Web automation");
        return new SwitchProjectPage();
    }


}
