package com.aconex.fieldautomation.utils;

import com.aconex.fieldautomation.dataObjects.User;
import cucumber.api.DataTable;
import store.DataStore;

import java.util.Map;

public class DataStoreUtils {
    public void addUser(String user, DataTable dtUserInfo) {

        User userObj = new User();
        Map<String, String> hashUser = dtUserInfo.transpose().asMap(String.class, String.class);
        userObj.setUserName(hashUser.get("username"));
        userObj.setProject(hashUser.get("project"));
        userObj.setFullName(hashUser.get("fullname"));
        String password = hashUser.containsKey("password") ? hashUser.get("password") : new ConfigReader().getPassword();
        userObj.setPassword(password);

        new DataStore().addUser(user, userObj);

    }
}
