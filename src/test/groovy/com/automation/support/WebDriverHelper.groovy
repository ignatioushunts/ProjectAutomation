package com.automation.support

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver

import java.util.concurrent.TimeUnit

class WebDriverHelper {

    static WebDriver driver

    static WebDriver getDriver() {
        return driver
    }

    static def openBrowser(String baseUrl){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\shawonb\\Documents\\Shawonb_Personal_Project\\ChromeDriver\\chromedriver.exe")
        driver = new ChromeDriver()
        driver.get(baseUrl)
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)
        driver.manage().window().maximize()
    }

    static def closeBrowser(){
        driver.quit()
    }
}