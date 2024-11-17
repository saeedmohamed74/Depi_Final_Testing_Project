package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUsPage {

    WebDriver driver;

    // Locators
    By contactUsLink = By.cssSelector("a[href=\"/contact_us\"]");
    By getInTouchHeader = By.xpath("//*[@id=\"contact-page\"]/div[2]/div[1]/div/h2");
    By nameField = By.cssSelector("input[name=\"name\"]");
    By emailField = By.cssSelector("input[name=\"email\"]");
    By subjectField = By.cssSelector("input[name=\"subject\"]");
    By messageField = By.cssSelector("textarea[id=\"message\"]");
    By uploadFileInput = By.cssSelector("input[name=\"upload_file\"]");
    By submitButton = By.cssSelector("input[name=\"submit\"]");
    By successMessage = By.xpath("//*[@id=\"contact-page\"]/div[2]/div[1]/div/h2");

    // Constructor
    public ContactUsPage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods to interact with elements
    public void navigateToHomePage() {
        driver.get("https://automationexercise.com/");
    }

    public void clickContactUs() {
        driver.findElement(contactUsLink).click();
    }

    public boolean isGetInTouchVisible() {
        return driver.findElement(getInTouchHeader).isDisplayed();
    }

    public void enterName(String name) {
        driver.findElement(nameField).sendKeys(name);
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterSubject(String subject) {
        driver.findElement(subjectField).sendKeys(subject);
    }

    public void enterMessage(String message) {
        driver.findElement(messageField).sendKeys(message);
    }

    public void uploadFile(String filePath) {
        driver.findElement(uploadFileInput).sendKeys(filePath);
    }

    public void clickSubmit() {
        driver.findElement(submitButton).click();
    }

    public boolean isSuccessMessageVisible() {
        return driver.findElement(successMessage).isDisplayed();
    }
}
