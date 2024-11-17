
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class AutomationExerciseTest {


    public static void main(String[] args) {
        // Setup WebDriverManager


           // Create WebDriver instance
           WebDriver driver = new ChromeDriver();


               // Step 2: Navigate to the website
               driver.get("http://automationexercise.com");

        // Step 3: Verify homepage is visible
               /* WebElement homepage = driver.findElement(By.xpath("//*[@id=\"slider-carousel\"]/div/div[3]/div[1]/p/text()"));
                if (homepage.isDisplayed()) {
                    System.out.println("Homepage is visible.");
                }*/

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

        // Step 8: Verify 'ENTER ACCOUNT INFORMATION' is visible
                /*WebElement accountInfo = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/h2/b"));
                if (accountInfo.isDisplayed()) {
                    System.out.println("'Enter Account Information' is visible.");
                }*/

        // Step 9: Fill account information details (Title, Name, etc.)
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/form/div[1]")).click();  // Select title
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
        driver.findElement(By.xpath("//*[@id=\"days\"]")).sendKeys("1");
        driver.findElement(By.xpath("//*[@id=\"months\"]")).sendKeys("January");
        driver.findElement(By.xpath("//*[@id=\"years\"]")).sendKeys("2000");
        // Add more fields as necessary

        // Step 10: Select 'Sign up for newsletter'
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/form/div[6]/label")).click();

        // Step 11: Select 'Receive special offers from partners'
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/form/div[7]/label")).click();

        // Step 12: Fill additional details (Name, Address, etc.)
        driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("Hady");
        driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("Abdelhady");
        driver.findElement(By.xpath("//*[@id=\"company\"]")).sendKeys("ana 5reg kolya tegara");
        driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("123 Street");
        driver.findElement(By.xpath("//*[@id=\"address2\"]")).sendKeys("124 Street");
        driver.findElement(By.xpath("//*[@id=\"country\"]")).sendKeys("India");
        driver.findElement(By.xpath("//*[@id=\"state\"]")).sendKeys("Gharbia");
        driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("El-Mahallah");
        driver.findElement(By.xpath("//*[@id=\"zipcode\"]")).sendKeys("304050");
        driver.findElement(By.xpath("//*[@id=\"mobile_number\"]")).sendKeys("01150045098");


        // Step 13: Click 'Create Account' button
        WebElement createAccountButton = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/form/button"));
        createAccountButton.click();

        // Step 14: Verify 'ACCOUNT CREATED!' is visible
        WebElement accountCreated = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/h2/b"));
        if (accountCreated.isDisplayed()) {
            System.out.println("'Account Created' is visible.");
        }

        // Step 15: Click 'Continue' button
        WebElement continueButton = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a"));
        continueButton.click();

        // Step 16: Verify that 'logout' is visible
        WebElement loggedInAs = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a"));
        if (loggedInAs.isDisplayed()) {
            System.out.println("Logged in as Test User is visible.");
        }
/*
        // Step 17: Click 'Delete Account' button
        WebElement deleteAccountButton = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a"));
        deleteAccountButton.click();

        // Step 18: Verify that 'ACCOUNT DELETED!' is visible and click 'Continue'
        WebElement accountDeleted = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/h2/b"));
        if (accountDeleted.isDisplayed()) {
            System.out.println("'Account Deleted' is visible.");
        }
        WebElement continueAfterDelete = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a"));
        continueAfterDelete.click();

*/
        // Close the browser
        driver.quit();

    }
}
