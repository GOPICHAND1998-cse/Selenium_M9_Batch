package synchronizationpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UsingExplicitWait
{
    public static void main(String[] args) {
        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

            driver.get("https://www.shoppersstack.com/");

            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='kids']")))
                    .click();

            driver.navigate().refresh();

            driver.findElement(By.xpath("//div[contains(@class,'MuiPaper-root MuiPaper-elevation MuiPaper-rounded')]/descendant::span[text()='funblast']"))
                    .click();

            driver.findElement(By.xpath("//input[@id='Check Delivery']"))
                    .sendKeys("500060");

            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@id='Check']"))))
                    .click();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
