package com.automation.tests;

import com.automation.base.BaseTest;
import com.automation.pages.TestCasesPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTestCasesPageTest extends BaseTest {

    @Test
    public void verifyTestCasesPageNavigation() {
        TestCasesPage testCasesPage = new TestCasesPage(driver);
        testCasesPage.navigateToHomePage();

        // Step 3: Verify homepage is visible
        Assert.assertTrue(testCasesPage.isHomePageVisible(), "Homepage is not visible.");

        // Step 4: Click on 'Test Cases' button
        testCasesPage.clickTestCasesLink();

        // Step 5: Verify user is navigated to the test cases page
        Assert.assertTrue(testCasesPage.isTestCasesPageVisible(), "Test Cases page is not visible.");
        
        // Optional log message
        System.out.println("User is navigated successfully to the Test Cases page.");
    }
}
