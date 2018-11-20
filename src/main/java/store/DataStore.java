package store;

import com.aconex.fieldautomation.dataObjects.User;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

public class DataStore {

    private static WebDriver driver;
    private static Map<String, User> userMap;

    public DataStore() {
        if (userMap == null)
            userMap = new HashMap<>();
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public static void addUser(String name, User user) {

        if (!userMap.containsKey(name)) {
            userMap.put(name, user);
            System.out.println(userMap);
        }
    }

    public static void clearUserMap() {
        userMap.clear();
    }

    public static User getUser(String name) {
        return userMap.get(name);
    }


}
