package synchronizationpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SynchronizationAutomation
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

            driver.get("https://www.automationexercise.com/#google_vignette");

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver.findElement(By.xpath("//a[@href='/products']"))
                    .click();

            driver.findElement(By.xpath("//a[@href='#Kids']"))
                    .click();

            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));

            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/category_products/4']")))
                    .click();


            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-product-id='16' and text()='Add to cart']")))
                    .click();

            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='cartModal']/descendant::a[@href='/view_cart']")))
                    .click();

            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='cart_quantity_delete']")))
                    .click();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
