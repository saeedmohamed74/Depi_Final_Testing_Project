import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TC002_loginUserWithCorrectEmailAndPassword {
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();  // Create WebDriver instance
        driver.manage().window().maximize();    //maximize the window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));   //make sure that the window is loaded successfully
        driver.get("http://automationexercise.com");    // Step 2: Navigate to the website

        driver.findElement(By.cssSelector("a[href=\"/login\"]")).click();   //Click on 'Signup / Login' button

        //Verify 'Login to your account' is visible
        WebElement Login_to_your_account = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/h2"));
        if (Login_to_your_account.isDisplayed()) {
            System.out.println("Login to your account is visible.");
        }

        //Enter correct email address and password
        driver.findElement(By.cssSelector("input[data-qa=\"login-email\"]")).sendKeys("sa3ed@gmail.com");
        driver.findElement(By.cssSelector("input[data-qa=\"login-password\"]")).sendKeys("password123");

        //Click 'login' button
        driver.findElement(By.cssSelector("button[data-qa=\"login-button\"]")).click();

        //Verify that 'Logged in as username' is visible
        WebElement  Logged_in_as_username  = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a"));
        if (Logged_in_as_username.isDisplayed()) {
            System.out.println("Logged in as username.");
        }

        driver.findElement(By.cssSelector("a[href=\"/delete_account\"]")).click(); //Click 'Delete Account' button
        //Verify that 'ACCOUNT DELETED!' is visible
        WebElement Account_Deleted = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/h2/b"));
        if (Account_Deleted.isDisplayed()) {
            System.out.println("Login to your account is visible.");
        }
    }
}
