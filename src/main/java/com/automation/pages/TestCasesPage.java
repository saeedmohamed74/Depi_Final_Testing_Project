package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCasesPage {

    WebDriver driver;

    // Locators
    By homepageLocator = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[1]/a");
    By testCasesLink = By.cssSelector("ul[class=\"nav navbar-nav\"] li a[href=\"/test_cases\"]");
    By testCasesPageTitle = By.cssSelector("h2[class=\"title text-center\"]");

    // Constructor
    public TestCasesPage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods to interact with elements
    public void navigateToHomePage() {
        driver.get("http://automationexercise.com");
    }

    public boolean isHomePageVisible() {
        return driver.findElement(homepageLocator).isDisplayed();
    }

    public void clickTestCasesLink() {
        driver.findElement(testCasesLink).click();
    }

    public boolean isTestCasesPageVisible() {
        return driver.findElement(testCasesPageTitle).isDisplayed();
    }
}
