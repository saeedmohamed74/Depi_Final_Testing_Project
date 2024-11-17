package com.automation.tests;

import com.automation.base.BaseTest;
import com.automation.pages.ContactUsPage;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactUsFormTest extends BaseTest {

    @Test
    public void submitContactUsForm() {
        ContactUsPage contactUsPage = new ContactUsPage(driver);
        contactUsPage.navigateToHomePage();
        contactUsPage.clickContactUs();

        // Step 3: Verify 'GET IN TOUCH' is visible
        Assert.assertTrue(contactUsPage.isGetInTouchVisible(), "'GET IN TOUCH' is not visible.");

        // Step 4: Fill out the contact form
        contactUsPage.enterName("sa3ed");
        contactUsPage.enterEmail("sa3ed@gmail.com");
        contactUsPage.enterSubject("Problem in Checkout");
        contactUsPage.enterMessage("I can't checkout if I have more than 50 products in my cart.");
        contactUsPage.uploadFile("C:\\Users\\har86\\OneDrive\\الصور\\لقطات الشاشة\\Screenshot 2024-09-22 133358.png");

        // Step 5: Click 'Submit' button and accept alert
        contactUsPage.clickSubmit();
        Alert okAlert = driver.switchTo().alert();
        okAlert.accept();

        // Step 6: Verify success message is visible
        Assert.assertTrue(contactUsPage.isSuccessMessageVisible(), "Success message is not visible.");

        // Optional log message
        System.out.println("Success! Your details have been submitted successfully.");
    }
}
