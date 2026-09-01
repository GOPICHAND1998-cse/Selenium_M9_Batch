package taskpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorTask1
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            Thread.sleep(2000);

            driver.get("https://www.youtube.com/");

            Thread.sleep(2000);

            driver.findElement(By.cssSelector("input[name='search_query']"))
                    .sendKeys("dude orchestral suite");

            Thread.sleep(2000);

            driver.findElement(By.cssSelector("button[title='Search']"))
                    .click();

            Thread.sleep(2000);

            driver.findElement(By.cssSelector("yt-formatted-string[aria-label='Dude – Orchestral Suite 2 minutes, 6 seconds']"))
                    .click();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
