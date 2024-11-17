package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSignupLogin() {
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
    }

    public boolean isLoginToYourAccountVisible() {
        return driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/h2")).isDisplayed();
    }

    public void enterEmail(String email) {
        driver.findElement(By.cssSelector("input[data-qa=\"login-email\"]")).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(By.cssSelector("input[data-qa=\"login-password\"]")).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(By.cssSelector("button[data-qa=\"login-button\"]")).click();
    }
}
