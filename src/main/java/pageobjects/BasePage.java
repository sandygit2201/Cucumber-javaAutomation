package pageobjects;


import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import Utils.Constants;
import Utils.DriverFactory;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;



public class BasePage extends DriverFactory {
    protected WebDriverWait wait;
    protected JavascriptExecutor jsExecutor;

    public BasePage() throws IOException {
        this.wait = new WebDriverWait(driver, 15);
        jsExecutor = ((JavascriptExecutor) driver);
    }

    /**********************************************************************************
     **CHECK SORT FOR DROP DOWNS
     **********************************************************************************/

    public static boolean validateSort(LinkedList<String> dropDownValues) {
        String prev = ""; // empty string
        for (final String cur : dropDownValues) {
            if (cur.compareTo(prev) < 0) {
                return false;
            }
            prev = cur;
        }
        return true;
    }

    /**********************************************************************************
     **VERIFY PDF CONTENT
     **********************************************************************************/


    public boolean verifyPdfContent(String searchText) throws IOException {
        File dir = new File(Constants.DOWNLOAD_DIRECTORY);
        File[] files = dir.listFiles((dir1, name) -> name.endsWith(".pdf"));
        PDDocument report = PDDocument.load(Objects.requireNonNull(files)[0]);
        PDFTextStripper pdfStripper = new PDFTextStripper();
        String text = pdfStripper.getText(report);
        report.close();
        org.testng.Assert.assertTrue(text.contains(searchText));
        return text.contains(searchText);

    }

    /**********************************************************************************
     **VERIFY IF FILE IS DOWNLOADED USING FILENAME
     **********************************************************************************/

    public boolean isFileDownloaded(String downloadPath) {
        File dir = new File(downloadPath);
        File[] dir_contents = dir.listFiles((dir1, name) -> name.endsWith(".pdf"));
        return dir_contents != null && dir_contents.length > 0;
    }

    protected boolean checkSorting(String xpathExpression) {
        List<WebElement> dropDownValues = new LinkedList<>(driver.findElements(By.xpath(xpathExpression)));
        LinkedList<String> DropDown = new LinkedList<String>();
        for (int i = 0; i < dropDownValues.size(); i++) {
//            System.out.println(dropDownValues.get(i).getText());
            DropDown.add(dropDownValues.get(i).getText());
        }
        return validateSort(DropDown);
    }


    /**********************************************************************************
     **DATA GENERATION
     **********************************************************************************/

    public String genUniqueInt() {
        return RandomStringUtils.random(10, "123456890 ");
    }

    /**********************************************************************************/
    /**********************************************************************************/


    /**********************************************************************************
     **CLICK METHODS
     **********************************************************************************/
    public void waitAndClickElement(WebElement element) throws InterruptedException {
        boolean clicked = false;
        int attempts = 0;
        while (!clicked && attempts < 20) {
            try {
                this.wait.until(ExpectedConditions.elementToBeClickable(element)).click();
                System.out.println("Successfully clicked on the WebElement: " + "<" + element.toString() + ">");
                clicked = true;
            } catch (Exception e) {
                System.out.println("Unable to wait and click on WebElement, Exception: " + e.getMessage());
                Assert.fail("Unable to wait and click on the WebElement, using locator: " + "<" + element.toString() + ">");
            }
            attempts++;
        }
    }

    public void waitAndClickElementsUsingByLocator(By by) throws InterruptedException {
        boolean clicked = false;
        int attempts = 0;
        while (!clicked && attempts < 10) {
            try {
                this.wait.until(ExpectedConditions.elementToBeClickable(by)).click();
                System.out.println("Successfully clicked on the element using by locator: " + "<" + by.toString() + ">");
                clicked = true;
            } catch (Exception e) {
                System.out.println("Unable to wait and click on the element using the By locator, Exception: " + e.getMessage());
                Assert.fail("Unable to wait and click on the element using the By locator, element: " + "<" + by.toString() + ">");
            }
            attempts++;
        }
    }

    public void clickOnTextFromDropdownList(WebElement list, String textToSearchFor) throws Exception {
        Wait<WebDriver> tempWait = new WebDriverWait(driver, 30);
        try {
            tempWait.until(ExpectedConditions.elementToBeClickable(list)).click();
            list.sendKeys(textToSearchFor);
            list.sendKeys(Keys.ENTER);
            System.out.println("Successfully sent the following keys: " + textToSearchFor + ", to the following WebElement: " + "<" + list.toString() + ">");
        } catch (Exception e) {
            System.out.println("Unable to send the following keys: " + textToSearchFor + ", to the following WebElement: " + "<" + list.toString() + ">");
            Assert.fail("Unable to select the required text from the dropdown menu, Exception: " + e.getMessage());
        }
    }


    public void clickOnElementUsingCustomTimeout(WebElement locator, WebDriver driver, int timeout) {
        try {
            final WebDriverWait customWait = new WebDriverWait(driver, timeout);
            customWait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(locator)));
            locator.click();
            System.out.println("Successfully clicked on the WebElement, using locator: " + "<" + locator + ">" + ", using a custom Timeout of: " + timeout);
        } catch (Exception e) {
            System.out.println("Unable to click on the WebElement, using locator: " + "<" + locator + ">" + ", using a custom Timeout of: " + timeout);
            Assert.fail("Unable to click on the WebElement, Exception: " + e.getMessage());
        }
    }

    /**********************************************************************************/
    /**********************************************************************************/


    /**********************************************************************************
     **ACTION METHODS
     **********************************************************************************/

    public void actionMoveAndClick(WebElement element) throws Exception {
        Actions ob = new Actions(driver);
        try {
            this.wait.until(ExpectedConditions.elementToBeClickable(element)).isEnabled();
            ob.moveToElement(element).click().build().perform();
            System.out.println("Successfully Action Moved and Clicked on the WebElement, using locator: " + "<" + element.toString() + ">");
        } catch (StaleElementReferenceException elementUpdated) {
            WebElement elementToClick = element;
            Boolean elementPresent = wait.until(ExpectedConditions.elementToBeClickable(elementToClick)).isEnabled();
            if (elementPresent == true) {
                ob.moveToElement(elementToClick).click().build().perform();
                System.out.println("(Stale Exception) - Successfully Action Moved and Clicked on the WebElement, using locator: " + "<" + element.toString() + ">");
            }
        } catch (Exception e) {
            System.out.println("Unable to Action Move and Click on the WebElement, using locator: " + "<" + element.toString() + ">");
            Assert.fail("Unable to Action Move and Click on the WebElement, Exception: " + e.getMessage());
        }
    }

    public void actionMoveAndClickByLocator(By element) throws Exception {
        Actions ob = new Actions(driver);
        try {
            Boolean elementPresent = wait.until(ExpectedConditions.elementToBeClickable(element)).isEnabled();
            if (elementPresent == true) {
                WebElement elementToClick = driver.findElement(element);
                ob.moveToElement(elementToClick).click().build().perform();
                System.out.println("Action moved and clicked on the following element, using By locator: " + "<" + element.toString() + ">");
            }
        } catch (StaleElementReferenceException elementUpdated) {
            WebElement elementToClick = driver.findElement(element);
            ob.moveToElement(elementToClick).click().build().perform();
            System.out.println("(Stale Exception) - Action moved and clicked on the following element, using By locator: " + "<" + element.toString() + ">");
        } catch (Exception e) {
            System.out.println("Unable to Action Move and Click on the WebElement using by locator: " + "<" + element.toString() + ">");
            Assert.fail("Unable to Action Move and Click on the WebElement using by locator, Exception: " + e.getMessage());
        }
    }

    /**********************************************************************************/
    /**********************************************************************************/


    /**********************************************************************************
     **SEND KEYS METHODS /
     **********************************************************************************/
    public void sendKeysToWebElement(WebElement element, String textToSend) throws Exception {
        try {
            this.waitUntilWebElementIsVisible(element);
            element.clear();
            element.sendKeys(textToSend);
            System.out.println("Successfully Sent the following keys: '" + textToSend + "' to element: " + "<" + element.toString() + ">");
        } catch (Exception e) {
            System.out.println("Unable to locate WebElement: " + "<" + element.toString() + "> and send the following keys: " + textToSend);
            Assert.fail("Unable to send keys to WebElement, Exception: " + e.getMessage());
        }
    }

    /**********************************************************************************/
    /**********************************************************************************/


    /**********************************************************************************
     **JS METHODS & JS SCROLL
     **********************************************************************************/
    public void scrollToElementByWebElementLocator(WebElement element) {
        try {
            this.wait.until(ExpectedConditions.visibilityOf(element)).isEnabled();
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -400)");
            System.out.println("Succesfully scrolled to the WebElement, using locator: " + "<" + element.toString() + ">");
        } catch (Exception e) {
            System.out.println("Unable to scroll to the WebElement, using locator: " + "<" + element.toString() + ">");
            Assert.fail("Unable to scroll to the WebElement, Exception: " + e.getMessage());
        }
    }

    public void jsPageScroll(int numb1, int numb2) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("scroll(" + numb1 + "," + numb2 + ")");
            System.out.println("Succesfully scrolled to the correct position! using locators: " + numb1 + ", " + numb2);
        } catch (Exception e) {
            System.out.println("Unable to scroll to element using locators: " + "<" + numb1 + "> " + " <" + numb2 + ">");
            Assert.fail("Unable to manually scroll to WebElement, Exception: " + e.getMessage());
        }
    }

    public void waitAndClickElementUsingJS(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element));
            js.executeScript("arguments[0].click();", element);
            System.out.println("Successfully JS clicked on the following WebElement: " + "<" + element.toString() + ">");
        } catch (StaleElementReferenceException elementUpdated) {
            WebElement staleElement = element;
            Boolean elementPresent = wait.until(ExpectedConditions.elementToBeClickable(staleElement)).isEnabled();
            if (elementPresent == true) {
                js.executeScript("arguments[0].click();", elementPresent);
                System.out.println("(Stale Exception) Successfully JS clicked on the following WebElement: " + "<" + element.toString() + ">");
            }
        } catch (NoSuchElementException e) {
            System.out.println("Unable to JS click on the following WebElement: " + "<" + element.toString() + ">");
            Assert.fail("Unable to JS click on the WebElement, Exception: " + e.getMessage());
        }
    }

    public void jsClick(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
    }

    /**********************************************************************************/
    /**********************************************************************************/


    /**********************************************************************************
     **WAIT METHODS
     **********************************************************************************/
    public boolean waitUntilWebElementIsVisible(WebElement element) {
        try {
            this.wait.until(ExpectedConditions.visibilityOf(element));
            System.out.println("WebElement is visible using locator: " + "<" + element.toString() + ">");
            return true;
        } catch (Exception e) {
            System.out.println("WebElement is NOT visible, using locator: " + "<" + element.toString() + ">");
            Assert.fail("WebElement is NOT visible, Exception: " + e.getMessage());
            return false;
        }
    }

    public boolean waitUntilWebElementIsVisibleUsingByLocator(By element) {
        try {
            this.wait.until(ExpectedConditions.visibilityOfElementLocated(element));
            System.out.println("Element is visible using By locator: " + "<" + element.toString() + ">");
            return true;
        } catch (Exception e) {
            System.out.println("WebElement is NOT visible, using By locator: " + "<" + element.toString() + ">");
            Assert.fail("WebElement is NOT visible, Exception: " + e.getMessage());
            return false;
        }
    }

    public boolean isElementClickable(WebElement element) {
        try {
            this.wait.until(ExpectedConditions.elementToBeClickable(element));
            System.out.println("WebElement is clickable using locator: " + "<" + element.toString() + ">");
            return true;
        } catch (Exception e) {
            System.out.println("WebElement is NOT clickable using locator: " + "<" + element.toString() + ">");
            return false;
        }
    }


    public boolean waitUntilPreLoadElementDisappears(By element) {
        return this.wait.until(ExpectedConditions.invisibilityOfElementLocated(element));
    }

    /**********************************************************************************/
    /**********************************************************************************/


    /**********************************************************************************
     **PAGE METHODS
     **********************************************************************************/
    public BasePage loadUrl(String url) throws Exception {
        driver.get(url);
        return new BasePage();
    }


    public String getCurrentURL() {
        try {
            String url = driver.getCurrentUrl();
            System.out.println("Found(Got) the following URL: " + url);
            return url;
        } catch (Exception e) {
            System.out.println("Unable to locate (Get) the current URL, Exception: " + e.getMessage());
            return e.getMessage();
        }
    }

    public String waitForSpecificPage(String urlToWaitFor) {
        try {
            String url = driver.getCurrentUrl();
            this.wait.until(ExpectedConditions.urlMatches(urlToWaitFor));
            System.out.println("The current URL was: " + url + ", " + "navigated and waited for the following URL: " + urlToWaitFor);
            return urlToWaitFor;
        } catch (Exception e) {
            System.out.println("Exception! waiting for the URL: " + urlToWaitFor + ",  Exception: " + e.getMessage());
            return e.getMessage();
        }
    }

    /**********************************************************************************/
    /**********************************************************************************/


    /**********************************************************************************
     **ALERT & POPUPS METHODS
     **********************************************************************************/
    public void closePopups(By locator) throws InterruptedException {
        try {
            List<WebElement> elements = this.wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
            for (WebElement element : elements) {
                if (element.isDisplayed()) {
                    element.click();
                    this.wait.until(ExpectedConditions.invisibilityOfAllElements(elements));
                    System.out.println("The popup has been closed Successfully!");
                }
            }
        } catch (Exception e) {
            System.out.println("Exception! - could not close the popup!, Exception: " + e.toString());
            throw (e);
        }
    }

    public boolean checkPopupIsVisible() {
        try {
            @SuppressWarnings("unused")
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            System.out.println("A popup has been found!");
            return true;
        } catch (Exception e) {
            System.err.println("Error came while waiting for the alert popup to appear. " + e.getMessage());
        }
        return false;
    }

    public boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void closeAlertPopupBox() throws AWTException, InterruptedException {
        try {
            Alert alert = this.wait.until(ExpectedConditions.alertIsPresent());
            alert.accept();
        } catch (UnhandledAlertException f) {
            Alert alert = driver.switchTo().alert();
            alert.accept();
        } catch (Exception e) {
            System.out.println("Unable to close the popup");
            Assert.fail("Unable to close the popup, Exception: " + e.getMessage());
        }
    }


    /**********************************************************************************/
    /**********************************************************************************/
}
