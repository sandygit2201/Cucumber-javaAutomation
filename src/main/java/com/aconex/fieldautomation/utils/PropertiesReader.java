package com.aconex.fieldautomation.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesReader {

    public String readProperty(String fileName,String property){
        Properties p = new Properties();
        InputStream input = getClass().getClassLoader().getResourceAsStream(fileName);
        try {
            p.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return p.getProperty(property);

    }
}
