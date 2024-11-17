import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class chromeBrowser {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.navigate().to("https://automationexercise.com/");
        driver.findElement(By.partialLinkText("Signup / Login")).click();

        driver.findElement(By.xpath("//*[@id=\"section\"]div/div/div[3]/div/form/input[2]")).sendKeys("Hady");
       /* WebElement nameField = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div[1]/div[3]/div/form/input[2]"));
        WebElement emailField = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div[1]/div[3]/div/form/input[3]"));

        nameField.sendKeys("Hady");
        emailField.sendKeys("hady011200@gmail.com");*/


    }
}
