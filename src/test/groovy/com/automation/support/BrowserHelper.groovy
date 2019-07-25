package com.automation.support

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

class BrowserHelper {

    /**
     * This is to Use the WebDriver from the BrowserHelper. So Driver doesn't needs to be call every time.
     */
    static WebDriver driver = WebDriverHelper.getDriver()

    //Navigation and Data Input Functionality Library

    /**
     * This Method Types in the Data in the Field.
     */
    static def sendKeys(By by, String keys){
        driver.findElement(by).sendKeys(keys)
    }

    /**
     * This Method Clicks the Elements/Buttons of the UI.
     */
    static def click(By by){
        driver.findElement(by).click()
    }

    //Testing Functionality

    /**
     * This Method Verifies that if the Element Displayed in the UI.
     */
    static boolean isElementDisplayed(By by) {
        try {
            driver.findElement(by)
            return true
        }
        catch (NoSuchElementException e) {
            return false
        }
    }
}