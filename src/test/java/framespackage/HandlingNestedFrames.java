package framespackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HandlingNestedFrames
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

            driver.get("https://www.dezlearn.com/nested-iframes-example/");

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

            FluentWait<WebDriver> wait = new WebDriverWait(driver,Duration.ofSeconds(40));

            wait.pollingEvery(Duration.ofSeconds(2));

//            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@aria-label='Close']")))
//                    .click();

            driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='parent_iframe']")));

            driver.findElement(By.xpath("//button[normalize-space()='Click Here']"))
                    .click();

            driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframe1']")));

            driver.findElement(By.xpath("//button[normalize-space()='Click Here']"))
                    .click();

            driver.close();

//            driver.switchTo().defaultContent();
//
//            driver.findElement(By.xpath("//a[@href='https://www.dezlearn.com/courses/']"))
//                    .click();


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
