package steps.SendMailSteps;

import static Utils.DriverFactory.sendMail;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SendMailSteps {
    @And("^I click on BLOCK E area$")
    public void iClickOnBLOCKEArea() throws Throwable {
        sendMail.selectArea();
    }

    @Then("^the Send button should be enabled$")
    public void theSendButtonShouldBeEnabled() throws Throwable {
        sendMail.verifySendButtonEnabled();
    }

    @When("^I click on Send Button$")
    public void iClickOnSendButton() throws Throwable {
        sendMail.clickSendButtonInIssuesPage();
    }

    @Then("^I should see the Send mail modal$")
    public void iShouldSeeTheSendMailModal() throws Throwable {
        sendMail.verifySendMailModalDisplayed();
    }

    @And("^the Send button should be disabled$")
    public void theSendButtonShouldBeDisabled() throws Throwable {
        sendMail.verifySendButtonInModalDisabled();
    }

    @And("^I click on Mail type drop down$")
    public void iClickOnMailTypeDropDown() throws Throwable {
        sendMail.clickOnMailTypeDropDown();
    }

    @And("^I select Variation mail type$")
    public void iSelectVariationMailType() throws Throwable {
        sendMail.clickOnVariationMailType();
    }

    @Then("^the Send button in the modal should be enabled$")
    public void theSendButtonInTheModalShouldBeEnabled() throws Throwable {
        sendMail.verifySendButtonInModalEnabled();
    }

    @And("^when I click on Send button$")
    public void whenIClickOnSendButton() throws Throwable {
        sendMail.clickSendButtonInModal();

    }

    @Then("^the Send mail modal should disappear$")
    public void theSendMailModalShouldDisappear() throws Throwable {
        sendMail.assertSendMailModalDisappear();
    }


    @Given("^User clicks on Mail-Sent module$")
    public void userClicksOnMailSentModule() throws Throwable {
        sendMail.navigateToMailSentFolder();
    }

    @Then("^the user should land in the Mail module$")
    public void theUserShouldLandInTheMailModule() throws Throwable {
        sendMail.assertMailModule();
    }

    @And("^the user waits for Ten minutes$")
    public void theUserWaitsForMinutes() throws Throwable {
        sendMail.waitForSometime();
    }

    @And("^the user selects today from the date column$")
    public void theUserSortsTheDateFromRecentToOld() throws Throwable {
        sendMail.selectDateToToday();
    }

    @And("^the user clicks the Search button$")
    public void theUserClicksTheSearchButton() throws Throwable {
        sendMail.clickSearchButton();
    }

    @Then("^the user should see the mail with subject: Aconex Field Issues for BLOCK E$")
    public void theUserShouldSeeTheMailWithSubjectAconexFieldIssuesForBLOCKE() throws Throwable {
        sendMail.assertMailSubject();
    }

    @And("^the From should be Maurice Jenner$")
    public void theFromShouldBeMauriceJenner() throws Throwable {
        sendMail.assertMailFromUser();
    }

    @And("^the type should be Variation$")
    public void theTypeShouldBeVariation() throws Throwable {
        sendMail.assertMailVariation();
    }

}
