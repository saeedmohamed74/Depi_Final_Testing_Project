import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TC006_contactUsForm {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://automationexercise.com/");
        driver.findElement(By.cssSelector("a[href=\"/contact_us\"]")).click();
        //Verify 'GET IN TOUCH' is visible
        WebElement GET_IN_TOUCH = driver.findElement(By.xpath("//*[@id=\"contact-page\"]/div[2]/div[1]/div/h2"));
        if (GET_IN_TOUCH.isDisplayed()) {
            System.out.println("Login to your account is visible");
        }
        driver.findElement(By.cssSelector("input[name=\"name\"]")).sendKeys("sa3ed");
        driver.findElement(By.cssSelector("input[name=\"email\"]")).sendKeys("sa3ed@gmail.com");
        driver.findElement(By.cssSelector("input[name=\"subject\"]")).sendKeys("Problem in Checkout");
        driver.findElement(By.cssSelector("textarea[id=\"message\"]")).sendKeys("I can't checkout if I have more than 50 product in my cart ");
        driver.findElement(By.cssSelector("input[name=\"upload_file\"]")).sendKeys("C:\\Users\\har86\\OneDrive\\الصور\\لقطات الشاشة\\Screenshot 2024-09-22 133358.png");
        driver.findElement(By.cssSelector("input[name=\"submit\"]")).click();
        Alert Ok_button = driver.switchTo().alert();
        Ok_button.accept();

        //Verify 'Sucess_message' is visible
        WebElement Sucess_message = driver.findElement(By.xpath("//*[@id=\"contact-page\"]/div[2]/div[1]/div/h2"));
        if (Sucess_message.isDisplayed()) {
            System.out.println("Success! Your details have been submitted successfully");
        }
        driver.findElement(By.cssSelector("a[class=\"btn btn-success\"]")).click();


    }

}