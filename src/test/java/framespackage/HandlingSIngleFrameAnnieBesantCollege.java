package framespackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class HandlingSIngleFrameAnnieBesantCollege
{
    public static void main(String[] args)
    {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

            driver.get("https://anniebesant.org/");

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

            Actions action = new Actions(driver);

            action.scrollToElement(driver.findElement(By.xpath("//p[contains(text(),\"2007 - 2026 All Rights Reserved © Annie Besant Women's College\")]")))
                    .pause(Duration.ofSeconds(2))
                    .perform();

            driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,\"https://www.google.com/maps/embed?pb\")]")));

            driver.findElement(By.xpath("//button[@aria-label='Show street map']")).click();






        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}

