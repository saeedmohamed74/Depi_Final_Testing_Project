package com.automation.tests;

import com.automation.base.BaseTest;
import com.automation.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testLoginWithCorrectCredentials() {
        // Step 1: Click on 'Signup / Login' button
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickSignupLogin();

        // Step 2: Verify 'Login to your account' is visible
        Assert.assertTrue(loginPage.isLoginToYourAccountVisible(), "'Login to your account' is not visible");

        // Step 3: Enter correct email address and password
        loginPage.enterEmail("sa3ed@gmail.com");
        loginPage.enterPassword("password123");

        // Step 4: Click 'Login' button
        loginPage.clickLoginButton();

        // Step 5: Verify that 'Logged in as username' is visible
        WebElement loggedInAs = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a"));
        Assert.assertTrue(loggedInAs.isDisplayed(), "Logged in as username is not visible");

        // Optionally, print confirmation
        System.out.println("User is logged in successfully.");
    }

    @Test
    public void testLoginWithIncorrectCredentials() {
        // Step 1: Click on 'Signup / Login' button
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickSignupLogin();

        // Step 2: Verify 'Login to your account' is visible
        Assert.assertTrue(loginPage.isLoginToYourAccountVisible(), "'Login to your account' is not visible");

        // Step 3: Enter incorrect email address and password
        loginPage.enterEmail("wrongemail@gmail.com");
        loginPage.enterPassword("wrongpassword");

        // Step 4: Click 'Login' button
        loginPage.clickLoginButton();

        // Step 5: Verify error 'Your email or password is incorrect!' is visible
        WebElement incorrectError = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/p"));
        Assert.assertTrue(incorrectError.isDisplayed(), "'Your email or password is incorrect!' is not visible");

        // Optionally, print confirmation
        System.out.println("Login with incorrect credentials failed as expected.");
    }

    @Test
    public void testLogoutAfterLogin() {
        // Step 1: Login with valid credentials
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickSignupLogin();
        loginPage.enterEmail("sa3ed@gmail.com");
        loginPage.enterPassword("password123");
        loginPage.clickLoginButton();

        // Step 2: Verify 'Logged in as username' is visible
        WebElement loggedInAs = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a"));
        Assert.assertTrue(loggedInAs.isDisplayed(), "Logged in as username is not visible");

        // Step 3: Click 'Logout' button
        WebElement logoutButton = driver.findElement(By.cssSelector("a[href=\"/logout\"]"));
        logoutButton.click();

        // Step 4: Verify user is redirected to the login page and 'Login to your account' is visible again
        Assert.assertTrue(loginPage.isLoginToYourAccountVisible(), "User is not redirected to login page after logout");

        // Optionally, print confirmation
        System.out.println("User logged out successfully.");
    }
}
