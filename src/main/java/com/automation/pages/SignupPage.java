package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupPage {

    WebDriver driver;

    // Locators
    By homepageLocator = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[1]/a");
    By signupLoginButton = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a");
    By newUserSignupHeader = By.xpath("//*[@id=\"form\"]/div/div[1]/div[3]/div/h2");
    By nameField = By.xpath("//*[@id=\"form\"]/div/div[1]/div[3]/div/form/input[2]");
    By emailField = By.xpath("//*[@id=\"form\"]/div/div[1]/div[3]/div/form/input[3]");
    By signupButton = By.xpath("//*[@id=\"form\"]/div/div[1]/div[3]/div/form/button");
    By emailAlreadyExistError = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/p");

    // Constructor
    public SignupPage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods to interact with elements
    public void navigateToHomePage() {
        driver.get("http://automationexercise.com");
    }

    public boolean isHomePageVisible() {
        return driver.findElement(homepageLocator).isDisplayed();
    }

    public void clickSignupLogin() {
        driver.findElement(signupLoginButton).click();
    }

    public boolean isNewUserSignupVisible() {
        return driver.findElement(newUserSignupHeader).isDisplayed();
    }

    public void enterName(String name) {
        driver.findElement(nameField).sendKeys(name);
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void clickSignupButton() {
        driver.findElement(signupButton).click();
    }

    public WebElement getEmailAlreadyExistError() {
        return driver.findElement(emailAlreadyExistError);
    }
}
