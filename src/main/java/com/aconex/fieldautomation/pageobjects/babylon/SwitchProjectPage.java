package com.aconex.fieldautomation.pageobjects.babylon;

import com.aconex.fieldautomation.pageobjects.BasePage;
import com.aconex.fieldautomation.utils.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.io.IOException;


public class SwitchProjectPage extends BasePage {


    public @FindBy(css = "div#nav span.nav-project > span")
    WebElement projectSelector;
    public @FindBy(xpath = "//SPAN[@class='projectChanger-container']/../../../../..//DIV[@id='projectChanger-1879048480']")
    WebElement myProject;
    public @FindBy(xpath = "//DIV[@class='toolbar clearFloats noprint']//H1[text()='Terms of Service Update']")
    WebElement headingServiceUpdatePage;
    public @FindBy(xpath = "//INPUT[@id='acceptTermsOfService']")
    WebElement checkBoxAgree;
    public @FindBy(xpath = "//DIV[@class='uiButton-label'][text()='Submit']")
    WebElement buttonSubmit;

    public SwitchProjectPage() throws IOException {
        super();
    }

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
            DriverFactory.driver.switchTo().frame("main");
            Thread.sleep(4000);
            if (headingServiceUpdatePage.isDisplayed()) {
                waitAndClickElement(checkBoxAgree);
                waitAndClickElement(buttonSubmit);
            }
        } catch (Exception e) {
            {
                DriverFactory.driver.switchTo().defaultContent();
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
