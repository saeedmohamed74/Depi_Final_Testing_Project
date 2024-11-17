package com.automation.base;

import com.automation.drivers.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = DriverManager.getDriver();
        driver.manage().window().maximize();
        driver.get("http://automationexercise.com");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
