package com.automation.tests;

import com.automation.base.BaseTest;
import com.automation.pages.SignupPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterUserWithExistingEmailTest extends BaseTest {

    @Test
    public void registerUserWithExistingEmail() {
        SignupPage signupPage = new SignupPage(driver);
        signupPage.navigateToHomePage();
        
        // Step 3: Verify homepage is visible
        Assert.assertTrue(signupPage.isHomePageVisible(), "Homepage is not visible.");
        
        // Step 4: Click on 'Signup / Login' button
        signupPage.clickSignupLogin();

        // Step 5: Verify 'New User Signup!' is visible
        Assert.assertTrue(signupPage.isNewUserSignupVisible(), "'New User Signup!' is not visible.");

        // Step 6: Enter name and email address
        signupPage.enterName("hady");
        signupPage.enterEmail("sa3ed@gmail.com");

        // Step 7: Click 'Signup' button
        signupPage.clickSignupButton();

        // Step 8: Verify 'Email Address already exist!' error message is visible
        WebElement emailAlreadyExistMessage = signupPage.getEmailAlreadyExistError();
        Assert.assertTrue(emailAlreadyExistMessage.isDisplayed(), "'Email Address already exist!' message is not visible.");

        // Optional log message
        System.out.println("'Email Address already exist!' error is visible.");
    }
}
