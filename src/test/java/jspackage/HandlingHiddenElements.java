package jspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandlingHiddenElements
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

            driver.findElement(By.xpath("//input[@id='hide-textbox']"))
                    .click();

            Thread.sleep(1000);

            JavascriptExecutor executor = (JavascriptExecutor) driver;

            executor.executeScript("document.querySelector(\"input#displayed-text\").value = \"Hello, World!\";");

            Thread.sleep(1000);

            driver.findElement(By.xpath("//input[@id='show-textbox']"))
                    .click();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
