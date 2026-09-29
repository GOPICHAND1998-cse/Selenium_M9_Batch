package jspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

import java.time.Duration;

public class HandlingDisabledElements
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

            driver.get("https://www.letskodeit.com/practice");

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver.findElement(By.cssSelector("input#disabled-button")).click();

            JavascriptExecutor executor = (JavascriptExecutor) driver;

            executor.executeScript("document.querySelector(\"input#enabled-example-input\").removeAttribute(\"disabled\")");

            driver.findElement(By.cssSelector("input#enabled-example-input")).sendKeys("Data Dummy");


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
