package com.aconex.fieldautomation.utils;


import org.apache.commons.lang3.SystemUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
import store.DataStore;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Objects;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public final class DriverFactory {

    private static final String HUB_URL = "http://localhost:4444/wd/hub";
    private static final String DRIVER_ENV_VAR = "DRIVER";

    public static WebDriver driver;

    public WebDriver getDriver() throws IOException {
        if (driver == null) {
            String browserName = getDriverName();
            switch (browserName) {
                case "firefox":
                    System.setProperty("webdriver.gecko.driver", getDriverExecutable("geckodriver"));
                    DesiredCapabilities capabilities = DesiredCapabilities.firefox();
                    capabilities.setCapability("marionette", true);
                    driver = new FirefoxDriver();
                    break;
                case "chrome":
                    System.setProperty("webdriver.chrome.driver", getDriverExecutable("chromedriver"));
                    driver = new ChromeDriver(buildLocalChromeOptions());
                    break;
                case "grid-chrome":
                    driver = new RemoteWebDriver(new URL(HUB_URL), DesiredCapabilities.chrome());
                    ((RemoteWebDriver) driver).setFileDetector(new LocalFileDetector());
                    break;
                case "grid-firefox":
                    driver = new RemoteWebDriver(new URL(HUB_URL), DesiredCapabilities.firefox());
                    ((RemoteWebDriver) driver).setFileDetector(new LocalFileDetector());
                    break;
                default:
                    throw new RuntimeException("Unable to load browser for '" + browserName + "'");
            }
            driver.manage().window().setSize(new Dimension(1920, 1080));
            driver.manage().window().fullscreen();
            driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
            Runtime.getRuntime().addShutdownHook(new Thread(driver::quit));
        }

        return driver;
    }

    private ChromeOptions buildLocalChromeOptions() {
        ChromeOptions chromeOptions = new ChromeOptions();
        setChromeDownloadDirectory(chromeOptions, Constants.DOWNLOAD_DIRECTORY);

        return chromeOptions;
    }

    private void setChromeDownloadDirectory(ChromeOptions chromeOptions, String downloadDir) {
        HashMap<String, Object> chromePrefs = new HashMap<>();
        chromePrefs.put("profile.default_content_settings.popups", 0);
        chromePrefs.put("download.default_directory", downloadDir);
        chromeOptions.setExperimentalOption("prefs", chromePrefs);
        chromeOptions.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
    }

    private String getDriverName() throws IOException {
        String envVar = System.getenv(DRIVER_ENV_VAR);
        String browser = (envVar != null) ? envVar : new ConfigReader().getBrowser();
        return browser;
    }

    private String getDriverExecutable(String executable) {
        String os = SystemUtils.IS_OS_MAC_OSX ? "mac64" : "linux64";
        return Objects.requireNonNull(getClass().getClassLoader().getResource("drivers/" + os + "/" + executable)).getFile();
    }

}
