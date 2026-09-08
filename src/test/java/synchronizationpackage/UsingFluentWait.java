package synchronizationpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UsingFluentWait
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

            driver.get("https://automationexercise.com/");

            FluentWait<WebDriver> wait = new FluentWait(driver);

            wait.pollingEvery(Duration.ofSeconds(2));

            wait.withTimeout(Duration.ofSeconds(30));

            wait.ignoring(Exception.class);

//            Thread.sleep(2000);

            driver.navigate().refresh();

            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/login']")))
                    .click();

            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='name']")))
                    .sendKeys("John Doe");

            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@data-qa='signup-email']")))
                    .sendKeys("john@gmail.com");

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
