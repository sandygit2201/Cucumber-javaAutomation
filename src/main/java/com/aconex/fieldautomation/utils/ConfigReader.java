package com.aconex.fieldautomation.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader extends PropertiesReader{

    private String browser="browser";
    private String url="url";
    private String password = "password";

//    read browser from config.properties
    public String getBrowser() {
        return getConfigProperty(browser);
    }

//    read password from config.properties
    public String getPassword(){
        return getConfigProperty(password);
    }

//read url from config.properties
    public String getUrl() {
        return getConfigProperty(url);
    }

//    method to read given property from config.properties
    private String getConfigProperty(String property) {
       return readProperty("config.properties",property);
    }

}
