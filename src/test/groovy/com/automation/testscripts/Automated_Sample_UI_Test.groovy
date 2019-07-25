package com.automation.testscripts
import spock.lang.Specification

import static com.automation.support.WebDriverHelper.*


class Automated_Sample_UI_Test extends Specification {

    def setupSpec() {

        //This is to Open the Target Website
        openBrowser('https://www.google.com')
    }

    def cleanupSpec() {

        //This is to Close the Web Browser When Test is completed
        closeBrowser()
    }

    def "Automated Sample UI Test"() {

        given:

        String expectedTittle = "Google"

        when: "Go to Google and Search"

        String tittle = driver.getTitle()

        then:

        tittle == expectedTittle
    }
}