package com.automation.tests;

import com.automation.base.BaseTest;
import com.automation.pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyAllProductsAndProductDetailPageTest extends BaseTest {

    @Test
    public void verifyAllProductsAndProductDetailPage() {
        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.navigateToHomePage();

        // Step 2: Click on 'Products' link
        productsPage.clickAllProducts();

        // Step 3: Verify 'All Products' heading is visible
        Assert.assertTrue(productsPage.isAllProductsVisible(), "'All Products' is not visible.");

        // Step 4: Select a product and verify its details
        productsPage.clickProduct(1);  // Clicks the first product on the list
        Assert.assertTrue(productsPage.isProductNameVisible(), "Product Name is not visible.");
        Assert.assertTrue(productsPage.isProductCategoryVisible(), "Category is not visible.");
        Assert.assertTrue(productsPage.isProductPriceVisible(), "Price is not visible.");
        Assert.assertTrue(productsPage.isProductAvailabilityVisible(), "Availability is not visible.");
        Assert.assertTrue(productsPage.isProductConditionVisible(), "Condition is not visible.");
        Assert.assertTrue(productsPage.isProductBrandVisible(), "Brand is not visible.");

        // Optional log message
        System.out.println("All product details are visible.");
    }
}
