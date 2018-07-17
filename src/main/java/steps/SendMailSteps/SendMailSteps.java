package steps.SendMailSteps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static Utils.DriverFactory.sendMail;

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


}
