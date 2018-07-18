package pageobjects.SendMailPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.BasePage;

import java.io.IOException;


public class SendMailPage extends BasePage {

    public SendMailPage() throws IOException {
        super();
    }

    public @FindBy(xpath = "(//A[@ng-href=''][text()='BLOCK E'][text()='BLOCK E'])[1]")
    WebElement areaBLOCKE;

    public @FindBy(xpath = "//BUTTON[@class='secondary send auiButton ng-binding ng-scope'][text()='Send']")
    WebElement buttonSendEnabled;

    public @FindBy(xpath = "/html/body/div[1]/div/div/div[3]/div[2]/button[2]")
    WebElement buttonMailSendDisabled;

    public @FindBy(xpath = "//SPAN[@class='ng-binding'][text()='Send with Aconex Mail']")
    WebElement assertSendMailModal;

    public @FindBy(xpath = "//*[@id=\"select2-chosen-2\"]")
    WebElement mailTypeDropDown;

    public @FindBy(xpath = "//*[@id=\"select2-result-label-3\"]")
    WebElement mailTypeVariation;

    public @FindBy(css = "div.right > button[type=\"button\"].primary.ng-binding")
    WebElement buttonMailSendEnabled;


    public @FindBy(xpath = "//DIV[@class='auiToolbar-header ng-binding'][text()='Issues']")
    WebElement assertSendModalDisappear;


    public @FindBy(xpath = "//DIV[@class='uiButton-label'][text()='Mail']")
    WebElement mailModule;

    public @FindBy(xpath = "//DIV[@id='nav-bar-CORRESPONDENCE-CORRESPONDENCE-SEARCHSENT']")
    WebElement sentFolder;

    public @FindBy(xpath = "//SPAN[@class='ng-binding'][text()='Search Mail']")
    WebElement assertMailModule;

    public @FindBy(xpath = "//BUTTON[@type='submit'][text()='Search']")
    WebElement buttonSearch;

    public @FindBy(xpath = "(//SPAN[@ng-non-bindable='true'][text()='Aconex Field Issues for BLOCK E'][text()='Aconex Field Issues for BLOCK E'])[1]")
    WebElement mailSubject;

    public @FindBy(css = "tbody#rowPerMailTableBody tr:nth-child(1) > td:nth-child(5) > span")
    WebElement mailDate;

    public @FindBy(css = "tbody#rowPerMailTableBody tr:nth-child(1) > td:nth-child(6) > span")
    WebElement fromUser;

    public @FindBy(css = "tbody#rowPerMailTableBody tr:nth-child(1) > td:nth-child(10) > span")
    WebElement typeVariation;

    public @FindBy(xpath = "//DIV[@class='input-group-addon icon icon-calendar']")
    WebElement dropdownDate;

    public @FindBy(xpath = "//LI[@ng-repeat='option in qualifierList'][text()='today']")
    WebElement todayDate;

    public SendMailPage selectArea() throws Exception {
        waitAndClickElement(areaBLOCKE);
        return new SendMailPage();
    }


    public SendMailPage verifySendButtonEnabled() throws Exception {
        buttonSendEnabled.isDisplayed();
        return new SendMailPage();
    }


    public SendMailPage clickSendButtonInIssuesPage() throws Exception {
        waitAndClickElement(buttonSendEnabled);
        return new SendMailPage();
    }

    public SendMailPage verifySendMailModalDisplayed() throws Exception {
        assertSendMailModal.isDisplayed();
        return new SendMailPage();
    }

    public SendMailPage verifySendButtonInModalDisabled() throws Exception {
        buttonMailSendDisabled.isDisplayed();
        return new SendMailPage();
    }

    public SendMailPage clickOnMailTypeDropDown() throws Exception {
        Thread.sleep(1000);
        waitAndClickElement(mailTypeDropDown);
        return new SendMailPage();
    }


    public SendMailPage clickOnVariationMailType() throws Exception {
        waitAndClickElement(mailTypeVariation);
        return new SendMailPage();
    }

    public SendMailPage verifySendButtonInModalEnabled() throws Exception {
        buttonMailSendEnabled.isDisplayed();
        return new SendMailPage();
    }

    public SendMailPage clickSendButtonInModal() throws Exception {
        waitAndClickElement(buttonMailSendEnabled);
        return new SendMailPage();
    }

    public SendMailPage assertSendMailModalDisappear() throws Exception {
        assertSendModalDisappear.isDisplayed();
        return new SendMailPage();
    }

    public SendMailPage navigateToMailSentFolder() throws Exception {
        driver.switchTo().defaultContent();
        waitAndClickElement(mailModule);
        waitAndClickElement(sentFolder);
        driver.switchTo().frame("frameMain");
        return new SendMailPage();
    }


    public SendMailPage assertMailModule() throws Exception {
        assertMailModule.isDisplayed();
        return new SendMailPage();
    }

    public SendMailPage waitForSometime() throws Exception {
        Thread.sleep(600000);
        return new SendMailPage();
    }


    public SendMailPage selectDateToToday() throws Exception {
        waitAndClickElement(dropdownDate);
        waitAndClickElement(todayDate);
        return new SendMailPage();
    }


    public SendMailPage clickSearchButton() throws Exception {
        waitAndClickElement(buttonSearch);
        Thread.sleep(1000);
        return new SendMailPage();
    }

    public SendMailPage assertMailSubject() throws Exception {
        org.testng.Assert.assertEquals(mailSubject.getText(), "Aconex Field Issues for BLOCK E");
        return new SendMailPage();
    }


    public SendMailPage assertMailFromUser() throws Exception {
        org.testng.Assert.assertEquals(fromUser.getText(), "Maurice Jenner");
        return new SendMailPage();
    }

    public SendMailPage assertMailVariation() throws Exception {
        org.testng.Assert.assertEquals(typeVariation.getText(), "Variation");
        return new SendMailPage();
    }

}
