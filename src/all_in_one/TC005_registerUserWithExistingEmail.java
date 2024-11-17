import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC005_registerUserWithExistingEmail {
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

        // Step 4: Click on 'Signup / Login' button
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();

        // Step 5: Verify 'New User Signup!' is visible
        WebElement newUserSignup = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div[1]/div[3]/div/h2"));
        if (newUserSignup.isDisplayed()) {
            System.out.println("'New User Signup!' is visible.");
        }

        // Step 6: Enter name and email address
        WebElement nameField = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div[1]/div[3]/div/form/input[2]"));
        WebElement emailField = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div[1]/div[3]/div/form/input[3]"));

        nameField.sendKeys("hady");
        emailField.sendKeys("sa3ed@gmail.com");

        // Step 7: Click 'Signup' button
        WebElement signupButton = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div[1]/div[3]/div/form/button"));
        signupButton.click();

        WebElement emailAlreadyExist = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/p"));

        if(emailAlreadyExist.isDisplayed()){
            System.out.println("'Email Address already exist!' is visible");
        }

        driver.quit();
    }
}