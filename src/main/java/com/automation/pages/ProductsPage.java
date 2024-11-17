package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {

    WebDriver driver;

    // Locators
    By allProductsLink = By.cssSelector("a[href=\"/products\"]");
    By allProductsHeader = By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/h2");
    By productName = By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/h2");
    By category = By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[1]");
    By price = By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/span");
    By availability = By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[2]");
    By condition = By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[3]");
    By brand = By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[4]");

    // Constructor
    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods to interact with elements
    public void navigateToHomePage() {
        driver.get("https://automationexercise.com/");
    }

    public void clickAllProducts() {
        driver.findElement(allProductsLink).click();
    }

    public boolean isAllProductsVisible() {
        return driver.findElement(allProductsHeader).isDisplayed();
    }

    public void clickProduct(int productIndex) {
        driver.findElement(By.cssSelector("a[href=\"/product_details/" + productIndex + "\"]")).click();
    }

    public boolean isProductNameVisible() {
        return driver.findElement(productName).isDisplayed();
    }

    public boolean isProductCategoryVisible() {
        return driver.findElement(category).isDisplayed();
    }

    public boolean isProductPriceVisible() {
        return driver.findElement(price).isDisplayed();
    }

    public boolean isProductAvailabilityVisible() {
        return driver.findElement(availability).isDisplayed();
    }

    public boolean isProductConditionVisible() {
        return driver.findElement(condition).isDisplayed();
    }

    public boolean isProductBrandVisible() {
        return driver.findElement(brand).isDisplayed();
    }
}
