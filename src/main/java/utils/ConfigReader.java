package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

    private String browser="browser";
    private String url="url";

    public String getBrowser() {
        return getConfigProperty(browser);
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
