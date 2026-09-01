package locartorspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UsingXpathByStartsWith
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            Thread.sleep(2000);

            driver.get("https://www.youtube.com/");

            Thread.sleep(2000);

            driver.findElement(By.xpath("//input[@placeholder='Search']"))
                    .sendKeys("nuvvu vasthanante nenu vaddantana song");

            Thread.sleep(2000);

            driver.findElement(By.xpath("//button[@title='Search']"))
                    .click();

//            Thread.sleep(4000);

//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(""))))

            driver.findElement(By.xpath("//yt-formatted-string[starts-with(@aria-label,'Nuvvostanante Nenoddantana Video Songs')]"))
                    .click();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
