package com.aconex.fieldautomation.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

    private String browser="browser";
    private String url="url";
    private String password = "password";

    public String getBrowser() {
        return getConfigProperty(browser);
    }

    public String getPassword(){
        return getConfigProperty("password");
    }


    public String getUrl() {
        return getConfigProperty(url);
    }

    private String getConfigProperty(String property) {
        Properties p = new Properties();
        InputStream input = getClass().getClassLoader().getResourceAsStream("config.properties");
        try {
            p.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return p.getProperty(property);
    }

}
