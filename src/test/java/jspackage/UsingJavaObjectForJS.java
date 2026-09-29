package jspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class UsingJavaObjectForJS
{
    public static void main(String[] args)
    {
        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));

            driver.get("https://www.letskodeit.com/practice");

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

            WebElement bmwCheckBox = driver.findElement(By.xpath("//input[@id='bmwcheck']"));

            JavascriptExecutor executor = (JavascriptExecutor) driver;

            executor.executeScript("arguments[0].click();",bmwCheckBox);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
