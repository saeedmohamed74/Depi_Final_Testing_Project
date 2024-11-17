package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage {
    private WebDriver driver;

    // Constructor
    public AccountPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private By accountCreatedHeader = By.xpath("//*[@id=\"form\"]/div/div/div/h2/b");

    // Methods for interacting with elements on the account page
    public boolean isAccountCreatedVisible() {
        return driver.findElement(accountCreatedHeader).isDisplayed();
    }
}
