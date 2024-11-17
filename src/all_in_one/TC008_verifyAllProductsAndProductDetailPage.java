import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TC008_verifyAllProductsAndProductDetailPage {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://automationexercise.com/");
        driver.findElement(By.cssSelector("a[href=\"/products\"]")).click();
        //Verify 'All_Product' is visible
        WebElement All_Product = driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/h2"));
        if (All_Product.isDisplayed()) {
            System.out.println("All Products");
        }
        driver.findElement(By.cssSelector("a[href=\"/product_details/1\"]")).click();

        //Verify 'Product_Name' is visible
        WebElement Product_Name = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/h2"));
        if (Product_Name.isDisplayed()) {
            System.out.println("Product_Name");
        }

        //Verify 'Category' is visible
        WebElement Category = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[1]"));
        if (Category.isDisplayed()) {
            System.out.println("Category");
        }

        //Verify 'Price' is visible
        WebElement Price = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/span"));
        if (Price.isDisplayed()) {
            System.out.println("Price");
        }
        //Verify 'Avaliability' is visible
        WebElement Avaliability = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[2]"));
        if (Avaliability.isDisplayed()) {
            System.out.println("Avaliability");
        }
        //Verify 'Condition' is visible
        WebElement Condition = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[3]"));
        if (Condition.isDisplayed()) {
            System.out.println("Condition");
        }

        //Verify 'Brand' is visible
        WebElement Brand = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[4]"));
        if (Brand.isDisplayed()) {
            System.out.println("Brand");
        }


    }



}
