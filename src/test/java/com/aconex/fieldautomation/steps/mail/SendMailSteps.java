package com.aconex.fieldautomation.steps.mail;

import com.aconex.fieldautomation.utils.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SendMailSteps {
    @And("^User click on BLOCK E area$")
    public void iClickOnBLOCKEArea() throws Throwable {
        DriverFactory.sendMail.selectArea();
    }

    @Then("^the Send button should be enabled$")
    public void theSendButtonShouldBeEnabled() throws Throwable {
        DriverFactory.sendMail.verifySendButtonEnabled();
    }

    @When("^User click on Send Button$")
    public void iClickOnSendButton() throws Throwable {
        DriverFactory.sendMail.clickSendButtonInIssuesPage();
    }

    @Then("^User should see the Send mail modal$")
    public void iShouldSeeTheSendMailModal() throws Throwable {
        DriverFactory.sendMail.verifySendMailModalDisplayed();
    }

    @And("^the Send button should be disabled$")
    public void theSendButtonShouldBeDisabled() throws Throwable {
        DriverFactory.sendMail.verifySendButtonInModalDisabled();
    }

    @And("^User click on Mail type drop down$")
    public void iClickOnMailTypeDropDown() throws Throwable {
        DriverFactory.sendMail.clickOnMailTypeDropDown();
    }

    @And("^User select Variation mail type$")
    public void iSelectVariationMailType() throws Throwable {
        DriverFactory.sendMail.clickOnVariationMailType();
    }

    @Then("^the Send button in the modal should be enabled$")
    public void theSendButtonInTheModalShouldBeEnabled() throws Throwable {
        DriverFactory.sendMail.verifySendButtonInModalEnabled();
    }

    @And("^User click on Send button$")
    public void whenIClickOnSendButton() throws Throwable {
        DriverFactory.sendMail.clickSendButtonInModal();

    }

    @Then("^the Send mail modal should disappear$")
    public void theSendMailModalShouldDisappear() throws Throwable {
        DriverFactory.sendMail.assertSendMailModalDisappear();
    }


    @Given("^User clicks on Mail-Sent module$")
    public void userClicksOnMailSentModule() throws Throwable {
        DriverFactory.sendMail.navigateToMailSentFolder();
    }

    @Then("^User should land in the Mail module$")
    public void theUserShouldLandInTheMailModule() throws Throwable {
        DriverFactory.sendMail.assertMailModule();
    }

    @And("^User selects today from the date column$")
    public void theUserSortsTheDateFromRecentToOld() throws Throwable {
        DriverFactory.sendMail.selectDateToToday();
    }

    @And("^User clicks the Search button$")
    public void theUserClicksTheSearchButton() throws Throwable {
        DriverFactory.sendMail.clickSearchButton();
    }

    @Then("^User should see the mail with subject: Aconex Field Issues for BLOCK E$")
    public void theUserShouldSeeTheMailWithSubjectAconexFieldIssuesForBLOCKE() throws Throwable {
        DriverFactory.sendMail.assertMailSubject();
    }

    @And("^the From should be Maurice Jenner$")
    public void theFromShouldBeMauriceJenner() throws Throwable {
        DriverFactory.sendMail.assertMailFromUser();
    }

    @And("^the type should be Variation$")
    public void theTypeShouldBeVariation() throws Throwable {
        DriverFactory.sendMail.assertMailVariation();
    }

}
