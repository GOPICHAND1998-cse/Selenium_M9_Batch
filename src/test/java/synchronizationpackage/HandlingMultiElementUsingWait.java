package synchronizationpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class HandlingMultiElementUsingWait
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

            driver.get("https://www.amazon.in/");

            FluentWait<WebDriver> wait = new FluentWait(driver);

            wait.pollingEvery(Duration.ofSeconds(2));
            wait.withTimeout(Duration.ofSeconds(20));
            wait.ignoring(Exception.class);

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='twotabsearchtextbox']")))
                    .sendKeys("vivo x");

            List<WebElement> allOptions = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='left-pane-results-container']/child::div/descendant::div[@role='button']")));

            for(WebElement element : allOptions)
            {
                if (element.getText().equals("vivo x200 fe"))
                {
                    element.click();
                    break;
                }
            }



        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
