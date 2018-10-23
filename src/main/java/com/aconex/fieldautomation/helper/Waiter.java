package com.aconex.fieldautomation.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waiter {
    private final WebDriver driver;

    public Waiter(WebDriver driver) {
        this.driver = driver;
    }

    public Boolean hasElement(By by, int timeInSeconds) {
        try {
            return wait(timeInSeconds).until(driver -> driver.findElement(by).isDisplayed());
        } catch (NoSuchElementException | TimeoutException e){
            return false;
        }
    }

    // NOT RECOMMENDED , NOR TESTED BY ME , YOU GUYS CAN GIVE A SHOT ;)
    public Boolean hasElement(WebElement element, int timeInSeconds) {
        try {
            return wait(timeInSeconds).until(driver -> element.isDisplayed());
        } catch (NoSuchElementException | TimeoutException e){
            return false;
        }
    }

    public Boolean hasNoElement(By by, int timeInSeconds) {
        try {
            return wait(timeInSeconds).until(driver -> !driver.findElement(by).isDisplayed());
        } catch (NoSuchElementException | TimeoutException e){
            return true;
        }
    }

    // NOT RECOMMENDED , NOR TESTED BY ME , YOU GUYS CAN GIVE A SHOT ;)

    public Boolean hasNoElement(WebElement element, int timeInSeconds) {
        try {
            return wait(timeInSeconds).until(driver -> !element.isDisplayed());
        } catch (NoSuchElementException | TimeoutException e){
            return true;
        }
    }

    private FluentWait<WebDriver> wait(int timeInSeconds) {
        return new WebDriverWait(driver, timeInSeconds);
    }
}