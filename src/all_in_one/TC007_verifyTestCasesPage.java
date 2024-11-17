import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC007_verifyTestCasesPage {
    public static void main(String[] args) {
        // Setup WebDriverManager


        // Create WebDriver instance
        WebDriver driver = new ChromeDriver();


        // Step 2: Navigate to the website
        driver.get("http://automationexercise.com");

        // Step 3: Verify homepage is visible
        WebElement homepage = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[1]/a"));
        if (homepage.isDisplayed()) {
            System.out.println("Homepage is visible.");
        }
        driver.findElement(By.cssSelector("ul[class=\"nav navbar-nav\"] li a[href=\"/test_cases\"]")).click();

        //verify user is navigated successfully to test cases page
        WebElement testCasesPage = driver.findElement(By.cssSelector("h2[class=\"title text-center\"]"));
        if (testCasesPage.isDisplayed()) {
            System.out.println("user is navigated successfully to test cases page.");
        }
        driver.quit();
    }
}
