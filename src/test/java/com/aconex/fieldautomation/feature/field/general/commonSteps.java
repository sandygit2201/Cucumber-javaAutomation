package com.aconex.fieldautomation.feature.field.general;

import com.aconex.fieldautomation.dataObjects.User;
import com.aconex.fieldautomation.utils.ConfigReader;
import com.aconex.fieldautomation.utils.DataStoreUtils;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import store.DataStore;

import static com.aconex.fieldautomation.utils.UIComponents.accessField;
import static com.aconex.fieldautomation.utils.UIComponents.login;
import static com.aconex.fieldautomation.utils.UIComponents.switchProject;

public class commonSteps {
    @Given("^user data \"([^\"]*)\"$")
    public void userData(String user, DataTable dtUserInfo)  {
        new DataStoreUtils().addUser(user,dtUserInfo);

    }

    @Then("^check user details$")
    public void checkUserDetails() {

        User a = DataStore.getUser("poleary");
        System.out.println(a.getUserName());
    }

    @Given("^login as \"([^\"]*)\"$")
    public void loginAs(String userName) throws Throwable,Exception  {

        User user = DataStore.getUser(userName);
        login.getLoginPage(new ConfigReader().getUrl());
        accessField.enterUserName(user.getUserName());
        accessField.enterPassword(user.getPassword());
        login.clickLoginButton();
        accessField.verifyUserName(user.getFullName());
        switchProject.clickProjectSelector();
        switchProject.checkForServiceUpdatePage();
        switchProject.assertMyProject("Web automation");


    }
}
