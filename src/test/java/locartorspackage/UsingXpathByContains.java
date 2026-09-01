package locartorspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathByContains
{
    public static void main(String[] args)
    {
        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            Thread.sleep(2000);

            driver.get("https://www.youtube.com/");

            Thread.sleep(2000);

            driver.findElement(By.xpath("//input[@name='search_query']"))
                    .sendKeys("o sita song");

            Thread.sleep(2000);

            driver.findElement(By.xpath("//button[@title='Search']"))
                    .click();

            Thread.sleep(2000);

            driver.findElement(By.xpath("//a[contains(@title,'Oh Sita Hey Rama Video Song')]"))
                    .click();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
